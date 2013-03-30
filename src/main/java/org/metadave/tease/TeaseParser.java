// Generated from ./src/main/java/org/metadave/tease/Tease.g4 by ANTLR 4.0
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
		AND=9, WITH=10, DEFINED=11, NOT=12, FROM=13, TO=14, VALUE=15, COMMA=16, 
		LSQUARE=17, RSQUARE=18, DOT=19, AT=20, COLON=21, SEMI=22, GT=23, GTE=24, 
		LT=25, LTE=26, EQEQ=27, NOTEQEQ=28, EQ=29, DOLLAR=30, ID=31, INT=32, STRING=33, 
		LINE_COMMENT=34, COMMENT=35, WS=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'query'", "'using'", "'index'", "'keys'", "'bucket'", "'extract'", 
		"'aggregate'", "'filter'", "'and'", "'with'", "'defined'", "'not'", "'from'", 
		"'to'", "'value'", "','", "'['", "']'", "'.'", "'@'", "':'", "';'", "'>'", 
		"'>='", "'<'", "'<='", "'=='", "'!='", "'='", "'$'", "ID", "INT", "STRING", 
		"LINE_COMMENT", "COMMENT", "WS"
	};
	public static final int
		RULE_query = 0, RULE_query_source = 1, RULE_query_source_keylist = 2, 
		RULE_keylist = 3, RULE_query_source_bucket = 4, RULE_query_index = 5, 
		RULE_filters = 6, RULE_filter = 7, RULE_predicate = 8, RULE_extract = 9, 
		RULE_bindings = 10, RULE_binding = 11, RULE_bound_id = 12, RULE_aggregate = 13, 
		RULE_results = 14, RULE_result = 15, RULE_obj = 16, RULE_objcoll = 17, 
		RULE_objarrayref = 18;
	public static final String[] ruleNames = {
		"query", "query_source", "query_source_keylist", "keylist", "query_source_bucket", 
		"query_index", "filters", "filter", "predicate", "extract", "bindings", 
		"binding", "bound_id", "aggregate", "results", "result", "obj", "objcoll", 
		"objarrayref"
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
			setState(38); match(QUERY);
			setState(39); match(USING);
			setState(40); query_source();
			setState(42);
			_la = _input.LA(1);
			if (_la==FILTER) {
				{
				setState(41); filters();
				}
			}

			setState(45);
			_la = _input.LA(1);
			if (_la==EXTRACT) {
				{
				setState(44); extract();
				}
			}

			setState(48);
			_la = _input.LA(1);
			if (_la==AGGREGATE) {
				{
				setState(47); aggregate();
				}
			}

			setState(50); match(SEMI);
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
			setState(54);
			switch (_input.LA(1)) {
			case BUCKET:
				{
				setState(52); query_source_bucket();
				}
				break;
			case KEYS:
				{
				setState(53); query_source_keylist();
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
			setState(56); match(KEYS);
			setState(57); match(LSQUARE);
			setState(59);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(58); keylist();
				}
			}

			setState(61); match(RSQUARE);
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
		public Token STRING;
		public List<Token> keys = new ArrayList<Token>();
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
			setState(63); ((KeylistContext)_localctx).STRING = match(STRING);
			((KeylistContext)_localctx).keys.add(((KeylistContext)_localctx).STRING);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(64); match(COMMA);
				setState(65); ((KeylistContext)_localctx).STRING = match(STRING);
				((KeylistContext)_localctx).keys.add(((KeylistContext)_localctx).STRING);
				}
				}
				setState(70);
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
		public TerminalNode BUCKET() { return getToken(TeaseParser.BUCKET, 0); }
		public TerminalNode STRING() { return getToken(TeaseParser.STRING, 0); }
		public Query_indexContext query_index() {
			return getRuleContext(Query_indexContext.class,0);
		}
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
			setState(71); match(BUCKET);
			setState(72); ((Query_source_bucketContext)_localctx).bucketName = match(STRING);
			setState(74);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(73); query_index();
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

	public static class Query_indexContext extends ParserRuleContext {
		public Token indexName;
		public TerminalNode INDEX() { return getToken(TeaseParser.INDEX, 0); }
		public TerminalNode STRING(int i) {
			return getToken(TeaseParser.STRING, i);
		}
		public TerminalNode VALUE() { return getToken(TeaseParser.VALUE, 0); }
		public TerminalNode TO() { return getToken(TeaseParser.TO, 0); }
		public TerminalNode FROM() { return getToken(TeaseParser.FROM, 0); }
		public List<TerminalNode> STRING() { return getTokens(TeaseParser.STRING); }
		public TerminalNode WITH() { return getToken(TeaseParser.WITH, 0); }
		public Query_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).enterQuery_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeaseListener ) ((TeaseListener)listener).exitQuery_index(this);
		}
	}

	public final Query_indexContext query_index() throws RecognitionException {
		Query_indexContext _localctx = new Query_indexContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_query_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(WITH);
			setState(77); match(INDEX);
			setState(78); ((Query_indexContext)_localctx).indexName = match(STRING);
			setState(85);
			switch (_input.LA(1)) {
			case FROM:
				{
				{
				setState(79); match(FROM);
				setState(80); match(STRING);
				setState(81); match(TO);
				setState(82); match(STRING);
				}
				}
				break;
			case VALUE:
				{
				{
				setState(83); match(VALUE);
				setState(84); match(STRING);
				}
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
		enterRule(_localctx, 12, RULE_filters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(FILTER);
			setState(88); filter();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(89); match(AND);
				setState(90); filter();
				}
				}
				setState(95);
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
		enterRule(_localctx, 14, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(96); obj();
			setState(97); predicate();
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
		enterRule(_localctx, 16, RULE_predicate);
		int _la;
		try {
			setState(104);
			switch (_input.LA(1)) {
			case GT:
			case GTE:
			case LT:
			case LTE:
			case EQEQ:
			case NOTEQEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE) | (1L << EQEQ) | (1L << NOTEQEQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(100);
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
				setState(101); match(DEFINED);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(102); match(NOT);
				setState(103); match(DEFINED);
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
		enterRule(_localctx, 18, RULE_extract);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(EXTRACT);
			setState(107); bindings();
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
		enterRule(_localctx, 20, RULE_bindings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); binding();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(110); match(AND);
				setState(111); binding();
				}
				}
				setState(116);
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
		enterRule(_localctx, 22, RULE_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); bound_id();
			setState(118); match(EQ);
			setState(119); obj();
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
		enterRule(_localctx, 24, RULE_bound_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(DOLLAR);
			setState(122); match(ID);
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
		enterRule(_localctx, 26, RULE_aggregate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(AGGREGATE);
			setState(125); results();
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
		enterRule(_localctx, 28, RULE_results);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); result();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(128); match(AND);
				setState(129); result();
				}
				}
				setState(134);
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
		enterRule(_localctx, 30, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(ID);
			setState(136); match(EQ);
			setState(137); obj();
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
		enterRule(_localctx, 32, RULE_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(ID);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(140); match(DOT);
				setState(143);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(141); match(ID);
					}
					break;
				case AT:
					{
					setState(142); objcoll();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(149);
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
		enterRule(_localctx, 34, RULE_objcoll);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(AT);
			setState(151); match(ID);
			setState(153);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(152); objarrayref();
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
		enterRule(_localctx, 36, RULE_objarrayref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(LSQUARE);
			setState(156); match(INT);
			setState(159);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(157); match(COLON);
				setState(158); match(INT);
				}
			}

			setState(161); match(RSQUARE);
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
		"\2\3&\u00a6\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\5\2-\n\2\3\2"+
		"\5\2\60\n\2\3\2\5\2\63\n\2\3\2\3\2\3\3\3\3\5\39\n\3\3\4\3\4\3\4\5\4>\n"+
		"\4\3\4\3\4\3\5\3\5\3\5\7\5E\n\5\f\5\16\5H\13\5\3\6\3\6\3\6\5\6M\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7X\n\7\3\b\3\b\3\b\3\b\7\b^\n\b\f"+
		"\b\16\ba\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nk\n\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\7\fs\n\f\f\f\16\fv\13\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\7\20\u0085\n\20\f\20\16\20\u0088\13\20\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u0092\n\22\7\22\u0094\n\22"+
		"\f\22\16\22\u0097\13\22\3\23\3\23\3\23\5\23\u009c\n\23\3\24\3\24\3\24"+
		"\3\24\5\24\u00a2\n\24\3\24\3\24\3\24\2\25\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&\2\4\3\31\36\3\"#\u00a3\2(\3\2\2\2\48\3\2\2\2\6:\3\2\2\2"+
		"\bA\3\2\2\2\nI\3\2\2\2\fN\3\2\2\2\16Y\3\2\2\2\20b\3\2\2\2\22j\3\2\2\2"+
		"\24l\3\2\2\2\26o\3\2\2\2\30w\3\2\2\2\32{\3\2\2\2\34~\3\2\2\2\36\u0081"+
		"\3\2\2\2 \u0089\3\2\2\2\"\u008d\3\2\2\2$\u0098\3\2\2\2&\u009d\3\2\2\2"+
		"()\7\3\2\2)*\7\4\2\2*,\5\4\3\2+-\5\16\b\2,+\3\2\2\2,-\3\2\2\2-/\3\2\2"+
		"\2.\60\5\24\13\2/.\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61\63\5\34\17\2\62"+
		"\61\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7\30\2\2\65\3\3\2\2\2\66"+
		"9\5\n\6\2\679\5\6\4\28\66\3\2\2\28\67\3\2\2\29\5\3\2\2\2:;\7\6\2\2;=\7"+
		"\23\2\2<>\5\b\5\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\24\2\2@\7\3\2\2\2"+
		"AF\7#\2\2BC\7\22\2\2CE\7#\2\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2"+
		"G\t\3\2\2\2HF\3\2\2\2IJ\7\7\2\2JL\7#\2\2KM\5\f\7\2LK\3\2\2\2LM\3\2\2\2"+
		"M\13\3\2\2\2NO\7\f\2\2OP\7\5\2\2PW\7#\2\2QR\7\17\2\2RS\7#\2\2ST\7\20\2"+
		"\2TX\7#\2\2UV\7\21\2\2VX\7#\2\2WQ\3\2\2\2WU\3\2\2\2X\r\3\2\2\2YZ\7\n\2"+
		"\2Z_\5\20\t\2[\\\7\13\2\2\\^\5\20\t\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`"+
		"\3\2\2\2`\17\3\2\2\2a_\3\2\2\2bc\5\"\22\2cd\5\22\n\2d\21\3\2\2\2ef\t\2"+
		"\2\2fk\t\3\2\2gk\7\r\2\2hi\7\16\2\2ik\7\r\2\2je\3\2\2\2jg\3\2\2\2jh\3"+
		"\2\2\2k\23\3\2\2\2lm\7\b\2\2mn\5\26\f\2n\25\3\2\2\2ot\5\30\r\2pq\7\13"+
		"\2\2qs\5\30\r\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\27\3\2\2\2vt"+
		"\3\2\2\2wx\5\32\16\2xy\7\37\2\2yz\5\"\22\2z\31\3\2\2\2{|\7 \2\2|}\7!\2"+
		"\2}\33\3\2\2\2~\177\7\t\2\2\177\u0080\5\36\20\2\u0080\35\3\2\2\2\u0081"+
		"\u0086\5 \21\2\u0082\u0083\7\13\2\2\u0083\u0085\5 \21\2\u0084\u0082\3"+
		"\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\37\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7!\2\2\u008a\u008b\7\37\2"+
		"\2\u008b\u008c\5\"\22\2\u008c!\3\2\2\2\u008d\u0095\7!\2\2\u008e\u0091"+
		"\7\25\2\2\u008f\u0092\7!\2\2\u0090\u0092\5$\23\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u008e\3\2\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096#\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u0099\7\26\2\2\u0099\u009b\7!\2\2\u009a\u009c\5&\24\2\u009b"+
		"\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c%\3\2\2\2\u009d\u009e\7\23\2\2"+
		"\u009e\u00a1\7\"\2\2\u009f\u00a0\7\27\2\2\u00a0\u00a2\7\"\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\24\2\2"+
		"\u00a4\'\3\2\2\2\22,/\628=FLW_jt\u0086\u0091\u0095\u009b\u00a1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}