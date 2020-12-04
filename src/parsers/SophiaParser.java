// Generated from /home/amin/University/Semester5/PLC/Sophia-Compiler-phase2/src/main/grammar/Sophia.g4 by ANTLR 4.8
package parsers;

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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SophiaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, EXTENDS=2, CLASS=3, PRINT=4, FUNC=5, NEW=6, CONTINUE=7, BREAK=8, 
		RETURN=9, FOREACH=10, IN=11, FOR=12, IF=13, ELSE=14, BOOLEAN=15, STRING=16, 
		INT=17, VOID=18, NULL=19, LIST=20, TRUE=21, FALSE=22, THIS=23, ARROW=24, 
		GREATER_THAN=25, LESS_THAN=26, NOT_EQUAL=27, EQUAL=28, MULT=29, DIVIDE=30, 
		MOD=31, PLUS=32, MINUS=33, AND=34, OR=35, NOT=36, QUESTION_MARK=37, ASSIGN=38, 
		INCREMENT=39, DECREMENT=40, LPAR=41, RPAR=42, LBRACK=43, RBRACK=44, LBRACE=45, 
		RBRACE=46, SHARP=47, COMMA=48, DOT=49, COLON=50, SEMICOLLON=51, INT_VALUE=52, 
		IDENTIFIER=53, STRING_VALUE=54, COMMENT=55, WS=56;
	public static final int
		RULE_sophia = 0, RULE_program = 1, RULE_sophiaClass = 2, RULE_varDeclaration = 3, 
		RULE_method = 4, RULE_constructor = 5, RULE_methodArguments = 6, RULE_variableWithType = 7, 
		RULE_type = 8, RULE_classType = 9, RULE_listType = 10, RULE_listItemsTypes = 11, 
		RULE_listItemType = 12, RULE_functionPointerType = 13, RULE_typesWithComma = 14, 
		RULE_primitiveDataType = 15, RULE_methodBody = 16, RULE_statement = 17, 
		RULE_block = 18, RULE_assignmentStatement = 19, RULE_assignment = 20, 
		RULE_printStatement = 21, RULE_returnStatement = 22, RULE_methodCallStatement = 23, 
		RULE_methodCall = 24, RULE_methodCallArguments = 25, RULE_continueBreakStatement = 26, 
		RULE_forStatement = 27, RULE_foreachStatement = 28, RULE_ifStatement = 29, 
		RULE_expression = 30, RULE_orExpression = 31, RULE_andExpression = 32, 
		RULE_equalityExpression = 33, RULE_relationalExpression = 34, RULE_additiveExpression = 35, 
		RULE_multiplicativeExpression = 36, RULE_preUnaryExpression = 37, RULE_postUnaryExpression = 38, 
		RULE_accessExpression = 39, RULE_otherExpression = 40, RULE_newExpression = 41, 
		RULE_values = 42, RULE_boolValue = 43, RULE_listValue = 44, RULE_identifier = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"sophia", "program", "sophiaClass", "varDeclaration", "method", "constructor", 
			"methodArguments", "variableWithType", "type", "classType", "listType", 
			"listItemsTypes", "listItemType", "functionPointerType", "typesWithComma", 
			"primitiveDataType", "methodBody", "statement", "block", "assignmentStatement", 
			"assignment", "printStatement", "returnStatement", "methodCallStatement", 
			"methodCall", "methodCallArguments", "continueBreakStatement", "forStatement", 
			"foreachStatement", "ifStatement", "expression", "orExpression", "andExpression", 
			"equalityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"preUnaryExpression", "postUnaryExpression", "accessExpression", "otherExpression", 
			"newExpression", "values", "boolValue", "listValue", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'extends'", "'class'", "'print'", "'func'", "'new'", 
			"'continue'", "'break'", "'return'", "'foreach'", "'in'", "'for'", "'if'", 
			"'else'", "'bool'", "'string'", "'int'", "'void'", "'null'", "'list'", 
			"'true'", "'false'", "'this'", "'->'", "'>'", "'<'", "'!='", "'=='", 
			"'*'", "'/'", "'%'", "'+'", "'-'", "'&&'", "'||'", "'!'", "'?'", "'='", 
			"'++'", "'--'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'#'", "','", 
			"'.'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "EXTENDS", "CLASS", "PRINT", "FUNC", "NEW", "CONTINUE", 
			"BREAK", "RETURN", "FOREACH", "IN", "FOR", "IF", "ELSE", "BOOLEAN", "STRING", 
			"INT", "VOID", "NULL", "LIST", "TRUE", "FALSE", "THIS", "ARROW", "GREATER_THAN", 
			"LESS_THAN", "NOT_EQUAL", "EQUAL", "MULT", "DIVIDE", "MOD", "PLUS", "MINUS", 
			"AND", "OR", "NOT", "QUESTION_MARK", "ASSIGN", "INCREMENT", "DECREMENT", 
			"LPAR", "RPAR", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "SHARP", "COMMA", 
			"DOT", "COLON", "SEMICOLLON", "INT_VALUE", "IDENTIFIER", "STRING_VALUE", 
			"COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Sophia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SophiaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SophiaContext extends ParserRuleContext {
		public Program sophiaProgram;
		public ProgramContext prog;
		public TerminalNode EOF() { return getToken(SophiaParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public SophiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sophia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSophia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSophia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSophia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SophiaContext sophia() throws RecognitionException {
		SophiaContext _localctx = new SophiaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sophia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((SophiaContext)_localctx).prog = program();
			setState(93);
			match(EOF);
			((SophiaContext)_localctx).sophiaProgram =  ((SophiaContext)_localctx).prog.prog;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program prog;
		public SophiaClassContext classDec;
		public List<SophiaClassContext> sophiaClass() {
			return getRuleContexts(SophiaClassContext.class);
		}
		public SophiaClassContext sophiaClass(int i) {
			return getRuleContext(SophiaClassContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ProgramContext)_localctx).prog =  new Program(); _localctx.prog.setLine(1);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(97);
				((ProgramContext)_localctx).classDec = sophiaClass();
				_localctx.prog.addClass(((ProgramContext)_localctx).classDec.classDec);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SophiaClassContext extends ParserRuleContext {
		public ClassDeclaration classDec;
		public Token c;
		public IdentifierContext name;
		public IdentifierContext parent;
		public VarDeclarationContext varDec1;
		public MethodContext methodDec1;
		public ConstructorContext cnst;
		public VarDeclarationContext varDec2;
		public MethodContext methodDec2;
		public VarDeclarationContext varDec;
		public MethodContext methodDec;
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode CLASS() { return getToken(SophiaParser.CLASS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(SophiaParser.EXTENDS, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public SophiaClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sophiaClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSophiaClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSophiaClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSophiaClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SophiaClassContext sophiaClass() throws RecognitionException {
		SophiaClassContext _localctx = new SophiaClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sophiaClass);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			((SophiaClassContext)_localctx).c = match(CLASS);
			setState(106);
			((SophiaClassContext)_localctx).name = identifier();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(107);
				match(EXTENDS);
				setState(108);
				((SophiaClassContext)_localctx).parent = identifier();
				}
			}


					((SophiaClassContext)_localctx).classDec =  new ClassDeclaration(((SophiaClassContext)_localctx).name.id);
					if ((((SophiaClassContext)_localctx).parent!=null?_input.getText(((SophiaClassContext)_localctx).parent.start,((SophiaClassContext)_localctx).parent.stop):null) != null)
						_localctx.classDec.setParentClassName(((SophiaClassContext)_localctx).parent.id);
					_localctx.classDec.setLine(((SophiaClassContext)_localctx).c.getLine());
				
			setState(112);
			match(LBRACE);
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				{
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(119);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
							{
							setState(113);
							((SophiaClassContext)_localctx).varDec1 = varDeclaration();

									FieldDeclaration f = new FieldDeclaration(((SophiaClassContext)_localctx).varDec1.varDec);
									f.setLine(((SophiaClassContext)_localctx).varDec1.varDec.getLine());
									_localctx.classDec.addField(f);
								
							}
							break;
						case DEF:
							{
							setState(116);
							((SophiaClassContext)_localctx).methodDec1 = method();
							if ((((SophiaClassContext)_localctx).methodDec1!=null?_input.getText(((SophiaClassContext)_localctx).methodDec1.start,((SophiaClassContext)_localctx).methodDec1.stop):null) != null) _localctx.classDec.addMethod(((SophiaClassContext)_localctx).methodDec1.methodDec);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(124);
				((SophiaClassContext)_localctx).cnst = constructor();
				if ((((SophiaClassContext)_localctx).cnst!=null?_input.getText(((SophiaClassContext)_localctx).cnst.start,((SophiaClassContext)_localctx).cnst.stop):null) != null) _localctx.classDec.setConstructor(((SophiaClassContext)_localctx).cnst.c);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DEF || _la==IDENTIFIER) {
					{
					setState(132);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(126);
						((SophiaClassContext)_localctx).varDec2 = varDeclaration();

						   		FieldDeclaration g = new FieldDeclaration(((SophiaClassContext)_localctx).varDec2.varDec);
						   		g.setLine(((SophiaClassContext)_localctx).varDec2.varDec.getLine());
						    	_localctx.classDec.addField(g);
						    
						}
						break;
					case DEF:
						{
						setState(129);
						((SophiaClassContext)_localctx).methodDec2 = method();
						if ((((SophiaClassContext)_localctx).methodDec2!=null?_input.getText(((SophiaClassContext)_localctx).methodDec2.start,((SophiaClassContext)_localctx).methodDec2.stop):null) != null) _localctx.classDec.addMethod(((SophiaClassContext)_localctx).methodDec2.methodDec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DEF || _la==IDENTIFIER) {
					{
					setState(143);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(137);
						((SophiaClassContext)_localctx).varDec = varDeclaration();

								FieldDeclaration h = new FieldDeclaration(((SophiaClassContext)_localctx).varDec.varDec);
						    	h.setLine(((SophiaClassContext)_localctx).varDec.varDec.getLine());
						    	_localctx.classDec.addField(h);
							
						}
						break;
					case DEF:
						{
						setState(140);
						((SophiaClassContext)_localctx).methodDec = method();
						if ((((SophiaClassContext)_localctx).methodDec!=null?_input.getText(((SophiaClassContext)_localctx).methodDec.start,((SophiaClassContext)_localctx).methodDec.stop):null) != null) _localctx.classDec.addMethod(((SophiaClassContext)_localctx).methodDec.methodDec); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(150);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclaration varDec;
		public IdentifierContext name;
		public TypeContext t;
		public TerminalNode COLON() { return getToken(SophiaParser.COLON, 0); }
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			((VarDeclarationContext)_localctx).name = identifier();
			setState(153);
			match(COLON);
			setState(154);
			((VarDeclarationContext)_localctx).t = type();
			setState(155);
			match(SEMICOLLON);
			((VarDeclarationContext)_localctx).varDec =  new VarDeclaration(((VarDeclarationContext)_localctx).name.id, ((VarDeclarationContext)_localctx).t._type); _localctx.varDec.setLine(((VarDeclarationContext)_localctx).name.id.getLine());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public MethodDeclaration methodDec;
		public Token d;
		public TypeContext t;
		public Token v;
		public IdentifierContext name;
		public MethodArgumentsContext args;
		public MethodBodyContext body;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode DEF() { return getToken(SophiaParser.DEF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SophiaParser.VOID, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			((MethodContext)_localctx).d = match(DEF);
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				setState(159);
				((MethodContext)_localctx).t = type();
				}
				break;
			case VOID:
				{
				setState(160);
				((MethodContext)_localctx).v = match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(163);
			((MethodContext)_localctx).name = identifier();
			setState(164);
			match(LPAR);
			setState(165);
			((MethodContext)_localctx).args = methodArguments();
			setState(166);
			match(RPAR);
			setState(167);
			match(LBRACE);
			setState(168);
			((MethodContext)_localctx).body = methodBody();
			setState(169);
			match(RBRACE);

					if ((((MethodContext)_localctx).v!=null?((MethodContext)_localctx).v.getText():null) == null)
						((MethodContext)_localctx).methodDec =  new MethodDeclaration(((MethodContext)_localctx).name.id, ((MethodContext)_localctx).t._type);
					else
						((MethodContext)_localctx).methodDec =  new MethodDeclaration(((MethodContext)_localctx).name.id, new NullType());
					_localctx.methodDec.setArgs(((MethodContext)_localctx).args.args);
					_localctx.methodDec.setBody(((MethodContext)_localctx).body.body);
					_localctx.methodDec.setLocalVars(((MethodContext)_localctx).body.localVars);
					_localctx.methodDec.setLine(((MethodContext)_localctx).d.getLine());
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public ConstructorDeclaration c;
		public Token d;
		public IdentifierContext name;
		public MethodArgumentsContext args;
		public MethodBodyContext body;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode DEF() { return getToken(SophiaParser.DEF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((ConstructorContext)_localctx).d = match(DEF);
			setState(173);
			((ConstructorContext)_localctx).name = identifier();
			setState(174);
			match(LPAR);
			setState(175);
			((ConstructorContext)_localctx).args = methodArguments();
			setState(176);
			match(RPAR);
			setState(177);
			match(LBRACE);
			setState(178);
			((ConstructorContext)_localctx).body = methodBody();
			setState(179);
			match(RBRACE);

					((ConstructorContext)_localctx).c =  new ConstructorDeclaration(((ConstructorContext)_localctx).name.id);
					_localctx.c.setArgs(((ConstructorContext)_localctx).args.args);
			        _localctx.c.setBody(((ConstructorContext)_localctx).body.body);
			        _localctx.c.setLocalVars(((ConstructorContext)_localctx).body.localVars);
			        _localctx.c.setLine(((ConstructorContext)_localctx).d.getLine());
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodArgumentsContext extends ParserRuleContext {
		public ArrayList<VarDeclaration> args;
		public VariableWithTypeContext var1;
		public VariableWithTypeContext var2;
		public List<VariableWithTypeContext> variableWithType() {
			return getRuleContexts(VariableWithTypeContext.class);
		}
		public VariableWithTypeContext variableWithType(int i) {
			return getRuleContext(VariableWithTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public MethodArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgumentsContext methodArguments() throws RecognitionException {
		MethodArgumentsContext _localctx = new MethodArgumentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MethodArgumentsContext)_localctx).args =  new ArrayList();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(183);
				((MethodArgumentsContext)_localctx).var1 = variableWithType();
				_localctx.args.add(((MethodArgumentsContext)_localctx).var1.varDec);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(185);
					match(COMMA);
					setState(186);
					((MethodArgumentsContext)_localctx).var2 = variableWithType();
					 if ((((MethodArgumentsContext)_localctx).var2!=null?_input.getText(((MethodArgumentsContext)_localctx).var2.start,((MethodArgumentsContext)_localctx).var2.stop):null) != null) _localctx.args.add(((MethodArgumentsContext)_localctx).var2.varDec); 
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableWithTypeContext extends ParserRuleContext {
		public VarDeclaration varDec;
		public IdentifierContext name;
		public TypeContext t;
		public TerminalNode COLON() { return getToken(SophiaParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableWithTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableWithType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterVariableWithType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitVariableWithType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitVariableWithType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableWithTypeContext variableWithType() throws RecognitionException {
		VariableWithTypeContext _localctx = new VariableWithTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableWithType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			((VariableWithTypeContext)_localctx).name = identifier();
			setState(197);
			match(COLON);
			setState(198);
			((VariableWithTypeContext)_localctx).t = type();
			((VariableWithTypeContext)_localctx).varDec =  new VarDeclaration(((VariableWithTypeContext)_localctx).name.id, ((VariableWithTypeContext)_localctx).t._type);  _localctx.varDec.setLine(((VariableWithTypeContext)_localctx).name.id.getLine());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type _type;
		public PrimitiveDataTypeContext pdt;
		public ListTypeContext lt;
		public FunctionPointerTypeContext fp;
		public ClassTypeContext ct;
		public PrimitiveDataTypeContext primitiveDataType() {
			return getRuleContext(PrimitiveDataTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public FunctionPointerTypeContext functionPointerType() {
			return getRuleContext(FunctionPointerTypeContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case STRING:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				((TypeContext)_localctx).pdt = primitiveDataType();
				((TypeContext)_localctx)._type =  ((TypeContext)_localctx).pdt._primitive;
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				((TypeContext)_localctx).lt = listType();
				((TypeContext)_localctx)._type =  ((TypeContext)_localctx).lt._listType;
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				((TypeContext)_localctx).fp = functionPointerType();
				((TypeContext)_localctx)._type =  ((TypeContext)_localctx).fp._fptrType;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				((TypeContext)_localctx).ct = classType();
				((TypeContext)_localctx)._type =  ((TypeContext)_localctx).ct._classType;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public ClassType _classType;
		public IdentifierContext iden;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			((ClassTypeContext)_localctx).iden = identifier();
			((ClassTypeContext)_localctx)._classType =  new ClassType(((ClassTypeContext)_localctx).iden.id);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListTypeContext extends ParserRuleContext {
		public ListType _listType;
		public Token num;
		public TypeContext t;
		public ListItemsTypesContext lit;
		public TerminalNode LIST() { return getToken(SophiaParser.LIST, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode SHARP() { return getToken(SophiaParser.SHARP, 0); }
		public TerminalNode INT_VALUE() { return getToken(SophiaParser.INT_VALUE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListItemsTypesContext listItemsTypes() {
			return getRuleContext(ListItemsTypesContext.class,0);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(LIST);
			setState(219);
			match(LPAR);
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VALUE:
				{
				{
				setState(220);
				((ListTypeContext)_localctx).num = match(INT_VALUE);
				setState(221);
				match(SHARP);
				setState(222);
				((ListTypeContext)_localctx).t = type();
				}
				 ((ListTypeContext)_localctx)._listType =  new ListType((((ListTypeContext)_localctx).num!=null?Integer.valueOf(((ListTypeContext)_localctx).num.getText()):0), new ListNameType(((ListTypeContext)_localctx).t._type)); 
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				{
				setState(226);
				((ListTypeContext)_localctx).lit = listItemsTypes();
				}
				 ((ListTypeContext)_localctx)._listType =  new ListType(((ListTypeContext)_localctx).lit._listItemsTypes); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(231);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListItemsTypesContext extends ParserRuleContext {
		public ArrayList<ListNameType> _listItemsTypes;
		public ListItemTypeContext lit;
		public List<ListItemTypeContext> listItemType() {
			return getRuleContexts(ListItemTypeContext.class);
		}
		public ListItemTypeContext listItemType(int i) {
			return getRuleContext(ListItemTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public ListItemsTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItemsTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListItemsTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListItemsTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListItemsTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListItemsTypesContext listItemsTypes() throws RecognitionException {
		ListItemsTypesContext _localctx = new ListItemsTypesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listItemsTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ListItemsTypesContext)_localctx)._listItemsTypes =  new ArrayList();
			setState(234);
			((ListItemsTypesContext)_localctx).lit = listItemType();
			_localctx._listItemsTypes.add(((ListItemsTypesContext)_localctx).lit._listItemType);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(236);
				match(COMMA);
				setState(237);
				((ListItemsTypesContext)_localctx).lit = listItemType();
				_localctx._listItemsTypes.add(((ListItemsTypesContext)_localctx).lit._listItemType);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListItemTypeContext extends ParserRuleContext {
		public ListNameType _listItemType;
		public VariableWithTypeContext varDec;
		public TypeContext t;
		public VariableWithTypeContext variableWithType() {
			return getRuleContext(VariableWithTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListItemTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItemType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListItemType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListItemType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListItemType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListItemTypeContext listItemType() throws RecognitionException {
		ListItemTypeContext _localctx = new ListItemTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listItemType);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				((ListItemTypeContext)_localctx).varDec = variableWithType();
				 ((ListItemTypeContext)_localctx)._listItemType =  new ListNameType(((ListItemTypeContext)_localctx).varDec.varDec); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				((ListItemTypeContext)_localctx).t = type();
				 ((ListItemTypeContext)_localctx)._listItemType =  new ListNameType(((ListItemTypeContext)_localctx).t._type); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionPointerTypeContext extends ParserRuleContext {
		public FptrType _fptrType;
		public Token v;
		public TypesWithCommaContext args;
		public Token isVoid;
		public TypeContext returnType;
		public TerminalNode FUNC() { return getToken(SophiaParser.FUNC, 0); }
		public TerminalNode LESS_THAN() { return getToken(SophiaParser.LESS_THAN, 0); }
		public TerminalNode ARROW() { return getToken(SophiaParser.ARROW, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SophiaParser.GREATER_THAN, 0); }
		public List<TerminalNode> VOID() { return getTokens(SophiaParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(SophiaParser.VOID, i);
		}
		public TypesWithCommaContext typesWithComma() {
			return getRuleContext(TypesWithCommaContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionPointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterFunctionPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitFunctionPointerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitFunctionPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionPointerTypeContext functionPointerType() throws RecognitionException {
		FunctionPointerTypeContext _localctx = new FunctionPointerTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionPointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(FUNC);
			setState(254);
			match(LESS_THAN);
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(255);
				((FunctionPointerTypeContext)_localctx).v = match(VOID);
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				setState(256);
				((FunctionPointerTypeContext)_localctx).args = typesWithComma();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(259);
			match(ARROW);
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(260);
				((FunctionPointerTypeContext)_localctx).isVoid = match(VOID);
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				setState(261);
				((FunctionPointerTypeContext)_localctx).returnType = type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(264);
			match(GREATER_THAN);

					if ((((FunctionPointerTypeContext)_localctx).isVoid!=null?((FunctionPointerTypeContext)_localctx).isVoid.getText():null) != null){
						((FunctionPointerTypeContext)_localctx)._fptrType =  new FptrType(((FunctionPointerTypeContext)_localctx).args._typesWithComma, new NullType());
					}
					else{
						((FunctionPointerTypeContext)_localctx)._fptrType =  new FptrType(((FunctionPointerTypeContext)_localctx).args._typesWithComma, ((FunctionPointerTypeContext)_localctx).returnType._type);
			        }
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesWithCommaContext extends ParserRuleContext {
		public ArrayList<Type> _typesWithComma;
		public TypeContext t1;
		public TypeContext t2;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public TypesWithCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesWithComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterTypesWithComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitTypesWithComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitTypesWithComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesWithCommaContext typesWithComma() throws RecognitionException {
		TypesWithCommaContext _localctx = new TypesWithCommaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typesWithComma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((TypesWithCommaContext)_localctx)._typesWithComma =  new ArrayList();
			setState(268);
			((TypesWithCommaContext)_localctx).t1 = type();
			_localctx._typesWithComma.add(((TypesWithCommaContext)_localctx).t1._type);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(270);
				match(COMMA);
				setState(271);
				((TypesWithCommaContext)_localctx).t2 = type();
				_localctx._typesWithComma.add(((TypesWithCommaContext)_localctx).t2._type);
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveDataTypeContext extends ParserRuleContext {
		public Type _primitive;
		public TerminalNode INT() { return getToken(SophiaParser.INT, 0); }
		public TerminalNode STRING() { return getToken(SophiaParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(SophiaParser.BOOLEAN, 0); }
		public PrimitiveDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveDataTypeContext primitiveDataType() throws RecognitionException {
		PrimitiveDataTypeContext _localctx = new PrimitiveDataTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primitiveDataType);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(INT);
				((PrimitiveDataTypeContext)_localctx)._primitive =  new IntType();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(STRING);
				((PrimitiveDataTypeContext)_localctx)._primitive =  new StringType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(BOOLEAN);
				((PrimitiveDataTypeContext)_localctx)._primitive =  new BoolType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public ArrayList<Statement> body;
		public ArrayList<VarDeclaration> localVars;
		public VarDeclarationContext varDec;
		public StatementContext stmt;
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((MethodBodyContext)_localctx).body =  new ArrayList(); ((MethodBodyContext)_localctx).localVars =  new ArrayList();
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					((MethodBodyContext)_localctx).varDec = varDeclaration();
					_localctx.localVars.add(((MethodBodyContext)_localctx).varDec.varDec);
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NEW) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << FOREACH) | (1L << FOR) | (1L << IF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << LBRACE) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				{
				setState(296);
				((MethodBodyContext)_localctx).stmt = statement();
				_localctx.body.add(((MethodBodyContext)_localctx).stmt._statement);
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Statement _statement;
		public ForStatementContext forStmt;
		public ForeachStatementContext foreachStmt;
		public IfStatementContext ifStmt;
		public AssignmentStatementContext assignStmt;
		public PrintStatementContext prntStmt;
		public ContinueBreakStatementContext cntnuBrkStmt;
		public MethodCallStatementContext mthdcall;
		public ReturnStatementContext rtrnStmt;
		public BlockContext blck;
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ContinueBreakStatementContext continueBreakStatement() {
			return getRuleContext(ContinueBreakStatementContext.class,0);
		}
		public MethodCallStatementContext methodCallStatement() {
			return getRuleContext(MethodCallStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				((StatementContext)_localctx).forStmt = forStatement();
				((StatementContext)_localctx)._statement =  ((StatementContext)_localctx).forStmt._for;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				((StatementContext)_localctx).foreachStmt = foreachStatement();
				((StatementContext)_localctx)._statement =  ((StatementContext)_localctx).foreachStmt._foreach;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				((StatementContext)_localctx).ifStmt = ifStatement();
				((StatementContext)_localctx)._statement =  ((StatementContext)_localctx).ifStmt._if;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				((StatementContext)_localctx).assignStmt = assignmentStatement();
				((StatementContext)_localctx)._statement =  ((StatementContext)_localctx).assignStmt.assign;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(316);
				((StatementContext)_localctx).prntStmt = printStatement();
				((StatementContext)_localctx)._statement =  ((StatementContext)_localctx).prntStmt._printStatement;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(319);
				((StatementContext)_localctx).cntnuBrkStmt = continueBreakStatement();
				((StatementContext)_localctx)._statement =  ((StatementContext)_localctx).cntnuBrkStmt._continueBreakStatement;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(322);
				((StatementContext)_localctx).mthdcall = methodCallStatement();
				((StatementContext)_localctx)._statement =  ((StatementContext)_localctx).mthdcall._methodCallStatement;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(325);
				((StatementContext)_localctx).rtrnStmt = returnStatement();
				((StatementContext)_localctx)._statement =  ((StatementContext)_localctx).rtrnStmt._returnStatement;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(328);
				((StatementContext)_localctx).blck = block();
				((StatementContext)_localctx)._statement =  ((StatementContext)_localctx).blck._block;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockStmt _block;
		public Token lb;
		public StatementContext stmt;
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((BlockContext)_localctx)._block =  new BlockStmt();
			setState(334);
			((BlockContext)_localctx).lb = match(LBRACE);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NEW) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << FOREACH) | (1L << FOR) | (1L << IF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << LBRACE) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				{
				setState(335);
				((BlockContext)_localctx).stmt = statement();
				_localctx._block.setLine(((BlockContext)_localctx).lb.getLine()); _localctx._block.addStatement(((BlockContext)_localctx).stmt._statement);
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStmt assign;
		public AssignmentContext as;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			((AssignmentStatementContext)_localctx).as = assignment();
			setState(346);
			match(SEMICOLLON);
			((AssignmentStatementContext)_localctx).assign =  ((AssignmentStatementContext)_localctx).as.assign;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentStmt assign;
		public OrExpressionContext or;
		public Token as;
		public ExpressionContext exp;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SophiaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			((AssignmentContext)_localctx).or = orExpression();
			setState(350);
			((AssignmentContext)_localctx).as = match(ASSIGN);
			setState(351);
			((AssignmentContext)_localctx).exp = expression();
			 ((AssignmentContext)_localctx).assign =  new AssignmentStmt(((AssignmentContext)_localctx).or._or, ((AssignmentContext)_localctx).exp._expression); _localctx.assign.setLine(((AssignmentContext)_localctx).as.getLine());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStmt _printStatement;
		public Token p;
		public ExpressionContext exp1;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public TerminalNode PRINT() { return getToken(SophiaParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			((PrintStatementContext)_localctx).p = match(PRINT);
			setState(355);
			match(LPAR);
			setState(356);
			((PrintStatementContext)_localctx).exp1 = expression();
			((PrintStatementContext)_localctx)._printStatement =  new PrintStmt(((PrintStatementContext)_localctx).exp1._expression); _localctx._printStatement.setLine(((PrintStatementContext)_localctx).p.getLine());
			setState(358);
			match(RPAR);
			setState(359);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStmt _returnStatement;
		public Token r;
		public ExpressionContext exp1;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public TerminalNode RETURN() { return getToken(SophiaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			((ReturnStatementContext)_localctx).r = match(RETURN);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(362);
				((ReturnStatementContext)_localctx).exp1 = expression();
				}
			}

			((ReturnStatementContext)_localctx)._returnStatement =  new ReturnStmt();
			        if ((((ReturnStatementContext)_localctx).exp1!=null?_input.getText(((ReturnStatementContext)_localctx).exp1.start,((ReturnStatementContext)_localctx).exp1.stop):null) != null)
			            _localctx._returnStatement.setReturnedExpr(((ReturnStatementContext)_localctx).exp1._expression);
			        else
			            _localctx._returnStatement.getReturnedExpr().setLine(((ReturnStatementContext)_localctx).r.getLine());
			        _localctx._returnStatement.setLine(((ReturnStatementContext)_localctx).r.getLine());
			    
			setState(366);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallStatementContext extends ParserRuleContext {
		public MethodCallStmt _methodCallStatement;
		public MethodCallContext mthdcall;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MethodCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallStatementContext methodCallStatement() throws RecognitionException {
		MethodCallStatementContext _localctx = new MethodCallStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			((MethodCallStatementContext)_localctx).mthdcall = methodCall();
			((MethodCallStatementContext)_localctx)._methodCallStatement =  new MethodCallStmt(((MethodCallStatementContext)_localctx).mthdcall._methodCall); _localctx._methodCallStatement.setLine(((MethodCallStatementContext)_localctx).mthdcall._methodCall.getLine());
			setState(370);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public MethodCall _methodCall;
		public Expression _expression;
		public OtherExpressionContext othrExpr;
		public Token lp;
		public MethodCallArgumentsContext mthdCllArgs;
		public IdentifierContext idntfr;
		public Token lb;
		public ExpressionContext exp1;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(SophiaParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SophiaParser.RPAR, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(SophiaParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SophiaParser.LPAR, i);
		}
		public List<MethodCallArgumentsContext> methodCallArguments() {
			return getRuleContexts(MethodCallArgumentsContext.class);
		}
		public MethodCallArgumentsContext methodCallArguments(int i) {
			return getRuleContext(MethodCallArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SophiaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SophiaParser.DOT, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SophiaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SophiaParser.RBRACK, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SophiaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SophiaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_methodCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			((MethodCallContext)_localctx).othrExpr = otherExpression();
			((MethodCallContext)_localctx)._expression =  ((MethodCallContext)_localctx).othrExpr._otherExpression;
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(391);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(374);
						((MethodCallContext)_localctx).lp = match(LPAR);
						setState(375);
						((MethodCallContext)_localctx).mthdCllArgs = methodCallArguments();
						setState(376);
						match(RPAR);
						}
						((MethodCallContext)_localctx)._expression =  new MethodCall(_localctx._expression, ((MethodCallContext)_localctx).mthdCllArgs._methodCallArguments); _localctx._expression.setLine(((MethodCallContext)_localctx).lp.getLine());
						}
						break;
					case DOT:
						{
						{
						setState(380);
						match(DOT);
						setState(381);
						((MethodCallContext)_localctx).idntfr = identifier();
						}
						((MethodCallContext)_localctx)._expression =  new ObjectOrListMemberAccess(_localctx._expression, ((MethodCallContext)_localctx).idntfr.id); _localctx._expression.setLine(((MethodCallContext)_localctx).idntfr.id.getLine()); 
						}
						break;
					case LBRACK:
						{
						{
						setState(385);
						((MethodCallContext)_localctx).lb = match(LBRACK);
						setState(386);
						((MethodCallContext)_localctx).exp1 = expression();
						setState(387);
						match(RBRACK);
						}
						((MethodCallContext)_localctx)._expression =  new ListAccessByIndex(_localctx._expression, ((MethodCallContext)_localctx).exp1._expression); _localctx._expression.setLine(((MethodCallContext)_localctx).lb.getLine());
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			{
			setState(396);
			((MethodCallContext)_localctx).lp = match(LPAR);
			setState(397);
			((MethodCallContext)_localctx).mthdCllArgs = methodCallArguments();
			setState(398);
			match(RPAR);
			}
			((MethodCallContext)_localctx)._methodCall =  new MethodCall(_localctx._expression, ((MethodCallContext)_localctx).mthdCllArgs._methodCallArguments); _localctx._methodCall.setLine(((MethodCallContext)_localctx).lp.getLine());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallArgumentsContext extends ParserRuleContext {
		public ArrayList<Expression> _methodCallArguments;
		public ExpressionContext expr1;
		public ExpressionContext expr2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public MethodCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallArgumentsContext methodCallArguments() throws RecognitionException {
		MethodCallArgumentsContext _localctx = new MethodCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodCallArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MethodCallArgumentsContext)_localctx)._methodCallArguments =  new ArrayList<>();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(403);
				((MethodCallArgumentsContext)_localctx).expr1 = expression();
				_localctx._methodCallArguments.add(((MethodCallArgumentsContext)_localctx).expr1._expression);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(405);
					match(COMMA);
					setState(406);
					((MethodCallArgumentsContext)_localctx).expr2 = expression();
					_localctx._methodCallArguments.add(((MethodCallArgumentsContext)_localctx).expr2._expression);
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueBreakStatementContext extends ParserRuleContext {
		public Statement _continueBreakStatement;
		public Token b;
		public Token c;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public TerminalNode BREAK() { return getToken(SophiaParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(SophiaParser.CONTINUE, 0); }
		public ContinueBreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueBreakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterContinueBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitContinueBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitContinueBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueBreakStatementContext continueBreakStatement() throws RecognitionException {
		ContinueBreakStatementContext _localctx = new ContinueBreakStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_continueBreakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				{
				setState(416);
				((ContinueBreakStatementContext)_localctx).b = match(BREAK);
				((ContinueBreakStatementContext)_localctx)._continueBreakStatement =  new BreakStmt(); _localctx._continueBreakStatement.setLine(((ContinueBreakStatementContext)_localctx).b.getLine());
				}
				break;
			case CONTINUE:
				{
				setState(418);
				((ContinueBreakStatementContext)_localctx).c = match(CONTINUE);
				((ContinueBreakStatementContext)_localctx)._continueBreakStatement =  new ContinueStmt(); _localctx._continueBreakStatement.setLine(((ContinueBreakStatementContext)_localctx).c.getLine());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(422);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public ForStmt _for;
		public Token f;
		public AssignmentContext init;
		public ExpressionContext exp;
		public AssignmentContext update;
		public StatementContext body;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public List<TerminalNode> SEMICOLLON() { return getTokens(SophiaParser.SEMICOLLON); }
		public TerminalNode SEMICOLLON(int i) {
			return getToken(SophiaParser.SEMICOLLON, i);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode FOR() { return getToken(SophiaParser.FOR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			((ForStatementContext)_localctx).f = match(FOR);
			setState(425);
			match(LPAR);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(426);
				((ForStatementContext)_localctx).init = assignment();
				}
			}

			setState(429);
			match(SEMICOLLON);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(430);
				((ForStatementContext)_localctx).exp = expression();
				}
			}

			setState(433);
			match(SEMICOLLON);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(434);
				((ForStatementContext)_localctx).update = assignment();
				}
			}

			setState(437);
			match(RPAR);
			setState(438);
			((ForStatementContext)_localctx).body = statement();

					((ForStatementContext)_localctx)._for =  new ForStmt();
					_localctx._for.setLine(((ForStatementContext)_localctx).f.getLine());
					if ((((ForStatementContext)_localctx).init!=null?_input.getText(((ForStatementContext)_localctx).init.start,((ForStatementContext)_localctx).init.stop):null) != null) _localctx._for.setInitialize(((ForStatementContext)_localctx).init.assign);
					if ((((ForStatementContext)_localctx).exp!=null?_input.getText(((ForStatementContext)_localctx).exp.start,((ForStatementContext)_localctx).exp.stop):null) != null) _localctx._for.setCondition(((ForStatementContext)_localctx).exp._expression);
					if ((((ForStatementContext)_localctx).update!=null?_input.getText(((ForStatementContext)_localctx).update.start,((ForStatementContext)_localctx).update.stop):null) != null) _localctx._for.setUpdate(((ForStatementContext)_localctx).update.assign);
					_localctx._for.setBody(((ForStatementContext)_localctx).body._statement);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachStatementContext extends ParserRuleContext {
		public ForeachStmt _foreach;
		public Token f;
		public IdentifierContext name;
		public ExpressionContext exp;
		public StatementContext body;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode IN() { return getToken(SophiaParser.IN, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode FOREACH() { return getToken(SophiaParser.FOREACH, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitForeachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			((ForeachStatementContext)_localctx).f = match(FOREACH);
			setState(442);
			match(LPAR);
			setState(443);
			((ForeachStatementContext)_localctx).name = identifier();
			setState(444);
			match(IN);
			setState(445);
			((ForeachStatementContext)_localctx).exp = expression();
			setState(446);
			match(RPAR);
			setState(447);
			((ForeachStatementContext)_localctx).body = statement();

					((ForeachStatementContext)_localctx)._foreach =  new ForeachStmt(((ForeachStatementContext)_localctx).name.id, ((ForeachStatementContext)_localctx).exp._expression);
					_localctx._foreach.setLine(((ForeachStatementContext)_localctx).f.getLine());
					_localctx._foreach.setBody(((ForeachStatementContext)_localctx).body._statement);
					_localctx._foreach.setList(((ForeachStatementContext)_localctx).exp._expression);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ConditionalStmt _if;
		public Token i;
		public ExpressionContext exp;
		public StatementContext thenBody;
		public StatementContext elseBody;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode IF() { return getToken(SophiaParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SophiaParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			((IfStatementContext)_localctx).i = match(IF);
			setState(451);
			match(LPAR);
			setState(452);
			((IfStatementContext)_localctx).exp = expression();
			setState(453);
			match(RPAR);
			setState(454);
			((IfStatementContext)_localctx).thenBody = statement();
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(455);
				match(ELSE);
				setState(456);
				((IfStatementContext)_localctx).elseBody = statement();
				}
				break;
			}

					((IfStatementContext)_localctx)._if =  new ConditionalStmt(((IfStatementContext)_localctx).exp._expression, ((IfStatementContext)_localctx).thenBody._statement);
					_localctx._if.setLine(((IfStatementContext)_localctx).i.getLine());
					if ((((IfStatementContext)_localctx).elseBody!=null?_input.getText(((IfStatementContext)_localctx).elseBody.start,((IfStatementContext)_localctx).elseBody.stop):null) != null) _localctx._if.setElseBody(((IfStatementContext)_localctx).elseBody._statement);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression _expression;
		public OrExpressionContext exp1;
		public ExpressionContext exp2;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SophiaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			((ExpressionContext)_localctx).exp1 = orExpression();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(462);
				match(ASSIGN);
				setState(463);
				((ExpressionContext)_localctx).exp2 = expression();
				}
			}


					((ExpressionContext)_localctx)._expression =  ((ExpressionContext)_localctx).exp1._or;
					if ((((ExpressionContext)_localctx).exp2!=null?_input.getText(((ExpressionContext)_localctx).exp2.start,((ExpressionContext)_localctx).exp2.stop):null) != null)
						((ExpressionContext)_localctx)._expression =  new BinaryExpression(_localctx._expression, ((ExpressionContext)_localctx).exp2._expression, BinaryOperator.assign);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExpressionContext extends ParserRuleContext {
		public Expression _or;
		public AndExpressionContext e1;
		public Token o;
		public AndExpressionContext e2;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SophiaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SophiaParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			((OrExpressionContext)_localctx).e1 = andExpression();
			((OrExpressionContext)_localctx)._or =  ((OrExpressionContext)_localctx).e1._and;
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(470);
				((OrExpressionContext)_localctx).o = match(OR);
				setState(471);
				((OrExpressionContext)_localctx).e2 = andExpression();

						((OrExpressionContext)_localctx)._or =  new BinaryExpression(_localctx._or, ((OrExpressionContext)_localctx).e2._and, BinaryOperator.or);
						_localctx._or.setLine(((OrExpressionContext)_localctx).o.getLine());
					
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression _and;
		public EqualityExpressionContext e1;
		public Token a;
		public EqualityExpressionContext e2;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SophiaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SophiaParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			((AndExpressionContext)_localctx).e1 = equalityExpression();
			((AndExpressionContext)_localctx)._and =  ((AndExpressionContext)_localctx).e1._eq;
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(481);
				((AndExpressionContext)_localctx).a = match(AND);
				setState(482);
				((AndExpressionContext)_localctx).e2 = equalityExpression();

						((AndExpressionContext)_localctx)._and =  new BinaryExpression(_localctx._and, ((AndExpressionContext)_localctx).e2._eq, BinaryOperator.and);
						_localctx._and.setLine(((AndExpressionContext)_localctx).a.getLine());
					
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression _eq;
		public RelationalExpressionContext e1;
		public Token equal;
		public RelationalExpressionContext e2;
		public Token notEqual;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(SophiaParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(SophiaParser.EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(SophiaParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(SophiaParser.NOT_EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			((EqualityExpressionContext)_localctx).e1 = relationalExpression();
			((EqualityExpressionContext)_localctx)._eq =  ((EqualityExpressionContext)_localctx).e1._rel;
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT_EQUAL || _la==EQUAL) {
				{
				setState(500);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					{
					setState(492);
					((EqualityExpressionContext)_localctx).equal = match(EQUAL);
					setState(493);
					((EqualityExpressionContext)_localctx).e2 = relationalExpression();
					((EqualityExpressionContext)_localctx)._eq =  new BinaryExpression(_localctx._eq, ((EqualityExpressionContext)_localctx).e2._rel, BinaryOperator.eq); _localctx._eq.setLine(((EqualityExpressionContext)_localctx).equal.getLine());
					}
					}
					break;
				case NOT_EQUAL:
					{
					{
					setState(496);
					((EqualityExpressionContext)_localctx).notEqual = match(NOT_EQUAL);
					setState(497);
					((EqualityExpressionContext)_localctx).e2 = relationalExpression();
					((EqualityExpressionContext)_localctx)._eq =  new BinaryExpression(_localctx._eq, ((EqualityExpressionContext)_localctx).e2._rel, BinaryOperator.neq); _localctx._eq.setLine(((EqualityExpressionContext)_localctx).notEqual.getLine());
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression _rel;
		public AdditiveExpressionContext e1;
		public Token gt;
		public AdditiveExpressionContext e2;
		public Token lt;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(SophiaParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(SophiaParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(SophiaParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(SophiaParser.LESS_THAN, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			((RelationalExpressionContext)_localctx).e1 = additiveExpression();
			((RelationalExpressionContext)_localctx)._rel =  ((RelationalExpressionContext)_localctx).e1._add;
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				setState(515);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					{
					setState(507);
					((RelationalExpressionContext)_localctx).gt = match(GREATER_THAN);
					setState(508);
					((RelationalExpressionContext)_localctx).e2 = additiveExpression();
					((RelationalExpressionContext)_localctx)._rel =  new BinaryExpression(_localctx._rel, ((RelationalExpressionContext)_localctx).e2._add, BinaryOperator.gt); _localctx._rel.setLine(((RelationalExpressionContext)_localctx).gt.getLine());
					}
					}
					break;
				case LESS_THAN:
					{
					{
					setState(511);
					((RelationalExpressionContext)_localctx).lt = match(LESS_THAN);
					setState(512);
					((RelationalExpressionContext)_localctx).e2 = additiveExpression();
					((RelationalExpressionContext)_localctx)._rel =  new BinaryExpression(_localctx._rel, ((RelationalExpressionContext)_localctx).e2._add, BinaryOperator.lt); _localctx._rel.setLine(((RelationalExpressionContext)_localctx).lt.getLine());
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression _add;
		public MultiplicativeExpressionContext e1;
		public Token plu;
		public MultiplicativeExpressionContext e2;
		public Token minu;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SophiaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SophiaParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SophiaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SophiaParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			((AdditiveExpressionContext)_localctx).e1 = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx)._add =  ((AdditiveExpressionContext)_localctx).e1._mult;
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(530);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					{
					setState(522);
					((AdditiveExpressionContext)_localctx).plu = match(PLUS);
					setState(523);
					((AdditiveExpressionContext)_localctx).e2 = multiplicativeExpression();
					((AdditiveExpressionContext)_localctx)._add =  new BinaryExpression(_localctx._add, ((AdditiveExpressionContext)_localctx).e2._mult, BinaryOperator.add); _localctx._add.setLine(((AdditiveExpressionContext)_localctx).plu.getLine());
					}
					}
					break;
				case MINUS:
					{
					{
					setState(526);
					((AdditiveExpressionContext)_localctx).minu = match(MINUS);
					setState(527);
					((AdditiveExpressionContext)_localctx).e2 = multiplicativeExpression();
					((AdditiveExpressionContext)_localctx)._add =  new BinaryExpression(_localctx._add, ((AdditiveExpressionContext)_localctx).e2._mult, BinaryOperator.sub); _localctx._add.setLine(((AdditiveExpressionContext)_localctx).minu.getLine());
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression _mult;
		public PreUnaryExpressionContext e1;
		public Token mul;
		public PreUnaryExpressionContext e2;
		public Token di;
		public Token mo;
		public List<PreUnaryExpressionContext> preUnaryExpression() {
			return getRuleContexts(PreUnaryExpressionContext.class);
		}
		public PreUnaryExpressionContext preUnaryExpression(int i) {
			return getRuleContext(PreUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SophiaParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SophiaParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(SophiaParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(SophiaParser.DIVIDE, i);
		}
		public List<TerminalNode> MOD() { return getTokens(SophiaParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(SophiaParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			((MultiplicativeExpressionContext)_localctx).e1 = preUnaryExpression();
			((MultiplicativeExpressionContext)_localctx)._mult =  ((MultiplicativeExpressionContext)_localctx).e1._preUnaryExpression;
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				setState(549);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					{
					setState(537);
					((MultiplicativeExpressionContext)_localctx).mul = match(MULT);
					setState(538);
					((MultiplicativeExpressionContext)_localctx).e2 = preUnaryExpression();
					((MultiplicativeExpressionContext)_localctx)._mult =  new BinaryExpression(_localctx._mult, ((MultiplicativeExpressionContext)_localctx).e2._preUnaryExpression, BinaryOperator.mult); _localctx._mult.setLine(((MultiplicativeExpressionContext)_localctx).mul.getLine());
					}
					}
					break;
				case DIVIDE:
					{
					{
					setState(541);
					((MultiplicativeExpressionContext)_localctx).di = match(DIVIDE);
					setState(542);
					((MultiplicativeExpressionContext)_localctx).e2 = preUnaryExpression();
					((MultiplicativeExpressionContext)_localctx)._mult =  new BinaryExpression(_localctx._mult, ((MultiplicativeExpressionContext)_localctx).e2._preUnaryExpression, BinaryOperator.div); _localctx._mult.setLine(((MultiplicativeExpressionContext)_localctx).di.getLine());
					}
					}
					break;
				case MOD:
					{
					{
					setState(545);
					((MultiplicativeExpressionContext)_localctx).mo = match(MOD);
					setState(546);
					((MultiplicativeExpressionContext)_localctx).e2 = preUnaryExpression();
					((MultiplicativeExpressionContext)_localctx)._mult =  new BinaryExpression(_localctx._mult, ((MultiplicativeExpressionContext)_localctx).e2._preUnaryExpression, BinaryOperator.mod); _localctx._mult.setLine(((MultiplicativeExpressionContext)_localctx).mo.getLine());
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public Expression _preUnaryExpression;
		public UnaryOperator operator;
		public Token n;
		public Token mi;
		public Token inc;
		public Token dec;
		public PreUnaryExpressionContext preUnryExp;
		public PostUnaryExpressionContext pstUnryExp;
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SophiaParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(SophiaParser.MINUS, 0); }
		public TerminalNode INCREMENT() { return getToken(SophiaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(SophiaParser.DECREMENT, 0); }
		public PostUnaryExpressionContext postUnaryExpression() {
			return getRuleContext(PostUnaryExpressionContext.class,0);
		}
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_preUnaryExpression);
		try {
			setState(571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(562);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(554);
					((PreUnaryExpressionContext)_localctx).n = match(NOT);
					((PreUnaryExpressionContext)_localctx).operator =  UnaryOperator.not;
					}
					break;
				case MINUS:
					{
					setState(556);
					((PreUnaryExpressionContext)_localctx).mi = match(MINUS);
					((PreUnaryExpressionContext)_localctx).operator =  UnaryOperator.minus;
					}
					break;
				case INCREMENT:
					{
					setState(558);
					((PreUnaryExpressionContext)_localctx).inc = match(INCREMENT);
					((PreUnaryExpressionContext)_localctx).operator =  UnaryOperator.preinc;
					}
					break;
				case DECREMENT:
					{
					setState(560);
					((PreUnaryExpressionContext)_localctx).dec = match(DECREMENT);
					((PreUnaryExpressionContext)_localctx).operator =  UnaryOperator.predec;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(564);
				((PreUnaryExpressionContext)_localctx).preUnryExp = preUnaryExpression();
				}

						((PreUnaryExpressionContext)_localctx)._preUnaryExpression =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).preUnryExp._preUnaryExpression, _localctx.operator);
						if (_localctx.operator == UnaryOperator.not)
							_localctx._preUnaryExpression.setLine(((PreUnaryExpressionContext)_localctx).n.getLine());
						if (_localctx.operator == UnaryOperator.minus)
				        	_localctx._preUnaryExpression.setLine(((PreUnaryExpressionContext)_localctx).mi.getLine());
				        if (_localctx.operator == UnaryOperator.preinc)
				       		_localctx._preUnaryExpression.setLine(((PreUnaryExpressionContext)_localctx).inc.getLine());
				        if (_localctx.operator == UnaryOperator.predec)
				   			_localctx._preUnaryExpression.setLine(((PreUnaryExpressionContext)_localctx).dec.getLine());
					
				}
				break;
			case NEW:
			case NULL:
			case TRUE:
			case FALSE:
			case THIS:
			case LPAR:
			case LBRACK:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				((PreUnaryExpressionContext)_localctx).pstUnryExp = postUnaryExpression();
				((PreUnaryExpressionContext)_localctx)._preUnaryExpression =  ((PreUnaryExpressionContext)_localctx).pstUnryExp._postUnaryExpression;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostUnaryExpressionContext extends ParserRuleContext {
		public Expression _postUnaryExpression;
		public UnaryOperator operator;
		public AccessExpressionContext acssExp;
		public Token inc;
		public Token dec;
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(SophiaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(SophiaParser.DECREMENT, 0); }
		public PostUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPostUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPostUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPostUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostUnaryExpressionContext postUnaryExpression() throws RecognitionException {
		PostUnaryExpressionContext _localctx = new PostUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_postUnaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			((PostUnaryExpressionContext)_localctx).acssExp = accessExpression();
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				{
				setState(574);
				((PostUnaryExpressionContext)_localctx).inc = match(INCREMENT);
				((PostUnaryExpressionContext)_localctx).operator =  UnaryOperator.postinc;
				}
				break;
			case DECREMENT:
				{
				setState(576);
				((PostUnaryExpressionContext)_localctx).dec = match(DECREMENT);
				((PostUnaryExpressionContext)_localctx).operator =  UnaryOperator.postdec;
				}
				break;
			case GREATER_THAN:
			case LESS_THAN:
			case NOT_EQUAL:
			case EQUAL:
			case MULT:
			case DIVIDE:
			case MOD:
			case PLUS:
			case MINUS:
			case AND:
			case OR:
			case ASSIGN:
			case RPAR:
			case RBRACK:
			case COMMA:
			case SEMICOLLON:
				break;
			default:
				break;
			}

			        if (((((PostUnaryExpressionContext)_localctx).inc!=null?((PostUnaryExpressionContext)_localctx).inc.getText():null) == null) && ((((PostUnaryExpressionContext)_localctx).dec!=null?((PostUnaryExpressionContext)_localctx).dec.getText():null) == null))
			            ((PostUnaryExpressionContext)_localctx)._postUnaryExpression =  ((PostUnaryExpressionContext)_localctx).acssExp._accessExpression;
			        else
			        {
			            ((PostUnaryExpressionContext)_localctx)._postUnaryExpression =  new UnaryExpression(((PostUnaryExpressionContext)_localctx).acssExp._accessExpression, _localctx.operator);
			    		if ((((PostUnaryExpressionContext)_localctx).inc!=null?((PostUnaryExpressionContext)_localctx).inc.getText():null) != null)
			    			_localctx._postUnaryExpression.setLine(((PostUnaryExpressionContext)_localctx).inc.getLine());
			    		else
			    			_localctx._postUnaryExpression.setLine(((PostUnaryExpressionContext)_localctx).dec.getLine());
			    	}
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessExpressionContext extends ParserRuleContext {
		public Expression _accessExpression;
		public OtherExpressionContext othrExp;
		public Token lp;
		public MethodCallArgumentsContext mthdCllArgs;
		public IdentifierContext idntfr;
		public Token lb;
		public ExpressionContext exp1;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(SophiaParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SophiaParser.RPAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SophiaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SophiaParser.DOT, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SophiaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SophiaParser.RBRACK, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(SophiaParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SophiaParser.LPAR, i);
		}
		public List<MethodCallArgumentsContext> methodCallArguments() {
			return getRuleContexts(MethodCallArgumentsContext.class);
		}
		public MethodCallArgumentsContext methodCallArguments(int i) {
			return getRuleContext(MethodCallArgumentsContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SophiaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SophiaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessExpressionContext accessExpression() throws RecognitionException {
		AccessExpressionContext _localctx = new AccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_accessExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			((AccessExpressionContext)_localctx).othrExp = otherExpression();
			((AccessExpressionContext)_localctx)._accessExpression =  ((AccessExpressionContext)_localctx).othrExp._otherExpression;
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRACK) | (1L << DOT))) != 0)) {
				{
				setState(601);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAR:
					{
					{
					setState(584);
					((AccessExpressionContext)_localctx).lp = match(LPAR);
					setState(585);
					((AccessExpressionContext)_localctx).mthdCllArgs = methodCallArguments();
					setState(586);
					match(RPAR);
					}
					((AccessExpressionContext)_localctx)._accessExpression =  new MethodCall(_localctx._accessExpression, ((AccessExpressionContext)_localctx).mthdCllArgs._methodCallArguments); _localctx._accessExpression.setLine(((AccessExpressionContext)_localctx).lp.getLine());
					}
					break;
				case DOT:
					{
					{
					setState(590);
					match(DOT);
					setState(591);
					((AccessExpressionContext)_localctx).idntfr = identifier();
					}
					((AccessExpressionContext)_localctx)._accessExpression =  new ObjectOrListMemberAccess(_localctx._accessExpression, ((AccessExpressionContext)_localctx).idntfr.id); _localctx._accessExpression.setLine(((AccessExpressionContext)_localctx).idntfr.id.getLine());
					}
					break;
				case LBRACK:
					{
					{
					setState(595);
					((AccessExpressionContext)_localctx).lb = match(LBRACK);
					setState(596);
					((AccessExpressionContext)_localctx).exp1 = expression();
					setState(597);
					match(RBRACK);
					}
					((AccessExpressionContext)_localctx)._accessExpression =  new ListAccessByIndex(_localctx._accessExpression, ((AccessExpressionContext)_localctx).exp1._expression); _localctx._accessExpression.setLine(((AccessExpressionContext)_localctx).lb.getLine());
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherExpressionContext extends ParserRuleContext {
		public Expression _otherExpression;
		public Token t;
		public NewExpressionContext nwExpr;
		public ValuesContext vals;
		public IdentifierContext idntfr;
		public ExpressionContext expr1;
		public TerminalNode THIS() { return getToken(SophiaParser.THIS, 0); }
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_otherExpression);
		try {
			setState(622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				((OtherExpressionContext)_localctx).t = match(THIS);
				((OtherExpressionContext)_localctx)._otherExpression =  new ThisClass(); _localctx._otherExpression.setLine(((OtherExpressionContext)_localctx).t.getLine());
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				((OtherExpressionContext)_localctx).nwExpr = newExpression();
				((OtherExpressionContext)_localctx)._otherExpression =  ((OtherExpressionContext)_localctx).nwExpr._newExpression;
				}
				break;
			case NULL:
			case TRUE:
			case FALSE:
			case LBRACK:
			case INT_VALUE:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				((OtherExpressionContext)_localctx).vals = values();
				((OtherExpressionContext)_localctx)._otherExpression =  ((OtherExpressionContext)_localctx).vals._values;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(614);
				((OtherExpressionContext)_localctx).idntfr = identifier();
				((OtherExpressionContext)_localctx)._otherExpression =  ((OtherExpressionContext)_localctx).idntfr.id;
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(617);
				match(LPAR);
				{
				setState(618);
				((OtherExpressionContext)_localctx).expr1 = expression();
				}
				setState(619);
				match(RPAR);
				((OtherExpressionContext)_localctx)._otherExpression =  ((OtherExpressionContext)_localctx).expr1._expression;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewExpressionContext extends ParserRuleContext {
		public NewClassInstance _newExpression;
		public Token n;
		public ClassTypeContext clssType;
		public MethodCallArgumentsContext mthdCllArgs;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode NEW() { return getToken(SophiaParser.NEW, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public MethodCallArgumentsContext methodCallArguments() {
			return getRuleContext(MethodCallArgumentsContext.class,0);
		}
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_newExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			((NewExpressionContext)_localctx).n = match(NEW);
			setState(625);
			((NewExpressionContext)_localctx).clssType = classType();
			setState(626);
			match(LPAR);
			setState(627);
			((NewExpressionContext)_localctx).mthdCllArgs = methodCallArguments();
			setState(628);
			match(RPAR);
			((NewExpressionContext)_localctx)._newExpression =  new NewClassInstance(((NewExpressionContext)_localctx).clssType._classType, ((NewExpressionContext)_localctx).mthdCllArgs._methodCallArguments); _localctx._newExpression.setLine(((NewExpressionContext)_localctx).n.getLine());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesContext extends ParserRuleContext {
		public Value _values;
		public BoolValueContext blVal;
		public Token strVal;
		public Token intVal;
		public Token n;
		public ListValueContext lstVal;
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode STRING_VALUE() { return getToken(SophiaParser.STRING_VALUE, 0); }
		public TerminalNode INT_VALUE() { return getToken(SophiaParser.INT_VALUE, 0); }
		public TerminalNode NULL() { return getToken(SophiaParser.NULL, 0); }
		public ListValueContext listValue() {
			return getRuleContext(ListValueContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_values);
		try {
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				((ValuesContext)_localctx).blVal = boolValue();
				((ValuesContext)_localctx)._values =  ((ValuesContext)_localctx).blVal._boolValue;
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				((ValuesContext)_localctx).strVal = match(STRING_VALUE);
				((ValuesContext)_localctx)._values =  new StringValue((((ValuesContext)_localctx).strVal!=null?((ValuesContext)_localctx).strVal.getText():null)); _localctx._values.setLine(((ValuesContext)_localctx).strVal.getLine());
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(636);
				((ValuesContext)_localctx).intVal = match(INT_VALUE);
				((ValuesContext)_localctx)._values =  new IntValue((((ValuesContext)_localctx).intVal!=null?Integer.valueOf(((ValuesContext)_localctx).intVal.getText()):0)); _localctx._values.setLine(((ValuesContext)_localctx).intVal.getLine());
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(638);
				((ValuesContext)_localctx).n = match(NULL);
				((ValuesContext)_localctx)._values =  new NullValue(); _localctx._values.setLine(((ValuesContext)_localctx).n.getLine());
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(640);
				((ValuesContext)_localctx).lstVal = listValue();
				((ValuesContext)_localctx)._values =  ((ValuesContext)_localctx).lstVal._listValue;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolValueContext extends ParserRuleContext {
		public BoolValue _boolValue;
		public Token t;
		public Token f;
		public TerminalNode TRUE() { return getToken(SophiaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SophiaParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_boolValue);
		try {
			setState(649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				((BoolValueContext)_localctx).t = match(TRUE);
				((BoolValueContext)_localctx)._boolValue =  new BoolValue(true); _localctx._boolValue.setLine(((BoolValueContext)_localctx).t.getLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				((BoolValueContext)_localctx).f = match(FALSE);
				((BoolValueContext)_localctx)._boolValue =  new BoolValue(false);_localctx._boolValue.setLine(((BoolValueContext)_localctx).f.getLine());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListValueContext extends ParserRuleContext {
		public ListValue _listValue;
		public Token lb;
		public MethodCallArgumentsContext mthdCllArgs;
		public TerminalNode RBRACK() { return getToken(SophiaParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(SophiaParser.LBRACK, 0); }
		public MethodCallArgumentsContext methodCallArguments() {
			return getRuleContext(MethodCallArgumentsContext.class,0);
		}
		public ListValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListValueContext listValue() throws RecognitionException {
		ListValueContext _localctx = new ListValueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_listValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			((ListValueContext)_localctx).lb = match(LBRACK);
			setState(652);
			((ListValueContext)_localctx).mthdCllArgs = methodCallArguments();
			setState(653);
			match(RBRACK);
			((ListValueContext)_localctx)._listValue =  new ListValue(((ListValueContext)_localctx).mthdCllArgs._methodCallArguments); _localctx._listValue.setLine(((ListValueContext)_localctx).lb.getLine());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier id;
		public Token name;
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			((IdentifierContext)_localctx).name = match(IDENTIFIER);
			((IdentifierContext)_localctx).id =  new Identifier((((IdentifierContext)_localctx).name!=null?((IdentifierContext)_localctx).name.getText():null)); _localctx.id.setLine(((IdentifierContext)_localctx).name.getLine());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0296\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3g\n\3\f\3\16"+
		"\3j\13\3\3\4\3\4\3\4\3\4\5\4p\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"z\n\4\f\4\16\4}\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0087\n\4\f\4"+
		"\16\4\u008a\13\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0092\n\4\f\4\16\4\u0095"+
		"\13\4\5\4\u0097\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u00a4"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c0\n\b\f\b\16\b\u00c3\13"+
		"\b\5\b\u00c5\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00d8\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00e8\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7"+
		"\r\u00f3\n\r\f\r\16\r\u00f6\13\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00fe"+
		"\n\16\3\17\3\17\3\17\3\17\5\17\u0104\n\17\3\17\3\17\3\17\5\17\u0109\n"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0115\n\20"+
		"\f\20\16\20\u0118\13\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0120\n\21"+
		"\3\22\3\22\3\22\3\22\7\22\u0126\n\22\f\22\16\22\u0129\13\22\3\22\3\22"+
		"\3\22\7\22\u012e\n\22\f\22\16\22\u0131\13\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u014e\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u0155\n\24\f\24\16\24\u0158\13\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\5\30\u016e\n\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\7\32\u018a\n\32\f\32\16\32\u018d\13\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u019c\n\33\f\33"+
		"\16\33\u019f\13\33\5\33\u01a1\n\33\3\34\3\34\3\34\3\34\5\34\u01a7\n\34"+
		"\3\34\3\34\3\35\3\35\3\35\5\35\u01ae\n\35\3\35\3\35\5\35\u01b2\n\35\3"+
		"\35\3\35\5\35\u01b6\n\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01cc\n\37"+
		"\3\37\3\37\3 \3 \3 \5 \u01d3\n \3 \3 \3!\3!\3!\3!\3!\3!\7!\u01dd\n!\f"+
		"!\16!\u01e0\13!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01e8\n\"\f\"\16\"\u01eb\13"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u01f7\n#\f#\16#\u01fa\13#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\7$\u0206\n$\f$\16$\u0209\13$\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\7%\u0215\n%\f%\16%\u0218\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\7&\u0228\n&\f&\16&\u022b\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\5\'\u0235\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u023e\n\'\3(\3(\3("+
		"\3(\3(\5(\u0245\n(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\7)\u025c\n)\f)\16)\u025f\13)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\5*\u0271\n*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\5,\u0286\n,\3-\3-\3-\3-\5-\u028c\n-\3.\3.\3.\3.\3"+
		".\3/\3/\3/\3/\2\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\\2\2\2\u02b2\2^\3\2\2\2\4b\3\2\2\2\6k\3\2"+
		"\2\2\b\u009a\3\2\2\2\n\u00a0\3\2\2\2\f\u00ae\3\2\2\2\16\u00b8\3\2\2\2"+
		"\20\u00c6\3\2\2\2\22\u00d7\3\2\2\2\24\u00d9\3\2\2\2\26\u00dc\3\2\2\2\30"+
		"\u00eb\3\2\2\2\32\u00fd\3\2\2\2\34\u00ff\3\2\2\2\36\u010d\3\2\2\2 \u011f"+
		"\3\2\2\2\"\u0121\3\2\2\2$\u014d\3\2\2\2&\u014f\3\2\2\2(\u015b\3\2\2\2"+
		"*\u015f\3\2\2\2,\u0164\3\2\2\2.\u016b\3\2\2\2\60\u0172\3\2\2\2\62\u0176"+
		"\3\2\2\2\64\u0194\3\2\2\2\66\u01a6\3\2\2\28\u01aa\3\2\2\2:\u01bb\3\2\2"+
		"\2<\u01c4\3\2\2\2>\u01cf\3\2\2\2@\u01d6\3\2\2\2B\u01e1\3\2\2\2D\u01ec"+
		"\3\2\2\2F\u01fb\3\2\2\2H\u020a\3\2\2\2J\u0219\3\2\2\2L\u023d\3\2\2\2N"+
		"\u023f\3\2\2\2P\u0248\3\2\2\2R\u0270\3\2\2\2T\u0272\3\2\2\2V\u0285\3\2"+
		"\2\2X\u028b\3\2\2\2Z\u028d\3\2\2\2\\\u0292\3\2\2\2^_\5\4\3\2_`\7\2\2\3"+
		"`a\b\2\1\2a\3\3\2\2\2bh\b\3\1\2cd\5\6\4\2de\b\3\1\2eg\3\2\2\2fc\3\2\2"+
		"\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\5\3\2\2\2jh\3\2\2\2kl\7\5\2\2lo\5\\"+
		"/\2mn\7\4\2\2np\5\\/\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\b\4\1\2r\u0096"+
		"\7/\2\2st\5\b\5\2tu\b\4\1\2uz\3\2\2\2vw\5\n\6\2wx\b\4\1\2xz\3\2\2\2ys"+
		"\3\2\2\2yv\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~"+
		"\177\5\f\7\2\177\u0088\b\4\1\2\u0080\u0081\5\b\5\2\u0081\u0082\b\4\1\2"+
		"\u0082\u0087\3\2\2\2\u0083\u0084\5\n\6\2\u0084\u0085\b\4\1\2\u0085\u0087"+
		"\3\2\2\2\u0086\u0080\3\2\2\2\u0086\u0083\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0097\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008b\u008c\5\b\5\2\u008c\u008d\b\4\1\2\u008d\u0092\3\2\2\2\u008e"+
		"\u008f\5\n\6\2\u008f\u0090\b\4\1\2\u0090\u0092\3\2\2\2\u0091\u008b\3\2"+
		"\2\2\u0091\u008e\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0096{\3\2\2\2"+
		"\u0096\u0093\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\60\2\2\u0099\7"+
		"\3\2\2\2\u009a\u009b\5\\/\2\u009b\u009c\7\64\2\2\u009c\u009d\5\22\n\2"+
		"\u009d\u009e\7\65\2\2\u009e\u009f\b\5\1\2\u009f\t\3\2\2\2\u00a0\u00a3"+
		"\7\3\2\2\u00a1\u00a4\5\22\n\2\u00a2\u00a4\7\24\2\2\u00a3\u00a1\3\2\2\2"+
		"\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\5\\/\2\u00a6\u00a7"+
		"\7+\2\2\u00a7\u00a8\5\16\b\2\u00a8\u00a9\7,\2\2\u00a9\u00aa\7/\2\2\u00aa"+
		"\u00ab\5\"\22\2\u00ab\u00ac\7\60\2\2\u00ac\u00ad\b\6\1\2\u00ad\13\3\2"+
		"\2\2\u00ae\u00af\7\3\2\2\u00af\u00b0\5\\/\2\u00b0\u00b1\7+\2\2\u00b1\u00b2"+
		"\5\16\b\2\u00b2\u00b3\7,\2\2\u00b3\u00b4\7/\2\2\u00b4\u00b5\5\"\22\2\u00b5"+
		"\u00b6\7\60\2\2\u00b6\u00b7\b\7\1\2\u00b7\r\3\2\2\2\u00b8\u00c4\b\b\1"+
		"\2\u00b9\u00ba\5\20\t\2\u00ba\u00c1\b\b\1\2\u00bb\u00bc\7\62\2\2\u00bc"+
		"\u00bd\5\20\t\2\u00bd\u00be\b\b\1\2\u00be\u00c0\3\2\2\2\u00bf\u00bb\3"+
		"\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00b9\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\17\3\2\2\2\u00c6\u00c7\5\\/\2\u00c7\u00c8\7\64\2\2\u00c8\u00c9"+
		"\5\22\n\2\u00c9\u00ca\b\t\1\2\u00ca\21\3\2\2\2\u00cb\u00cc\5 \21\2\u00cc"+
		"\u00cd\b\n\1\2\u00cd\u00d8\3\2\2\2\u00ce\u00cf\5\26\f\2\u00cf\u00d0\b"+
		"\n\1\2\u00d0\u00d8\3\2\2\2\u00d1\u00d2\5\34\17\2\u00d2\u00d3\b\n\1\2\u00d3"+
		"\u00d8\3\2\2\2\u00d4\u00d5\5\24\13\2\u00d5\u00d6\b\n\1\2\u00d6\u00d8\3"+
		"\2\2\2\u00d7\u00cb\3\2\2\2\u00d7\u00ce\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7"+
		"\u00d4\3\2\2\2\u00d8\23\3\2\2\2\u00d9\u00da\5\\/\2\u00da\u00db\b\13\1"+
		"\2\u00db\25\3\2\2\2\u00dc\u00dd\7\26\2\2\u00dd\u00e7\7+\2\2\u00de\u00df"+
		"\7\66\2\2\u00df\u00e0\7\61\2\2\u00e0\u00e1\5\22\n\2\u00e1\u00e2\3\2\2"+
		"\2\u00e2\u00e3\b\f\1\2\u00e3\u00e8\3\2\2\2\u00e4\u00e5\5\30\r\2\u00e5"+
		"\u00e6\b\f\1\2\u00e6\u00e8\3\2\2\2\u00e7\u00de\3\2\2\2\u00e7\u00e4\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7,\2\2\u00ea\27\3\2\2\2\u00eb\u00ec"+
		"\b\r\1\2\u00ec\u00ed\5\32\16\2\u00ed\u00f4\b\r\1\2\u00ee\u00ef\7\62\2"+
		"\2\u00ef\u00f0\5\32\16\2\u00f0\u00f1\b\r\1\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00ee\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\31\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\5\20\t\2\u00f8\u00f9"+
		"\b\16\1\2\u00f9\u00fe\3\2\2\2\u00fa\u00fb\5\22\n\2\u00fb\u00fc\b\16\1"+
		"\2\u00fc\u00fe\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fe\33"+
		"\3\2\2\2\u00ff\u0100\7\7\2\2\u0100\u0103\7\34\2\2\u0101\u0104\7\24\2\2"+
		"\u0102\u0104\5\36\20\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0108\7\32\2\2\u0106\u0109\7\24\2\2\u0107\u0109\5\22\n"+
		"\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b"+
		"\7\33\2\2\u010b\u010c\b\17\1\2\u010c\35\3\2\2\2\u010d\u010e\b\20\1\2\u010e"+
		"\u010f\5\22\n\2\u010f\u0116\b\20\1\2\u0110\u0111\7\62\2\2\u0111\u0112"+
		"\5\22\n\2\u0112\u0113\b\20\1\2\u0113\u0115\3\2\2\2\u0114\u0110\3\2\2\2"+
		"\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\37"+
		"\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7\23\2\2\u011a\u0120\b\21\1\2"+
		"\u011b\u011c\7\22\2\2\u011c\u0120\b\21\1\2\u011d\u011e\7\21\2\2\u011e"+
		"\u0120\b\21\1\2\u011f\u0119\3\2\2\2\u011f\u011b\3\2\2\2\u011f\u011d\3"+
		"\2\2\2\u0120!\3\2\2\2\u0121\u0127\b\22\1\2\u0122\u0123\5\b\5\2\u0123\u0124"+
		"\b\22\1\2\u0124\u0126\3\2\2\2\u0125\u0122\3\2\2\2\u0126\u0129\3\2\2\2"+
		"\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012f\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u012a\u012b\5$\23\2\u012b\u012c\b\22\1\2\u012c\u012e\3\2\2\2"+
		"\u012d\u012a\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130#\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\58\35\2\u0133"+
		"\u0134\b\23\1\2\u0134\u014e\3\2\2\2\u0135\u0136\5:\36\2\u0136\u0137\b"+
		"\23\1\2\u0137\u014e\3\2\2\2\u0138\u0139\5<\37\2\u0139\u013a\b\23\1\2\u013a"+
		"\u014e\3\2\2\2\u013b\u013c\5(\25\2\u013c\u013d\b\23\1\2\u013d\u014e\3"+
		"\2\2\2\u013e\u013f\5,\27\2\u013f\u0140\b\23\1\2\u0140\u014e\3\2\2\2\u0141"+
		"\u0142\5\66\34\2\u0142\u0143\b\23\1\2\u0143\u014e\3\2\2\2\u0144\u0145"+
		"\5\60\31\2\u0145\u0146\b\23\1\2\u0146\u014e\3\2\2\2\u0147\u0148\5.\30"+
		"\2\u0148\u0149\b\23\1\2\u0149\u014e\3\2\2\2\u014a\u014b\5&\24\2\u014b"+
		"\u014c\b\23\1\2\u014c\u014e\3\2\2\2\u014d\u0132\3\2\2\2\u014d\u0135\3"+
		"\2\2\2\u014d\u0138\3\2\2\2\u014d\u013b\3\2\2\2\u014d\u013e\3\2\2\2\u014d"+
		"\u0141\3\2\2\2\u014d\u0144\3\2\2\2\u014d\u0147\3\2\2\2\u014d\u014a\3\2"+
		"\2\2\u014e%\3\2\2\2\u014f\u0150\b\24\1\2\u0150\u0156\7/\2\2\u0151\u0152"+
		"\5$\23\2\u0152\u0153\b\24\1\2\u0153\u0155\3\2\2\2\u0154\u0151\3\2\2\2"+
		"\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159"+
		"\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7\60\2\2\u015a\'\3\2\2\2\u015b"+
		"\u015c\5*\26\2\u015c\u015d\7\65\2\2\u015d\u015e\b\25\1\2\u015e)\3\2\2"+
		"\2\u015f\u0160\5@!\2\u0160\u0161\7(\2\2\u0161\u0162\5> \2\u0162\u0163"+
		"\b\26\1\2\u0163+\3\2\2\2\u0164\u0165\7\6\2\2\u0165\u0166\7+\2\2\u0166"+
		"\u0167\5> \2\u0167\u0168\b\27\1\2\u0168\u0169\7,\2\2\u0169\u016a\7\65"+
		"\2\2\u016a-\3\2\2\2\u016b\u016d\7\13\2\2\u016c\u016e\5> \2\u016d\u016c"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\b\30\1\2"+
		"\u0170\u0171\7\65\2\2\u0171/\3\2\2\2\u0172\u0173\5\62\32\2\u0173\u0174"+
		"\b\31\1\2\u0174\u0175\7\65\2\2\u0175\61\3\2\2\2\u0176\u0177\5R*\2\u0177"+
		"\u018b\b\32\1\2\u0178\u0179\7+\2\2\u0179\u017a\5\64\33\2\u017a\u017b\7"+
		",\2\2\u017b\u017c\3\2\2\2\u017c\u017d\b\32\1\2\u017d\u018a\3\2\2\2\u017e"+
		"\u017f\7\63\2\2\u017f\u0180\5\\/\2\u0180\u0181\3\2\2\2\u0181\u0182\b\32"+
		"\1\2\u0182\u018a\3\2\2\2\u0183\u0184\7-\2\2\u0184\u0185\5> \2\u0185\u0186"+
		"\7.\2\2\u0186\u0187\3\2\2\2\u0187\u0188\b\32\1\2\u0188\u018a\3\2\2\2\u0189"+
		"\u0178\3\2\2\2\u0189\u017e\3\2\2\2\u0189\u0183\3\2\2\2\u018a\u018d\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018e\u018f\7+\2\2\u018f\u0190\5\64\33\2\u0190\u0191\7"+
		",\2\2\u0191\u0192\3\2\2\2\u0192\u0193\b\32\1\2\u0193\63\3\2\2\2\u0194"+
		"\u01a0\b\33\1\2\u0195\u0196\5> \2\u0196\u019d\b\33\1\2\u0197\u0198\7\62"+
		"\2\2\u0198\u0199\5> \2\u0199\u019a\b\33\1\2\u019a\u019c\3\2\2\2\u019b"+
		"\u0197\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u0195\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\65\3\2\2\2\u01a2\u01a3\7\n\2\2\u01a3\u01a7\b\34\1"+
		"\2\u01a4\u01a5\7\t\2\2\u01a5\u01a7\b\34\1\2\u01a6\u01a2\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\7\65\2\2\u01a9\67\3\2\2"+
		"\2\u01aa\u01ab\7\16\2\2\u01ab\u01ad\7+\2\2\u01ac\u01ae\5*\26\2\u01ad\u01ac"+
		"\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\7\65\2\2"+
		"\u01b0\u01b2\5> \2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b5\7\65\2\2\u01b4\u01b6\5*\26\2\u01b5\u01b4\3\2\2\2"+
		"\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\7,\2\2\u01b8\u01b9"+
		"\5$\23\2\u01b9\u01ba\b\35\1\2\u01ba9\3\2\2\2\u01bb\u01bc\7\f\2\2\u01bc"+
		"\u01bd\7+\2\2\u01bd\u01be\5\\/\2\u01be\u01bf\7\r\2\2\u01bf\u01c0\5> \2"+
		"\u01c0\u01c1\7,\2\2\u01c1\u01c2\5$\23\2\u01c2\u01c3\b\36\1\2\u01c3;\3"+
		"\2\2\2\u01c4\u01c5\7\17\2\2\u01c5\u01c6\7+\2\2\u01c6\u01c7\5> \2\u01c7"+
		"\u01c8\7,\2\2\u01c8\u01cb\5$\23\2\u01c9\u01ca\7\20\2\2\u01ca\u01cc\5$"+
		"\23\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01ce\b\37\1\2\u01ce=\3\2\2\2\u01cf\u01d2\5@!\2\u01d0\u01d1\7(\2\2\u01d1"+
		"\u01d3\5> \2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2"+
		"\2\u01d4\u01d5\b \1\2\u01d5?\3\2\2\2\u01d6\u01d7\5B\"\2\u01d7\u01de\b"+
		"!\1\2\u01d8\u01d9\7%\2\2\u01d9\u01da\5B\"\2\u01da\u01db\b!\1\2\u01db\u01dd"+
		"\3\2\2\2\u01dc\u01d8\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01dfA\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\5D#\2\u01e2"+
		"\u01e9\b\"\1\2\u01e3\u01e4\7$\2\2\u01e4\u01e5\5D#\2\u01e5\u01e6\b\"\1"+
		"\2\u01e6\u01e8\3\2\2\2\u01e7\u01e3\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7"+
		"\3\2\2\2\u01e9\u01ea\3\2\2\2\u01eaC\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec"+
		"\u01ed\5F$\2\u01ed\u01f8\b#\1\2\u01ee\u01ef\7\36\2\2\u01ef\u01f0\5F$\2"+
		"\u01f0\u01f1\b#\1\2\u01f1\u01f7\3\2\2\2\u01f2\u01f3\7\35\2\2\u01f3\u01f4"+
		"\5F$\2\u01f4\u01f5\b#\1\2\u01f5\u01f7\3\2\2\2\u01f6\u01ee\3\2\2\2\u01f6"+
		"\u01f2\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2"+
		"\2\2\u01f9E\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fc\5H%\2\u01fc\u0207"+
		"\b$\1\2\u01fd\u01fe\7\33\2\2\u01fe\u01ff\5H%\2\u01ff\u0200\b$\1\2\u0200"+
		"\u0206\3\2\2\2\u0201\u0202\7\34\2\2\u0202\u0203\5H%\2\u0203\u0204\b$\1"+
		"\2\u0204\u0206\3\2\2\2\u0205\u01fd\3\2\2\2\u0205\u0201\3\2\2\2\u0206\u0209"+
		"\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208G\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u020a\u020b\5J&\2\u020b\u0216\b%\1\2\u020c\u020d\7\"\2"+
		"\2\u020d\u020e\5J&\2\u020e\u020f\b%\1\2\u020f\u0215\3\2\2\2\u0210\u0211"+
		"\7#\2\2\u0211\u0212\5J&\2\u0212\u0213\b%\1\2\u0213\u0215\3\2\2\2\u0214"+
		"\u020c\3\2\2\2\u0214\u0210\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2"+
		"\2\2\u0216\u0217\3\2\2\2\u0217I\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a"+
		"\5L\'\2\u021a\u0229\b&\1\2\u021b\u021c\7\37\2\2\u021c\u021d\5L\'\2\u021d"+
		"\u021e\b&\1\2\u021e\u0228\3\2\2\2\u021f\u0220\7 \2\2\u0220\u0221\5L\'"+
		"\2\u0221\u0222\b&\1\2\u0222\u0228\3\2\2\2\u0223\u0224\7!\2\2\u0224\u0225"+
		"\5L\'\2\u0225\u0226\b&\1\2\u0226\u0228\3\2\2\2\u0227\u021b\3\2\2\2\u0227"+
		"\u021f\3\2\2\2\u0227\u0223\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2"+
		"\2\2\u0229\u022a\3\2\2\2\u022aK\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022d"+
		"\7&\2\2\u022d\u0235\b\'\1\2\u022e\u022f\7#\2\2\u022f\u0235\b\'\1\2\u0230"+
		"\u0231\7)\2\2\u0231\u0235\b\'\1\2\u0232\u0233\7*\2\2\u0233\u0235\b\'\1"+
		"\2\u0234\u022c\3\2\2\2\u0234\u022e\3\2\2\2\u0234\u0230\3\2\2\2\u0234\u0232"+
		"\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\5L\'\2\u0237\u0238\3\2\2\2\u0238"+
		"\u0239\b\'\1\2\u0239\u023e\3\2\2\2\u023a\u023b\5N(\2\u023b\u023c\b\'\1"+
		"\2\u023c\u023e\3\2\2\2\u023d\u0234\3\2\2\2\u023d\u023a\3\2\2\2\u023eM"+
		"\3\2\2\2\u023f\u0244\5P)\2\u0240\u0241\7)\2\2\u0241\u0245\b(\1\2\u0242"+
		"\u0243\7*\2\2\u0243\u0245\b(\1\2\u0244\u0240\3\2\2\2\u0244\u0242\3\2\2"+
		"\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\b(\1\2\u0247O\3"+
		"\2\2\2\u0248\u0249\5R*\2\u0249\u025d\b)\1\2\u024a\u024b\7+\2\2\u024b\u024c"+
		"\5\64\33\2\u024c\u024d\7,\2\2\u024d\u024e\3\2\2\2\u024e\u024f\b)\1\2\u024f"+
		"\u025c\3\2\2\2\u0250\u0251\7\63\2\2\u0251\u0252\5\\/\2\u0252\u0253\3\2"+
		"\2\2\u0253\u0254\b)\1\2\u0254\u025c\3\2\2\2\u0255\u0256\7-\2\2\u0256\u0257"+
		"\5> \2\u0257\u0258\7.\2\2\u0258\u0259\3\2\2\2\u0259\u025a\b)\1\2\u025a"+
		"\u025c\3\2\2\2\u025b\u024a\3\2\2\2\u025b\u0250\3\2\2\2\u025b\u0255\3\2"+
		"\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"Q\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0261\7\31\2\2\u0261\u0271\b*\1\2"+
		"\u0262\u0263\5T+\2\u0263\u0264\b*\1\2\u0264\u0271\3\2\2\2\u0265\u0266"+
		"\5V,\2\u0266\u0267\b*\1\2\u0267\u0271\3\2\2\2\u0268\u0269\5\\/\2\u0269"+
		"\u026a\b*\1\2\u026a\u0271\3\2\2\2\u026b\u026c\7+\2\2\u026c\u026d\5> \2"+
		"\u026d\u026e\7,\2\2\u026e\u026f\b*\1\2\u026f\u0271\3\2\2\2\u0270\u0260"+
		"\3\2\2\2\u0270\u0262\3\2\2\2\u0270\u0265\3\2\2\2\u0270\u0268\3\2\2\2\u0270"+
		"\u026b\3\2\2\2\u0271S\3\2\2\2\u0272\u0273\7\b\2\2\u0273\u0274\5\24\13"+
		"\2\u0274\u0275\7+\2\2\u0275\u0276\5\64\33\2\u0276\u0277\7,\2\2\u0277\u0278"+
		"\b+\1\2\u0278U\3\2\2\2\u0279\u027a\5X-\2\u027a\u027b\b,\1\2\u027b\u0286"+
		"\3\2\2\2\u027c\u027d\78\2\2\u027d\u0286\b,\1\2\u027e\u027f\7\66\2\2\u027f"+
		"\u0286\b,\1\2\u0280\u0281\7\25\2\2\u0281\u0286\b,\1\2\u0282\u0283\5Z."+
		"\2\u0283\u0284\b,\1\2\u0284\u0286\3\2\2\2\u0285\u0279\3\2\2\2\u0285\u027c"+
		"\3\2\2\2\u0285\u027e\3\2\2\2\u0285\u0280\3\2\2\2\u0285\u0282\3\2\2\2\u0286"+
		"W\3\2\2\2\u0287\u0288\7\27\2\2\u0288\u028c\b-\1\2\u0289\u028a\7\30\2\2"+
		"\u028a\u028c\b-\1\2\u028b\u0287\3\2\2\2\u028b\u0289\3\2\2\2\u028cY\3\2"+
		"\2\2\u028d\u028e\7-\2\2\u028e\u028f\5\64\33\2\u028f\u0290\7.\2\2\u0290"+
		"\u0291\b.\1\2\u0291[\3\2\2\2\u0292\u0293\7\67\2\2\u0293\u0294\b/\1\2\u0294"+
		"]\3\2\2\2\67hoy{\u0086\u0088\u0091\u0093\u0096\u00a3\u00c1\u00c4\u00d7"+
		"\u00e7\u00f4\u00fd\u0103\u0108\u0116\u011f\u0127\u012f\u014d\u0156\u016d"+
		"\u0189\u018b\u019d\u01a0\u01a6\u01ad\u01b1\u01b5\u01cb\u01d2\u01de\u01e9"+
		"\u01f6\u01f8\u0205\u0207\u0214\u0216\u0227\u0229\u0234\u023d\u0244\u025b"+
		"\u025d\u0270\u0285\u028b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}