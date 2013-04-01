Tease
=====
**T**ranslated **E**rlang **A**s **A** **S**econd **E**ncoding

[Grammar](https://raw.github.com/metadave/tease/master/src/main/java/org/metadave/tease/Tease.g4)

[Parser tests](https://github.com/metadave/tease/blob/master/src/main/java/org/metadave/tease/Tease.java)

# Sample M/R queries

Note: these sample queries are already out of date :-(

```
query using bucket "Foo";

// foo being a simple json element
query using bucket "Foo" filter foo > 1;


query using keys ["Foo", "Bar", "Baz"] filter foo > 1;

// kvc encoding
query using bucket "Foo" filter foo > 1 and foo.@bar < 100;


query using bucket "Foo" 
    with index "test_bin" from "A" to "Z" 
    filter foo > 1 and foo.@bar < 100;

// extracted values use a $ prefix
query using bucket "Foo" 
      filter foo > 1 and foo.@bar < 100 
      extract $tempsum = foo.@bar;


query using bucket "Foo" 
      filter foo > 1 
             and bar defined 
             and foo.@bar < 100 
      extract $tempsum = foo.@bar;


// results in the aggregate phase don't need $'s
query using bucket "Foo" 
      filter foo > 1 
             and bar defined 
             and foo.@bar < 100 
      extract $tempsum = foo.@bar;
      aggregate sum = $tempsum 
             and x = foo.@bar;

```

##TODO:

```
query using bucket "Foo" 
      filter foo > 1 
             and bar defined 
             and foo.@bar < 100 
      extract $tempsum = foo.@bar + 100; // simple arithmetic expressions
			  and $ foo = foo.baz / 100 + foo.@bar
      aggregate sum = $tempsum 
             and x = foo.@bar;
```


Nested queries
