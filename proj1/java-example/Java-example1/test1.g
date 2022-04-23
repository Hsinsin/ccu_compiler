lexer grammar test1;

options {
  language = Java;
}

/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
INT_TYPE  : 'int';
CHAR_TYPE : 'char';
VOID_TYPE : 'void';
FLOAT_TYPE: 'float';
DOUBL_TYPE: 'double';
WHILE_    : 'while';
SWITCH_   : 'switch';
CASE_     : 'case';
BREAK_    : 'break';
RETURN_   : 'return';
DEFUALT_  : 'default';
CONST_    : 'const';
FOR_      : 'for';
IF_       : 'if';
ELSE_     : 'else';
ELSEIF_   : 'else if';

/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';
PP_OP : '++';
MM_OP : '--';
OR_OP : '||';
RSHIFT_OP : '<<';
LSHIFT_OP : '>>';
ANDAND_OP : '&&';
INDICA_OP : '->';

NEW_LINE     : '\n';
HASHTAG      : '#';
LINE_BREAK   : ('\\n')|('\0');
IND_VAR      : ('*')(ID);
HEADER       : (LETTER)(LETTER | DIGIT)*('.')(LETTER);

/*----------------------*/
/*      Operators       */
/*----------------------*/

ADD_OP : '+';
DEC_OP : '-';
MUL_OP : '*';
DIV_OP : '/';
EQU_OP : '=';
MOD_OP : '%';
LES_OP : '<';
GRT_OP : '>';
ESP_OP : '&';
BOO_OP : '~';
SEI_OP : '!';
ORR_OP : '|';
LPAR_OP : '(';
RPAR_OP : ')';
LCUR_OP : '{';
RCUR_OP : '}';
LBAR_OP : '[';
RBAR_OP : ']';
SEMICOL_OP : ';';
COLON_OP   : ':';
COMMA_OP   : ',';
DMARK_OP   : '\"';
QMARK_OP   : '\'';

DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;
SEN : (('\"' (options{greedy=false;}: .)* '\"') | ('\'' (options{greedy=false;}: .)* '\'')) ;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;
 

/* Comments */
COMMENT1 : '//'(.)*'\n';
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/';

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';


WS  : (' '|'\r'|'\t')+
    ;
