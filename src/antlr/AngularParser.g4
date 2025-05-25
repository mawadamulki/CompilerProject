parser grammar AngularParser;

options { tokenVocab=AngularLexer; }



app: importStatement* appContent*;

appContent
    : interfaceDecl  # appInterface
    | componentDecl  # appComponent
    | serviceDecl    # appService
    | classDecl      # appClass
    ;


// --------------------- INTERFACE ---------------------

interfaceDecl:
    INTERFACE IDENTIFIER LBRACE (parameter SEMI)* RBRACE;


// --------------------- IMPORT ---------------------

importStatement:
    IMPORT LBRACE importItems RBRACE FROM STRING SEMI;

importItems: IDENTIFIER (COMMA IDENTIFIER)*;




// --------------------- SERVICE ---------------------

serviceDecl:
    INJECTABLE LPAREN PROVIDEDIN COLON STRING RPAREN;


// --------------------- COMPONENT ---------------------

componentDecl:
    COMPONENT LPAREN LBRACE componentdata (COMMA componentdata)* RBRACE RPAREN;

componentdata:
      selector      # componentSelector
    | standalone    # componentStandalone
    | imports       # componentImports
    | styleUrls     # componentStyleUrl
    | templateUrl   # componentTamplateUrl
    | templateDecl  # componentTamplate
    ;

selector:
    SELECTOR COLON STRING;

standalone:
    STANDALONE COLON BOOLEAN;

imports:
    IMPORTS COLON LBRACK IDENTIFIER (COMMA IDENTIFIER)* RBRACK;

styleUrls:
    STYLE COLON LBRACK STRING (COMMA STRING)* RBRACK;

templateUrl:
    TEMPLATEURL COLON STRING;

templateDecl:
    TEMPLATE COLON BACKTICK html* BACKTICK;


// --------------------- HTML TEMPLATE ---------------------

html
    :imageTag      # htmlImage
    |inputTag      # htmlInput
    |completeTag   # htmlComplete
    |commentTag    # htmlComment
    ;

imageTag:
    TAG_OPEN IMG attributeHTML* TAG_CLOSE;

inputTag:
    TAG_OPEN INPUT attributeHTML* TAG_CLOSE;

completeTag:
    openTag tagBody+ closeTag;

openTag:
    TAG_OPEN IDENTIFIER attributeHTML* TAG_CLOSE;

attributeHTML
    :styling        # htmlAttStyling
    |click          # htmlAttClick
    |src            # htmlAttSrc
    |srcFunc        # htmlAttSrcFunc
    |alt            # htmlAttAlt
    |altFunc        # htmlAttAltFunc
    |starEle        # htmlAttStarEle
    |type           # htmlAttType
    |bracket2Ele    # htmlAttBrack2
    |bracket1Ele    # htmlAttBrack1
    |questionEle    # htmlAttQuestion
    |placeholder    # htmlAttPlaceholder
    ;

styling:
    STYLE ASSIGN DQUOTE styleElement* DQUOTE;

styleElement
    :styleAssign  # styleElementAssign
    |styleNumber  # styleElementNumber
    |styleColor   # styleElementColor
    |styleOnly    # styleElementOnly
    ;

styleAssign:
    IDENTIFIER COLON IDENTIFIER (COMMA IDENTIFIER)* SEMI;

styleNumber:
    IDENTIFIER COLON (NUMBER extention*)+ SEMI;

styleColor:
    IDENTIFIER COLON HEXADECIMALCOLOR NUMBER? IDENTIFIER? SEMI;

extention
    :PIXIL              # extenPixil
    |IDENTIFIER         # extenId
    |HEXADECIMALCOLOR NUMBER? IDENTIFIER?   # extenHex
    |PERCENT            # extenPercent
    |AUTO               # extenAuto
    ;

styleOnly:
    IDENTIFIER SEMI;

click:
    LPAREN CLICK RPAREN ASSIGN DQUOTE functionCall DQUOTE;

src:
    SRC ASSIGN STRING;

srcFunc:
    LBRACK SRC RBRACK ASSIGN DQUOTE expression DQUOTE;

alt:
    ALT ASSIGN STRING;

altFunc:
    LBRACK ALT RBRACK ASSIGN DQUOTE expression (OPERATION expression)* DQUOTE;

starEle:
    OPERATION IDENTIFIER ASSIGN STRING;

type:
    TYPE ASSIGN STRING;

bracket2Ele:
    LBRACK LPAREN IDENTIFIER RPAREN RBRACK ASSIGN DQUOTE expression DQUOTE;

bracket1Ele:
    LPAREN expression RPAREN ASSIGN DQUOTE functionCall DQUOTE;

questionEle:
    LBRACK STYLE DOT expression RBRACK ASSIGN DQUOTE expression QUESTION expression COLON expression DQUOTE;

placeholder:
    PLACEHOLDER ASSIGN STRING;

tagBody
    :completeTag                                 # tagBodyCompleteTag
    |imageTag                                    # tagBodyImageTag
    |inputTag                                    # tagBodyInputTag
    |commentTag                                  # tagBodyCommentTag
    |expression+ EXCLAMATION?                    # tagBodyExpressionExc
    |LBRACE LBRACE expression RBRACE RBRACE      # tagBodyExpression
    |OPERATION                                   # tagBodyOperation
    ;



closeTag:
    TAG_OPEN SLASH IDENTIFIER TAG_CLOSE;


commentTag:
    TAG_OPEN EXCLAMATION OPERATION OPERATION expression* OPERATION OPERATION TAG_CLOSE;

expression:
      dotIdentifier                   # expId
    | STRING                          # expString
    | NUMBER                          # expNumber
    ;

dotIdentifier:
    IDENTIFIER (DOT IDENTIFIER)*;



// --------------------- CLASS ---------------------

classDecl:
    EXPORT CLASS IDENTIFIER LBRACE classBody* RBRACE;

classBody
    : variableDecl       # classBodyVariable
    | arrayDecl          # classBodyArray
    | functionDecl       # classBodyFunc
    ;

variableDecl:
    IDENTIFIER ASSIGN expression SEMI;



arrayDecl:
    IDENTIFIER COLON IDENTIFIER LBRACK RBRACK ASSIGN LBRACK RBRACK SEMI;



functionDecl:
    IDENTIFIER LPAREN paramList? RPAREN LBRACE functionBody* RBRACE;

paramList:
    parameter (COMMA parameter)*;

parameter:
    IDENTIFIER COLON IDENTIFIER;

functionCall:
    expression LPAREN functionCallBody? RPAREN;

functionCallBody:
     expressionBody                  # funcCallBodyexp
    |bracketBody                     # funcCallBodyBracketBody
    |special                         # funcCallBodySpecial
    ;


expressionBody:
    expression (COMMA expression)*;

bracketBody:
    LBRACE (body (COMMA body)*)? RBRACE;

body
    :IDENTIFIER COLON (functionCall|BOOLEAN);

special:
    IDENTIFIER ASSIGN TAG_CLOSE expression EXCLAMATION ASSIGN ASSIGN expression;

functionBody
    :returnStmt    # funcBodyReturn
    |statement     # funcBodyStatement
    |ifStatement   # funcBodyIf
    ;

returnStmt:
    RETURN expression SEMI;



statement
    :assignStatement
    |plusStatement
    ;

assignStatement:
    expression ASSIGN (expression|functionCall) SEMI;

plusStatement:
    expression OPERATION OPERATION SEMI;


ifStatement:
    IF LPAREN ifCondition? RPAREN LBRACE ifBody* RBRACE;

ifCondition:
    functionCall;

ifBody
    :(functionCall SEMI)
    |assignStatement
    ;

