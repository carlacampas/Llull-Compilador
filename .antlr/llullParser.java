// Generated from /Users/carlacampas/Desktop/UPC/LP/Llull-Compilador/llull.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class llullParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, MES=16, MENYS=17, 
		MULT=18, DIV=19, POW=20, MOD=21, PARL=22, PARR=23, BRACKL=24, BRACKR=25, 
		ASSIG=26, EQ=27, NOTEQ=28, LESS=29, GREATER=30, LESSEQ=31, GREATEREQ=32, 
		AND=33, OR=34, RET=35, ALPH=36, INT=37, FLOAT=38, WS=39, NEWLINE=40, COMMENT=41, 
		STRING=42;
	public static final int
		RULE_root = 0, RULE_accio = 1, RULE_stat = 2, RULE_expr = 3, RULE_if_else = 4, 
		RULE_while_loop = 5, RULE_do_while_loop = 6, RULE_for_loop = 7, RULE_assig = 8, 
		RULE_assig_operator = 9, RULE_assig_double = 10, RULE_read = 11, RULE_write = 12, 
		RULE_create_array = 13, RULE_get_array = 14, RULE_set_array = 15, RULE_invocacio = 16, 
		RULE_ids = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "accio", "stat", "expr", "if_else", "while_loop", "do_while_loop", 
			"for_loop", "assig", "assig_operator", "assig_double", "read", "write", 
			"create_array", "get_array", "set_array", "invocacio", "ids"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'if'", "'else if'", "'else'", "'while'", "'do'", "'for'", 
			"';'", "'++'", "'--'", "'read'", "'write'", "'array'", "'get'", "'set'", 
			"'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'('", "')'", "'{'", "'}'", 
			"'='", "'=='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'&&'", "'||'", 
			"'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "MES", "MENYS", "MULT", "DIV", "POW", "MOD", 
			"PARL", "PARR", "BRACKL", "BRACKR", "ASSIG", "EQ", "NOTEQ", "LESS", "GREATER", 
			"LESSEQ", "GREATEREQ", "AND", "OR", "RET", "ALPH", "INT", "FLOAT", "WS", 
			"NEWLINE", "COMMENT", "STRING"
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
	public String getGrammarFileName() { return "llull.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public llullParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(llullParser.EOF, 0); }
		public List<AccioContext> accio() {
			return getRuleContexts(AccioContext.class);
		}
		public AccioContext accio(int i) {
			return getRuleContext(AccioContext.class,i);
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
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				accio();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RET );
			setState(41);
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

	public static class AccioContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(llullParser.RET, 0); }
		public List<IdsContext> ids() {
			return getRuleContexts(IdsContext.class);
		}
		public IdsContext ids(int i) {
			return getRuleContext(IdsContext.class,i);
		}
		public TerminalNode PARL() { return getToken(llullParser.PARL, 0); }
		public TerminalNode PARR() { return getToken(llullParser.PARR, 0); }
		public TerminalNode BRACKL() { return getToken(llullParser.BRACKL, 0); }
		public TerminalNode BRACKR() { return getToken(llullParser.BRACKR, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public AccioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accio; }
	}

	public final AccioContext accio() throws RecognitionException {
		AccioContext _localctx = new AccioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_accio);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(RET);
			setState(44);
			ids();
			setState(45);
			match(PARL);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPH) {
				{
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(46);
						ids();
						setState(47);
						match(T__0);
						}
						} 
					}
					setState(53);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(54);
				ids();
				}
			}

			setState(57);
			match(PARR);
			setState(58);
			match(BRACKL);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << ALPH))) != 0)) {
				{
				{
				setState(59);
				stat();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(BRACKR);
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

	public static class StatContext extends ParserRuleContext {
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Do_while_loopContext do_while_loop() {
			return getRuleContext(Do_while_loopContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public AssigContext assig() {
			return getRuleContext(AssigContext.class,0);
		}
		public Assig_operatorContext assig_operator() {
			return getRuleContext(Assig_operatorContext.class,0);
		}
		public Assig_doubleContext assig_double() {
			return getRuleContext(Assig_doubleContext.class,0);
		}
		public InvocacioContext invocacio() {
			return getRuleContext(InvocacioContext.class,0);
		}
		public Create_arrayContext create_array() {
			return getRuleContext(Create_arrayContext.class,0);
		}
		public Get_arrayContext get_array() {
			return getRuleContext(Get_arrayContext.class,0);
		}
		public Set_arrayContext set_array() {
			return getRuleContext(Set_arrayContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				if_else();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				while_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				for_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				do_while_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				read();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				write();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				assig();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(74);
				assig_operator();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(75);
				assig_double();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(76);
				invocacio();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(77);
				create_array();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(78);
				get_array();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(79);
				set_array();
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode PARL() { return getToken(llullParser.PARL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PARR() { return getToken(llullParser.PARR, 0); }
		public TerminalNode MES() { return getToken(llullParser.MES, 0); }
		public TerminalNode MENYS() { return getToken(llullParser.MENYS, 0); }
		public TerminalNode INT() { return getToken(llullParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(llullParser.FLOAT, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode STRING() { return getToken(llullParser.STRING, 0); }
		public Get_arrayContext get_array() {
			return getRuleContext(Get_arrayContext.class,0);
		}
		public TerminalNode POW() { return getToken(llullParser.POW, 0); }
		public TerminalNode MULT() { return getToken(llullParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(llullParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(llullParser.MOD, 0); }
		public TerminalNode EQ() { return getToken(llullParser.EQ, 0); }
		public TerminalNode NOTEQ() { return getToken(llullParser.NOTEQ, 0); }
		public TerminalNode LESS() { return getToken(llullParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(llullParser.GREATER, 0); }
		public TerminalNode LESSEQ() { return getToken(llullParser.LESSEQ, 0); }
		public TerminalNode GREATEREQ() { return getToken(llullParser.GREATEREQ, 0); }
		public TerminalNode AND() { return getToken(llullParser.AND, 0); }
		public TerminalNode OR() { return getToken(llullParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARL:
				{
				setState(83);
				match(PARL);
				setState(84);
				expr(0);
				setState(85);
				match(PARR);
				}
				break;
			case MES:
			case MENYS:
				{
				setState(87);
				_la = _input.LA(1);
				if ( !(_la==MES || _la==MENYS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(88);
				expr(10);
				}
				break;
			case INT:
				{
				setState(89);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(90);
				match(FLOAT);
				}
				break;
			case ALPH:
				{
				setState(91);
				ids();
				}
				break;
			case STRING:
				{
				setState(92);
				match(STRING);
				}
				break;
			case T__13:
				{
				setState(93);
				get_array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(97);
						match(POW);
						setState(98);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(100);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(101);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(103);
						_la = _input.LA(1);
						if ( !(_la==MES || _la==MENYS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(104);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(106);
						match(MOD);
						setState(107);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(109);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NOTEQ) | (1L << LESS) | (1L << GREATER) | (1L << LESSEQ) | (1L << GREATEREQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(112);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class If_elseContext extends ParserRuleContext {
		public List<TerminalNode> PARL() { return getTokens(llullParser.PARL); }
		public TerminalNode PARL(int i) {
			return getToken(llullParser.PARL, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> PARR() { return getTokens(llullParser.PARR); }
		public TerminalNode PARR(int i) {
			return getToken(llullParser.PARR, i);
		}
		public List<TerminalNode> BRACKL() { return getTokens(llullParser.BRACKL); }
		public TerminalNode BRACKL(int i) {
			return getToken(llullParser.BRACKL, i);
		}
		public List<TerminalNode> BRACKR() { return getTokens(llullParser.BRACKR); }
		public TerminalNode BRACKR(int i) {
			return getToken(llullParser.BRACKR, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__1);
			setState(120);
			match(PARL);
			setState(121);
			expr(0);
			setState(122);
			match(PARR);
			setState(123);
			match(BRACKL);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << ALPH))) != 0)) {
				{
				{
				setState(124);
				stat();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(BRACKR);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(131);
				match(T__2);
				setState(132);
				match(PARL);
				setState(133);
				expr(0);
				setState(134);
				match(PARR);
				setState(135);
				match(BRACKL);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << ALPH))) != 0)) {
					{
					{
					setState(136);
					stat();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				match(BRACKR);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(149);
				match(T__3);
				setState(150);
				match(BRACKL);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << ALPH))) != 0)) {
					{
					{
					setState(151);
					stat();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(BRACKR);
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode PARL() { return getToken(llullParser.PARL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARR() { return getToken(llullParser.PARR, 0); }
		public TerminalNode BRACKL() { return getToken(llullParser.BRACKL, 0); }
		public TerminalNode BRACKR() { return getToken(llullParser.BRACKR, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__4);
			setState(161);
			match(PARL);
			setState(162);
			expr(0);
			setState(163);
			match(PARR);
			setState(164);
			match(BRACKL);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << ALPH))) != 0)) {
				{
				{
				setState(165);
				stat();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(BRACKR);
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

	public static class Do_while_loopContext extends ParserRuleContext {
		public TerminalNode BRACKL() { return getToken(llullParser.BRACKL, 0); }
		public TerminalNode BRACKR() { return getToken(llullParser.BRACKR, 0); }
		public TerminalNode PARL() { return getToken(llullParser.PARL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARR() { return getToken(llullParser.PARR, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Do_while_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_loop; }
	}

	public final Do_while_loopContext do_while_loop() throws RecognitionException {
		Do_while_loopContext _localctx = new Do_while_loopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_do_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__5);
			setState(174);
			match(BRACKL);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << ALPH))) != 0)) {
				{
				{
				setState(175);
				stat();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(BRACKR);
			setState(182);
			match(T__4);
			setState(183);
			match(PARL);
			setState(184);
			expr(0);
			setState(185);
			match(PARR);
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode PARL() { return getToken(llullParser.PARL, 0); }
		public AssigContext assig() {
			return getRuleContext(AssigContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARR() { return getToken(llullParser.PARR, 0); }
		public TerminalNode BRACKL() { return getToken(llullParser.BRACKL, 0); }
		public TerminalNode BRACKR() { return getToken(llullParser.BRACKR, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__6);
			setState(188);
			match(PARL);
			setState(189);
			assig();
			setState(190);
			match(T__7);
			setState(191);
			expr(0);
			setState(192);
			match(T__7);
			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				stat();
				}
				}
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << ALPH))) != 0) );
			setState(198);
			match(PARR);
			setState(199);
			match(BRACKL);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << ALPH))) != 0)) {
				{
				{
				setState(200);
				stat();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(BRACKR);
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

	public static class AssigContext extends ParserRuleContext {
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode ASSIG() { return getToken(llullParser.ASSIG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assig; }
	}

	public final AssigContext assig() throws RecognitionException {
		AssigContext _localctx = new AssigContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			ids();
			setState(209);
			match(ASSIG);
			setState(210);
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

	public static class Assig_operatorContext extends ParserRuleContext {
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode ASSIG() { return getToken(llullParser.ASSIG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MES() { return getToken(llullParser.MES, 0); }
		public TerminalNode MENYS() { return getToken(llullParser.MENYS, 0); }
		public TerminalNode MULT() { return getToken(llullParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(llullParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(llullParser.MOD, 0); }
		public TerminalNode AND() { return getToken(llullParser.AND, 0); }
		public TerminalNode OR() { return getToken(llullParser.OR, 0); }
		public Assig_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assig_operator; }
	}

	public final Assig_operatorContext assig_operator() throws RecognitionException {
		Assig_operatorContext _localctx = new Assig_operatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assig_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			ids();
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MES) | (1L << MENYS) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << AND) | (1L << OR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(214);
			match(ASSIG);
			setState(215);
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

	public static class Assig_doubleContext extends ParserRuleContext {
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public Assig_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assig_double; }
	}

	public final Assig_doubleContext assig_double() throws RecognitionException {
		Assig_doubleContext _localctx = new Assig_doubleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assig_double);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			ids();
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode PARL() { return getToken(llullParser.PARL, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode PARR() { return getToken(llullParser.PARR, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__10);
			setState(221);
			match(PARL);
			setState(222);
			ids();
			setState(223);
			match(PARR);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode PARL() { return getToken(llullParser.PARL, 0); }
		public TerminalNode PARR() { return getToken(llullParser.PARR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(llullParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(llullParser.STRING, i);
		}
		public List<IdsContext> ids() {
			return getRuleContexts(IdsContext.class);
		}
		public IdsContext ids(int i) {
			return getRuleContext(IdsContext.class,i);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_write);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__11);
			setState(226);
			match(PARL);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(227);
						expr(0);
						}
						break;
					case 2:
						{
						setState(228);
						match(STRING);
						}
						break;
					case 3:
						{
						setState(229);
						ids();
						}
						break;
					}
					setState(232);
					match(T__0);
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(238);
				expr(0);
				}
				break;
			case 2:
				{
				setState(239);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(240);
				ids();
				}
				break;
			}
			setState(243);
			match(PARR);
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

	public static class Create_arrayContext extends ParserRuleContext {
		public TerminalNode PARL() { return getToken(llullParser.PARL, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARR() { return getToken(llullParser.PARR, 0); }
		public Create_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_array; }
	}

	public final Create_arrayContext create_array() throws RecognitionException {
		Create_arrayContext _localctx = new Create_arrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__12);
			setState(246);
			match(PARL);
			setState(247);
			ids();
			setState(248);
			match(T__0);
			setState(249);
			expr(0);
			setState(250);
			match(PARR);
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

	public static class Get_arrayContext extends ParserRuleContext {
		public TerminalNode PARL() { return getToken(llullParser.PARL, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARR() { return getToken(llullParser.PARR, 0); }
		public Get_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_array; }
	}

	public final Get_arrayContext get_array() throws RecognitionException {
		Get_arrayContext _localctx = new Get_arrayContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_get_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__13);
			setState(253);
			match(PARL);
			setState(254);
			ids();
			setState(255);
			match(T__0);
			setState(256);
			expr(0);
			setState(257);
			match(PARR);
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

	public static class Set_arrayContext extends ParserRuleContext {
		public TerminalNode PARL() { return getToken(llullParser.PARL, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PARR() { return getToken(llullParser.PARR, 0); }
		public Set_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_array; }
	}

	public final Set_arrayContext set_array() throws RecognitionException {
		Set_arrayContext _localctx = new Set_arrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_set_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__14);
			setState(260);
			match(PARL);
			setState(261);
			ids();
			setState(262);
			match(T__0);
			setState(263);
			expr(0);
			setState(264);
			match(T__0);
			setState(265);
			expr(0);
			setState(266);
			match(PARR);
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

	public static class InvocacioContext extends ParserRuleContext {
		public List<IdsContext> ids() {
			return getRuleContexts(IdsContext.class);
		}
		public IdsContext ids(int i) {
			return getRuleContext(IdsContext.class,i);
		}
		public TerminalNode PARL() { return getToken(llullParser.PARL, 0); }
		public TerminalNode PARR() { return getToken(llullParser.PARR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InvocacioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocacio; }
	}

	public final InvocacioContext invocacio() throws RecognitionException {
		InvocacioContext _localctx = new InvocacioContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_invocacio);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			ids();
			setState(269);
			match(PARL);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << MES) | (1L << MENYS) | (1L << PARL) | (1L << ALPH) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(272);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(270);
							ids();
							}
							break;
						case 2:
							{
							setState(271);
							expr(0);
							}
							break;
						}
						setState(274);
						match(T__0);
						}
						} 
					}
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(281);
					ids();
					}
					break;
				case 2:
					{
					setState(282);
					expr(0);
					}
					break;
				}
				}
			}

			setState(287);
			match(PARR);
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

	public static class IdsContext extends ParserRuleContext {
		public List<TerminalNode> ALPH() { return getTokens(llullParser.ALPH); }
		public TerminalNode ALPH(int i) {
			return getToken(llullParser.ALPH, i);
		}
		public List<TerminalNode> INT() { return getTokens(llullParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(llullParser.INT, i);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ids);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(ALPH);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(290);
					_la = _input.LA(1);
					if ( !(_la==ALPH || _la==INT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u012b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"\64\n\3\f\3\16\3\67\13\3\3\3\5\3:\n\3\3\3\3\3\3\3\7\3?\n\3\f\3\16\3B\13"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4S\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5a\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5u\n"+
		"\5\f\5\16\5x\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0080\n\6\f\6\16\6\u0083"+
		"\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008c\n\6\f\6\16\6\u008f\13\6\3"+
		"\6\3\6\7\6\u0093\n\6\f\6\16\6\u0096\13\6\3\6\3\6\3\6\7\6\u009b\n\6\f\6"+
		"\16\6\u009e\13\6\3\6\5\6\u00a1\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a9\n"+
		"\7\f\7\16\7\u00ac\13\7\3\7\3\7\3\b\3\b\3\b\7\b\u00b3\n\b\f\b\16\b\u00b6"+
		"\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u00c5\n"+
		"\t\r\t\16\t\u00c6\3\t\3\t\3\t\7\t\u00cc\n\t\f\t\16\t\u00cf\13\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u00e9\n\16\3\16\7\16\u00ec\n\16\f"+
		"\16\16\16\u00ef\13\16\3\16\3\16\3\16\5\16\u00f4\n\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u0113"+
		"\n\22\3\22\3\22\7\22\u0117\n\22\f\22\16\22\u011a\13\22\3\22\3\22\5\22"+
		"\u011e\n\22\5\22\u0120\n\22\3\22\3\22\3\23\3\23\7\23\u0126\n\23\f\23\16"+
		"\23\u0129\13\23\3\23\2\3\b\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$\2\t\3\2\22\23\3\2\24\25\3\2\35\"\3\2#$\5\2\22\25\27\27#$\3\2\13\f"+
		"\3\2&\'\2\u0147\2\'\3\2\2\2\4-\3\2\2\2\6R\3\2\2\2\b`\3\2\2\2\ny\3\2\2"+
		"\2\f\u00a2\3\2\2\2\16\u00af\3\2\2\2\20\u00bd\3\2\2\2\22\u00d2\3\2\2\2"+
		"\24\u00d6\3\2\2\2\26\u00db\3\2\2\2\30\u00de\3\2\2\2\32\u00e3\3\2\2\2\34"+
		"\u00f7\3\2\2\2\36\u00fe\3\2\2\2 \u0105\3\2\2\2\"\u010e\3\2\2\2$\u0123"+
		"\3\2\2\2&(\5\4\3\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2"+
		"+,\7\2\2\3,\3\3\2\2\2-.\7%\2\2./\5$\23\2/9\7\30\2\2\60\61\5$\23\2\61\62"+
		"\7\3\2\2\62\64\3\2\2\2\63\60\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66"+
		"\3\2\2\2\668\3\2\2\2\67\65\3\2\2\28:\5$\23\29\65\3\2\2\29:\3\2\2\2:;\3"+
		"\2\2\2;<\7\31\2\2<@\7\32\2\2=?\5\6\4\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@"+
		"A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\33\2\2D\5\3\2\2\2ES\5\n\6\2FS\5\f\7"+
		"\2GS\5\20\t\2HS\5\16\b\2IS\5\30\r\2JS\5\32\16\2KS\5\22\n\2LS\5\24\13\2"+
		"MS\5\26\f\2NS\5\"\22\2OS\5\34\17\2PS\5\36\20\2QS\5 \21\2RE\3\2\2\2RF\3"+
		"\2\2\2RG\3\2\2\2RH\3\2\2\2RI\3\2\2\2RJ\3\2\2\2RK\3\2\2\2RL\3\2\2\2RM\3"+
		"\2\2\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\7\3\2\2\2TU\b\5\1\2UV"+
		"\7\30\2\2VW\5\b\5\2WX\7\31\2\2Xa\3\2\2\2YZ\t\2\2\2Za\5\b\5\f[a\7\'\2\2"+
		"\\a\7(\2\2]a\5$\23\2^a\7,\2\2_a\5\36\20\2`T\3\2\2\2`Y\3\2\2\2`[\3\2\2"+
		"\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2av\3\2\2\2bc\f\16\2\2cd\7\26"+
		"\2\2du\5\b\5\17ef\f\r\2\2fg\t\3\2\2gu\5\b\5\16hi\f\13\2\2ij\t\2\2\2ju"+
		"\5\b\5\fkl\f\n\2\2lm\7\27\2\2mu\5\b\5\13no\f\t\2\2op\t\4\2\2pu\5\b\5\n"+
		"qr\f\b\2\2rs\t\5\2\2su\5\b\5\ttb\3\2\2\2te\3\2\2\2th\3\2\2\2tk\3\2\2\2"+
		"tn\3\2\2\2tq\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\t\3\2\2\2xv\3\2\2"+
		"\2yz\7\4\2\2z{\7\30\2\2{|\5\b\5\2|}\7\31\2\2}\u0081\7\32\2\2~\u0080\5"+
		"\6\4\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0094\7\33\2\2"+
		"\u0085\u0086\7\5\2\2\u0086\u0087\7\30\2\2\u0087\u0088\5\b\5\2\u0088\u0089"+
		"\7\31\2\2\u0089\u008d\7\32\2\2\u008a\u008c\5\6\4\2\u008b\u008a\3\2\2\2"+
		"\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\33\2\2\u0091\u0093\3\2\2\2"+
		"\u0092\u0085\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u00a0\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\6\2\2\u0098"+
		"\u009c\7\32\2\2\u0099\u009b\5\6\4\2\u009a\u0099\3\2\2\2\u009b\u009e\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a1\7\33\2\2\u00a0\u0097\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\13\3\2\2\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\7\30\2\2\u00a4"+
		"\u00a5\5\b\5\2\u00a5\u00a6\7\31\2\2\u00a6\u00aa\7\32\2\2\u00a7\u00a9\5"+
		"\6\4\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\33"+
		"\2\2\u00ae\r\3\2\2\2\u00af\u00b0\7\b\2\2\u00b0\u00b4\7\32\2\2\u00b1\u00b3"+
		"\5\6\4\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\33"+
		"\2\2\u00b8\u00b9\7\7\2\2\u00b9\u00ba\7\30\2\2\u00ba\u00bb\5\b\5\2\u00bb"+
		"\u00bc\7\31\2\2\u00bc\17\3\2\2\2\u00bd\u00be\7\t\2\2\u00be\u00bf\7\30"+
		"\2\2\u00bf\u00c0\5\22\n\2\u00c0\u00c1\7\n\2\2\u00c1\u00c2\5\b\5\2\u00c2"+
		"\u00c4\7\n\2\2\u00c3\u00c5\5\6\4\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\7\31\2\2\u00c9\u00cd\7\32\2\2\u00ca\u00cc\5\6\4\2\u00cb\u00ca\3"+
		"\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\33\2\2\u00d1\21\3\2\2"+
		"\2\u00d2\u00d3\5$\23\2\u00d3\u00d4\7\34\2\2\u00d4\u00d5\5\b\5\2\u00d5"+
		"\23\3\2\2\2\u00d6\u00d7\5$\23\2\u00d7\u00d8\t\6\2\2\u00d8\u00d9\7\34\2"+
		"\2\u00d9\u00da\5\b\5\2\u00da\25\3\2\2\2\u00db\u00dc\5$\23\2\u00dc\u00dd"+
		"\t\7\2\2\u00dd\27\3\2\2\2\u00de\u00df\7\r\2\2\u00df\u00e0\7\30\2\2\u00e0"+
		"\u00e1\5$\23\2\u00e1\u00e2\7\31\2\2\u00e2\31\3\2\2\2\u00e3\u00e4\7\16"+
		"\2\2\u00e4\u00ed\7\30\2\2\u00e5\u00e9\5\b\5\2\u00e6\u00e9\7,\2\2\u00e7"+
		"\u00e9\5$\23\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\7\3\2\2\u00eb\u00e8\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f3\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f4\5\b\5\2\u00f1\u00f4\7,\2\2\u00f2"+
		"\u00f4\5$\23\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7\31\2\2\u00f6\33\3\2\2\2\u00f7\u00f8"+
		"\7\17\2\2\u00f8\u00f9\7\30\2\2\u00f9\u00fa\5$\23\2\u00fa\u00fb\7\3\2\2"+
		"\u00fb\u00fc\5\b\5\2\u00fc\u00fd\7\31\2\2\u00fd\35\3\2\2\2\u00fe\u00ff"+
		"\7\20\2\2\u00ff\u0100\7\30\2\2\u0100\u0101\5$\23\2\u0101\u0102\7\3\2\2"+
		"\u0102\u0103\5\b\5\2\u0103\u0104\7\31\2\2\u0104\37\3\2\2\2\u0105\u0106"+
		"\7\21\2\2\u0106\u0107\7\30\2\2\u0107\u0108\5$\23\2\u0108\u0109\7\3\2\2"+
		"\u0109\u010a\5\b\5\2\u010a\u010b\7\3\2\2\u010b\u010c\5\b\5\2\u010c\u010d"+
		"\7\31\2\2\u010d!\3\2\2\2\u010e\u010f\5$\23\2\u010f\u011f\7\30\2\2\u0110"+
		"\u0113\5$\23\2\u0111\u0113\5\b\5\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\3\2\2\u0115\u0117\3\2\2\2\u0116"+
		"\u0112\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011d\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011e\5$\23\2\u011c"+
		"\u011e\5\b\5\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u0120\3\2"+
		"\2\2\u011f\u0118\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\7\31\2\2\u0122#\3\2\2\2\u0123\u0127\7&\2\2\u0124\u0126\t\b\2\2"+
		"\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128%\3\2\2\2\u0129\u0127\3\2\2\2\33)\659@R`tv\u0081\u008d\u0094"+
		"\u009c\u00a0\u00aa\u00b4\u00c6\u00cd\u00e8\u00ed\u00f3\u0112\u0118\u011d"+
		"\u011f\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}