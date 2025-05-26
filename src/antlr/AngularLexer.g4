
lexer grammar AngularLexer;


IMPORT       : 'import';
FROM         : 'from';
COMPONENT    : '@Component';
INJECTABLE   : '@Injectable';
EXPORT       : 'export';
CLASS        : 'class';
SELECTOR     : 'selector';
STANDALONE   : 'standalone';
IMPORTS      : 'imports';
STYLEURL     : 'styleUrls';
TEMPLATEURL  : 'templateUrl';
TEMPLATE     : 'template';
PROVIDEDIN   : 'providedIn';
INTERFACE    : 'interface';
PIXIL        : 'px';
STYLE        : 'style';
CLICK        : 'click';
AUTO         : 'auto';
SRC          : 'src';
ALT          : 'alt';
IF           : 'if';
IMG          : 'img';
TYPE         : 'type';
INPUT        : 'input';
PLACEHOLDER  :'placeholder';
PADDING      :'padding';

LBRACE       : '{';
RBRACE       : '}';
LBRACK       : '[';
RBRACK       : ']';
LPAREN       : '(';
RPAREN       : ')';
COLON        : ':';
SEMI         : ';';
COMMA        : ',';
DOT          : '.';
ASSIGN       : '=';
QUOTE        : '\'';
DQUOTE       : '"';
PERCENT      : '%';
BACKTICK     : '`';
EXCLAMATION  : '!';
QUESTION     : '?';
WS           : [ \t\r\n]+ -> skip;
BOOLEAN      : 'true' | 'false';
RETURN       : 'return';


STRING
    : '\'' ( ~['\\] | '\\' . )* '\''
    ;


IDENTIFIER   : [a-zA-Z_] [a-zA-Z0-9_]* ('-'? [a-zA-Z0-9_]+)?;

NUMBER       : [0-9]+;

TAG_OPEN     : '<';
TAG_CLOSE    : '>';
SLASH        : '/';

HEXADECIMALCOLOR : '#' ;
ATTR_NAME    : IDENTIFIER;
ATTR_VALUE   : STRING;

OPERATION    : '+' | '-' | '*' | '×' ;

