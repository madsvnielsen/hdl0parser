// Generated from cc.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ccParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, BINARY=12, SIGNAL=13, HARDWARECMD=14, INPUTSCMD=15, 
		OUTPUTSCMD=16, WHITESPACE=17, COMMENT=18, MULTICOMMENT=19;
	public static final int
		RULE_start = 0, RULE_commands = 1, RULE_assignment = 2, RULE_latch = 3, 
		RULE_iovalue = 4, RULE_updatescmd = 5, RULE_latchescmd = 6, RULE_simulatedcmd = 7, 
		RULE_exp = 8, RULE_ignore = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "commands", "assignment", "latch", "iovalue", "updatescmd", 
			"latchescmd", "simulatedcmd", "exp", "ignore"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'\\n'", "'->'", "'.update'", "'.latches'", "'.simulate'", 
			"'('", "')'", "'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"BINARY", "SIGNAL", "HARDWARECMD", "INPUTSCMD", "OUTPUTSCMD", "WHITESPACE", 
			"COMMENT", "MULTICOMMENT"
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
	public String getGrammarFileName() { return "cc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ccParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ccParser.EOF, 0); }
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 901232L) != 0)) {
				{
				{
				setState(20);
				commands();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandsContext extends ParserRuleContext {
		public TerminalNode HARDWARECMD() { return getToken(ccParser.HARDWARECMD, 0); }
		public TerminalNode INPUTSCMD() { return getToken(ccParser.INPUTSCMD, 0); }
		public TerminalNode OUTPUTSCMD() { return getToken(ccParser.OUTPUTSCMD, 0); }
		public UpdatescmdContext updatescmd() {
			return getRuleContext(UpdatescmdContext.class,0);
		}
		public LatchescmdContext latchescmd() {
			return getRuleContext(LatchescmdContext.class,0);
		}
		public SimulatedcmdContext simulatedcmd() {
			return getRuleContext(SimulatedcmdContext.class,0);
		}
		public IgnoreContext ignore() {
			return getRuleContext(IgnoreContext.class,0);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitCommands(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_commands);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HARDWARECMD:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(HARDWARECMD);
				}
				break;
			case INPUTSCMD:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(INPUTSCMD);
				}
				break;
			case OUTPUTSCMD:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				match(OUTPUTSCMD);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				updatescmd();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				latchescmd();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(33);
				simulatedcmd();
				}
				break;
			case COMMENT:
			case MULTICOMMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(34);
				ignore();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode SIGNAL() { return getToken(ccParser.SIGNAL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(SIGNAL);
			setState(38);
			match(T__0);
			setState(39);
			exp(0);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(40);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LatchContext extends ParserRuleContext {
		public List<TerminalNode> SIGNAL() { return getTokens(ccParser.SIGNAL); }
		public TerminalNode SIGNAL(int i) {
			return getToken(ccParser.SIGNAL, i);
		}
		public LatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterLatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitLatch(this);
		}
	}

	public final LatchContext latch() throws RecognitionException {
		LatchContext _localctx = new LatchContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_latch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(SIGNAL);
			setState(44);
			match(T__2);
			setState(45);
			match(SIGNAL);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(46);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IovalueContext extends ParserRuleContext {
		public TerminalNode SIGNAL() { return getToken(ccParser.SIGNAL, 0); }
		public TerminalNode BINARY() { return getToken(ccParser.BINARY, 0); }
		public IovalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iovalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterIovalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitIovalue(this);
		}
	}

	public final IovalueContext iovalue() throws RecognitionException {
		IovalueContext _localctx = new IovalueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_iovalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(SIGNAL);
			setState(50);
			match(T__0);
			setState(51);
			match(BINARY);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(52);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UpdatescmdContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public UpdatescmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updatescmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterUpdatescmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitUpdatescmd(this);
		}
	}

	public final UpdatescmdContext updatescmd() throws RecognitionException {
		UpdatescmdContext _localctx = new UpdatescmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_updatescmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__3);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(56);
				match(T__1);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				assignment();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SIGNAL );
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

	@SuppressWarnings("CheckReturnValue")
	public static class LatchescmdContext extends ParserRuleContext {
		public List<LatchContext> latch() {
			return getRuleContexts(LatchContext.class);
		}
		public LatchContext latch(int i) {
			return getRuleContext(LatchContext.class,i);
		}
		public LatchescmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latchescmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterLatchescmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitLatchescmd(this);
		}
	}

	public final LatchescmdContext latchescmd() throws RecognitionException {
		LatchescmdContext _localctx = new LatchescmdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_latchescmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__4);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(68);
				match(T__1);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				latch();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SIGNAL );
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimulatedcmdContext extends ParserRuleContext {
		public List<IovalueContext> iovalue() {
			return getRuleContexts(IovalueContext.class);
		}
		public IovalueContext iovalue(int i) {
			return getRuleContext(IovalueContext.class,i);
		}
		public SimulatedcmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simulatedcmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterSimulatedcmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitSimulatedcmd(this);
		}
	}

	public final SimulatedcmdContext simulatedcmd() throws RecognitionException {
		SimulatedcmdContext _localctx = new SimulatedcmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simulatedcmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__5);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(80);
				match(T__1);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				iovalue();
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SIGNAL );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SIGNAL() { return getToken(ccParser.SIGNAL, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(92);
				match(T__6);
				setState(93);
				exp(0);
				setState(94);
				match(T__7);
				}
				break;
			case T__8:
				{
				setState(96);
				match(T__8);
				setState(97);
				exp(4);
				}
				break;
			case SIGNAL:
				{
				setState(98);
				match(SIGNAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(101);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(102);
						match(T__9);
						setState(103);
						exp(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(104);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(105);
						match(T__10);
						setState(106);
						exp(3);
						}
						break;
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IgnoreContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(ccParser.COMMENT, 0); }
		public TerminalNode MULTICOMMENT() { return getToken(ccParser.MULTICOMMENT, 0); }
		public IgnoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterIgnore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitIgnore(this);
		}
	}

	public final IgnoreContext ignore() throws RecognitionException {
		IgnoreContext _localctx = new IgnoreContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ignore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !(_la==COMMENT || _la==MULTICOMMENT) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013s\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"$\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"*\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"0\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"6\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005:\b\u0005\n\u0005\f\u0005"+
		"=\t\u0005\u0001\u0005\u0004\u0005@\b\u0005\u000b\u0005\f\u0005A\u0001"+
		"\u0006\u0001\u0006\u0005\u0006F\b\u0006\n\u0006\f\u0006I\t\u0006\u0001"+
		"\u0006\u0004\u0006L\b\u0006\u000b\u0006\f\u0006M\u0001\u0007\u0001\u0007"+
		"\u0005\u0007R\b\u0007\n\u0007\f\u0007U\t\u0007\u0001\u0007\u0004\u0007"+
		"X\b\u0007\u000b\u0007\f\u0007Y\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\bd\b\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\bl\b\b\n\b\f\bo\t\b\u0001\t\u0001\t\u0001\t\u0000"+
		"\u0001\u0010\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0001"+
		"\u0001\u0000\u0012\u0013|\u0000\u0017\u0001\u0000\u0000\u0000\u0002#\u0001"+
		"\u0000\u0000\u0000\u0004%\u0001\u0000\u0000\u0000\u0006+\u0001\u0000\u0000"+
		"\u0000\b1\u0001\u0000\u0000\u0000\n7\u0001\u0000\u0000\u0000\fC\u0001"+
		"\u0000\u0000\u0000\u000eO\u0001\u0000\u0000\u0000\u0010c\u0001\u0000\u0000"+
		"\u0000\u0012p\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000"+
		"\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000"+
		"\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000"+
		"\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0005\u0000\u0000\u0001\u001b\u0001\u0001\u0000\u0000\u0000"+
		"\u001c$\u0005\u000e\u0000\u0000\u001d$\u0005\u000f\u0000\u0000\u001e$"+
		"\u0005\u0010\u0000\u0000\u001f$\u0003\n\u0005\u0000 $\u0003\f\u0006\u0000"+
		"!$\u0003\u000e\u0007\u0000\"$\u0003\u0012\t\u0000#\u001c\u0001\u0000\u0000"+
		"\u0000#\u001d\u0001\u0000\u0000\u0000#\u001e\u0001\u0000\u0000\u0000#"+
		"\u001f\u0001\u0000\u0000\u0000# \u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000#\"\u0001\u0000\u0000\u0000$\u0003\u0001\u0000\u0000\u0000"+
		"%&\u0005\r\u0000\u0000&\'\u0005\u0001\u0000\u0000\')\u0003\u0010\b\u0000"+
		"(*\u0005\u0002\u0000\u0000)(\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000"+
		"\u0000*\u0005\u0001\u0000\u0000\u0000+,\u0005\r\u0000\u0000,-\u0005\u0003"+
		"\u0000\u0000-/\u0005\r\u0000\u0000.0\u0005\u0002\u0000\u0000/.\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u00000\u0007\u0001\u0000\u0000\u0000"+
		"12\u0005\r\u0000\u000023\u0005\u0001\u0000\u000035\u0005\f\u0000\u0000"+
		"46\u0005\u0002\u0000\u000054\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u00006\t\u0001\u0000\u0000\u00007;\u0005\u0004\u0000\u00008:\u0005\u0002"+
		"\u0000\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000>@\u0003\u0004\u0002\u0000?>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000B\u000b\u0001\u0000\u0000\u0000CG\u0005\u0005\u0000\u0000"+
		"DF\u0005\u0002\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HK\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000JL\u0003\u0006\u0003\u0000KJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000N\r\u0001\u0000\u0000\u0000OS\u0005\u0006\u0000"+
		"\u0000PR\u0005\u0002\u0000\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TW\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VX\u0003\b\u0004\u0000WV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z\u000f\u0001\u0000\u0000\u0000[\\\u0006\b\uffff"+
		"\uffff\u0000\\]\u0005\u0007\u0000\u0000]^\u0003\u0010\b\u0000^_\u0005"+
		"\b\u0000\u0000_d\u0001\u0000\u0000\u0000`a\u0005\t\u0000\u0000ad\u0003"+
		"\u0010\b\u0004bd\u0005\r\u0000\u0000c[\u0001\u0000\u0000\u0000c`\u0001"+
		"\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000dm\u0001\u0000\u0000\u0000"+
		"ef\n\u0003\u0000\u0000fg\u0005\n\u0000\u0000gl\u0003\u0010\b\u0004hi\n"+
		"\u0002\u0000\u0000ij\u0005\u000b\u0000\u0000jl\u0003\u0010\b\u0003ke\u0001"+
		"\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u0011\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0007\u0000\u0000\u0000q\u0013"+
		"\u0001\u0000\u0000\u0000\u000e\u0017#)/5;AGMSYckm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}