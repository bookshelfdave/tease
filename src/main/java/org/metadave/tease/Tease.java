package org.metadave.tease;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Tease {

    public static boolean testQuery(String query) {
        System.out.println("\nTesting:\n" + query);
        ANTLRInputStream input = new ANTLRInputStream(query);
        TeaseLexer lexer = new TeaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TeaseParser parser = new TeaseParser(tokens);
        parser.query();
        return false;
    }

    public static boolean testObj(String query) {
        //System.out.println("Testing " + query);
        ANTLRInputStream input = new ANTLRInputStream(query);
        TeaseLexer lexer = new TeaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TeaseParser parser = new TeaseParser(tokens);
        parser.obj();
        return false;
    }

    public static void main(String[] args) throws Exception {
        String[] ids = {
          "foo",
          "foo.bar",
          "foo.bar.baz",
          "foo.bar.@baz",
          "foo.bar.@baz.@foo[1:10]"
        };
        for(String o : ids) {
            testObj(o);
        }


        String[] queries = {
                "query using bucket \"Foo\";",

                "query using bucket \"Foo\" filter foo > 1;",

                "query using keys [\"Foo\", \"Bar\", \"Baz\"] filter foo > 1;",

                "query using bucket \"Foo\" filter foo > 1 and foo.@bar < 100;",

                "query using bucket \"Foo\" \n" +
                "    with index \"test_bin\" from \"A\" to \"Z\" \n" +
                "    filter foo > 1 and foo.@bar < 100;",

                "query using bucket \"Foo\" \n" +
                "      filter foo > 1 and foo.@bar < 100 \n" +
                "      extract $tempsum = foo.@bar;",

                "query using bucket \"Foo\" \n" +
                "      filter foo > 1 \n" +
                "             and bar defined \n" +
                "             and foo.@bar < 100 \n" +
                "      extract $tempsum = foo.@bar;\n",


                "query using bucket \"Foo\" \n" +
                        "      filter foo > 1 \n" +
                        "             and bar defined \n" +
                        "             and foo.@bar < 100 \n" +
                        "      extract $tempsum = foo.@bar;\n" +
                        "      aggregate sum = $tempsum \n" +
                        "             and x = foo.@bar;"
        };
        for(String query : queries) {
            testQuery(query);
        }


        //parser.addErrorListener(new ContactErrorListener(runtimeCtx));
        //ParseTreeWalker walker = new ParseTreeWalker();
//        try {
//            walker.walk(cw, parser.prog());
//        } catch (Throwable t) {
//            t.printStackTrace();
//            // catch parse errors. ANTLR will display a message for me.
//        }
    }
}
