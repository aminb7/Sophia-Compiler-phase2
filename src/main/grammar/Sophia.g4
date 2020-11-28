grammar Sophia;

@header{
    import main.ast.types.*;
    import main.ast.types.functionPointer.*;
    import main.ast.types.list.*;
    import main.ast.types.single.*;
    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.declaration.classDec.*;
    import main.ast.nodes.declaration.classDec.classMembersDec.*;
    import main.ast.nodes.declaration.variableDec.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.values.*;
    import main.ast.nodes.expression.values.primitive.*;
    import main.ast.nodes.statement.*;
    import main.ast.nodes.statement.loop.*;
}

sophia returns[Program sophiaProgram]: program EOF;

program returns[Program prog]: {$prog = new Program();} (classDec = sophiaClass {$prog.addClass($classDec.classDec);})*;

sophiaClass returns[ClassDeclaration classDec]: CLASS name = identifier (EXTENDS parent = identifier)?
	{
		$classDec = new ClassDeclaration($name.id);
		if ($parent.text != null)
			$classDec.setParentClassName($parent.id);
	}
	LBRACE (((varDec1 = varDeclaration | methodDec1 = method)* c = constructor (varDec2 = varDeclaration | methodDec2 = method)*)
	{
		if ($varDec1.text != null) $classDec.addField(new FieldDeclaration($varDec1.varDec));
		if ($varDec2.text != null) $classDec.addField(new FieldDeclaration($varDec2.varDec));
		if ($methodDec1.text != null) $classDec.addMethod($methodDec1.methodDec);
		if ($methodDec2.text != null) $classDec.addMethod($methodDec2.methodDec);
		if ($c.text != null) $classDec.setConstructor($c.c);
	}
	| ((varDec = varDeclaration | methodDec = method)*)) RBRACE
	{
    	if ($varDec.text != null) $classDec.addField(new FieldDeclaration($varDec.varDec));
    	if ($varDec.text != null) $classDec.addMethod($methodDec.methodDec);
	};

varDeclaration returns[VarDeclaration varDec]:
	name = identifier COLON t = type SEMICOLLON {$varDec = new VarDeclaration($name.id, $t._type);};

method returns[MethodDeclaration methodDec]:
	DEF (t = type | v = VOID) name = identifier LPAR args = methodArguments RPAR LBRACE body = methodBody RBRACE
	{
		if ($v.text == null)
			$methodDec = new MethodDeclaration($name.id, $t._type);
		else
			$methodDec = new MethodDeclaration($name.id, new NullType());
		$methodDec.setArgs($args.args);
		$methodDec.setBody($body.body);
	};

constructor returns[ConstructorDeclaration c]: DEF identifier LPAR methodArguments RPAR LBRACE methodBody RBRACE;

methodArguments returns[ArrayList<VarDeclaration> args]: {$args = new ArrayList();}
	(var1 = variableWithType {$args.add($var1.varDec);} (COMMA var2 = variableWithType)*)?
	{ if ($var2.text != null) $args.add($var2.varDec); };

variableWithType returns[VarDeclaration varDec]: name = identifier COLON t = type {$varDec = new VarDeclaration($name.id, $t._type);};

type returns[Type _type]: primitiveDataType | listType | functionPointerType | classType {$_type = new IntType();};

classType: identifier;

listType: LIST LPAR ((INT_VALUE SHARP type) | (listItemsTypes)) RPAR;

listItemsTypes: listItemType (COMMA listItemType)*;

listItemType: variableWithType | type;

functionPointerType: FUNC LESS_THAN (VOID | typesWithComma) ARROW (VOID | type) GREATER_THAN;

typesWithComma: type (COMMA type)*;

primitiveDataType: INT | STRING | BOOLEAN;

methodBody returns[ArrayList<Statement> body]: {$body = new ArrayList();} (varDeclaration)* (statement)*;

statement returns[Statement _statement]: forStatement | foreachStatement | ifStatement | assignmentStatement | prntStmt = printStatement {$_statement = $prntStmt.printStmt} | cntnuStatement = continueBreakStatement| methodCallStatement | returnStatement | block;

block: LBRACE (statement)* RBRACE;

assignmentStatement: assignment SEMICOLLON;

assignment: orExpression ASSIGN expression;

printStatement returns[PrintStmt printStmt]: PRINT LPAR exp1 = expression {$printStmt = new PrintStmt($exp1._expression)} RPAR SEMICOLLON;

returnStatement: RETURN expression? SEMICOLLON;

methodCallStatement: methodCall SEMICOLLON;

methodCall: otherExpression ((LPAR methodCallArguments RPAR) | (DOT identifier) | (LBRACK expression RBRACK))* (LPAR methodCallArguments RPAR);

methodCallArguments: (expression (COMMA expression)*)?;

continueBreakStatement: (BREAK | CONTINUE) SEMICOLLON;

forStatement: FOR LPAR (assignment)? SEMICOLLON (expression)? SEMICOLLON (assignment)? RPAR statement;

foreachStatement: FOREACH LPAR identifier IN expression RPAR statement;

ifStatement: IF LPAR expression RPAR statement (ELSE statement)?;

expression returns[Expression _expression]: orExpression (ASSIGN expression)?;

orExpression: andExpression (OR andExpression)*;

andExpression: equalityExpression (AND equalityExpression)*;

equalityExpression: relationalExpression ((EQUAL | NOT_EQUAL) relationalExpression)*;

relationalExpression: additiveExpression ((GREATER_THAN | LESS_THAN) additiveExpression)*;

additiveExpression: multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*;

multiplicativeExpression: preUnaryExpression ((MULT | DIVIDE | MOD) preUnaryExpression)*;

preUnaryExpression: ((NOT | MINUS | INCREMENT | DECREMENT) preUnaryExpression) | postUnaryExpression;

postUnaryExpression: accessExpression (INCREMENT | DECREMENT)?;

accessExpression: otherExpression ((LPAR methodCallArguments RPAR) | (DOT identifier) | (LBRACK expression RBRACK))*;

otherExpression: THIS | newExpression | values | identifier | LPAR (expression) RPAR;

newExpression: NEW classType LPAR methodCallArguments RPAR;

values: boolValue | STRING_VALUE | INT_VALUE | NULL | listValue;

boolValue: TRUE | FALSE;

listValue: LBRACK methodCallArguments RBRACK;

identifier returns[Identifier id]: name = IDENTIFIER {$id = new Identifier($name.text);};


DEF: 'def';
EXTENDS: 'extends';
CLASS: 'class';

PRINT: 'print';
FUNC: 'func';

NEW: 'new';

CONTINUE: 'continue';
BREAK: 'break';
RETURN: 'return';

FOREACH: 'foreach';
IN: 'in';
FOR: 'for';
IF: 'if';
ELSE: 'else';

BOOLEAN: 'bool';
STRING: 'string';
INT: 'int';
VOID: 'void';
NULL: 'null';
LIST: 'list';

TRUE: 'true';
FALSE: 'false';

THIS: 'this';

ARROW: '->';
GREATER_THAN: '>';
LESS_THAN: '<';
NOT_EQUAL: '!=';
EQUAL: '==';

MULT: '*';
DIVIDE: '/';
MOD: '%';
PLUS: '+';
MINUS: '-';
AND: '&&';
OR: '||';
NOT: '!';
QUESTION_MARK: '?';

ASSIGN: '=';

INCREMENT: '++';
DECREMENT: '--';

LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';

SHARP: '#';
COMMA: ',';
DOT: '.';
COLON: ':';
SEMICOLLON: ';';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;
STRING_VALUE: '"'~["]*'"';
COMMENT: ('//' ~( '\r' | '\n')*) -> skip;
WS: ([ \t\n\r]) -> skip;
