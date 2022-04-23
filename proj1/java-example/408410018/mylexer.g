lexer grammar mylexer;

options {
  language = Java;
}

/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
INCLUDE_  : 'include';
DEFINE_   : 'define';
INT_TYPE  : 'int';
CHAR_TYPE : 'char';
VOID_TYPE : 'void';
BOOL_TYPE : 'bool';
AUTO_TYPE : 'auto';
SIGN_TYPE : 'signed';
USIGN_TYPE: 'unsigned';
UNION_TYPE: 'union';
SHORT_TYPE: 'short';
FLOAT_TYPE: 'float';
DOUBL_TYPE: 'double';
LONG_TYPE : 'long';
LLONG_TYPE: 'long long';
STRUC_TYPE: 'struct';
TYPEDEF_  : 'typedef';
STATIC_   : 'static';
EXTERN_   : 'extern';
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
CONTINUE_ : 'continue';
DOWHILE_  : ('do')('{' (options{greedy=false;}: .)* '}')(WHILE_);

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
ANDEUQ_OP : '+=';
DECEQU_OP : '-=';
MULEQU_OP : '*=';
DIVEQU_OP : '/=';
RSHIFT_OP : '<<';
LSHIFT_OP : '>>';
ANDAND_OP : '&&';
INDICA_OP : '->';

NEW_LINE     : '\n';
HASHTAG      : '#';
LINE_BREAK   : ('\\n');
IND_VAR      : ('*')(ID);
INDIND_VAR   : ('*')('*')(ID);
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

MAIN_      : 'main';
PRINTF_    : 'printf';
SCNAF_     : 'scanf';
FGETS_     : 'fgets';
STRLEN_	   : 'strlen';
STRCSPN_   : 'strcspn';
MALLOC_    : 'malloc';
STRDUP_    : 'strdup';
STRCMP_    : 'strcmp';
FREE_      : 'free';

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
