grammar llull;
root : expr EOF ;

expr : PARL expr PARR
    | expr POW expr
    | expr (MULT | DIV) expr
    | expr (MES | MENYS) expr
    | expr (EQ | NOTEQ | LESS | GREATER | LESSEQ | GREATEREQ) expr
    | NUM
    | ID
    ;

MES     : '+' ;
MENYS   : '-' ;
MULT    : '*' ;
DIV     : '/' ;
POW     : '^' ;
PARL    : '(' ;
PARR    : ')' ;

ASSIG   : '=' ;

EQ         : '==' ;
NOTEQ      : '<>' ;
LESS       : '<'  ;
GREATER    : '>'  ;
LESSEQ     : '<='  ;
GREATEREQ  : '>='  ;

ID      : [a-zA-Z] [a-zA-Z_0-9]* ;

NUM     : [0-9]+ ;
     
WS      :   [ \n]+ -> skip ; 