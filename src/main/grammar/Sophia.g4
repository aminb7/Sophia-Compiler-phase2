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
	LBRACE (((varDec1 = varDeclaration | methodDec1 = method
	{
    		if ($varDec1.text != null) $classDec.addField(new FieldDeclaration($varDec1.varDec));
    		if ($methodDec1.text != null) $classDec.addMethod($methodDec1.methodDec);
    }
    )* c = constructor (varDec2 = varDeclaration | methodDec2 = method)*)
	{
		if ($varDec2.text != null) $classDec.addField(new FieldDeclaration($varDec2.varDec));
		if ($methodDec2.text != null) $classDec.addMethod($methodDec2.methodDec);
		if ($c.text != null) $classDec.setConstructor($c.c);
	}
	| ((varDec = varDeclaration | methodDec = method
	{
       	if ($varDec.text != null) $classDec.addField(new FieldDeclaration($varDec.varDec));
       	if ($varDec.text != null) $classDec.addMethod($methodDec.methodDec);
    }
    )*)) RBRACE
;

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

constructor returns[ConstructorDeclaration c]: DEF name = identifier LPAR args = methodArguments RPAR LBRACE body = methodBody RBRACE
	{
		$c = new ConstructorDeclaration($name.id);
		$c.setArgs($args.args);
        $c.setBody($body.body);
	};

methodArguments returns[ArrayList<VarDeclaration> args]: {$args = new ArrayList();}
	(var1 = variableWithType {$args.add($var1.varDec);} (COMMA var2 = variableWithType)*)?
	{ if ($var2.text != null) $args.add($var2.varDec); };

variableWithType returns[VarDeclaration varDec]: name = identifier COLON t = type {$varDec = new VarDeclaration($name.id, $t._type);};
//type ba toe
type returns[Type _type]: pdt = primitiveDataType {$_type = $pdt._primitive;}
	| lt = listType {$_type = $lt._listType;}
	| functionPointerType
	| classType {$_type = new IntType();};

classType returns[ClassType _classType]: iden = identifier {$_classType = new ClassType($iden.id);};

listType returns[ListType _listType]:
	LIST LPAR ((num = INT_VALUE SHARP t = type) { $_listType = new ListType($num.int, new ListNameType($t._type)); }
	| (lit = listItemsTypes) { $_listType = new ListType($lit._listItemsTypes); }) RPAR;

listItemsTypes returns[ArrayList<ListNameType> _listItemsTypes]:
	{$_listItemsTypes = new ArrayList();}
	lit = listItemType {$_listItemsTypes.add($lit._listItemType);}
	(COMMA lit = listItemType {$_listItemsTypes.add($lit._listItemType);})*;

listItemType returns[ListNameType _listItemType]:
	varDec = variableWithType { $_listItemType = new ListNameType($varDec.varDec); }
	| t = type { $_listItemType = new ListNameType($t._type); };

functionPointerType returns[FptrType _fptrType]: FUNC LESS_THAN (v = VOID | args = typesWithComma) ARROW (isVoid = VOID | returnType = type) GREATER_THAN
	{
		if ($isVoid.text == null)
			$_fptrType = new FptrType($args._typesWithComma, new NullType());
		else
			$_fptrType = new FptrType($args._typesWithComma, $returnType._type);
	};

typesWithComma returns[ArrayList<Type> _typesWithComma]: {$_typesWithComma = new ArrayList();}
	t1 = type {$_typesWithComma.add($t1._type);}
	(COMMA t2 = type {$_typesWithComma.add($t2._type);})*;

primitiveDataType returns[Type _primitive]:
	INT {$_primitive = new IntType();}
	| STRING {$_primitive = new StringType();}
	| BOOLEAN {$_primitive = new BoolType();};

methodBody returns[ArrayList<Statement> body]: {$body = new ArrayList();} (varDeclaration)* (statement)*;

statement returns[Statement _statement]:
	forStmt = forStatement {$_statement = $forStmt._for;}
	| foreachStmt = foreachStatement {$_statement = $foreachStmt._foreach;}
	| ifStmt = ifStatement {$_statement = $ifStmt._if;}
	| assignStmt = assignmentStatement {$_statement = $assignStmt.assign;}
	| prntStmt = printStatement {$_statement = $prntStmt._printStatement;}
	| cntnuBrkStmt = continueBreakStatement {$_statement = $cntnuBrkStmt._continueBreakStatement;}
	| mthdcall = methodCallStatement {$_statement = $mthdcall._methodCallStatement;}
	| rtrnStmt = returnStatement {$_statement = $rtrnStmt._returnStatement;}
	| blck = block {$_statement = $blck._block;};

block returns[BlockStmt _block]: {$_block = new BlockStmt();} LBRACE (stmt = statement {$_block.addStatement($stmt._statement);})* RBRACE;

assignmentStatement returns[AssignmentStmt assign]: as = assignment SEMICOLLON {$assign = $as.assign;};

assignment returns[AssignmentStmt assign]: or = orExpression ASSIGN exp = expression
	{ $assign = new AssignmentStmt($or._or, $exp._expression); };

printStatement returns[PrintStmt _printStatement]: PRINT LPAR exp1 = expression {$_printStatement = new PrintStmt($exp1._expression);} RPAR SEMICOLLON;

returnStatement returns[ReturnStmt _returnStatement]: RETURN (exp1 = expression)? {$_returnStatement = new ReturnStmt(); if ($exp1.text != null) $_returnStatement.setReturnedExpr($exp1._expression);} SEMICOLLON;

methodCallStatement returns[MethodCallStmt _methodCallStatement]: mthdcall = methodCall {$_methodCallStatement = new MethodCallStmt($mthdcall._methodCall);} SEMICOLLON;

methodCall returns[MethodCall _methodCall, Expression _expression]: othrExpr = otherExpression {$_expression = $othrExpr._otherExpression;} ((LPAR mthdCllArgs = methodCallArguments RPAR) {$_expression = new MethodCall($_expression, $mthdCllArgs._methodCallArguments);} | (DOT idntfr = identifier) {$_expression = new ObjectOrListMemberAccess($_expression, $idntfr.id);} | (LBRACK exp1 = expression RBRACK) {$_expression = new ListAccessByIndex($_expression, $exp1._expression);})* (LPAR mthdCllArgs = methodCallArguments RPAR) {$_methodCall = new MethodCall($_expression, $mthdCllArgs._methodCallArguments);};

methodCallArguments returns[ArrayList<Expression> _methodCallArguments]: {$_methodCallArguments = new ArrayList<>();} (expr1 = expression {$_methodCallArguments.add($expr1._expression);} (COMMA expr2 = expression {$_methodCallArguments.add($expr2._expression);})*)?;

continueBreakStatement returns[Statement _continueBreakStatement]: (BREAK {$_continueBreakStatement = new BreakStmt();} | CONTINUE {$_continueBreakStatement = new ContinueStmt();}) SEMICOLLON;

forStatement returns[ForStmt _for]: FOR LPAR (init = assignment)? SEMICOLLON (exp = expression)? SEMICOLLON (update = assignment)? RPAR body = statement
	{
		$_for = new ForStmt();
		if ($init.text != null) $_for.setInitialize($init.assign);
		if ($exp.text != null) $_for.setCondition($exp._expression);
		if ($update.text != null) $_for.setUpdate($update.assign);
		$_for.setBody($body._statement);
	};

foreachStatement returns[ForeachStmt _foreach]: FOREACH LPAR name = identifier IN exp = expression RPAR body = statement
	{
		$_foreach = new ForeachStmt($name.id, $exp._expression);
		$_foreach.setBody($body._statement);
	};

ifStatement returns[ConditionalStmt _if]: IF LPAR exp = expression RPAR thenBody = statement (ELSE elseBody = statement)?
	{
		$_if = new ConditionalStmt($exp._expression, $thenBody._statement);
		if ($elseBody.text != null) $_if.setElseBody($elseBody._statement);
	};

expression returns[Expression _expression]: orExpression (ASSIGN expression)?;

orExpression returns[Expression _or]: e1 = andExpression {$_or = $e1._and;} (OR e2 = andExpression
	{
		$_or = new BinaryExpression($_or, $e2._and, BinaryOperator.or);
	})*;

andExpression returns[Expression _and]: e1 = equalityExpression {$_and = $e1._eq;} (AND e2 = equalityExpression
	{
		$_and = new BinaryExpression($_and, $e2._eq, BinaryOperator.and);
	}
	)*;

equalityExpression returns[Expression _eq]: e1 = relationalExpression {$_eq = $e1._rel;}
	((equal = EQUAL | notEqual = NOT_EQUAL) e2 = relationalExpression
	{
		if ($equal.text == null)
			$_eq = new BinaryExpression($_eq, $e2._rel, BinaryOperator.neq);
		else
			$_eq = new BinaryExpression($_eq, $e2._rel, BinaryOperator.eq);
	}
	)*;

relationalExpression returns[Expression _rel]: e1 = additiveExpression {$_rel = $e1._add;}
	((gt = GREATER_THAN | ls = LESS_THAN) e2 = additiveExpression
	{
		if ($gt.text == null)
			$_rel = new BinaryExpression($_rel, $e2._add, BinaryOperator.lt);
		else
			$_rel = new BinaryExpression($_rel, $e2._add, BinaryOperator.gt);
	}
	)*;

additiveExpression returns[Expression _add]: e1 = multiplicativeExpression {$_add = $e1._mult;}
 	((plu = PLUS | minu = MINUS) e2 = multiplicativeExpression
 	{
 		if ($plu.text == null)
 			$_add = new BinaryExpression($_add, $e2._mult, BinaryOperator.sub);
 		else
 			$_add = new BinaryExpression($_add, $e2._mult, BinaryOperator.add);
 	}
 	)*;

multiplicativeExpression returns[Expression _mult]: e1 = preUnaryExpression {$_mult = $e1._preUnaryExpression;}
	((mul = MULT | di = DIVIDE | mo = MOD) e2 = preUnaryExpression
	{
		if ($mul.text != null)
			$_mult = new BinaryExpression($_mult, $e2._preUnaryExpression, BinaryOperator.mult);
		if ($di.text != null)
       		$_mult = new BinaryExpression($_mult, $e2._preUnaryExpression, BinaryOperator.div);
        if ($mo.text != null)
        	$_mult = new BinaryExpression($_mult, $e2._preUnaryExpression, BinaryOperator.mod);
	}
	)*;
preUnaryExpression returns[Expression _preUnaryExpression, UnaryOperator operator]: ((NOT {$operator = UnaryOperator.not;} | MINUS {$operator = UnaryOperator.minus;} | INCREMENT {$operator = UnaryOperator.preinc;} | DECREMENT {$operator = UnaryOperator.predec;} ) preUnryExp = preUnaryExpression) {$_preUnaryExpression = new UnaryExpression($preUnryExp._preUnaryExpression, $operator);} | pstUnryExp = postUnaryExpression {$_preUnaryExpression = $pstUnryExp._postUnaryExpression;};

postUnaryExpression returns[Expression _postUnaryExpression, UnaryOperator operator]: acssExp = accessExpression (inc = INCREMENT {$operator = UnaryOperator.postinc;} | dec = DECREMENT {$operator = UnaryOperator.postdec;})?
    {
        if (($inc.text == null) && ($dec.text == null))
            $_postUnaryExpression = $acssExp._accessExpression;
        else
            $_postUnaryExpression = new UnaryExpression($acssExp._accessExpression, $operator);
    };

accessExpression returns[Expression _accessExpression]: othrExp = otherExpression {$_accessExpression = $othrExp._otherExpression;} ((LPAR mthdCllArgs = methodCallArguments RPAR) {$_accessExpression = new MethodCall($_accessExpression, $mthdCllArgs._methodCallArguments);} | (DOT idntfr = identifier) {$_accessExpression = new ObjectOrListMemberAccess($_accessExpression, $idntfr.id);} | (LBRACK exp1 = expression RBRACK) {$_accessExpression = new ListAccessByIndex($_accessExpression, $exp1._expression);} )*;

otherExpression returns[Expression _otherExpression]: THIS {$_otherExpression = new ThisClass();} | nwExpr = newExpression {$_otherExpression = $nwExpr._newExpression;} | vals = values {$_otherExpression = $vals._values;} | idntfr = identifier {$_otherExpression = $idntfr.id;} | LPAR (expr1 = expression) RPAR {$_otherExpression = $expr1._expression;};

newExpression returns[NewClassInstance _newExpression]: NEW clssType = classType LPAR mthdCllArgs = methodCallArguments RPAR {$_newExpression = new NewClassInstance($clssType._classType, $mthdCllArgs._methodCallArguments);};

values returns[Value _values]: blVal = boolValue {$_values = $blVal._boolValue;} | strVal = STRING_VALUE {$_values = new StringValue($strVal.text);} | intVal = INT_VALUE {$_values = new IntValue($intVal.int);} | NULL {$_values = new NullValue();} | lstVal = listValue {$_values = $lstVal._listValue;};

boolValue returns[BoolValue _boolValue]: TRUE {$_boolValue = new BoolValue(true);} | FALSE {$_boolValue = new BoolValue(false);};

listValue returns[ListValue _listValue]: LBRACK mthdCllArgs = methodCallArguments RBRACK {$_listValue = new ListValue($mthdCllArgs._methodCallArguments);};

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
