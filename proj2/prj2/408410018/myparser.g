grammar myparser;

options {
   language = Java;
   backtrack = true;
}

@header {
    import java.util.Set;
    import java.util.HashSet;
}

@members {
    boolean TRACEON = true;
    //HashMap memory = new HashMap();
}

program:
	VOID MAIN '(' ')' '{' declarations statements '}'
    {if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");}
    | INT MAIN '(' ')' '{' declarations statements '}'
    {if (TRACEON) System.out.println("INT MAIN () {declarations statements}");}
    ;


declarations:
	(type Identifier | Identifier) (';'| (',' Identifier)* ';') declarations
	{ if (TRACEON) System.out.println("declarations: type Identifier : declarations"); }
	| (type Identifier | Identifier) '=' arith_expression ';' 
	{ if (TRACEON) System.out.println("statement: assign"); }
    | { if (TRACEON) System.out.println("declarations: ");} ;

type:
	INT { if (TRACEON) System.out.println("type: INT"); }
	| CHAR {if (TRACEON) System.out.println("type: CHAR"); }
	| FLOAT {if (TRACEON) System.out.println("type: FLOAT"); }
	| DOUBLE {if (TRACEON) System.out.println("type: DOUBLE"); }
	| VOID {if (TRACEON) System.out.println("type: VOID"); }
	| SIGNED {if (TRACEON) System.out.println("type: SIGNED"); }
	| UNSIGNED {if (TRACEON) System.out.println("type: UNSIGNED"); }
	| BOOLEAN {if (TRACEON) System.out.println("type: BOOLEAN"); }
	| UNION {if (TRACEON) System.out.println("type: UNION"); }
	| STRING {if (TRACEON) System.out.println("type: STRING"); }
	| LONG {if (TRACEON) System.out.println("type: LONG"); }
	| LONGG {if (TRACEON) System.out.println("type: LONGLONG"); }
	| SHORT {if (TRACEON) System.out.println("type: SHORT"); }
	;

storage:
	EXTERN {if (TRACEON) System.out.println("storage: EXTERN"); }
	| STATIC {if (TRACEON) System.out.println("storage: STATIC"); }
	| AUTO {if (TRACEON) System.out.println("storage: AUTO"); }
	|;

statements:
	statement statements
    |;

argument_expression_list:
	assignment_expression (Comma assignment_expression)*
	;

arith_expression: 
	multExpr( '+' multExpr| '-' multExpr)*
	;

multExpr: 
	signExpr( '*' signExpr| '/' signExpr | '%' signExpr)*
	;

signExpr: 
	primaryExpr
	| '-' primaryExpr
	;
	
expression:
	assignment_expression (Comma assignment_expression)*
	;
	
assignment_expression:
	value (options{backtrack=true;}: assignment_expression)
	| conditional_expression {if (TRACEON) System.out.println("assignment_expression: condition");}
	;
	
value:
	identify_expression assignment_operator
	;
	
identify_expression:	
	postfix_expression
	| PlusPlus identify_expression
	| MinusMinus identify_expression
	| math_operator signExpr
	| SIZEOF identify_expression
	| SIZEOF '(' type ')'
	;
	
postfix_expression:
	primaryExpr('['arith_expression']' | '(' ')' | '(' argument_expression_list ')' | '.' Identifier | PlusPlus | MinusMinus)*;

math_operator:
	And | Plus | Minus | Star | Div | Not | Mod
	;

primaryExpr: 
	Integer_constant
	| Floating_point_constant
	| Identifier
	| '(' expression ')'
	;

assignment_operator:
	Assign | StarAssign | DivAssign | ModAssign | PlusAssign | MinusAssign
	;

conditional_expression:
	logical_expression_OrOr ('?' expression Colon conditional_expression)?
	;
	
logical_expression_OrOr:
	logical_expression_AndAnd (OrOr logical_expression_AndAnd)*
	;

logical_expression_AndAnd:
	logical_expression_OrAnd (AndAnd logical_expression_OrAnd)*
	;

logical_expression_OrAnd:
	equality_expression ((Or|And) equality_expression)*
	;

equality_expression:
	relational_expression ((Equal | NotEqual) relational_expression)*
	;

relational_expression:
	arith_expression ((LessEqual | Less | GreaterEqual | Greater) arith_expression)*
	;

statement: 
	Identifier '=' arith_expression ';' {if (TRACEON) System.out.println("statement: assign"); }
    | expressionStatement {if (TRACEON) System.out.println("statement: expression"); }
    | if_then_else_Statement
    | switch_statement
    | switch_case_statement
    | iteration_statement
    | printfStatement
    | scanfStatement
	;

expressionStatement:
	arith_expression? Semi
	;

if_then_else_Statement:
	IF LeftParen expression RightParen normal_statements ((ELSE if_then_else_statements)? |{if (TRACEON) System.out.println("statement: if-then"); })
	;

if_then_else_statements:
	normal_statements {if (TRACEON) System.out.println("statement: if-then-else"); }
	;

switch_statement:
	SWITCH LeftParen expression RightParen iteration_statement
	{if (TRACEON) System.out.println("statement: switch"); }
	;
	
switch_case_statement:
	Identifier ':' statement
	| CASE conditional_expression Colon statement 
	{if (TRACEON) System.out.println("statement: case"); }
	| DEFAULT conditional_expression Colon statement 
	{if (TRACEON) System.out.println("statement: default"); }
	;
	
iteration_statement:
	WHILE LeftParen expression RightParen normal_statements 
	{if (TRACEON) System.out.println("statement: while-loop"); }
	| DO normal_statements WHILE LeftParen expression RightParen Semi
	{if (TRACEON) System.out.println("statement: do-while-loop"); }
	| FOR LeftParen expressionStatement expressionStatement expression? RightParen normal_statements 
	{if (TRACEON) System.out.println("statement: for-loop"); }
	;
	
printfStatement:
	 PRINTF LeftParen printf_parameter RightParen Semi
	 {if (TRACEON) System.out.println("statement: printf"); }
	 ;
	
printf_parameter:
	Sentence ( Comma (And primaryExpr | primaryExpr) )* 
	{if (TRACEON) System.out.println("statement: printf: string: parameter"); }
	;

scanfStatement:
	 SCANF LeftParen scanf_parameter RightParen Semi
	 {if (TRACEON) System.out.println("statement: scanf"); }
	 ;
	
scanf_parameter:
	Sentence ( Comma expression)* 
	{if (TRACEON) System.out.println("statement: scanf: string: parameter"); }
	;
	
normal_statements:
	statement
	| '{' statements '}'
	;

normalCondition:
	arith_expression (Less | LessEqual | Greater | GreaterEqual | Equal | NotEqual) arith_expression
	| arith_expression (Less | LessEqual | Greater | GreaterEqual | Equal | NotEqual) arith_expression
	;


/* lexer */
// type
INT			: 'int';
CHAR		: 'char';
FLOAT		: 'float';
DOUBLE		: 'double';
VOID		: 'void';
SIGNED		: 'signed';
UNSIGNED	: 'unsigned';
BOOLEAN		: 'bool';
STRING		: 'string';
UNION		: 'union';
LONG		: 'long';
LONGG		: 'long long';
SHORT		: 'short';

// storage
AUTO		: 'auto';
STATIC		: 'static';
EXTERN		: 'extern';

// keyword
MAIN		: 'main';
IF			: 'if';
INCLUDE		: 'include';
ELSE		: 'else';
SWITCH		: 'switch';
CASE		: 'case';
DEFAULT		: 'default';
WHILE		: 'while';
DO			: 'do';
FOR			: 'for';
CONTINUE	: 'continue';
BREAK		: 'break';
RETURN		: 'return';
CONST		: 'const';
TYPEDEF		: 'typedef';
PRINTF		: 'printf';
SIZEOF		: 'sizeof';
SCANF		: 'scanf';

// operator
LeftParen		: '(';
RightParen      : ')';
LeftBracket     : '[';
RightBracket    : ']';
LeftBrace       : '{';
RightBrace      : '}';
Less            : '<';
LessEqual       : '<=';
Greater         : '>';
GreaterEqual    : '>=';
LeftShift       : '<<';
RightShift      : '>>';
Plus            : '+';
PlusPlus        : '++';
Minus           : '-';
MinusMinus      : '--';
Star            : '*';
Div             : '/';
Mod             : '%';
And             : '&';
Or              : '|';
Negate          : '~';
Colon           : ':';
Semi            : ';';
Comma           : ',';
Assign          : '=';
StarAssign      : '*=';
DivAssign       : '/=';
ModAssign       : '%=';
PlusAssign      : '+=';
MinusAssign     : '-=';
AndAnd			: '&&';
OrOr			: '||';
Equal			: '==';
NotEqual		: '!=';
Not				: '!';
Dot             : '.';

Identifier:
	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	;
	
Integer_constant:
	'-'? ('1'..'9') ('0'..'9')*
	| '0'
	;
	
Floating_point_constant:
	Integer_constant '.' '0'..'9'+
	;

Sentence:
	(('\"' (options{greedy=false;}: .)* '\"')
	| ('\'' (options{greedy=false;}: .) '\''))
	;

WS:
	( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;}
	;

COMMENT:
	'/*' .* '*/' {$channel=HIDDEN;}
	;
