// Generated from c:\Users\troug\Desktop\Study\UPC\2020-2021-Q2\LP\Laboratorio\github\Logo3D\logo3d.g by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class logo3dParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, ID=27, REAL=28, INT=29, ASSIGN=30, EQ=31, NEQ=32, 
		LE=33, GT=34, LEQ=35, GEQ=36, MES=37, MENYS=38, MUL=39, DIV=40, WS=41, 
		COMMENT=42;
	public static final int
		RULE_root = 0, RULE_function = 1, RULE_funcParam = 2, RULE_instrucBloc = 3, 
		RULE_instruc = 4, RULE_ifInst = 5, RULE_whileInst = 6, RULE_forInst = 7, 
		RULE_writeInst = 8, RULE_readInst = 9, RULE_callInst = 10, RULE_turtleCall = 11, 
		RULE_assignationInst = 12, RULE_expr = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "function", "funcParam", "instrucBloc", "instruc", "ifInst", 
			"whileInst", "forInst", "writeInst", "readInst", "callInst", "turtleCall", 
			"assignationInst", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROC'", "'IS'", "'END'", "'('", "','", "')'", "'IF'", "'THEN'", 
			"'ELSE'", "'WHILE'", "'DO'", "'FOR'", "'FROM'", "'TO'", "'<<'", "'>>'", 
			"'up'", "'down'", "'left'", "'right'", "'forward'", "'backward'", "'color'", 
			"'hide'", "'show'", "'home'", null, null, null, "':='", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "REAL", "INT", "ASSIGN", "EQ", "NEQ", "LE", "GT", 
			"LEQ", "GEQ", "MES", "MENYS", "MUL", "DIV", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "logo3d.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public logo3dParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(logo3dParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				function();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(33);
			match(EOF);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(logo3dParser.ID, 0); }
		public FuncParamContext funcParam() {
			return getRuleContext(FuncParamContext.class,0);
		}
		public InstrucBlocContext instrucBloc() {
			return getRuleContext(InstrucBlocContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__0);
			setState(36);
			match(ID);
			setState(37);
			funcParam();
			setState(38);
			match(T__1);
			setState(39);
			instrucBloc();
			setState(40);
			match(T__2);
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

	public static class FuncParamContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(logo3dParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(logo3dParser.ID, i);
		}
		public FuncParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParam; }
	}

	public final FuncParamContext funcParam() throws RecognitionException {
		FuncParamContext _localctx = new FuncParamContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__3);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(43);
				match(ID);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(44);
					match(T__4);
					setState(45);
					match(ID);
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(53);
			match(T__5);
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

	public static class InstrucBlocContext extends ParserRuleContext {
		public List<InstrucContext> instruc() {
			return getRuleContexts(InstrucContext.class);
		}
		public InstrucContext instruc(int i) {
			return getRuleContext(InstrucContext.class,i);
		}
		public InstrucBlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucBloc; }
	}

	public final InstrucBlocContext instrucBloc() throws RecognitionException {
		InstrucBlocContext _localctx = new InstrucBlocContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instrucBloc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				instruc();
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << ID))) != 0) );
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

	public static class InstrucContext extends ParserRuleContext {
		public AssignationInstContext assignationInst() {
			return getRuleContext(AssignationInstContext.class,0);
		}
		public WriteInstContext writeInst() {
			return getRuleContext(WriteInstContext.class,0);
		}
		public ReadInstContext readInst() {
			return getRuleContext(ReadInstContext.class,0);
		}
		public IfInstContext ifInst() {
			return getRuleContext(IfInstContext.class,0);
		}
		public WhileInstContext whileInst() {
			return getRuleContext(WhileInstContext.class,0);
		}
		public ForInstContext forInst() {
			return getRuleContext(ForInstContext.class,0);
		}
		public CallInstContext callInst() {
			return getRuleContext(CallInstContext.class,0);
		}
		public InstrucContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruc; }
	}

	public final InstrucContext instruc() throws RecognitionException {
		InstrucContext _localctx = new InstrucContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruc);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				assignationInst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				writeInst();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				readInst();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				ifInst();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				whileInst();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				forInst();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				callInst();
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

	public static class IfInstContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<InstrucBlocContext> instrucBloc() {
			return getRuleContexts(InstrucBlocContext.class);
		}
		public InstrucBlocContext instrucBloc(int i) {
			return getRuleContext(InstrucBlocContext.class,i);
		}
		public IfInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifInst; }
	}

	public final IfInstContext ifInst() throws RecognitionException {
		IfInstContext _localctx = new IfInstContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__6);
			setState(70);
			expr(0);
			setState(71);
			match(T__7);
			setState(72);
			instrucBloc();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(73);
				match(T__8);
				setState(74);
				instrucBloc();
				}
			}

			setState(77);
			match(T__2);
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

	public static class WhileInstContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstrucBlocContext instrucBloc() {
			return getRuleContext(InstrucBlocContext.class,0);
		}
		public WhileInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileInst; }
	}

	public final WhileInstContext whileInst() throws RecognitionException {
		WhileInstContext _localctx = new WhileInstContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__9);
			setState(80);
			expr(0);
			setState(81);
			match(T__10);
			setState(82);
			instrucBloc();
			setState(83);
			match(T__2);
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

	public static class ForInstContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(logo3dParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InstrucBlocContext instrucBloc() {
			return getRuleContext(InstrucBlocContext.class,0);
		}
		public ForInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInst; }
	}

	public final ForInstContext forInst() throws RecognitionException {
		ForInstContext _localctx = new ForInstContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__11);
			setState(86);
			match(ID);
			setState(87);
			match(T__12);
			setState(88);
			expr(0);
			setState(89);
			match(T__13);
			setState(90);
			expr(0);
			setState(91);
			match(T__10);
			setState(92);
			instrucBloc();
			setState(93);
			match(T__2);
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

	public static class WriteInstContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WriteInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeInst; }
	}

	public final WriteInstContext writeInst() throws RecognitionException {
		WriteInstContext _localctx = new WriteInstContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_writeInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__14);
			setState(96);
			expr(0);
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

	public static class ReadInstContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(logo3dParser.ID, 0); }
		public ReadInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readInst; }
	}

	public final ReadInstContext readInst() throws RecognitionException {
		ReadInstContext _localctx = new ReadInstContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_readInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__15);
			setState(99);
			match(ID);
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

	public static class CallInstContext extends ParserRuleContext {
		public TurtleCallContext turtleCall() {
			return getRuleContext(TurtleCallContext.class,0);
		}
		public TerminalNode ID() { return getToken(logo3dParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callInst; }
	}

	public final CallInstContext callInst() throws RecognitionException {
		CallInstContext _localctx = new CallInstContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_callInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
				{
				setState(101);
				turtleCall();
				}
				break;
			case ID:
				{
				setState(102);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(105);
			match(T__3);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << ID) | (1L << REAL) | (1L << INT))) != 0)) {
				{
				setState(106);
				expr(0);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(107);
					match(T__4);
					setState(108);
					expr(0);
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(116);
			match(T__5);
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

	public static class TurtleCallContext extends ParserRuleContext {
		public TurtleCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turtleCall; }
	}

	public final TurtleCallContext turtleCall() throws RecognitionException {
		TurtleCallContext _localctx = new TurtleCallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_turtleCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AssignationInstContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(logo3dParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(logo3dParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignationInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignationInst; }
	}

	public final AssignationInstContext assignationInst() throws RecognitionException {
		AssignationInstContext _localctx = new AssignationInstContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignationInst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ID);
			setState(121);
			match(ASSIGN);
			setState(122);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntExprContext extends ExprContext {
		public TerminalNode INT() { return getToken(logo3dParser.INT, 0); }
		public IntExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MesExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MES() { return getToken(logo3dParser.MES, 0); }
		public MesExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class RealExprContext extends ExprContext {
		public TerminalNode REAL() { return getToken(logo3dParser.REAL, 0); }
		public RealExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LessExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(logo3dParser.LE, 0); }
		public LessExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class GreaterEqualExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GEQ() { return getToken(logo3dParser.GEQ, 0); }
		public GreaterEqualExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DifferentExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(logo3dParser.NEQ, 0); }
		public DifferentExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LessEqualExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LEQ() { return getToken(logo3dParser.LEQ, 0); }
		public LessEqualExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class VarExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(logo3dParser.ID, 0); }
		public VarExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class GreaterExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(logo3dParser.GT, 0); }
		public GreaterExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesizedExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesizedExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MulExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(logo3dParser.MUL, 0); }
		public MulExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MenyslExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MENYS() { return getToken(logo3dParser.MENYS, 0); }
		public MenyslExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DivExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(logo3dParser.DIV, 0); }
		public DivExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class EqualExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(logo3dParser.EQ, 0); }
		public EqualExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(125);
				match(T__3);
				setState(126);
				expr(0);
				setState(127);
				match(T__5);
				}
				break;
			case REAL:
				{
				_localctx = new RealExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(REAL);
				}
				break;
			case INT:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new EqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(135);
						match(EQ);
						setState(136);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new DifferentExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(138);
						match(NEQ);
						setState(139);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new LessExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(141);
						match(LE);
						setState(142);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new GreaterExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(144);
						match(GT);
						setState(145);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new LessEqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(147);
						match(LEQ);
						setState(148);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new GreaterEqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(150);
						match(GEQ);
						setState(151);
						expr(9);
						}
						break;
					case 7:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(153);
						match(MUL);
						setState(154);
						expr(8);
						}
						break;
					case 8:
						{
						_localctx = new DivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(156);
						match(DIV);
						setState(157);
						expr(7);
						}
						break;
					case 9:
						{
						_localctx = new MesExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(159);
						match(MES);
						setState(160);
						expr(6);
						}
						break;
					case 10:
						{
						_localctx = new MenyslExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(162);
						match(MENYS);
						setState(163);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\61\n\4\f\4\16\4\64\13"+
		"\4\5\4\66\n\4\3\4\3\4\3\5\6\5;\n\5\r\5\16\5<\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6F\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7N\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\5\fj\n\f\3\f\3\f\3\f\3\f\7\fp\n\f\f\f\16\fs\13\f\5\fu\n\f"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0087\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00a7\n\17\f\17\16\17\u00aa\13\17"+
		"\3\17\2\3\34\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3\2\23\34\2\u00b8"+
		"\2\37\3\2\2\2\4%\3\2\2\2\6,\3\2\2\2\b:\3\2\2\2\nE\3\2\2\2\fG\3\2\2\2\16"+
		"Q\3\2\2\2\20W\3\2\2\2\22a\3\2\2\2\24d\3\2\2\2\26i\3\2\2\2\30x\3\2\2\2"+
		"\32z\3\2\2\2\34\u0086\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37"+
		"\3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\7\2\2\3$\3\3\2\2\2%&\7\3\2\2&\'\7\35"+
		"\2\2\'(\5\6\4\2()\7\4\2\2)*\5\b\5\2*+\7\5\2\2+\5\3\2\2\2,\65\7\6\2\2-"+
		"\62\7\35\2\2./\7\7\2\2/\61\7\35\2\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3"+
		"\2\2\2\62\63\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\65-\3\2\2\2\65\66\3\2"+
		"\2\2\66\67\3\2\2\2\678\7\b\2\28\7\3\2\2\29;\5\n\6\2:9\3\2\2\2;<\3\2\2"+
		"\2<:\3\2\2\2<=\3\2\2\2=\t\3\2\2\2>F\5\32\16\2?F\5\22\n\2@F\5\24\13\2A"+
		"F\5\f\7\2BF\5\16\b\2CF\5\20\t\2DF\5\26\f\2E>\3\2\2\2E?\3\2\2\2E@\3\2\2"+
		"\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\13\3\2\2\2GH\7\t\2\2HI\5\34"+
		"\17\2IJ\7\n\2\2JM\5\b\5\2KL\7\13\2\2LN\5\b\5\2MK\3\2\2\2MN\3\2\2\2NO\3"+
		"\2\2\2OP\7\5\2\2P\r\3\2\2\2QR\7\f\2\2RS\5\34\17\2ST\7\r\2\2TU\5\b\5\2"+
		"UV\7\5\2\2V\17\3\2\2\2WX\7\16\2\2XY\7\35\2\2YZ\7\17\2\2Z[\5\34\17\2[\\"+
		"\7\20\2\2\\]\5\34\17\2]^\7\r\2\2^_\5\b\5\2_`\7\5\2\2`\21\3\2\2\2ab\7\21"+
		"\2\2bc\5\34\17\2c\23\3\2\2\2de\7\22\2\2ef\7\35\2\2f\25\3\2\2\2gj\5\30"+
		"\r\2hj\7\35\2\2ig\3\2\2\2ih\3\2\2\2jk\3\2\2\2kt\7\6\2\2lq\5\34\17\2mn"+
		"\7\7\2\2np\5\34\17\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2"+
		"sq\3\2\2\2tl\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\b\2\2w\27\3\2\2\2xy\t\2\2"+
		"\2y\31\3\2\2\2z{\7\35\2\2{|\7 \2\2|}\5\34\17\2}\33\3\2\2\2~\177\b\17\1"+
		"\2\177\u0080\7\6\2\2\u0080\u0081\5\34\17\2\u0081\u0082\7\b\2\2\u0082\u0087"+
		"\3\2\2\2\u0083\u0087\7\36\2\2\u0084\u0087\7\37\2\2\u0085\u0087\7\35\2"+
		"\2\u0086~\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085"+
		"\3\2\2\2\u0087\u00a8\3\2\2\2\u0088\u0089\f\17\2\2\u0089\u008a\7!\2\2\u008a"+
		"\u00a7\5\34\17\20\u008b\u008c\f\16\2\2\u008c\u008d\7\"\2\2\u008d\u00a7"+
		"\5\34\17\17\u008e\u008f\f\r\2\2\u008f\u0090\7#\2\2\u0090\u00a7\5\34\17"+
		"\16\u0091\u0092\f\f\2\2\u0092\u0093\7$\2\2\u0093\u00a7\5\34\17\r\u0094"+
		"\u0095\f\13\2\2\u0095\u0096\7%\2\2\u0096\u00a7\5\34\17\f\u0097\u0098\f"+
		"\n\2\2\u0098\u0099\7&\2\2\u0099\u00a7\5\34\17\13\u009a\u009b\f\t\2\2\u009b"+
		"\u009c\7)\2\2\u009c\u00a7\5\34\17\n\u009d\u009e\f\b\2\2\u009e\u009f\7"+
		"*\2\2\u009f\u00a7\5\34\17\t\u00a0\u00a1\f\7\2\2\u00a1\u00a2\7\'\2\2\u00a2"+
		"\u00a7\5\34\17\b\u00a3\u00a4\f\6\2\2\u00a4\u00a5\7(\2\2\u00a5\u00a7\5"+
		"\34\17\7\u00a6\u0088\3\2\2\2\u00a6\u008b\3\2\2\2\u00a6\u008e\3\2\2\2\u00a6"+
		"\u0091\3\2\2\2\u00a6\u0094\3\2\2\2\u00a6\u0097\3\2\2\2\u00a6\u009a\3\2"+
		"\2\2\u00a6\u009d\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\35\3\2\2"+
		"\2\u00aa\u00a8\3\2\2\2\16!\62\65<EMiqt\u0086\u00a6\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}