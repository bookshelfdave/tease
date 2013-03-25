// Generated from /Users/dparfitt/src/tease/src/main/java/org/metadave/tease/Tease.g4 by ANTLR 4.0
package org.metadave.tease;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface TeaseListener extends ParseTreeListener {
	void enterBound_id(TeaseParser.Bound_idContext ctx);
	void exitBound_id(TeaseParser.Bound_idContext ctx);

	void enterResult(TeaseParser.ResultContext ctx);
	void exitResult(TeaseParser.ResultContext ctx);

	void enterAggregate(TeaseParser.AggregateContext ctx);
	void exitAggregate(TeaseParser.AggregateContext ctx);

	void enterObjarrayref(TeaseParser.ObjarrayrefContext ctx);
	void exitObjarrayref(TeaseParser.ObjarrayrefContext ctx);

	void enterQuery_source_keylist(TeaseParser.Query_source_keylistContext ctx);
	void exitQuery_source_keylist(TeaseParser.Query_source_keylistContext ctx);

	void enterQuery(TeaseParser.QueryContext ctx);
	void exitQuery(TeaseParser.QueryContext ctx);

	void enterBindings(TeaseParser.BindingsContext ctx);
	void exitBindings(TeaseParser.BindingsContext ctx);

	void enterPredicate(TeaseParser.PredicateContext ctx);
	void exitPredicate(TeaseParser.PredicateContext ctx);

	void enterQuery_source_bucket(TeaseParser.Query_source_bucketContext ctx);
	void exitQuery_source_bucket(TeaseParser.Query_source_bucketContext ctx);

	void enterObjcoll(TeaseParser.ObjcollContext ctx);
	void exitObjcoll(TeaseParser.ObjcollContext ctx);

	void enterExtract(TeaseParser.ExtractContext ctx);
	void exitExtract(TeaseParser.ExtractContext ctx);

	void enterResults(TeaseParser.ResultsContext ctx);
	void exitResults(TeaseParser.ResultsContext ctx);

	void enterQuery_source(TeaseParser.Query_sourceContext ctx);
	void exitQuery_source(TeaseParser.Query_sourceContext ctx);

	void enterBinding(TeaseParser.BindingContext ctx);
	void exitBinding(TeaseParser.BindingContext ctx);

	void enterObj(TeaseParser.ObjContext ctx);
	void exitObj(TeaseParser.ObjContext ctx);

	void enterKeylist(TeaseParser.KeylistContext ctx);
	void exitKeylist(TeaseParser.KeylistContext ctx);

	void enterFilters(TeaseParser.FiltersContext ctx);
	void exitFilters(TeaseParser.FiltersContext ctx);

	void enterFilter(TeaseParser.FilterContext ctx);
	void exitFilter(TeaseParser.FilterContext ctx);

	void enterQuery_index(TeaseParser.Query_indexContext ctx);
	void exitQuery_index(TeaseParser.Query_indexContext ctx);
}