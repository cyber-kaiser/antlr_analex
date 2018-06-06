// Generated from fol.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class folParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, LPAREN=6, RPAREN=7, EQUAL=8, NOT=9, 
		FORALL=10, EXISTS=11, CHARACTER=12, CONJ=13, DISJ=14, IMPL=15, BICOND=16, 
		ENDLINE=17, WHITESPACE=18;
	public static final int
		RULE_condition = 0, RULE_formula = 1, RULE_term = 2, RULE_bin_connective = 3, 
		RULE_variable = 4, RULE_pred_constant = 5, RULE_ind_constant = 6, RULE_func_constant = 7, 
		RULE_separator = 8;
	public static final String[] ruleNames = {
		"condition", "formula", "term", "bin_connective", "variable", "pred_constant", 
		"ind_constant", "func_constant", "separator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'?'", "'_'", "'#'", "'.'", "','", "'('", "')'", "'='", "'!'", "'Forall'", 
		"'Exists'", null, "'\\/'", "'^'", "'->'", "'<->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "LPAREN", "RPAREN", "EQUAL", "NOT", 
		"FORALL", "EXISTS", "CHARACTER", "CONJ", "DISJ", "IMPL", "BICOND", "ENDLINE", 
		"WHITESPACE"
	};
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
	public String getGrammarFileName() { return "fol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public folParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConditionContext extends ParserRuleContext {
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public TerminalNode EOF() { return getToken(folParser.EOF, 0); }
		public List<TerminalNode> ENDLINE() { return getTokens(folParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(folParser.ENDLINE, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			formula(0);
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(19);
					match(ENDLINE);
					setState(20);
					formula(0);
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(26);
				match(ENDLINE);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
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

	public static class FormulaContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(folParser.NOT, 0); }
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public Bin_connectiveContext bin_connective() {
			return getRuleContext(Bin_connectiveContext.class,0);
		}
		public TerminalNode FORALL() { return getToken(folParser.FORALL, 0); }
		public TerminalNode LPAREN() { return getToken(folParser.LPAREN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(folParser.RPAREN, 0); }
		public TerminalNode EXISTS() { return getToken(folParser.EXISTS, 0); }
		public Pred_constantContext pred_constant() {
			return getRuleContext(Pred_constantContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(folParser.EQUAL, 0); }
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitFormula(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		return formula(0);
	}

	private FormulaContext formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FormulaContext _localctx = new FormulaContext(_ctx, _parentState);
		FormulaContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_formula, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(35);
				match(NOT);
				setState(36);
				formula(0);
				setState(37);
				bin_connective();
				setState(38);
				formula(6);
				}
				break;
			case 2:
				{
				setState(40);
				match(NOT);
				setState(41);
				formula(5);
				}
				break;
			case 3:
				{
				setState(42);
				match(FORALL);
				setState(43);
				match(LPAREN);
				setState(44);
				variable();
				setState(45);
				match(RPAREN);
				setState(46);
				formula(4);
				}
				break;
			case 4:
				{
				setState(48);
				match(EXISTS);
				setState(49);
				match(LPAREN);
				setState(50);
				variable();
				setState(51);
				match(RPAREN);
				setState(52);
				formula(3);
				}
				break;
			case 5:
				{
				setState(54);
				pred_constant();
				setState(55);
				match(LPAREN);
				setState(56);
				term();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(57);
					separator();
					setState(58);
					term();
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65);
				match(RPAREN);
				}
				break;
			case 6:
				{
				setState(67);
				term();
				setState(68);
				match(EQUAL);
				setState(69);
				term();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FormulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_formula);
					setState(73);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(74);
					bin_connective();
					setState(75);
					formula(8);
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public Ind_constantContext ind_constant() {
			return getRuleContext(Ind_constantContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Func_constantContext func_constant() {
			return getRuleContext(Func_constantContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(folParser.LPAREN, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(folParser.RPAREN, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				ind_constant();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				variable();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				func_constant();
				setState(85);
				match(LPAREN);
				setState(86);
				term();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(87);
					separator();
					setState(88);
					term();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
				match(RPAREN);
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

	public static class Bin_connectiveContext extends ParserRuleContext {
		public TerminalNode CONJ() { return getToken(folParser.CONJ, 0); }
		public TerminalNode DISJ() { return getToken(folParser.DISJ, 0); }
		public TerminalNode IMPL() { return getToken(folParser.IMPL, 0); }
		public TerminalNode BICOND() { return getToken(folParser.BICOND, 0); }
		public Bin_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterBin_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitBin_connective(this);
		}
	}

	public final Bin_connectiveContext bin_connective() throws RecognitionException {
		Bin_connectiveContext _localctx = new Bin_connectiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bin_connective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONJ) | (1L << DISJ) | (1L << IMPL) | (1L << BICOND))) != 0)) ) {
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

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> CHARACTER() { return getTokens(folParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(folParser.CHARACTER, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__0);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					match(CHARACTER);
					}
					} 
				}
				setState(107);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Pred_constantContext extends ParserRuleContext {
		public List<TerminalNode> CHARACTER() { return getTokens(folParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(folParser.CHARACTER, i);
		}
		public Pred_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pred_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterPred_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitPred_constant(this);
		}
	}

	public final Pred_constantContext pred_constant() throws RecognitionException {
		Pred_constantContext _localctx = new Pred_constantContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pred_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__1);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARACTER) {
				{
				{
				setState(109);
				match(CHARACTER);
				}
				}
				setState(114);
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

	public static class Ind_constantContext extends ParserRuleContext {
		public List<TerminalNode> CHARACTER() { return getTokens(folParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(folParser.CHARACTER, i);
		}
		public Ind_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ind_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterInd_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitInd_constant(this);
		}
	}

	public final Ind_constantContext ind_constant() throws RecognitionException {
		Ind_constantContext _localctx = new Ind_constantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ind_constant);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__2);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					match(CHARACTER);
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Func_constantContext extends ParserRuleContext {
		public List<TerminalNode> CHARACTER() { return getTokens(folParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(folParser.CHARACTER, i);
		}
		public Func_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterFunc_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitFunc_constant(this);
		}
	}

	public final Func_constantContext func_constant() throws RecognitionException {
		Func_constantContext _localctx = new Func_constantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__3);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARACTER) {
				{
				{
				setState(123);
				match(CHARACTER);
				}
				}
				setState(128);
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

	public static class SeparatorContext extends ParserRuleContext {
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).enterSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof folListener ) ((folListener)listener).exitSeparator(this);
		}
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_separator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__4);
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
		case 1:
			return formula_sempred((FormulaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean formula_sempred(FormulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u0086\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3?\n\3\f\3\16\3B\13\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3J\n\3\3\3\3\3\3\3\3\3\7\3P\n\3\f\3\16\3S\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4\3\4\3\4\5\4d\n\4\3"+
		"\5\3\5\3\6\3\6\7\6j\n\6\f\6\16\6m\13\6\3\7\3\7\7\7q\n\7\f\7\16\7t\13\7"+
		"\3\b\3\b\7\bx\n\b\f\b\16\b{\13\b\3\t\3\t\7\t\177\n\t\f\t\16\t\u0082\13"+
		"\t\3\n\3\n\3\n\2\3\4\13\2\4\6\b\n\f\16\20\22\2\3\3\2\17\22\2\u008c\2\24"+
		"\3\2\2\2\4I\3\2\2\2\6c\3\2\2\2\be\3\2\2\2\ng\3\2\2\2\fn\3\2\2\2\16u\3"+
		"\2\2\2\20|\3\2\2\2\22\u0083\3\2\2\2\24\31\5\4\3\2\25\26\7\23\2\2\26\30"+
		"\5\4\3\2\27\25\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\37"+
		"\3\2\2\2\33\31\3\2\2\2\34\36\7\23\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\2\2\3#\3\3\2\2\2$%\b"+
		"\3\1\2%&\7\13\2\2&\'\5\4\3\2\'(\5\b\5\2()\5\4\3\b)J\3\2\2\2*+\7\13\2\2"+
		"+J\5\4\3\7,-\7\f\2\2-.\7\b\2\2./\5\n\6\2/\60\7\t\2\2\60\61\5\4\3\6\61"+
		"J\3\2\2\2\62\63\7\r\2\2\63\64\7\b\2\2\64\65\5\n\6\2\65\66\7\t\2\2\66\67"+
		"\5\4\3\5\67J\3\2\2\289\5\f\7\29:\7\b\2\2:@\5\6\4\2;<\5\22\n\2<=\5\6\4"+
		"\2=?\3\2\2\2>;\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2"+
		"\2CD\7\t\2\2DJ\3\2\2\2EF\5\6\4\2FG\7\n\2\2GH\5\6\4\2HJ\3\2\2\2I$\3\2\2"+
		"\2I*\3\2\2\2I,\3\2\2\2I\62\3\2\2\2I8\3\2\2\2IE\3\2\2\2JQ\3\2\2\2KL\f\t"+
		"\2\2LM\5\b\5\2MN\5\4\3\nNP\3\2\2\2OK\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2"+
		"\2\2R\5\3\2\2\2SQ\3\2\2\2Td\5\16\b\2Ud\5\n\6\2VW\5\20\t\2WX\7\b\2\2X^"+
		"\5\6\4\2YZ\5\22\n\2Z[\5\6\4\2[]\3\2\2\2\\Y\3\2\2\2]`\3\2\2\2^\\\3\2\2"+
		"\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\t\2\2bd\3\2\2\2cT\3\2\2\2cU\3\2\2"+
		"\2cV\3\2\2\2d\7\3\2\2\2ef\t\2\2\2f\t\3\2\2\2gk\7\3\2\2hj\7\16\2\2ih\3"+
		"\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\13\3\2\2\2mk\3\2\2\2nr\7\4\2\2o"+
		"q\7\16\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\r\3\2\2\2tr\3\2\2"+
		"\2uy\7\5\2\2vx\7\16\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\17\3"+
		"\2\2\2{y\3\2\2\2|\u0080\7\6\2\2}\177\7\16\2\2~}\3\2\2\2\177\u0082\3\2"+
		"\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\21\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0083\u0084\7\7\2\2\u0084\23\3\2\2\2\r\31\37@IQ^ckry\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}