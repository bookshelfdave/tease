// Generated from /Users/dparfitt/src/tease/src/main/java/org/metadave/tease/Tease.g4 by ANTLR 4.0
package org.metadave.tease;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TeaseParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		QUERY=1, USING=2, INDEX=3, KEYS=4, BUCKET=5, EXTRACT=6, AGGREGATE=7, FILTER=8, 
		AND=9, WITH=10, DEFINED=11, NOT=12, COMMA=13, LSQUARE=14, RSQUARE=15, 
		DOT=16, AT=17, COLON=18, SEMI=19, GT=20, GTE=21, LT=22, LTE=23, EQEQ=24, 
		NOTEQEQ=25, EQ=26, DOLLAR=27, ID=28, INT=29, STRING=30, LINE_COMMENT=31, 
		COMMENT=32, WS=33;
	public static final String[] tokenNames = {
		"<INVALID>", "'query'", "'using'", "'index'", "'keys'", "'bucket'", "'extract'", 
		"'aggregate'", "'filter'", "'and'", "'with'", "'defined'", "'not'", "','", 
		"'['", "']'", "'.'", "'@'", "':'", "';'", "'>'", "'>='", "'<'", "'<='", 
		"'=='", "'!='", "'='", "'$'", "ID", "INT", "STRING", "LINE_COMMENT", "COMMENT", 
		"WS"
	};
	public static final int
		RULE_query = 0, RULE_query_source = 1, RULE_query_source_keylist = 2, 
		RULE_keylist = 3, RULE_query_source_bucket = 4, RULE_filters = 5, RULE_filter = 6, 
		RULE_predicate = 7, RULE_extract = 8, RULE_bindings = 9, RULE_binding = 10, 
		RULE_bound_id = 11, RULE_aggregate = 12, RULE_results = 13, RULE_result = 14, 
		RULE_obj = 15, RULE_objcoll = 16, RULE_objarrayref = 17;
	public static final String[] ruleNames = {
		"query", "query_source", "query_source_keylist", "keylist", "query_source_bucket", 
		"filters", "filter", "predicate", "extract", "bindings", "binding", "bound_id", 
		"aggregate", "results", "result", "obj", "objcoll", "objarrayref"
	};

	@Override
	public String getGrammarFileName() { return "Tease.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public TeaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public TerminalNode QUERY() { return getToken(TeaseParser.QUERY, 0); }
		public Query_sourceContext query_source() {
			return getRuleContext(Query_sourceContext.class,0);
		}
		public TerminalNode USING() { return getToken(TeaseParser.USING, 0); }
		public TerminalNode SEMI() { return getToken(TeaseParser.SEMI, 0); }
		public ExtractContext extract() {
			return getRuleContext(ExtractContext.class,0);
		}
		public FiltersContext filters() {
			return getRuleContext(FiltersContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(QUERY);
			setState(37); match(USING);
			setState(38); query_source();
			setState(40);
			_la = _input.LA(1);
			if (_la==FILTER) {
				{
				setState(39); filters();
				}
			}

			setState(43);
			_la = _input.LA(1);
			if (_la==EXTRACT) {
				{
				setState(42); extract();
				}
			}

			setState(46);
			_la = _input.LA(1);
			if (_la==AGGREGATE) {
				{
				setState(45); aggregate();
				}
			}

			setState(48); match(SEMI);
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

	public static class Query_sourceContext extends ParserRuleContext {
		public Query_source_keylistContext query_source_keylist() {
			return getRuleContext(Query_source_keylistContext.class,0);
		}
		public Query_source_bucketContext query_source_bucket() {
			return getRuleContext(Query_source_bucketContext.class,0);
		}
		public Query_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterQuery_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitQuery_source(this);
		}
	}

	public final Query_sourceContext query_source() throws RecognitionException {
		Query_sourceContext _localctx = new Query_sourceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			switch (_input.LA(1)) {
			case BUCKET:
				{
				setState(50); query_source_bucket();
				}
				break;
			case KEYS:
				{
				setState(51); query_source_keylist();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Query_source_keylistContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(TeaseParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(TeaseParser.RSQUARE, 0); }
		public TerminalNode KEYS() { return getToken(TeaseParser.KEYS, 0); }
		public KeylistContext keylist() {
			return getRuleContext(KeylistContext.class,0);
		}
		public Query_source_keylistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_source_keylist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterQuery_source_keylist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitQuery_source_keylist(this);
		}
	}

	public final Query_source_keylistContext query_source_keylist() throws RecognitionException {
		Query_source_keylistContext _localctx = new Query_source_keylistContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query_source_keylist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(KEYS);
			setState(55); match(LSQUARE);
			setState(57);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(56); keylist();
				}
			}

			setState(59); match(RSQUARE);
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

	public static class KeylistContext extends ParserRuleContext {
		public TerminalNode COMMA(int i) {
			return getToken(TeaseParser.COMMA, i);
		}
		public TerminalNode STRING(int i) {
			return getToken(TeaseParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TeaseParser.COMMA); }
		public List<TerminalNode> STRING() { return getTokens(TeaseParser.STRING); }
		public KeylistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keylist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterKeylist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitKeylist(this);
		}
	}

	public final KeylistContext keylist() throws RecognitionException {
		KeylistContext _localctx = new KeylistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_keylist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(STRING);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(62); match(COMMA);
				setState(63); match(STRING);
				}
				}
				setState(68);
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

	public static class Query_source_bucketContext extends ParserRuleContext {
		public Token bucketName;
		public Token indexName;
		public TerminalNode INDEX() { return getToken(TeaseParser.INDEX, 0); }
		public TerminalNode BUCKET() { return getToken(TeaseParser.BUCKET, 0); }
		public TerminalNode STRING(int i) {
			return getToken(TeaseParser.STRING, i);
		}
		public TerminalNode WITH() { return getToken(TeaseParser.WITH, 0); }
		public List<TerminalNode> STRING() { return getTokens(TeaseParser.STRING); }
		public Query_source_bucketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_source_bucket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterQuery_source_bucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitQuery_source_bucket(this);
		}
	}

	public final Query_source_bucketContext query_source_bucket() throws RecognitionException {
		Query_source_bucketContext _localctx = new Query_source_bucketContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_query_source_bucket);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(BUCKET);
			setState(70); ((Query_source_bucketContext)_localctx).bucketName = match(STRING);
			setState(74);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(71); match(WITH);
				setState(72); match(INDEX);
				setState(73); ((Query_source_bucketContext)_localctx).indexName = match(STRING);
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

	public static class FiltersContext extends ParserRuleContext {
		public List<TerminalNode> AND() { return getTokens(TeaseParser.AND); }
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public TerminalNode AND(int i) {
			return getToken(TeaseParser.AND, i);
		}
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public TerminalNode FILTER() { return getToken(TeaseParser.FILTER, 0); }
		public FiltersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterFilters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitFilters(this);
		}
	}

	public final FiltersContext filters() throws RecognitionException {
		FiltersContext _localctx = new FiltersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_filters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(FILTER);
			setState(77); filter();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(78); match(AND);
				setState(79); filter();
				}
				}
				setState(84);
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

	public static class FilterContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitFilter(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(85); obj();
			setState(86); predicate();
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

	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(TeaseParser.GT, 0); }
		public TerminalNode NOTEQEQ() { return getToken(TeaseParser.NOTEQEQ, 0); }
		public TerminalNode LT() { return getToken(TeaseParser.LT, 0); }
		public TerminalNode INT() { return getToken(TeaseParser.INT, 0); }
		public TerminalNode NOT() { return getToken(TeaseParser.NOT, 0); }
		public TerminalNode LTE() { return getToken(TeaseParser.LTE, 0); }
		public TerminalNode DEFINED() { return getToken(TeaseParser.DEFINED, 0); }
		public TerminalNode STRING() { return getToken(TeaseParser.STRING, 0); }
		public TerminalNode EQEQ() { return getToken(TeaseParser.EQEQ, 0); }
		public TerminalNode GTE() { return getToken(TeaseParser.GTE, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_predicate);
		int _la;
		try {
			setState(93);
			switch (_input.LA(1)) {
			case GT:
			case GTE:
			case LT:
			case LTE:
			case EQEQ:
			case NOTEQEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE) | (1L << EQEQ) | (1L << NOTEQEQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(89);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case DEFINED:
				enterOuterAlt(_localctx, 2);
				{
				setState(90); match(DEFINED);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(91); match(NOT);
				setState(92); match(DEFINED);
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

	public static class ExtractContext extends ParserRuleContext {
		public BindingsContext bindings() {
			return getRuleContext(BindingsContext.class,0);
		}
		public ExtractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extract; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitExtract(this);
		}
	}

	public final ExtractContext extract() throws RecognitionException {
		ExtractContext _localctx = new ExtractContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_extract);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(EXTRACT);
			setState(96); bindings();
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

	public static class BindingsContext extends ParserRuleContext {
		public List<TerminalNode> AND() { return getTokens(TeaseParser.AND); }
		public List<BindingContext> binding() {
			return getRuleContexts(BindingContext.class);
		}
		public BindingContext binding(int i) {
			return getRuleContext(BindingContext.class,i);
		}
		public TerminalNode AND(int i) {
			return getToken(TeaseParser.AND, i);
		}
		public BindingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterBindings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitBindings(this);
		}
	}

	public final BindingsContext bindings() throws RecognitionException {
		BindingsContext _localctx = new BindingsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bindings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); binding();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(99); match(AND);
				setState(100); binding();
				}
				}
				setState(105);
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

	public static class BindingContext extends ParserRuleContext {
		public Bound_idContext bound_id() {
			return getRuleContext(Bound_idContext.class,0);
		}
		public TerminalNode EQ() { return getToken(TeaseParser.EQ, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitBinding(this);
		}
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); bound_id();
			setState(107); match(EQ);
			setState(108); obj();
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

	public static class Bound_idContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(TeaseParser.DOLLAR, 0); }
		public TerminalNode ID() { return getToken(TeaseParser.ID, 0); }
		public Bound_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bound_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterBound_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitBound_id(this);
		}
	}

	public final Bound_idContext bound_id() throws RecognitionException {
		Bound_idContext _localctx = new Bound_idContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bound_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(DOLLAR);
			setState(111); match(ID);
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

	public static class AggregateContext extends ParserRuleContext {
		public ResultsContext results() {
			return getRuleContext(ResultsContext.class,0);
		}
		public TerminalNode AGGREGATE() { return getToken(TeaseParser.AGGREGATE, 0); }
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterAggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitAggregate(this);
		}
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aggregate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(AGGREGATE);
			setState(114); results();
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

	public static class ResultsContext extends ParserRuleContext {
		public List<ResultContext> result() {
			return getRuleContexts(ResultContext.class);
		}
		public List<TerminalNode> AND() { return getTokens(TeaseParser.AND); }
		public ResultContext result(int i) {
			return getRuleContext(ResultContext.class,i);
		}
		public TerminalNode AND(int i) {
			return getToken(TeaseParser.AND, i);
		}
		public ResultsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_results; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterResults(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitResults(this);
		}
	}

	public final ResultsContext results() throws RecognitionException {
		ResultsContext _localctx = new ResultsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_results);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); result();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(117); match(AND);
				setState(118); result();
				}
				}
				setState(123);
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

	public static class ResultContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(TeaseParser.EQ, 0); }
		public TerminalNode ID() { return getToken(TeaseParser.ID, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(ID);
			setState(125); match(EQ);
			setState(126); obj();
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

	public static class ObjContext extends ParserRuleContext {
		public TerminalNode DOT(int i) {
			return getToken(TeaseParser.DOT, i);
		}
		public TerminalNode ID(int i) {
			return getToken(TeaseParser.ID, i);
		}
		public ObjcollContext objcoll(int i) {
			return getRuleContext(ObjcollContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(TeaseParser.DOT); }
		public List<TerminalNode> ID() { return getTokens(TeaseParser.ID); }
		public List<ObjcollContext> objcoll() {
			return getRuleContexts(ObjcollContext.class);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitObj(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(ID);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(129); match(DOT);
				setState(132);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(130); match(ID);
					}
					break;
				case AT:
					{
					setState(131); objcoll();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(138);
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

	public static class ObjcollContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(TeaseParser.AT, 0); }
		public ObjarrayrefContext objarrayref() {
			return getRuleContext(ObjarrayrefContext.class,0);
		}
		public TerminalNode ID() { return getToken(TeaseParser.ID, 0); }
		public ObjcollContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objcoll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterObjcoll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitObjcoll(this);
		}
	}

	public final ObjcollContext objcoll() throws RecognitionException {
		ObjcollContext _localctx = new ObjcollContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_objcoll);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(AT);
			setState(140); match(ID);
			setState(142);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(141); objarrayref();
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

	public static class ObjarrayrefContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(TeaseParser.COLON, 0); }
		public List<TerminalNode> INT() { return getTokens(TeaseParser.INT); }
		public TerminalNode LSQUARE() { return getToken(TeaseParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(TeaseParser.RSQUARE, 0); }
		public TerminalNode INT(int i) {
			return getToken(TeaseParser.INT, i);
		}
		public ObjarrayrefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objarrayref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterObjarrayref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitObjarrayref(this);
		}
	}

	public final ObjarrayrefContext objarrayref() throws RecognitionException {
		ObjarrayrefContext _localctx = new ObjarrayrefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_objarrayref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(LSQUARE);
			setState(145); match(INT);
			setState(148);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(146); match(COLON);
				setState(147); match(INT);
				}
			}

			setState(150); match(RSQUARE);
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
		"\2\3#\u009b\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\3\2\3\2\3\2\3\2\5\2+\n\2\3\2\5\2.\n\2\3"+
		"\2\5\2\61\n\2\3\2\3\2\3\3\3\3\5\3\67\n\3\3\4\3\4\3\4\5\4<\n\4\3\4\3\4"+
		"\3\5\3\5\3\5\7\5C\n\5\f\5\16\5F\13\5\3\6\3\6\3\6\3\6\3\6\5\6M\n\6\3\7"+
		"\3\7\3\7\3\7\7\7S\n\7\f\7\16\7V\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5"+
		"\t`\n\t\3\n\3\n\3\n\3\13\3\13\3\13\7\13h\n\13\f\13\16\13k\13\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\7\17z\n\17\f\17\16"+
		"\17}\13\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u0087\n\21\7\21"+
		"\u0089\n\21\f\21\16\21\u008c\13\21\3\22\3\22\3\22\5\22\u0091\n\22\3\23"+
		"\3\23\3\23\3\23\5\23\u0097\n\23\3\23\3\23\3\23\2\24\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$\2\4\3\26\33\3\37 \u0098\2&\3\2\2\2\4\66\3\2"+
		"\2\2\68\3\2\2\2\b?\3\2\2\2\nG\3\2\2\2\fN\3\2\2\2\16W\3\2\2\2\20_\3\2\2"+
		"\2\22a\3\2\2\2\24d\3\2\2\2\26l\3\2\2\2\30p\3\2\2\2\32s\3\2\2\2\34v\3\2"+
		"\2\2\36~\3\2\2\2 \u0082\3\2\2\2\"\u008d\3\2\2\2$\u0092\3\2\2\2&\'\7\3"+
		"\2\2\'(\7\4\2\2(*\5\4\3\2)+\5\f\7\2*)\3\2\2\2*+\3\2\2\2+-\3\2\2\2,.\5"+
		"\22\n\2-,\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/\61\5\32\16\2\60/\3\2\2\2\60\61"+
		"\3\2\2\2\61\62\3\2\2\2\62\63\7\25\2\2\63\3\3\2\2\2\64\67\5\n\6\2\65\67"+
		"\5\6\4\2\66\64\3\2\2\2\66\65\3\2\2\2\67\5\3\2\2\289\7\6\2\29;\7\20\2\2"+
		":<\5\b\5\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\21\2\2>\7\3\2\2\2?D\7 \2"+
		"\2@A\7\17\2\2AC\7 \2\2B@\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\t\3\2"+
		"\2\2FD\3\2\2\2GH\7\7\2\2HL\7 \2\2IJ\7\f\2\2JK\7\5\2\2KM\7 \2\2LI\3\2\2"+
		"\2LM\3\2\2\2M\13\3\2\2\2NO\7\n\2\2OT\5\16\b\2PQ\7\13\2\2QS\5\16\b\2RP"+
		"\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\r\3\2\2\2VT\3\2\2\2WX\5 \21\2"+
		"XY\5\20\t\2Y\17\3\2\2\2Z[\t\2\2\2[`\t\3\2\2\\`\7\r\2\2]^\7\16\2\2^`\7"+
		"\r\2\2_Z\3\2\2\2_\\\3\2\2\2_]\3\2\2\2`\21\3\2\2\2ab\7\b\2\2bc\5\24\13"+
		"\2c\23\3\2\2\2di\5\26\f\2ef\7\13\2\2fh\5\26\f\2ge\3\2\2\2hk\3\2\2\2ig"+
		"\3\2\2\2ij\3\2\2\2j\25\3\2\2\2ki\3\2\2\2lm\5\30\r\2mn\7\34\2\2no\5 \21"+
		"\2o\27\3\2\2\2pq\7\35\2\2qr\7\36\2\2r\31\3\2\2\2st\7\t\2\2tu\5\34\17\2"+
		"u\33\3\2\2\2v{\5\36\20\2wx\7\13\2\2xz\5\36\20\2yw\3\2\2\2z}\3\2\2\2{y"+
		"\3\2\2\2{|\3\2\2\2|\35\3\2\2\2}{\3\2\2\2~\177\7\36\2\2\177\u0080\7\34"+
		"\2\2\u0080\u0081\5 \21\2\u0081\37\3\2\2\2\u0082\u008a\7\36\2\2\u0083\u0086"+
		"\7\22\2\2\u0084\u0087\7\36\2\2\u0085\u0087\5\"\22\2\u0086\u0084\3\2\2"+
		"\2\u0086\u0085\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0083\3\2\2\2\u0089\u008c"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b!\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\7\23\2\2\u008e\u0090\7\36\2\2\u008f\u0091\5"+
		"$\23\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091#\3\2\2\2\u0092\u0093"+
		"\7\20\2\2\u0093\u0096\7\37\2\2\u0094\u0095\7\24\2\2\u0095\u0097\7\37\2"+
		"\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099"+
		"\7\21\2\2\u0099%\3\2\2\2\21*-\60\66;DLT_i{\u0086\u008a\u0090\u0096";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}