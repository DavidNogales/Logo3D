from antlr4 import *
from logo3dLexer import logo3dLexer
from logo3dParser import logo3dParser
from visitor import Visitor
import sys

# Treating console parameters 
args = sys.argv
print("number args:", len(args))
if(len(args) > 1):
    path = args[1]
    mainVar = "main"
    parameters = []
    if(len(args) >= 3):
        mainVar = args[2]

    if(len(args) > 3):
        parameters = args[3:]

    print("arguments for tree:", mainVar, parameters)

    # AST
    input_stream = FileStream(path)
    lexer = logo3dLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = logo3dParser(token_stream)
    tree = parser.root()
    # print(tree.toStringTree(recog=parser))
    treeV = Visitor()
    try:
        # Input program execution
        print("-----------------------------------------")
        functionsDic = treeV.visit(tree)
        if(mainVar in functionsDic):
            print("-------------PROGRAM I/O-----------------")
            treeV.visitMain(mainVar, functionsDic, parameters)

        else:
            print("No main function found!!")

        print("-----------------------------------------")

    except Exception as e:
        print("something went wrong...")
        reportWithTraceback = True
        if reportWithTraceback:
            raise e
        else:
            print(e)
else:
    print("No input program")
