package org.metadave.tease;


import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTree;
import org.metadave.tease.queryir.QuerySource;
import org.metadave.tease.queryir.QuerySourceKeylist;
import org.omg.CORBA.CTX_RESTRICT_SCOPE;

import java.util.ArrayList;
import java.util.List;

public class QuerySourceListener extends TeaseBaseListener {
    ParseTreeProperty<Object> values = new ParseTreeProperty<Object>();
    @Override
    public void exitQuery(TeaseParser.QueryContext ctx) {
        System.out.println("Exiting query");
        //query_source filters? extract? aggregate?
        //ctx.query_source()
    }

    @Override
    public void exitQuery_source(TeaseParser.Query_sourceContext ctx) {
        QuerySource qs;
        if(ctx.query_source_keylist() != null) {
            qs = (QuerySource)getValue(ctx.query_source_keylist());
            System.out.println(qs);
        } else if (ctx.query_source_bucket() != null) {
            System.out.println("Not implemented");
        }
    }

    @Override
    public void exitQuery_source_keylist(TeaseParser.Query_source_keylistContext ctx) {
        QuerySourceKeylist kl = new QuerySourceKeylist();

        List<String> keys = (List<String>)getValue(ctx.keylist());
        kl.setKeyList(keys);
        setValue(ctx, kl);
        super.exitQuery_source_keylist(ctx);
    }

    @Override
    public void exitQuery_source_bucket(TeaseParser.Query_source_bucketContext ctx) {
        super.exitQuery_source_bucket(ctx);
    }

    @Override
    public void exitQuery_index(TeaseParser.Query_indexContext ctx) {
        super.exitQuery_index(ctx);
    }

    @Override
    public void exitKeylist(TeaseParser.KeylistContext ctx) {
        List<Token> keys = ctx.keys;
        List<String> keylist = new ArrayList<String>();

        for(Token k:keys) {
            keylist.add(stripQuotes(k.getText()));
        }
        setValue(ctx, keylist);
        super.exitKeylist(ctx);
    }

    /////////////////////////

    public void setValue(ParseTree node, Object value) {
        values.put(node, value);
    }

    public Object getValue(ParseTree node) {
        return values.get(node);
    }

    public String stripQuotes(String rawVal) {
        // should probably check if it's an empty string and all that..
        if (rawVal.length() == 2) {
            return "";
        } else if (rawVal.length() == 3) {
            return rawVal.substring(1, 2);
        } else {
            return rawVal.substring(1, rawVal.length() - 1);
        }
    }

}
