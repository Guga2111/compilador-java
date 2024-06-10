grammar myLang;

prog
    : decl*
    ;

decl
    : varDecl
    | funcDecl
    | structDecl
    | controlStruct
    | expr ';'
    ;

varDecl
    : type ID ('=' expr ';')?

    ;

init
    : expr
    | arrayInit
    ;

type
    : 'int'
    | 'float'
    | 'double'
    | 'char'
    | 'boolean'
    ;

funcDecl
    : type ID '(' params? ')' block
    ;

params
    : param (',' params)*
    ;

param
    : type ID
    | type ID '[' ']'
    ;

block
    : '{' decl* '}'
    ;

expr
    : assign
    | logicExpr
    | relExpr
    | arithExpr
    ;

assign
    : ID '=' expr
    | ID '+=' expr
    | ID '-=' expr
    | ID '*=' expr
    | ID '/=' expr
    | ID '%=' expr
    | ID '&&=' expr
    | ID '||=' expr
    | ID '=' ID
    | ID '+=' ID
    | ID '-=' ID
    | ID '*=' ID
    | ID '/=' ID
    | ID '%=' ID
    | ID '&&=' ID
    | ID '||=' ID
    ;

controlStruct
    : 'if' '(' expr ')' block
    | 'if' '(' expr ')' block 'else' block
    | 'while' '(' expr ')' block
    | 'for' '(' expr ';' expr ';' expr ')' block
    | 'switch' '(' expr ')' caseList
    | 'break' ';'
    | 'continue' ';'
    | 'return' expr ';'
    ;

forDecl
    : varDecl
    | assign
    | ID
    |
    ;

caseList
    : caseDecl*
    ;

caseDecl
    : 'case' expr ':' block
    | 'default' ':' block
    ;

structDecl
    : 'struct' ID '{' varDecl* '}' ';'
    ;

array
    : '[' ']'
    | '[' expr ']'
    ;

arrayInit
    : '{' exprList '}'
    ;

exprList
    : expr (',' expr)*
    ;

logicExpr
    : relExpr
    | logicExpr '&&' relExpr
    | logicExpr '||' relExpr
    | '!' relExpr
    ;

relExpr
    : arithExpr
    | arithExpr '>' arithExpr
    | arithExpr '>=' arithExpr
    | arithExpr '<' arithExpr
    | arithExpr '<=' arithExpr
    | arithExpr '!=' arithExpr
    | arithExpr '==' arithExpr
    ;

arithExpr
    : multExpr
    | arithExpr '+' multExpr
    | arithExpr '-' multExpr
    ;

multExpr
    : unaryExpr
    | multExpr '*' unaryExpr
    | multExpr '/' unaryExpr
    | multExpr '%' unaryExpr
    ;

unaryExpr
    : postfixExpr
    | '-' unaryExpr
    |  unaryExpr '++'
    | unaryExpr '--'
    ;

postfixExpr
    : primary
    | primary '[' expr ']'
    | primary '.' ID
    | primary '->' ID
    ;

args
    : exprList
    |
    ;

primary
    : ID
    | NUM_INT
    | NUM_DEC
    | STRING
    | '(' expr ')'
    ;

ID: [a-zA-Z_][a-zA-Z_0-9]*;
NUM_INT: [0-9]+;
NUM_DEC: [0-9]+ '.' [0-9]+;
STRING: '"' (~["\\] | '\\' .)* '"';
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
COMMENT_BLOCK: '/' .? '*/' -> skip;