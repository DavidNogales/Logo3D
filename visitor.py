# Generated from logo3d.g by ANTLR 4.9.2
from inspect import signature
from antlr4 import *
from turtle3d import Turtle3D
from logo3dParser import logo3dParser

# This class defines a complete generic visitor for a parse tree produced by logo3dParser.


class Visitor(ParseTreeVisitor):
    FALSE_LOWER_BOUND = -1e-6
    FALSE_UPPER_BOUND = 1e-6

    def __init__(self):
        self.variables = {}
        self.functDic = {}
        self.contextStack = []
        self.turtle = Turtle3D()

    def visitMain(self, mainFunc, functionsDic, parametersValues):
        self.functDic = functionsDic
        body = (self.functDic[mainFunc])
        param = body[0]
        block = body[1]
        mainParamVars = self.visit(param)
        self.variables = self.bindVariablesWithValues(
            mainParamVars, parametersValues, mainFunc)
        self.visit(block)

    # Visit a parse tree produced by logo3dParser#root.
    def visitRoot(self, ctx: logo3dParser.RootContext):
        l = list(ctx.getChildren())
        functions = []
        [functions.append(self.visit(x)) for x in l[:-1]]
        functDict = dict(functions)
        return functDict

    # Visit a parse tree produced by logo3dParser#function.
    def visitFunction(self, ctx: logo3dParser.FunctionContext):
        # print("visitFunction")
        l = list(ctx.getChildren())
        functionName = l[1].getText()
        functionParam = l[2]
        instrucBloc = l[4]

        if functionName in self.functDic:
            errorMsg = "Procedure with name '{}' already defined"
            raise Exception(errorMsg.format(functionName))

        parametersList = self.visit(functionParam)
        parametersSet = set(parametersList)
        differentVariableNames = len(parametersList) == len(parametersSet)
        if not differentVariableNames:
            errorMsg = "Some parameters in function '{}' have the same name"
            raise Exception(errorMsg.format(functionName))

        self.functDic[functionName] = ""
        return (functionName, [functionParam, instrucBloc])

    # Visit a parse tree produced by logo3dParser#funcParam.
    def visitFuncParam(self, ctx: logo3dParser.FuncParamContext):
        #print("visiting function parameters!!")
        l = list(ctx.getChildren())
        param = []
        if len(l) > 2:
            param = [l[i].getText()
                     for i in range(1, len(l)-1) if l[i].getText() != ',']

        return param

    # Visit a parse tree produced by logo3dParser#instrucBloc.
    def visitInstrucBloc(self, ctx: logo3dParser.InstrucBlocContext):
        #print("visiting block of instructions")
        #l = list(ctx.getChildren())
        # print(len(l))
        self.visitChildren(ctx)
        #[self.visit(x) for x in l]

    # Visit a parse tree produced by logo3dParser#instruc.
    def visitInstruc(self, ctx: logo3dParser.InstrucContext):
        #print ("visiting instruction!!")
        l = list(ctx.getChildren())
        self.visit(l[0])

    # evaluates if a condition in inside of False bounds
    def isConditionTrue(self, condition):
        return False if condition < Visitor.FALSE_UPPER_BOUND and condition > Visitor.FALSE_LOWER_BOUND else True

    # Visit a parse tree produced by logo3dParser#ifInst.
    def visitIfInst(self, ctx: logo3dParser.IfInstContext):
        #print("visiting If Instuction")
        l = list(ctx.getChildren())
        # print("numInst",len(l))
        condition = self.visit(l[1])
        if(self.isConditionTrue(condition)):
            self.visit(l[3])
        elif len(l) > 5:
            self.visit(l[5])

    # Visit a parse tree produced by logo3dParser#whileInst.
    def visitWhileInst(self, ctx: logo3dParser.WhileInstContext):
        #print("visiting While Instuction")
        l = list(ctx.getChildren())
        # print("numInst",len(l))
        condition = self.visit(l[1])
        while(self.isConditionTrue(condition)):
            self.visit(l[3])
            condition = self.visit(l[1])

    # Visit a parse tree produced by logo3dParser#forInst.
    def visitForInst(self, ctx: logo3dParser.ForInstContext):
        #print("visiting For Instuction")
        l = list(ctx.getChildren())
        varIniName = l[1].getText()
        varIniValue = self.visit(l[3])
        varEndValue = self.visit(l[5])
        self.variables[varIniName] = varIniValue
        while(self.variables[varIniName] <= varEndValue):
            self.visit(l[7])
            if(self.variables[varIniName] == varIniValue):
                varIniValue += 1
                self.variables[varIniName] = varIniValue

    # Visit a parse tree produced by logo3dParser#writeInst.

    def visitWriteInst(self, ctx: logo3dParser.WriteInstContext):
        l = list(ctx.getChildren())
        #print("Visiting Writing Instruction",l[1].getText())
        exprValue = self.visit(l[1])
        print("<<", exprValue)

    # Visit a parse tree produced by logo3dParser#readInst.
    def visitReadInst(self, ctx: logo3dParser.ReadInstContext):
        l = list(ctx.getChildren())
        varName = l[1].getText()
        #print("Visiting Reading Instruction",varName)
        varValue = input("Please, enter input:")
        varValue = varValue.lower()
        containsLetters = varValue.islower()
        if containsLetters:
            errorMsg = "Error, input '{}' contains letters!"
            raise Exception(errorMsg.format(varValue))

        self.variables[varName] = int(
            varValue) if varValue.isdecimal() else float(varValue)

    # Given a valid turtle function name and its parameters calls the corresponding function in Turtle3D API
    def treatTurtleCall(self, functionName, paramValues):

        myfunc = getattr(self.turtle, functionName)
        funcSignature = signature(myfunc)
        funcNumParam = len(funcSignature.parameters)
        if funcNumParam == len(paramValues):
            #print("Valid call")
            myfunc(*paramValues)
        else:
            errorMsg = "Wrong number of parameters calling function '{}'"
            raise Exception(errorMsg.format(functionName))

    # Visit a parse tree produced by logo3dParser#callInst.
    def visitCallInst(self, ctx: logo3dParser.CallInstContext):
        #print("Visiting Call Instruction")
        l = list(ctx.getChildren())
        functionName = l[0].getText()
        paramValues = [self.visit(l[i]) for i in range(
            2, len(l)-1) if l[i].getText() != ',']
        isTurtleCall = (ctx.turtleCall() != None)
        if isTurtleCall:
            if not self.turtle.isSceneActive():
                print("setting up the scene...")
                self.turtle.setupScene()
            self.treatTurtleCall(functionName, paramValues)

        elif(functionName in self.functDic):
            # print(functionName)
            instBlock = self.functDic[functionName]
            param = instBlock[0]
            block = instBlock[1]
            paramVars = self.visit(param)
            bindingsDic = {}
            bindingsDic = self.bindVariablesWithValues(
                paramVars, paramValues, functionName)
            # print(bindingsDic)
            self.contextPush(bindingsDic)
            #print("Entering function")
            self.visit(block)
            #print("Exiting function")
            self.contextPop()
        else:
            errorMsg = "Error, there is no function with name '{}'"
            raise Exception(errorMsg.format(functionName))

    # binds each variable with its respective value
    def bindVariablesWithValues(self, paramVars, paramValues, functionName):
        myBindings = dict()
        if (len(paramValues) == len(paramVars)):
            myBindings = dict(zip(paramVars, paramValues))
        else:
            errorMsg = "Wrong number of parameters calling function '{}'"
            raise Exception(errorMsg.format(functionName))
        return myBindings

    # function to change context while entering functions
    def contextPush(self, newVarDic):
        oldDictionary = self.variables
        self.variables = newVarDic
        self.contextStack.append(oldDictionary)

    # function to change context while leaving functions
    def contextPop(self):
        self.variables = self.contextStack.pop()

    # Visit a parse tree produced by logo3dParser#assignationInst.
    def visitAssignationInst(self, ctx: logo3dParser.AssignationInstContext):
        #print("visiting AssignationInst")
        l = list(ctx.getChildren())
        varName = l[0].getText()
        varValue = self.visit(l[2])
        self.variables[varName] = varValue

    # Visit a parse tree produced by logo3dParser#intExpr.
    def visitIntExpr(self, ctx: logo3dParser.IntExprContext):
        #print("visiting intExpr")
        l = list(ctx.getChildren())
        return int(l[0].getText())

    # Visit a parse tree produced by logo3dParser#realExpr.
    def visitRealExpr(self, ctx: logo3dParser.RealExprContext):
        #print("visiting realExpr")
        l = list(ctx.getChildren())
        return float(l[0].getText())

    # Visit a parse tree produced by logo3dParser#mesExpr.
    def visitMesExpr(self, ctx: logo3dParser.MesExprContext):
        # print("visitMesExpr")
        l = list(ctx.getChildren())
        sumVar = 0
        #print("expr length",len(l))
        if len(l) == 3:
            a = self.visit(l[0])
            b = self.visit(l[2])
            sumVar = a+b
        else:
            print("Error evaluating sum expression!")
        # print("sum",sumVar)
        return sumVar

    # Visit a parse tree produced by logo3dParser#varExpr.
    def visitVarExpr(self, ctx: logo3dParser.VarExprContext):
        #print("visiting var!!!")
        l = list(ctx.getChildren())
        varValue = 0
        varName = l[0].getText()
        if varName in self.variables:
            varValue = self.variables[varName]

            if (type(varValue) is str):
                varValue = varValue.lower()
                containsLetters = varValue.islower()
                if containsLetters:
                    errorMsg = "Error, variable '{}' contains letters!"
                    raise Exception(errorMsg.format(varName))

                if varValue.isdecimal():
                    varValue = int(varValue)
                else:
                    varValue = float(varValue)
        else:
            errorMsg = "Error, there is no variable with name: {}"
            raise Exception(errorMsg.format(varName))

        return varValue

    # Visit a parse tree produced by logo3dParser#parenthesizedExpr.
    def visitParenthesizedExpr(self, ctx: logo3dParser.ParenthesizedExprContext):
        # print("visitParenthesizedExpr")
        l = list(ctx.getChildren())
        #print("length Parent expr:",len(l))
        if len(l) == 3:
            return self.visit(l[1])
        else:
            print("Error in parenthesized expression")

    # Visit a parse tree produced by logo3dParser#mulExpr.
    def visitMulExpr(self, ctx: logo3dParser.MulExprContext):
        # print("visitMulExpr")
        l = list(ctx.getChildren())
        mulVar = 0
        #print("expr length",len(l))
        if len(l) == 3:
            a = self.visit(l[0])
            b = self.visit(l[2])
            mulVar = a*b
        else:
            print("Error evaluating multiplication expression!")
        return mulVar

    # Visit a parse tree produced by logo3dParser#menyslExpr.
    def visitMenyslExpr(self, ctx: logo3dParser.MenyslExprContext):
        l = list(ctx.getChildren())
        difVar = 0
        if len(l) == 3:
            a = self.visit(l[0])
            b = self.visit(l[2])
            difVar = a-b
        else:
            print("Error evaluating difference expression!")
        return difVar

    # Visit a parse tree produced by logo3dParser#divExpr.
    def visitDivExpr(self, ctx: logo3dParser.DivExprContext):
        l = list(ctx.getChildren())
        divVar = 0
        #print("expr length",len(l))
        if len(l) == 3:
            a = self.visit(l[0])
            b = self.visit(l[2])
            if b == 0:
                errorMsg = "Error, division by zero! in expression: {}"
                expression = "{}/{}".format(l[0].getText(), l[2].getText())
                raise Exception(errorMsg.format(expression))
            else:
                divVar = a/b
        else:
            print("Error evaluating division expression!")
        return divVar

    # Visit a parse tree produced by logo3dParser#greaterExpr.
    def visitGreaterExpr(self, ctx: logo3dParser.GreaterExprContext):
        l = list(ctx.getChildren())
        #print ("visiting GreaterExpr")
        eval = 0
        a = self.visit(l[0])
        b = self.visit(l[2])
        if (a > b):
            eval = 1
        return eval

    # Visit a parse tree produced by logo3dParser#lessExpr.
    def visitLessExpr(self, ctx: logo3dParser.LessExprContext):
        l = list(ctx.getChildren())
        #print ("visiting LessExpr")
        eval = 0
        a = self.visit(l[0])
        b = self.visit(l[2])
        if (a < b):
            eval = 1
        return eval

    # Visit a parse tree produced by logo3dParser#equalExpr.
    def visitEqualExpr(self, ctx: logo3dParser.EqualExprContext):
        l = list(ctx.getChildren())
        #print ("visiting EqualExpr")
        eval = 0
        a = self.visit(l[0])
        b = self.visit(l[2])
        if (a == b):
            eval = 1
        return eval

    # Visit a parse tree produced by logo3dParser#greaterEqualExpr.
    def visitGreaterEqualExpr(self, ctx: logo3dParser.GreaterEqualExprContext):
        l = list(ctx.getChildren())
        #print ("visiting GreaterEqualExpr")
        eval = 0
        a = self.visit(l[0])
        b = self.visit(l[2])
        if (a >= b):
            eval = 1
        return eval

    # Visit a parse tree produced by logo3dParser#differentExpr.
    def visitDifferentExpr(self, ctx: logo3dParser.DifferentExprContext):
        l = list(ctx.getChildren())
        #print ("visiting DifferentExpr")
        eval = 0
        a = self.visit(l[0])
        b = self.visit(l[2])
        if (a != b):
            eval = 1
        return eval

    # Visit a parse tree produced by logo3dParser#lessEqualExpr.
    def visitLessEqualExpr(self, ctx: logo3dParser.LessEqualExprContext):
        l = list(ctx.getChildren())
        #print ("visiting LessEqualExpr")
        eval = 0
        a = self.visit(l[0])
        b = self.visit(l[2])
        if (a <= b):
            eval = 1
        return eval

    # Visit a parse tree produced by logo3dParser#turtleCall.
    def visitTurtleCall(self, ctx: logo3dParser.TurtleCallContext):
        print("visiting turtleCall!")
        l = list(ctx.getChildren())
        return l[0].getText()
