tease
=====

[Grammar](https://raw.github.com/metadave/tease/master/src/main/java/org/metadave/tease/Tease.g4)

[Parser tests](https://github.com/metadave/tease/blob/master/src/main/java/org/metadave/tease/Tease.java)

# Sample M/R queries

```
query using bucket "Foo";


query using bucket "Foo" 
	filter foo > 1;


query using bucket "Foo" 
	filter foo > 1 and foo.@bar < 100;


query using bucket "Foo" 
    filter foo > 1 and foo.@bar < 100 
    extract $tempsum = foo.@bar;


query using bucket "Foo" 
    filter foo > 1 
    		and bar defined 
    		and foo.@bar < 100 
    extract $tempsum = foo.@bar;


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