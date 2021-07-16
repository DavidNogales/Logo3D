grammar logo3d;
 
root : (function)+ EOF;

function : 'PROC' ID funcParam 'IS' instrucBloc 'END';

funcParam: '('(ID (','ID)*)?')'; 

instrucBloc : instruc+ ;

instruc : assignationInst | writeInst | readInst | ifInst | whileInst | forInst | callInst;

ifInst : 'IF' expr 'THEN'  instrucBloc ('ELSE' instrucBloc)? 'END';

whileInst : 'WHILE' expr 'DO'  instrucBloc 'END';

forInst : 'FOR' ID 'FROM' expr 'TO' expr 'DO' instrucBloc 'END';


writeInst : '<<' expr;

readInst : '>>' ID;

callInst : (turtleCall|ID) '('(expr (','expr)*)?')'; 

turtleCall : 'up' | 'down' | 'left' | 'right' | 'forward' | 'backward' | 'color' | 'hide' | 'show' | 'home';

assignationInst : ID ASSIGN expr;

expr : '(' expr ')'     # parenthesizedExpr
    | expr EQ expr      # equalExpr
    | expr NEQ expr     # differentExpr
    | expr LE expr      # lessExpr
    | expr GT expr      # greaterExpr
    | expr LEQ expr     # lessEqualExpr
    | expr GEQ expr     # greaterEqualExpr
    | expr MUL expr     # mulExpr
    | expr DIV expr     # divExpr
    | expr MES expr     # mesExpr
    | expr MENYS expr   # menyslExpr
    | REAL              # realExpr
    | INT               # intExpr
    | ID                # varExpr
    ;


ID : [a-z][a-zA-Z0-9_]*;    
REAL : [0-9]+'.'[0-9]*;
INT : ('-')?[0-9]+ ;
ASSIGN : ':=';
EQ : '==';
NEQ : '!=';
LE : '<';
GT : '>';
LEQ : '<=';
GEQ : '>=';
MES : '+' ;
MENYS : '-' ;
MUL : '*' ;
DIV : '/' ;
WS : [ \t\r\n]+ -> skip ;
COMMENT : '//'~'\n'* -> skip;