grammar llull;
root : accio+ EOF ;

accio : RET ids PARL ((ids ',')* ids)? PARR BRACKL stat* BRACKR ;

stat : if_else 
    | while_loop
    | for_loop
    | do_while_loop
    | read
    | write
    | assig 
    | assig_operator
    | assig_double
    | invocacio
    | create_array
    | get_array
    | set_array
    ;

expr : PARL expr PARR
    | expr POW expr
    | expr (MULT | DIV) expr
    | (MES | MENYS) expr
    | expr (MES | MENYS) expr
    | expr MOD expr
    | expr (EQ | NOTEQ | LESS | GREATER | LESSEQ | GREATEREQ) expr
    | expr (AND | OR) expr
    | INT
    | FLOAT
    | ids
    | STRING
    | get_array
    ;

if_else: 'if' PARL expr PARR BRACKL stat* BRACKR 
        ('else if' PARL expr PARR BRACKL stat* BRACKR)?
        ('else' BRACKL stat* BRACKR)?;

while_loop: 'while' PARL expr PARR BRACKL stat* BRACKR;

do_while_loop: 'do' BRACKL stat* BRACKR 'while' PARL expr PARR;

for_loop: 'for' PARL assig ';' expr ';' stat+ PARR BRACKL stat* BRACKR;

assig : ids '=' expr;
assig_operator : ids (MES | MENYS | MULT | DIV) '=' expr;
assig_double : ids ('++'| '--' );

read  : 'read' PARL ids PARR                    ;
write : 'write' PARL ((expr | STRING | ids) ',')* (expr | STRING | ids) PARR ;

create_array : 'array' PARL ids ',' expr PARR        ;
get_array    : 'get' PARL ids ',' expr PARR          ;
set_array    : 'set' PARL ids ',' expr ',' expr PARR ;

invocacio : ids PARL (((ids | expr) ',')* (ids | expr))? PARR ;

MES     : '+' ;
MENYS   : '-' ;
MULT    : '*' ;
DIV     : '/' ;
POW     : '^' ;
MOD     : '%' ;

PARL    : '(' ;
PARR    : ')' ;
BRACKL  : '{' ;
BRACKR  : '}' ;

ASSIG   : '=' ;

EQ         : '==' ;
NOTEQ      : '<>' ;
LESS       : '<'  ;
GREATER    : '>'  ;
LESSEQ     : '<=' ;
GREATEREQ  : '>=' ;

AND : '&&' ;
OR  : '||' ;

RET : 'void';
ALPH : [a-zA-Z] ;

ids :  ALPH (ALPH | INT)* ;

INT     : [0-9]+            ;
FLOAT   : [0-9]+ '.' [0-9]+ ;
     
WS      :   [ \n]+ -> skip      ; 
NEWLINE :   '\r'? '\n'          ;   
COMMENT  : '#' ~[\r\n]* -> skip ;
STRING   : '"' ~'"'* '"'        ;