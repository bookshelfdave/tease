grammar Tease;

query: QUERY USING query_source filters? extract? aggregate? SEMI;

/* query source */

query_source: (query_source_bucket);

query_source_bucket: BUCKET bucketName=STRING (query_index | query_keylist)? ;

query_index: WITH INDEX indexName=STRING ((FROM STRING TO STRING) | (VALUE STRING));

query_keylist: KEYS LSQUARE keylist? RSQUARE;

keylist: keys+=STRING (COMMA keys+=STRING)*;

/* filtering */

filters: FILTER filter (AND filter)*;

filter: (obj predicate);

predicate: (GT | GTE | LT | LTE | EQEQ | NOTEQEQ) (INT | STRING)
           | DEFINED 
           | NOT DEFINED;


/* extracting */
/* TODO: support simple math */
extract: 'extract' bindings;

bindings: binding (AND binding)*;

binding: bound_id EQ obj;

bound_id: DOLLAR ID;

/* aggregating */
aggregate: AGGREGATE results;

results: result (AND result)*;           
           
result: ID EQ obj; 
           
//  values.@i[0].data.@i[0].group
obj:    ID (DOT (ID | objcoll))*;
objcoll: AT ID objarrayref?;
objarrayref: LSQUARE INT (COLON INT)? RSQUARE; // supports slices
                    
QUERY:         'query';
USING:         'using';
INDEX:         'index';
KEYS:          'keys';
BUCKET:        'bucket';
EXTRACT:       'extract';
AGGREGATE:     'aggregate';
FILTER:        'filter';
AND:           'and';
WITH:          'with';
DEFINED:       'defined';
NOT:           'not';
FROM:          'from';
TO:            'to';
VALUE:         'value';
COMMA:         ',';
LSQUARE:       '[';
RSQUARE:       ']';
DOT:           '.';
AT:            '@';
COLON:         ':';
SEMI:          ';';

GT:            '>';
GTE:           '>=';
LT:            '<';
LTE:           '<=';

EQEQ:          '==';
NOTEQEQ:       '!=';

EQ:            '=';
DOLLAR:        '$';
ID          :       [a-z][A-Za-z_]*;

INT             :   DIGIT+;
fragment DIGIT  : '0' .. '9';

FLOAT       :       [0-9]+ DOT [0-9]*
                    | DOT [0-9]+
                       ;

STRING  :  '"' (ESC|.)*? '"';
fragment ESC : '\\"' | '\\\\' ;

LINE_COMMENT  : '//' .*? '\r'? '\n' -> skip ;
COMMENT       : '/*' .*? '*/'       -> skip ;

WS      :       [ \t\r\n]+ -> skip;

