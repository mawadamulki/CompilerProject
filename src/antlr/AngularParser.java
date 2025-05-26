// Generated from C:/Users/ROG STRIX/IdeaProjects/Compiler1ProjectComplete/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, FROM=2, COMPONENT=3, INJECTABLE=4, EXPORT=5, CLASS=6, SELECTOR=7, 
		STANDALONE=8, IMPORTS=9, STYLEURL=10, TEMPLATEURL=11, TEMPLATE=12, PROVIDEDIN=13, 
		INTERFACE=14, PIXIL=15, STYLE=16, CLICK=17, AUTO=18, SRC=19, ALT=20, IF=21, 
		IMG=22, TYPE=23, INPUT=24, PLACEHOLDER=25, PADDING=26, LBRACE=27, RBRACE=28, 
		LBRACK=29, RBRACK=30, LPAREN=31, RPAREN=32, COLON=33, SEMI=34, COMMA=35, 
		DOT=36, ASSIGN=37, QUOTE=38, DQUOTE=39, PERCENT=40, BACKTICK=41, EXCLAMATION=42, 
		QUESTION=43, WS=44, BOOLEAN=45, RETURN=46, STRING=47, IDENTIFIER=48, NUMBER=49, 
		TAG_OPEN=50, TAG_CLOSE=51, SLASH=52, HEXADECIMALCOLOR=53, ATTR_NAME=54, 
		ATTR_VALUE=55, OPERATION=56;
	public static final int
		RULE_app = 0, RULE_appContent = 1, RULE_interfaceDecl = 2, RULE_importStatement = 3, 
		RULE_importItems = 4, RULE_serviceDecl = 5, RULE_componentDecl = 6, RULE_componentdata = 7, 
		RULE_selector = 8, RULE_standalone = 9, RULE_imports = 10, RULE_styleUrls = 11, 
		RULE_templateUrl = 12, RULE_templateDecl = 13, RULE_html = 14, RULE_imageTag = 15, 
		RULE_inputTag = 16, RULE_completeTag = 17, RULE_openTag = 18, RULE_attributeHTML = 19, 
		RULE_styling = 20, RULE_styleElement = 21, RULE_styleAssign = 22, RULE_styleNumber = 23, 
		RULE_styleColor = 24, RULE_extention = 25, RULE_styleOnly = 26, RULE_stylePadding = 27, 
		RULE_click = 28, RULE_src = 29, RULE_srcFunc = 30, RULE_alt = 31, RULE_altFunc = 32, 
		RULE_starEle = 33, RULE_type = 34, RULE_bracket2Ele = 35, RULE_bracket1Ele = 36, 
		RULE_questionEle = 37, RULE_placeholder = 38, RULE_tagBody = 39, RULE_closeTag = 40, 
		RULE_commentTag = 41, RULE_expression = 42, RULE_dotIdentifier = 43, RULE_classDecl = 44, 
		RULE_classBody = 45, RULE_variableDecl = 46, RULE_arrayDecl = 47, RULE_functionDecl = 48, 
		RULE_paramList = 49, RULE_parameter = 50, RULE_functionCall = 51, RULE_functionCallBody = 52, 
		RULE_expressionBody = 53, RULE_bracketBody = 54, RULE_body = 55, RULE_special = 56, 
		RULE_functionBody = 57, RULE_returnStmt = 58, RULE_statement = 59, RULE_assignStatement = 60, 
		RULE_plusStatement = 61, RULE_ifStatement = 62, RULE_ifCondition = 63, 
		RULE_ifBody = 64;
	private static String[] makeRuleNames() {
		return new String[] {
			"app", "appContent", "interfaceDecl", "importStatement", "importItems", 
			"serviceDecl", "componentDecl", "componentdata", "selector", "standalone", 
			"imports", "styleUrls", "templateUrl", "templateDecl", "html", "imageTag", 
			"inputTag", "completeTag", "openTag", "attributeHTML", "styling", "styleElement", 
			"styleAssign", "styleNumber", "styleColor", "extention", "styleOnly", 
			"stylePadding", "click", "src", "srcFunc", "alt", "altFunc", "starEle", 
			"type", "bracket2Ele", "bracket1Ele", "questionEle", "placeholder", "tagBody", 
			"closeTag", "commentTag", "expression", "dotIdentifier", "classDecl", 
			"classBody", "variableDecl", "arrayDecl", "functionDecl", "paramList", 
			"parameter", "functionCall", "functionCallBody", "expressionBody", "bracketBody", 
			"body", "special", "functionBody", "returnStmt", "statement", "assignStatement", 
			"plusStatement", "ifStatement", "ifCondition", "ifBody"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'from'", "'@Component'", "'@Injectable'", "'export'", 
			"'class'", "'selector'", "'standalone'", "'imports'", "'styleUrls'", 
			"'templateUrl'", "'template'", "'providedIn'", "'interface'", "'px'", 
			"'style'", "'click'", "'auto'", "'src'", "'alt'", "'if'", "'img'", "'type'", 
			"'input'", "'placeholder'", "'padding'", "'{'", "'}'", "'['", "']'", 
			"'('", "')'", "':'", "';'", "','", "'.'", "'='", "'''", "'\"'", "'%'", 
			"'`'", "'!'", "'?'", null, null, "'return'", null, null, null, "'<'", 
			"'>'", "'/'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "FROM", "COMPONENT", "INJECTABLE", "EXPORT", "CLASS", 
			"SELECTOR", "STANDALONE", "IMPORTS", "STYLEURL", "TEMPLATEURL", "TEMPLATE", 
			"PROVIDEDIN", "INTERFACE", "PIXIL", "STYLE", "CLICK", "AUTO", "SRC", 
			"ALT", "IF", "IMG", "TYPE", "INPUT", "PLACEHOLDER", "PADDING", "LBRACE", 
			"RBRACE", "LBRACK", "RBRACK", "LPAREN", "RPAREN", "COLON", "SEMI", "COMMA", 
			"DOT", "ASSIGN", "QUOTE", "DQUOTE", "PERCENT", "BACKTICK", "EXCLAMATION", 
			"QUESTION", "WS", "BOOLEAN", "RETURN", "STRING", "IDENTIFIER", "NUMBER", 
			"TAG_OPEN", "TAG_CLOSE", "SLASH", "HEXADECIMALCOLOR", "ATTR_NAME", "ATTR_VALUE", 
			"OPERATION"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppContext extends ParserRuleContext {
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<AppContentContext> appContent() {
			return getRuleContexts(AppContentContext.class);
		}
		public AppContentContext appContent(int i) {
			return getRuleContext(AppContentContext.class,i);
		}
		public AppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppContext app() throws RecognitionException {
		AppContext _localctx = new AppContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_app);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(130);
				importStatement();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16440L) != 0)) {
				{
				{
				setState(136);
				appContent();
				}
				}
				setState(141);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AppContentContext extends ParserRuleContext {
		public AppContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appContent; }
	 
		public AppContentContext() { }
		public void copyFrom(AppContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AppServiceContext extends AppContentContext {
		public ServiceDeclContext serviceDecl() {
			return getRuleContext(ServiceDeclContext.class,0);
		}
		public AppServiceContext(AppContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAppService(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAppService(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAppService(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AppClassContext extends AppContentContext {
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public AppClassContext(AppContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAppClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAppClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAppClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AppComponentContext extends AppContentContext {
		public ComponentDeclContext componentDecl() {
			return getRuleContext(ComponentDeclContext.class,0);
		}
		public AppComponentContext(AppContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAppComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAppComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAppComponent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AppInterfaceContext extends AppContentContext {
		public InterfaceDeclContext interfaceDecl() {
			return getRuleContext(InterfaceDeclContext.class,0);
		}
		public AppInterfaceContext(AppContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAppInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAppInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAppInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppContentContext appContent() throws RecognitionException {
		AppContentContext _localctx = new AppContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_appContent);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERFACE:
				_localctx = new AppInterfaceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				interfaceDecl();
				}
				break;
			case COMPONENT:
				_localctx = new AppComponentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				componentDecl();
				}
				break;
			case INJECTABLE:
				_localctx = new AppServiceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				serviceDecl();
				}
				break;
			case EXPORT:
				_localctx = new AppClassContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				classDecl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(AngularParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(AngularParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AngularParser.SEMI, i);
		}
		public InterfaceDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclContext interfaceDecl() throws RecognitionException {
		InterfaceDeclContext _localctx = new InterfaceDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_interfaceDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(INTERFACE);
			setState(149);
			match(IDENTIFIER);
			setState(150);
			match(LBRACE);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(151);
				parameter();
				setState(152);
				match(SEMI);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public ImportItemsContext importItems() {
			return getRuleContext(ImportItemsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(IMPORT);
			setState(162);
			match(LBRACE);
			setState(163);
			importItems();
			setState(164);
			match(RBRACE);
			setState(165);
			match(FROM);
			setState(166);
			match(STRING);
			setState(167);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportItemsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportItemsContext importItems() throws RecognitionException {
		ImportItemsContext _localctx = new ImportItemsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(IDENTIFIER);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(170);
				match(COMMA);
				setState(171);
				match(IDENTIFIER);
				}
				}
				setState(176);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ServiceDeclContext extends ParserRuleContext {
		public TerminalNode INJECTABLE() { return getToken(AngularParser.INJECTABLE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode PROVIDEDIN() { return getToken(AngularParser.PROVIDEDIN, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ServiceDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterServiceDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitServiceDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitServiceDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceDeclContext serviceDecl() throws RecognitionException {
		ServiceDeclContext _localctx = new ServiceDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_serviceDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(INJECTABLE);
			setState(178);
			match(LPAREN);
			setState(179);
			match(PROVIDEDIN);
			setState(180);
			match(COLON);
			setState(181);
			match(STRING);
			setState(182);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public List<ComponentdataContext> componentdata() {
			return getRuleContexts(ComponentdataContext.class);
		}
		public ComponentdataContext componentdata(int i) {
			return getRuleContext(ComponentdataContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ComponentDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclContext componentDecl() throws RecognitionException {
		ComponentDeclContext _localctx = new ComponentDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_componentDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(COMPONENT);
			setState(185);
			match(LPAREN);
			setState(186);
			match(LBRACE);
			setState(187);
			componentdata();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(188);
				match(COMMA);
				setState(189);
				componentdata();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(RBRACE);
			setState(196);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentdataContext extends ParserRuleContext {
		public ComponentdataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentdata; }
	 
		public ComponentdataContext() { }
		public void copyFrom(ComponentdataContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentStandaloneContext extends ComponentdataContext {
		public StandaloneContext standalone() {
			return getRuleContext(StandaloneContext.class,0);
		}
		public ComponentStandaloneContext(ComponentdataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentStandalone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentStandalone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentStandalone(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentTamplateContext extends ComponentdataContext {
		public TemplateDeclContext templateDecl() {
			return getRuleContext(TemplateDeclContext.class,0);
		}
		public ComponentTamplateContext(ComponentdataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentTamplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentTamplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentTamplate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentSelectorContext extends ComponentdataContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public ComponentSelectorContext(ComponentdataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentImportsContext extends ComponentdataContext {
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public ComponentImportsContext(ComponentdataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentImports(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentTamplateUrlContext extends ComponentdataContext {
		public TemplateUrlContext templateUrl() {
			return getRuleContext(TemplateUrlContext.class,0);
		}
		public ComponentTamplateUrlContext(ComponentdataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentTamplateUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentTamplateUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentTamplateUrl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentStyleUrlContext extends ComponentdataContext {
		public StyleUrlsContext styleUrls() {
			return getRuleContext(StyleUrlsContext.class,0);
		}
		public ComponentStyleUrlContext(ComponentdataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentStyleUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentStyleUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentStyleUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentdataContext componentdata() throws RecognitionException {
		ComponentdataContext _localctx = new ComponentdataContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_componentdata);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new ComponentSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				selector();
				}
				break;
			case STANDALONE:
				_localctx = new ComponentStandaloneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				standalone();
				}
				break;
			case IMPORTS:
				_localctx = new ComponentImportsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				imports();
				}
				break;
			case STYLE:
				_localctx = new ComponentStyleUrlContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				styleUrls();
				}
				break;
			case TEMPLATEURL:
				_localctx = new ComponentTamplateUrlContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				templateUrl();
				}
				break;
			case TEMPLATE:
				_localctx = new ComponentTamplateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				templateDecl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(SELECTOR);
			setState(207);
			match(COLON);
			setState(208);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StandaloneContext extends ParserRuleContext {
		public TerminalNode STANDALONE() { return getToken(AngularParser.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public StandaloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandalone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandalone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandalone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneContext standalone() throws RecognitionException {
		StandaloneContext _localctx = new StandaloneContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_standalone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(STANDALONE);
			setState(211);
			match(COLON);
			setState(212);
			match(BOOLEAN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(AngularParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(IMPORTS);
			setState(215);
			match(COLON);
			setState(216);
			match(LBRACK);
			setState(217);
			match(IDENTIFIER);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(218);
				match(COMMA);
				setState(219);
				match(IDENTIFIER);
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StyleUrlsContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(AngularParser.STYLE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public List<TerminalNode> STRING() { return getTokens(AngularParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AngularParser.STRING, i);
		}
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public StyleUrlsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleUrls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleUrls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleUrls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleUrls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleUrlsContext styleUrls() throws RecognitionException {
		StyleUrlsContext _localctx = new StyleUrlsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_styleUrls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(STYLE);
			setState(228);
			match(COLON);
			setState(229);
			match(LBRACK);
			setState(230);
			match(STRING);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(231);
				match(COMMA);
				setState(232);
				match(STRING);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateUrlContext extends ParserRuleContext {
		public TerminalNode TEMPLATEURL() { return getToken(AngularParser.TEMPLATEURL, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TemplateUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateUrlContext templateUrl() throws RecognitionException {
		TemplateUrlContext _localctx = new TemplateUrlContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_templateUrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(TEMPLATEURL);
			setState(241);
			match(COLON);
			setState(242);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateDeclContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(AngularParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
		}
		public List<HtmlContext> html() {
			return getRuleContexts(HtmlContext.class);
		}
		public HtmlContext html(int i) {
			return getRuleContext(HtmlContext.class,i);
		}
		public TemplateDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDeclContext templateDecl() throws RecognitionException {
		TemplateDeclContext _localctx = new TemplateDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_templateDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(TEMPLATE);
			setState(245);
			match(COLON);
			setState(246);
			match(BACKTICK);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_OPEN) {
				{
				{
				setState(247);
				html();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			match(BACKTICK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContext extends ParserRuleContext {
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
	 
		public HtmlContext() { }
		public void copyFrom(HtmlContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentContext extends HtmlContext {
		public CommentTagContext commentTag() {
			return getRuleContext(CommentTagContext.class,0);
		}
		public HtmlCommentContext(HtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCompleteContext extends HtmlContext {
		public CompleteTagContext completeTag() {
			return getRuleContext(CompleteTagContext.class,0);
		}
		public HtmlCompleteContext(HtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlComplete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlComplete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlComplete(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlImageContext extends HtmlContext {
		public ImageTagContext imageTag() {
			return getRuleContext(ImageTagContext.class,0);
		}
		public HtmlImageContext(HtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlImage(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlInputContext extends HtmlContext {
		public InputTagContext inputTag() {
			return getRuleContext(InputTagContext.class,0);
		}
		public HtmlInputContext(HtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_html);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new HtmlImageContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				imageTag();
				}
				break;
			case 2:
				_localctx = new HtmlInputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				inputTag();
				}
				break;
			case 3:
				_localctx = new HtmlCompleteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				completeTag();
				}
				break;
			case 4:
				_localctx = new HtmlCommentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				commentTag();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImageTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(AngularParser.TAG_OPEN, 0); }
		public TerminalNode IMG() { return getToken(AngularParser.IMG, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(AngularParser.TAG_CLOSE, 0); }
		public List<AttributeHTMLContext> attributeHTML() {
			return getRuleContexts(AttributeHTMLContext.class);
		}
		public AttributeHTMLContext attributeHTML(int i) {
			return getRuleContext(AttributeHTMLContext.class,i);
		}
		public ImageTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImageTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImageTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImageTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageTagContext imageTag() throws RecognitionException {
		ImageTagContext _localctx = new ImageTagContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_imageTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(TAG_OPEN);
			setState(262);
			match(IMG);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057596765863936L) != 0)) {
				{
				{
				setState(263);
				attributeHTML();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(TAG_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(AngularParser.TAG_OPEN, 0); }
		public TerminalNode INPUT() { return getToken(AngularParser.INPUT, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(AngularParser.TAG_CLOSE, 0); }
		public List<AttributeHTMLContext> attributeHTML() {
			return getRuleContexts(AttributeHTMLContext.class);
		}
		public AttributeHTMLContext attributeHTML(int i) {
			return getRuleContext(AttributeHTMLContext.class,i);
		}
		public InputTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInputTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInputTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInputTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputTagContext inputTag() throws RecognitionException {
		InputTagContext _localctx = new InputTagContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inputTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(TAG_OPEN);
			setState(272);
			match(INPUT);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057596765863936L) != 0)) {
				{
				{
				setState(273);
				attributeHTML();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			match(TAG_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompleteTagContext extends ParserRuleContext {
		public OpenTagContext openTag() {
			return getRuleContext(OpenTagContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public List<TagBodyContext> tagBody() {
			return getRuleContexts(TagBodyContext.class);
		}
		public TagBodyContext tagBody(int i) {
			return getRuleContext(TagBodyContext.class,i);
		}
		public CompleteTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_completeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCompleteTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCompleteTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCompleteTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompleteTagContext completeTag() throws RecognitionException {
		CompleteTagContext _localctx = new CompleteTagContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_completeTag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			openTag();
			setState(283); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(282);
					tagBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(285); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(287);
			closeTag();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpenTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(AngularParser.TAG_OPEN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(AngularParser.TAG_CLOSE, 0); }
		public List<AttributeHTMLContext> attributeHTML() {
			return getRuleContexts(AttributeHTMLContext.class);
		}
		public AttributeHTMLContext attributeHTML(int i) {
			return getRuleContext(AttributeHTMLContext.class,i);
		}
		public OpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenTagContext openTag() throws RecognitionException {
		OpenTagContext _localctx = new OpenTagContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(TAG_OPEN);
			setState(290);
			match(IDENTIFIER);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057596765863936L) != 0)) {
				{
				{
				setState(291);
				attributeHTML();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(TAG_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeHTMLContext extends ParserRuleContext {
		public AttributeHTMLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeHTML; }
	 
		public AttributeHTMLContext() { }
		public void copyFrom(AttributeHTMLContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttStylingContext extends AttributeHTMLContext {
		public StylingContext styling() {
			return getRuleContext(StylingContext.class,0);
		}
		public HtmlAttStylingContext(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttStyling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttStyling(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttStyling(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttSrcContext extends AttributeHTMLContext {
		public SrcContext src() {
			return getRuleContext(SrcContext.class,0);
		}
		public HtmlAttSrcContext(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttSrc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttSrc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttSrc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttTypeContext extends AttributeHTMLContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public HtmlAttTypeContext(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttPlaceholderContext extends AttributeHTMLContext {
		public PlaceholderContext placeholder() {
			return getRuleContext(PlaceholderContext.class,0);
		}
		public HtmlAttPlaceholderContext(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttPlaceholder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttPlaceholder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttPlaceholder(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttClickContext extends AttributeHTMLContext {
		public ClickContext click() {
			return getRuleContext(ClickContext.class,0);
		}
		public HtmlAttClickContext(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttClick(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttSrcFuncContext extends AttributeHTMLContext {
		public SrcFuncContext srcFunc() {
			return getRuleContext(SrcFuncContext.class,0);
		}
		public HtmlAttSrcFuncContext(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttSrcFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttSrcFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttSrcFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttQuestionContext extends AttributeHTMLContext {
		public QuestionEleContext questionEle() {
			return getRuleContext(QuestionEleContext.class,0);
		}
		public HtmlAttQuestionContext(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttQuestion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttBrack1Context extends AttributeHTMLContext {
		public Bracket1EleContext bracket1Ele() {
			return getRuleContext(Bracket1EleContext.class,0);
		}
		public HtmlAttBrack1Context(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttBrack1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttBrack1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttBrack1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttAltFuncContext extends AttributeHTMLContext {
		public AltFuncContext altFunc() {
			return getRuleContext(AltFuncContext.class,0);
		}
		public HtmlAttAltFuncContext(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttAltFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttAltFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttAltFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttBrack2Context extends AttributeHTMLContext {
		public Bracket2EleContext bracket2Ele() {
			return getRuleContext(Bracket2EleContext.class,0);
		}
		public HtmlAttBrack2Context(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttBrack2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttBrack2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttBrack2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttStarEleContext extends AttributeHTMLContext {
		public StarEleContext starEle() {
			return getRuleContext(StarEleContext.class,0);
		}
		public HtmlAttStarEleContext(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttStarEle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttStarEle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttStarEle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttAltContext extends AttributeHTMLContext {
		public AltContext alt() {
			return getRuleContext(AltContext.class,0);
		}
		public HtmlAttAltContext(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeHTMLContext attributeHTML() throws RecognitionException {
		AttributeHTMLContext _localctx = new AttributeHTMLContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_attributeHTML);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new HtmlAttStylingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				styling();
				}
				break;
			case 2:
				_localctx = new HtmlAttClickContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				click();
				}
				break;
			case 3:
				_localctx = new HtmlAttSrcContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				src();
				}
				break;
			case 4:
				_localctx = new HtmlAttSrcFuncContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				srcFunc();
				}
				break;
			case 5:
				_localctx = new HtmlAttAltContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				alt();
				}
				break;
			case 6:
				_localctx = new HtmlAttAltFuncContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(304);
				altFunc();
				}
				break;
			case 7:
				_localctx = new HtmlAttStarEleContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(305);
				starEle();
				}
				break;
			case 8:
				_localctx = new HtmlAttTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(306);
				type();
				}
				break;
			case 9:
				_localctx = new HtmlAttBrack2Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(307);
				bracket2Ele();
				}
				break;
			case 10:
				_localctx = new HtmlAttBrack1Context(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(308);
				bracket1Ele();
				}
				break;
			case 11:
				_localctx = new HtmlAttQuestionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(309);
				questionEle();
				}
				break;
			case 12:
				_localctx = new HtmlAttPlaceholderContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(310);
				placeholder();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class StylingContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(AngularParser.STYLE, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public List<TerminalNode> DQUOTE() { return getTokens(AngularParser.DQUOTE); }
		public TerminalNode DQUOTE(int i) {
			return getToken(AngularParser.DQUOTE, i);
		}
		public List<StyleElementContext> styleElement() {
			return getRuleContexts(StyleElementContext.class);
		}
		public StyleElementContext styleElement(int i) {
			return getRuleContext(StyleElementContext.class,i);
		}
		public StylingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyling(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyling(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylingContext styling() throws RecognitionException {
		StylingContext _localctx = new StylingContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_styling);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(STYLE);
			setState(314);
			match(ASSIGN);
			setState(315);
			match(DQUOTE);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PADDING || _la==IDENTIFIER) {
				{
				{
				setState(316);
				styleElement();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
			match(DQUOTE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StyleElementContext extends ParserRuleContext {
		public StyleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleElement; }
	 
		public StyleElementContext() { }
		public void copyFrom(StyleElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleElementOnlyContext extends StyleElementContext {
		public StyleOnlyContext styleOnly() {
			return getRuleContext(StyleOnlyContext.class,0);
		}
		public StyleElementOnlyContext(StyleElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleElementOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleElementOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleElementOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleElementAssignContext extends StyleElementContext {
		public StyleAssignContext styleAssign() {
			return getRuleContext(StyleAssignContext.class,0);
		}
		public StyleElementAssignContext(StyleElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleElementAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleElementAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleElementAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleElementPaddingContext extends StyleElementContext {
		public StylePaddingContext stylePadding() {
			return getRuleContext(StylePaddingContext.class,0);
		}
		public StyleElementPaddingContext(StyleElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleElementPadding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleElementPadding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleElementPadding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleElementColorContext extends StyleElementContext {
		public StyleColorContext styleColor() {
			return getRuleContext(StyleColorContext.class,0);
		}
		public StyleElementColorContext(StyleElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleElementColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleElementColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleElementColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleElementNumberContext extends StyleElementContext {
		public StyleNumberContext styleNumber() {
			return getRuleContext(StyleNumberContext.class,0);
		}
		public StyleElementNumberContext(StyleElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleElementNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleElementNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleElementNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleElementContext styleElement() throws RecognitionException {
		StyleElementContext _localctx = new StyleElementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_styleElement);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new StyleElementAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				styleAssign();
				}
				break;
			case 2:
				_localctx = new StyleElementNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				styleNumber();
				}
				break;
			case 3:
				_localctx = new StyleElementColorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				styleColor();
				}
				break;
			case 4:
				_localctx = new StyleElementOnlyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				styleOnly();
				}
				break;
			case 5:
				_localctx = new StyleElementPaddingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(328);
				stylePadding();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class StyleAssignContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public StyleAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleAssignContext styleAssign() throws RecognitionException {
		StyleAssignContext _localctx = new StyleAssignContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_styleAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(IDENTIFIER);
			setState(332);
			match(COLON);
			setState(333);
			match(IDENTIFIER);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(334);
				match(COMMA);
				setState(335);
				match(IDENTIFIER);
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StyleNumberContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(AngularParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AngularParser.NUMBER, i);
		}
		public List<ExtentionContext> extention() {
			return getRuleContexts(ExtentionContext.class);
		}
		public ExtentionContext extention(int i) {
			return getRuleContext(ExtentionContext.class,i);
		}
		public StyleNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleNumberContext styleNumber() throws RecognitionException {
		StyleNumberContext _localctx = new StyleNumberContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_styleNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(IDENTIFIER);
			setState(344);
			match(COLON);
			setState(352); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(345);
				match(NUMBER);
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9289773743374336L) != 0)) {
					{
					{
					setState(346);
					extention();
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(354); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(356);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StyleColorContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode HEXADECIMALCOLOR() { return getToken(AngularParser.HEXADECIMALCOLOR, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public StyleColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleColorContext styleColor() throws RecognitionException {
		StyleColorContext _localctx = new StyleColorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_styleColor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(IDENTIFIER);
			setState(359);
			match(COLON);
			setState(360);
			match(HEXADECIMALCOLOR);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(361);
				match(NUMBER);
				}
			}

			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(364);
				match(IDENTIFIER);
				}
			}

			setState(367);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExtentionContext extends ParserRuleContext {
		public ExtentionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extention; }
	 
		public ExtentionContext() { }
		public void copyFrom(ExtentionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExtenPixilContext extends ExtentionContext {
		public TerminalNode PIXIL() { return getToken(AngularParser.PIXIL, 0); }
		public ExtenPixilContext(ExtentionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExtenPixil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExtenPixil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExtenPixil(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExtenHexContext extends ExtentionContext {
		public TerminalNode HEXADECIMALCOLOR() { return getToken(AngularParser.HEXADECIMALCOLOR, 0); }
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ExtenHexContext(ExtentionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExtenHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExtenHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExtenHex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExtenIdContext extends ExtentionContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ExtenIdContext(ExtentionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExtenId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExtenId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExtenId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExtenPercentContext extends ExtentionContext {
		public TerminalNode PERCENT() { return getToken(AngularParser.PERCENT, 0); }
		public ExtenPercentContext(ExtentionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExtenPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExtenPercent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExtenPercent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExtenAutoContext extends ExtentionContext {
		public TerminalNode AUTO() { return getToken(AngularParser.AUTO, 0); }
		public ExtenAutoContext(ExtentionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExtenAuto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExtenAuto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExtenAuto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtentionContext extention() throws RecognitionException {
		ExtentionContext _localctx = new ExtentionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_extention);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIXIL:
				_localctx = new ExtenPixilContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(PIXIL);
				}
				break;
			case IDENTIFIER:
				_localctx = new ExtenIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(IDENTIFIER);
				}
				break;
			case HEXADECIMALCOLOR:
				_localctx = new ExtenHexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				match(HEXADECIMALCOLOR);
				setState(373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(372);
					match(NUMBER);
					}
					break;
				}
				setState(376);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(375);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case PERCENT:
				_localctx = new ExtenPercentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				match(PERCENT);
				}
				break;
			case AUTO:
				_localctx = new ExtenAutoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(379);
				match(AUTO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StyleOnlyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public StyleOnlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleOnly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleOnlyContext styleOnly() throws RecognitionException {
		StyleOnlyContext _localctx = new StyleOnlyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_styleOnly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(IDENTIFIER);
			setState(383);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StylePaddingContext extends ParserRuleContext {
		public TerminalNode PADDING() { return getToken(AngularParser.PADDING, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(AngularParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AngularParser.NUMBER, i);
		}
		public List<TerminalNode> PIXIL() { return getTokens(AngularParser.PIXIL); }
		public TerminalNode PIXIL(int i) {
			return getToken(AngularParser.PIXIL, i);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public StylePaddingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylePadding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStylePadding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStylePadding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStylePadding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylePaddingContext stylePadding() throws RecognitionException {
		StylePaddingContext _localctx = new StylePaddingContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stylePadding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(PADDING);
			setState(386);
			match(COLON);
			setState(387);
			match(NUMBER);
			setState(388);
			match(PIXIL);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(389);
				match(NUMBER);
				setState(390);
				match(PIXIL);
				}
			}

			setState(393);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClickContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode CLICK() { return getToken(AngularParser.CLICK, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public List<TerminalNode> DQUOTE() { return getTokens(AngularParser.DQUOTE); }
		public TerminalNode DQUOTE(int i) {
			return getToken(AngularParser.DQUOTE, i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_click; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClickContext click() throws RecognitionException {
		ClickContext _localctx = new ClickContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_click);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(LPAREN);
			setState(396);
			match(CLICK);
			setState(397);
			match(RPAREN);
			setState(398);
			match(ASSIGN);
			setState(399);
			match(DQUOTE);
			setState(400);
			functionCall();
			setState(401);
			match(DQUOTE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SrcContext extends ParserRuleContext {
		public TerminalNode SRC() { return getToken(AngularParser.SRC, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public SrcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_src; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSrc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSrc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSrc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SrcContext src() throws RecognitionException {
		SrcContext _localctx = new SrcContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_src);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(SRC);
			setState(404);
			match(ASSIGN);
			setState(405);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SrcFuncContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode SRC() { return getToken(AngularParser.SRC, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public List<TerminalNode> DQUOTE() { return getTokens(AngularParser.DQUOTE); }
		public TerminalNode DQUOTE(int i) {
			return getToken(AngularParser.DQUOTE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SrcFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_srcFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSrcFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSrcFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSrcFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SrcFuncContext srcFunc() throws RecognitionException {
		SrcFuncContext _localctx = new SrcFuncContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_srcFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(LBRACK);
			setState(408);
			match(SRC);
			setState(409);
			match(RBRACK);
			setState(410);
			match(ASSIGN);
			setState(411);
			match(DQUOTE);
			setState(412);
			expression();
			setState(413);
			match(DQUOTE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AltContext extends ParserRuleContext {
		public TerminalNode ALT() { return getToken(AngularParser.ALT, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public AltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltContext alt() throws RecognitionException {
		AltContext _localctx = new AltContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_alt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(ALT);
			setState(416);
			match(ASSIGN);
			setState(417);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AltFuncContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode ALT() { return getToken(AngularParser.ALT, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public List<TerminalNode> DQUOTE() { return getTokens(AngularParser.DQUOTE); }
		public TerminalNode DQUOTE(int i) {
			return getToken(AngularParser.DQUOTE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> OPERATION() { return getTokens(AngularParser.OPERATION); }
		public TerminalNode OPERATION(int i) {
			return getToken(AngularParser.OPERATION, i);
		}
		public AltFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAltFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAltFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAltFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltFuncContext altFunc() throws RecognitionException {
		AltFuncContext _localctx = new AltFuncContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_altFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(LBRACK);
			setState(420);
			match(ALT);
			setState(421);
			match(RBRACK);
			setState(422);
			match(ASSIGN);
			setState(423);
			match(DQUOTE);
			setState(424);
			expression();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATION) {
				{
				{
				setState(425);
				match(OPERATION);
				setState(426);
				expression();
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432);
			match(DQUOTE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StarEleContext extends ParserRuleContext {
		public TerminalNode OPERATION() { return getToken(AngularParser.OPERATION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public StarEleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starEle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStarEle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStarEle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStarEle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarEleContext starEle() throws RecognitionException {
		StarEleContext _localctx = new StarEleContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_starEle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(OPERATION);
			setState(435);
			match(IDENTIFIER);
			setState(436);
			match(ASSIGN);
			setState(437);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(AngularParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(TYPE);
			setState(440);
			match(ASSIGN);
			setState(441);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bracket2EleContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public List<TerminalNode> DQUOTE() { return getTokens(AngularParser.DQUOTE); }
		public TerminalNode DQUOTE(int i) {
			return getToken(AngularParser.DQUOTE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bracket2EleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket2Ele; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBracket2Ele(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBracket2Ele(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBracket2Ele(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bracket2EleContext bracket2Ele() throws RecognitionException {
		Bracket2EleContext _localctx = new Bracket2EleContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_bracket2Ele);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(LBRACK);
			setState(444);
			match(LPAREN);
			setState(445);
			match(IDENTIFIER);
			setState(446);
			match(RPAREN);
			setState(447);
			match(RBRACK);
			setState(448);
			match(ASSIGN);
			setState(449);
			match(DQUOTE);
			setState(450);
			expression();
			setState(451);
			match(DQUOTE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bracket1EleContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public List<TerminalNode> DQUOTE() { return getTokens(AngularParser.DQUOTE); }
		public TerminalNode DQUOTE(int i) {
			return getToken(AngularParser.DQUOTE, i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public Bracket1EleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket1Ele; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBracket1Ele(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBracket1Ele(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBracket1Ele(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bracket1EleContext bracket1Ele() throws RecognitionException {
		Bracket1EleContext _localctx = new Bracket1EleContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_bracket1Ele);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(LPAREN);
			setState(454);
			expression();
			setState(455);
			match(RPAREN);
			setState(456);
			match(ASSIGN);
			setState(457);
			match(DQUOTE);
			setState(458);
			functionCall();
			setState(459);
			match(DQUOTE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionEleContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode STYLE() { return getToken(AngularParser.STYLE, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public List<TerminalNode> DQUOTE() { return getTokens(AngularParser.DQUOTE); }
		public TerminalNode DQUOTE(int i) {
			return getToken(AngularParser.DQUOTE, i);
		}
		public TerminalNode QUESTION() { return getToken(AngularParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public QuestionEleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionEle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterQuestionEle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitQuestionEle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitQuestionEle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionEleContext questionEle() throws RecognitionException {
		QuestionEleContext _localctx = new QuestionEleContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_questionEle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(LBRACK);
			setState(462);
			match(STYLE);
			setState(463);
			match(DOT);
			setState(464);
			expression();
			setState(465);
			match(RBRACK);
			setState(466);
			match(ASSIGN);
			setState(467);
			match(DQUOTE);
			setState(468);
			expression();
			setState(469);
			match(QUESTION);
			setState(470);
			expression();
			setState(471);
			match(COLON);
			setState(472);
			expression();
			setState(473);
			match(DQUOTE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PlaceholderContext extends ParserRuleContext {
		public TerminalNode PLACEHOLDER() { return getToken(AngularParser.PLACEHOLDER, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public PlaceholderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placeholder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPlaceholder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPlaceholder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPlaceholder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlaceholderContext placeholder() throws RecognitionException {
		PlaceholderContext _localctx = new PlaceholderContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_placeholder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(PLACEHOLDER);
			setState(476);
			match(ASSIGN);
			setState(477);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TagBodyContext extends ParserRuleContext {
		public TagBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagBody; }
	 
		public TagBodyContext() { }
		public void copyFrom(TagBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagBodyImageTagContext extends TagBodyContext {
		public ImageTagContext imageTag() {
			return getRuleContext(ImageTagContext.class,0);
		}
		public TagBodyImageTagContext(TagBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagBodyImageTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagBodyImageTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagBodyImageTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagBodyOperationContext extends TagBodyContext {
		public TerminalNode OPERATION() { return getToken(AngularParser.OPERATION, 0); }
		public TagBodyOperationContext(TagBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagBodyOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagBodyOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagBodyOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagBodyInputTagContext extends TagBodyContext {
		public InputTagContext inputTag() {
			return getRuleContext(InputTagContext.class,0);
		}
		public TagBodyInputTagContext(TagBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagBodyInputTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagBodyInputTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagBodyInputTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagBodyExpressionContext extends TagBodyContext {
		public List<TerminalNode> LBRACE() { return getTokens(AngularParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(AngularParser.LBRACE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> RBRACE() { return getTokens(AngularParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(AngularParser.RBRACE, i);
		}
		public TagBodyExpressionContext(TagBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagBodyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagBodyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagBodyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagBodyCompleteTagContext extends TagBodyContext {
		public CompleteTagContext completeTag() {
			return getRuleContext(CompleteTagContext.class,0);
		}
		public TagBodyCompleteTagContext(TagBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagBodyCompleteTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagBodyCompleteTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagBodyCompleteTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagBodyCommentTagContext extends TagBodyContext {
		public CommentTagContext commentTag() {
			return getRuleContext(CommentTagContext.class,0);
		}
		public TagBodyCommentTagContext(TagBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagBodyCommentTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagBodyCommentTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagBodyCommentTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagBodyExpressionExcContext extends TagBodyContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EXCLAMATION() { return getToken(AngularParser.EXCLAMATION, 0); }
		public TagBodyExpressionExcContext(TagBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagBodyExpressionExc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagBodyExpressionExc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagBodyExpressionExc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagBodyContext tagBody() throws RecognitionException {
		TagBodyContext _localctx = new TagBodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tagBody);
		int _la;
		try {
			int _alt;
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new TagBodyCompleteTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				completeTag();
				}
				break;
			case 2:
				_localctx = new TagBodyImageTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				imageTag();
				}
				break;
			case 3:
				_localctx = new TagBodyInputTagContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
				inputTag();
				}
				break;
			case 4:
				_localctx = new TagBodyCommentTagContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				commentTag();
				}
				break;
			case 5:
				_localctx = new TagBodyExpressionExcContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(484); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(483);
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(486); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXCLAMATION) {
					{
					setState(488);
					match(EXCLAMATION);
					}
				}

				}
				break;
			case 6:
				_localctx = new TagBodyExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(491);
				match(LBRACE);
				setState(492);
				match(LBRACE);
				setState(493);
				expression();
				setState(494);
				match(RBRACE);
				setState(495);
				match(RBRACE);
				}
				break;
			case 7:
				_localctx = new TagBodyOperationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(497);
				match(OPERATION);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class CloseTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(AngularParser.TAG_OPEN, 0); }
		public TerminalNode SLASH() { return getToken(AngularParser.SLASH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(AngularParser.TAG_CLOSE, 0); }
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(TAG_OPEN);
			setState(501);
			match(SLASH);
			setState(502);
			match(IDENTIFIER);
			setState(503);
			match(TAG_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommentTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(AngularParser.TAG_OPEN, 0); }
		public TerminalNode EXCLAMATION() { return getToken(AngularParser.EXCLAMATION, 0); }
		public List<TerminalNode> OPERATION() { return getTokens(AngularParser.OPERATION); }
		public TerminalNode OPERATION(int i) {
			return getToken(AngularParser.OPERATION, i);
		}
		public TerminalNode TAG_CLOSE() { return getToken(AngularParser.TAG_CLOSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CommentTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCommentTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCommentTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCommentTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentTagContext commentTag() throws RecognitionException {
		CommentTagContext _localctx = new CommentTagContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_commentTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(TAG_OPEN);
			setState(506);
			match(EXCLAMATION);
			setState(507);
			match(OPERATION);
			setState(508);
			match(OPERATION);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) {
				{
				{
				setState(509);
				expression();
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
			match(OPERATION);
			setState(516);
			match(OPERATION);
			setState(517);
			match(TAG_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpNumberContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public ExpNumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpIdContext extends ExpressionContext {
		public DotIdentifierContext dotIdentifier() {
			return getRuleContext(DotIdentifierContext.class,0);
		}
		public ExpIdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpStringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public ExpStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expression);
		try {
			setState(522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new ExpIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				dotIdentifier();
				}
				break;
			case STRING:
				_localctx = new ExpStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(STRING);
				}
				break;
			case NUMBER:
				_localctx = new ExpNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(521);
				match(NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DotIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public DotIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDotIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDotIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDotIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotIdentifierContext dotIdentifier() throws RecognitionException {
		DotIdentifierContext _localctx = new DotIdentifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_dotIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(IDENTIFIER);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(525);
				match(DOT);
				setState(526);
				match(IDENTIFIER);
				}
				}
				setState(531);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<ClassBodyContext> classBody() {
			return getRuleContexts(ClassBodyContext.class);
		}
		public ClassBodyContext classBody(int i) {
			return getRuleContext(ClassBodyContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(EXPORT);
			setState(533);
			match(CLASS);
			setState(534);
			match(IDENTIFIER);
			setState(535);
			match(LBRACE);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(536);
				classBody();
				}
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(542);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	 
		public ClassBodyContext() { }
		public void copyFrom(ClassBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyArrayContext extends ClassBodyContext {
		public ArrayDeclContext arrayDecl() {
			return getRuleContext(ArrayDeclContext.class,0);
		}
		public ClassBodyArrayContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBodyArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBodyArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBodyArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyVariableContext extends ClassBodyContext {
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public ClassBodyVariableContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBodyVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBodyVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBodyVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyFuncContext extends ClassBodyContext {
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public ClassBodyFuncContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBodyFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBodyFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBodyFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_classBody);
		try {
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new ClassBodyVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				variableDecl();
				}
				break;
			case 2:
				_localctx = new ClassBodyArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				arrayDecl();
				}
				break;
			case 3:
				_localctx = new ClassBodyFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(546);
				functionDecl();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_variableDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(IDENTIFIER);
			setState(550);
			match(ASSIGN);
			setState(551);
			expression();
			setState(552);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(AngularParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AngularParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AngularParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AngularParser.RBRACK, i);
		}
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ArrayDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclContext arrayDecl() throws RecognitionException {
		ArrayDeclContext _localctx = new ArrayDeclContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_arrayDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(IDENTIFIER);
			setState(555);
			match(COLON);
			setState(556);
			match(IDENTIFIER);
			setState(557);
			match(LBRACK);
			setState(558);
			match(RBRACK);
			setState(559);
			match(ASSIGN);
			setState(560);
			match(LBRACK);
			setState(561);
			match(RBRACK);
			setState(562);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public List<FunctionBodyContext> functionBody() {
			return getRuleContexts(FunctionBodyContext.class);
		}
		public FunctionBodyContext functionBody(int i) {
			return getRuleContext(FunctionBodyContext.class,i);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(IDENTIFIER);
			setState(565);
			match(LPAREN);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(566);
				paramList();
				}
			}

			setState(569);
			match(RPAREN);
			setState(570);
			match(LBRACE);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531164762112L) != 0)) {
				{
				{
				setState(571);
				functionBody();
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(577);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			parameter();
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(580);
				match(COMMA);
				setState(581);
				parameter();
				}
				}
				setState(586);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(IDENTIFIER);
			setState(588);
			match(COLON);
			setState(589);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public FunctionCallBodyContext functionCallBody() {
			return getRuleContext(FunctionCallBodyContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			expression();
			setState(592);
			match(LPAREN);
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162552705024L) != 0)) {
				{
				setState(593);
				functionCallBody();
				}
			}

			setState(596);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallBodyContext extends ParserRuleContext {
		public FunctionCallBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallBody; }
	 
		public FunctionCallBodyContext() { }
		public void copyFrom(FunctionCallBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallBodyBracketBodyContext extends FunctionCallBodyContext {
		public BracketBodyContext bracketBody() {
			return getRuleContext(BracketBodyContext.class,0);
		}
		public FuncCallBodyBracketBodyContext(FunctionCallBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFuncCallBodyBracketBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFuncCallBodyBracketBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFuncCallBodyBracketBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallBodySpecialContext extends FunctionCallBodyContext {
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public FuncCallBodySpecialContext(FunctionCallBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFuncCallBodySpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFuncCallBodySpecial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFuncCallBodySpecial(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallBodyexpContext extends FunctionCallBodyContext {
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public FuncCallBodyexpContext(FunctionCallBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFuncCallBodyexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFuncCallBodyexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFuncCallBodyexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallBodyContext functionCallBody() throws RecognitionException {
		FunctionCallBodyContext _localctx = new FunctionCallBodyContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_functionCallBody);
		try {
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new FuncCallBodyexpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				expressionBody();
				}
				break;
			case 2:
				_localctx = new FuncCallBodyBracketBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				bracketBody();
				}
				break;
			case 3:
				_localctx = new FuncCallBodySpecialContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(600);
				special();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionBodyContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ExpressionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionBodyContext expressionBody() throws RecognitionException {
		ExpressionBodyContext _localctx = new ExpressionBodyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expressionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			expression();
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(604);
				match(COMMA);
				setState(605);
				expression();
				}
				}
				setState(610);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BracketBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public BracketBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBracketBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBracketBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBracketBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketBodyContext bracketBody() throws RecognitionException {
		BracketBodyContext _localctx = new BracketBodyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_bracketBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(LBRACE);
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(612);
				body();
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(613);
					match(COMMA);
					setState(614);
					body();
					}
					}
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(622);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(IDENTIFIER);
			setState(625);
			match(COLON);
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case IDENTIFIER:
			case NUMBER:
				{
				setState(626);
				functionCall();
				}
				break;
			case BOOLEAN:
				{
				setState(627);
				match(BOOLEAN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpecialContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(AngularParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(AngularParser.ASSIGN, i);
		}
		public TerminalNode TAG_CLOSE() { return getToken(AngularParser.TAG_CLOSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EXCLAMATION() { return getToken(AngularParser.EXCLAMATION, 0); }
		public SpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSpecial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSpecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_special);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(IDENTIFIER);
			setState(631);
			match(ASSIGN);
			setState(632);
			match(TAG_CLOSE);
			setState(633);
			expression();
			setState(634);
			match(EXCLAMATION);
			setState(635);
			match(ASSIGN);
			setState(636);
			match(ASSIGN);
			setState(637);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	 
		public FunctionBodyContext() { }
		public void copyFrom(FunctionBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncBodyStatementContext extends FunctionBodyContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FuncBodyStatementContext(FunctionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFuncBodyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFuncBodyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFuncBodyStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncBodyReturnContext extends FunctionBodyContext {
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public FuncBodyReturnContext(FunctionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFuncBodyReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFuncBodyReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFuncBodyReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncBodyIfContext extends FunctionBodyContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public FuncBodyIfContext(FunctionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFuncBodyIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFuncBodyIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFuncBodyIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_functionBody);
		try {
			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new FuncBodyReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				returnStmt();
				}
				break;
			case STRING:
			case IDENTIFIER:
			case NUMBER:
				_localctx = new FuncBodyStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				statement();
				}
				break;
			case IF:
				_localctx = new FuncBodyIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(641);
				ifStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(RETURN);
			setState(645);
			expression();
			setState(646);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public PlusStatementContext plusStatement() {
			return getRuleContext(PlusStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_statement);
		try {
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				assignStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				plusStatement();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			expression();
			setState(653);
			match(ASSIGN);
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(654);
				expression();
				}
				break;
			case 2:
				{
				setState(655);
				functionCall();
				}
				break;
			}
			setState(658);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PlusStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> OPERATION() { return getTokens(AngularParser.OPERATION); }
		public TerminalNode OPERATION(int i) {
			return getToken(AngularParser.OPERATION, i);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public PlusStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPlusStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPlusStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPlusStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusStatementContext plusStatement() throws RecognitionException {
		PlusStatementContext _localctx = new PlusStatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_plusStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			expression();
			setState(661);
			match(OPERATION);
			setState(662);
			match(OPERATION);
			setState(663);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public List<IfBodyContext> ifBody() {
			return getRuleContexts(IfBodyContext.class);
		}
		public IfBodyContext ifBody(int i) {
			return getRuleContext(IfBodyContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(IF);
			setState(666);
			match(LPAREN);
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) {
				{
				setState(667);
				ifCondition();
				}
			}

			setState(670);
			match(RPAREN);
			setState(671);
			match(LBRACE);
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) {
				{
				{
				setState(672);
				ifBody();
				}
				}
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(678);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfConditionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_ifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			functionCall();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfBodyContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_ifBody);
		try {
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(682);
				functionCall();
				setState(683);
				match(SEMI);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				assignStatement();
				}
				break;
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
		"\u0004\u00018\u02b1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0001"+
		"\u0000\u0005\u0000\u0084\b\u0000\n\u0000\f\u0000\u0087\t\u0000\u0001\u0000"+
		"\u0005\u0000\u008a\b\u0000\n\u0000\f\u0000\u008d\t\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0093\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u009b"+
		"\b\u0002\n\u0002\f\u0002\u009e\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00ad\b\u0004"+
		"\n\u0004\f\u0004\u00b0\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00bf\b\u0006\n"+
		"\u0006\f\u0006\u00c2\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00cd\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00dd"+
		"\b\n\n\n\f\n\u00e0\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ea\b\u000b\n\u000b"+
		"\f\u000b\u00ed\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00f9\b\r\n\r\f\r\u00fc"+
		"\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0104\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0109"+
		"\b\u000f\n\u000f\f\u000f\u010c\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u0113\b\u0010\n\u0010\f\u0010\u0116"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0004\u0011\u011c"+
		"\b\u0011\u000b\u0011\f\u0011\u011d\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0125\b\u0012\n\u0012\f\u0012\u0128"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0138\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u013e\b\u0014\n\u0014\f\u0014"+
		"\u0141\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u014a\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0151\b\u0016\n\u0016"+
		"\f\u0016\u0154\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u015c\b\u0017\n\u0017\f\u0017\u015f"+
		"\t\u0017\u0004\u0017\u0161\b\u0017\u000b\u0017\f\u0017\u0162\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u016b\b\u0018\u0001\u0018\u0003\u0018\u016e\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0176"+
		"\b\u0019\u0001\u0019\u0003\u0019\u0179\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u017d\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0188\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0005 \u01ac\b \n \f \u01af\t \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0004\'\u01e5\b\'\u000b\'\f\'\u01e6\u0001\'\u0003\'\u01ea\b\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u01f3\b\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0005"+
		")\u01ff\b)\n)\f)\u0202\t)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0003*\u020b\b*\u0001+\u0001+\u0001+\u0005+\u0210\b+\n+\f+\u0213\t+"+
		"\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u021a\b,\n,\f,\u021d\t,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0003-\u0224\b-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u00010\u00010\u00010\u00030\u0238\b0\u00010\u00010\u00010\u0005"+
		"0\u023d\b0\n0\f0\u0240\t0\u00010\u00010\u00011\u00011\u00011\u00051\u0247"+
		"\b1\n1\f1\u024a\t1\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u0003"+
		"3\u0253\b3\u00013\u00013\u00014\u00014\u00014\u00034\u025a\b4\u00015\u0001"+
		"5\u00015\u00055\u025f\b5\n5\f5\u0262\t5\u00016\u00016\u00016\u00016\u0005"+
		"6\u0268\b6\n6\f6\u026b\t6\u00036\u026d\b6\u00016\u00016\u00017\u00017"+
		"\u00017\u00017\u00037\u0275\b7\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00019\u00019\u00019\u00039\u0283\b9\u0001:\u0001"+
		":\u0001:\u0001:\u0001;\u0001;\u0003;\u028b\b;\u0001<\u0001<\u0001<\u0001"+
		"<\u0003<\u0291\b<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		">\u0001>\u0001>\u0003>\u029d\b>\u0001>\u0001>\u0001>\u0005>\u02a2\b>\n"+
		">\f>\u02a5\t>\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@"+
		"\u0003@\u02af\b@\u0001@\u0000\u0000A\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0000\u0000\u02c3\u0000\u0085\u0001"+
		"\u0000\u0000\u0000\u0002\u0092\u0001\u0000\u0000\u0000\u0004\u0094\u0001"+
		"\u0000\u0000\u0000\u0006\u00a1\u0001\u0000\u0000\u0000\b\u00a9\u0001\u0000"+
		"\u0000\u0000\n\u00b1\u0001\u0000\u0000\u0000\f\u00b8\u0001\u0000\u0000"+
		"\u0000\u000e\u00cc\u0001\u0000\u0000\u0000\u0010\u00ce\u0001\u0000\u0000"+
		"\u0000\u0012\u00d2\u0001\u0000\u0000\u0000\u0014\u00d6\u0001\u0000\u0000"+
		"\u0000\u0016\u00e3\u0001\u0000\u0000\u0000\u0018\u00f0\u0001\u0000\u0000"+
		"\u0000\u001a\u00f4\u0001\u0000\u0000\u0000\u001c\u0103\u0001\u0000\u0000"+
		"\u0000\u001e\u0105\u0001\u0000\u0000\u0000 \u010f\u0001\u0000\u0000\u0000"+
		"\"\u0119\u0001\u0000\u0000\u0000$\u0121\u0001\u0000\u0000\u0000&\u0137"+
		"\u0001\u0000\u0000\u0000(\u0139\u0001\u0000\u0000\u0000*\u0149\u0001\u0000"+
		"\u0000\u0000,\u014b\u0001\u0000\u0000\u0000.\u0157\u0001\u0000\u0000\u0000"+
		"0\u0166\u0001\u0000\u0000\u00002\u017c\u0001\u0000\u0000\u00004\u017e"+
		"\u0001\u0000\u0000\u00006\u0181\u0001\u0000\u0000\u00008\u018b\u0001\u0000"+
		"\u0000\u0000:\u0193\u0001\u0000\u0000\u0000<\u0197\u0001\u0000\u0000\u0000"+
		">\u019f\u0001\u0000\u0000\u0000@\u01a3\u0001\u0000\u0000\u0000B\u01b2"+
		"\u0001\u0000\u0000\u0000D\u01b7\u0001\u0000\u0000\u0000F\u01bb\u0001\u0000"+
		"\u0000\u0000H\u01c5\u0001\u0000\u0000\u0000J\u01cd\u0001\u0000\u0000\u0000"+
		"L\u01db\u0001\u0000\u0000\u0000N\u01f2\u0001\u0000\u0000\u0000P\u01f4"+
		"\u0001\u0000\u0000\u0000R\u01f9\u0001\u0000\u0000\u0000T\u020a\u0001\u0000"+
		"\u0000\u0000V\u020c\u0001\u0000\u0000\u0000X\u0214\u0001\u0000\u0000\u0000"+
		"Z\u0223\u0001\u0000\u0000\u0000\\\u0225\u0001\u0000\u0000\u0000^\u022a"+
		"\u0001\u0000\u0000\u0000`\u0234\u0001\u0000\u0000\u0000b\u0243\u0001\u0000"+
		"\u0000\u0000d\u024b\u0001\u0000\u0000\u0000f\u024f\u0001\u0000\u0000\u0000"+
		"h\u0259\u0001\u0000\u0000\u0000j\u025b\u0001\u0000\u0000\u0000l\u0263"+
		"\u0001\u0000\u0000\u0000n\u0270\u0001\u0000\u0000\u0000p\u0276\u0001\u0000"+
		"\u0000\u0000r\u0282\u0001\u0000\u0000\u0000t\u0284\u0001\u0000\u0000\u0000"+
		"v\u028a\u0001\u0000\u0000\u0000x\u028c\u0001\u0000\u0000\u0000z\u0294"+
		"\u0001\u0000\u0000\u0000|\u0299\u0001\u0000\u0000\u0000~\u02a8\u0001\u0000"+
		"\u0000\u0000\u0080\u02ae\u0001\u0000\u0000\u0000\u0082\u0084\u0003\u0006"+
		"\u0003\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u008b\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0088\u008a\u0003\u0002\u0001\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0001\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0093\u0003\u0004"+
		"\u0002\u0000\u008f\u0093\u0003\f\u0006\u0000\u0090\u0093\u0003\n\u0005"+
		"\u0000\u0091\u0093\u0003X,\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0092"+
		"\u008f\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0003\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005\u000e\u0000\u0000\u0095\u0096\u00050\u0000\u0000\u0096\u009c"+
		"\u0005\u001b\u0000\u0000\u0097\u0098\u0003d2\u0000\u0098\u0099\u0005\""+
		"\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0097\u0001\u0000"+
		"\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000"+
		"\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u001c"+
		"\u0000\u0000\u00a0\u0005\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0001"+
		"\u0000\u0000\u00a2\u00a3\u0005\u001b\u0000\u0000\u00a3\u00a4\u0003\b\u0004"+
		"\u0000\u00a4\u00a5\u0005\u001c\u0000\u0000\u00a5\u00a6\u0005\u0002\u0000"+
		"\u0000\u00a6\u00a7\u0005/\u0000\u0000\u00a7\u00a8\u0005\"\u0000\u0000"+
		"\u00a8\u0007\u0001\u0000\u0000\u0000\u00a9\u00ae\u00050\u0000\u0000\u00aa"+
		"\u00ab\u0005#\u0000\u0000\u00ab\u00ad\u00050\u0000\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\t\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0004"+
		"\u0000\u0000\u00b2\u00b3\u0005\u001f\u0000\u0000\u00b3\u00b4\u0005\r\u0000"+
		"\u0000\u00b4\u00b5\u0005!\u0000\u0000\u00b5\u00b6\u0005/\u0000\u0000\u00b6"+
		"\u00b7\u0005 \u0000\u0000\u00b7\u000b\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0005\u0003\u0000\u0000\u00b9\u00ba\u0005\u001f\u0000\u0000\u00ba\u00bb"+
		"\u0005\u001b\u0000\u0000\u00bb\u00c0\u0003\u000e\u0007\u0000\u00bc\u00bd"+
		"\u0005#\u0000\u0000\u00bd\u00bf\u0003\u000e\u0007\u0000\u00be\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005"+
		"\u001c\u0000\u0000\u00c4\u00c5\u0005 \u0000\u0000\u00c5\r\u0001\u0000"+
		"\u0000\u0000\u00c6\u00cd\u0003\u0010\b\u0000\u00c7\u00cd\u0003\u0012\t"+
		"\u0000\u00c8\u00cd\u0003\u0014\n\u0000\u00c9\u00cd\u0003\u0016\u000b\u0000"+
		"\u00ca\u00cd\u0003\u0018\f\u0000\u00cb\u00cd\u0003\u001a\r\u0000\u00cc"+
		"\u00c6\u0001\u0000\u0000\u0000\u00cc\u00c7\u0001\u0000\u0000\u0000\u00cc"+
		"\u00c8\u0001\u0000\u0000\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"\u000f\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0007\u0000\u0000\u00cf"+
		"\u00d0\u0005!\u0000\u0000\u00d0\u00d1\u0005/\u0000\u0000\u00d1\u0011\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0005\b\u0000\u0000\u00d3\u00d4\u0005!"+
		"\u0000\u0000\u00d4\u00d5\u0005-\u0000\u0000\u00d5\u0013\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0005\t\u0000\u0000\u00d7\u00d8\u0005!\u0000\u0000"+
		"\u00d8\u00d9\u0005\u001d\u0000\u0000\u00d9\u00de\u00050\u0000\u0000\u00da"+
		"\u00db\u0005#\u0000\u0000\u00db\u00dd\u00050\u0000\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005"+
		"\u001e\u0000\u0000\u00e2\u0015\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005"+
		"\u0010\u0000\u0000\u00e4\u00e5\u0005!\u0000\u0000\u00e5\u00e6\u0005\u001d"+
		"\u0000\u0000\u00e6\u00eb\u0005/\u0000\u0000\u00e7\u00e8\u0005#\u0000\u0000"+
		"\u00e8\u00ea\u0005/\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea"+
		"\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u001e\u0000\u0000\u00ef"+
		"\u0017\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u000b\u0000\u0000\u00f1"+
		"\u00f2\u0005!\u0000\u0000\u00f2\u00f3\u0005/\u0000\u0000\u00f3\u0019\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0005\f\u0000\u0000\u00f5\u00f6\u0005!"+
		"\u0000\u0000\u00f6\u00fa\u0005)\u0000\u0000\u00f7\u00f9\u0003\u001c\u000e"+
		"\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0005)\u0000\u0000\u00fe\u001b\u0001\u0000\u0000\u0000"+
		"\u00ff\u0104\u0003\u001e\u000f\u0000\u0100\u0104\u0003 \u0010\u0000\u0101"+
		"\u0104\u0003\"\u0011\u0000\u0102\u0104\u0003R)\u0000\u0103\u00ff\u0001"+
		"\u0000\u0000\u0000\u0103\u0100\u0001\u0000\u0000\u0000\u0103\u0101\u0001"+
		"\u0000\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u001d\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u00052\u0000\u0000\u0106\u010a\u0005\u0016"+
		"\u0000\u0000\u0107\u0109\u0003&\u0013\u0000\u0108\u0107\u0001\u0000\u0000"+
		"\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d\u0001\u0000\u0000"+
		"\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010e\u00053\u0000\u0000"+
		"\u010e\u001f\u0001\u0000\u0000\u0000\u010f\u0110\u00052\u0000\u0000\u0110"+
		"\u0114\u0005\u0018\u0000\u0000\u0111\u0113\u0003&\u0013\u0000\u0112\u0111"+
		"\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0117"+
		"\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u00053\u0000\u0000\u0118!\u0001\u0000\u0000\u0000\u0119\u011b\u0003$"+
		"\u0012\u0000\u011a\u011c\u0003N\'\u0000\u011b\u011a\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0003P(\u0000\u0120#\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u00052\u0000\u0000\u0122\u0126\u00050\u0000\u0000\u0123\u0125\u0003"+
		"&\u0013\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000"+
		"\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u00053\u0000\u0000\u012a%\u0001\u0000\u0000\u0000"+
		"\u012b\u0138\u0003(\u0014\u0000\u012c\u0138\u00038\u001c\u0000\u012d\u0138"+
		"\u0003:\u001d\u0000\u012e\u0138\u0003<\u001e\u0000\u012f\u0138\u0003>"+
		"\u001f\u0000\u0130\u0138\u0003@ \u0000\u0131\u0138\u0003B!\u0000\u0132"+
		"\u0138\u0003D\"\u0000\u0133\u0138\u0003F#\u0000\u0134\u0138\u0003H$\u0000"+
		"\u0135\u0138\u0003J%\u0000\u0136\u0138\u0003L&\u0000\u0137\u012b\u0001"+
		"\u0000\u0000\u0000\u0137\u012c\u0001\u0000\u0000\u0000\u0137\u012d\u0001"+
		"\u0000\u0000\u0000\u0137\u012e\u0001\u0000\u0000\u0000\u0137\u012f\u0001"+
		"\u0000\u0000\u0000\u0137\u0130\u0001\u0000\u0000\u0000\u0137\u0131\u0001"+
		"\u0000\u0000\u0000\u0137\u0132\u0001\u0000\u0000\u0000\u0137\u0133\u0001"+
		"\u0000\u0000\u0000\u0137\u0134\u0001\u0000\u0000\u0000\u0137\u0135\u0001"+
		"\u0000\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\'\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0005\u0010\u0000\u0000\u013a\u013b\u0005%\u0000"+
		"\u0000\u013b\u013f\u0005\'\u0000\u0000\u013c\u013e\u0003*\u0015\u0000"+
		"\u013d\u013c\u0001\u0000\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000"+
		"\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000"+
		"\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0005\'\u0000\u0000\u0143)\u0001\u0000\u0000\u0000\u0144"+
		"\u014a\u0003,\u0016\u0000\u0145\u014a\u0003.\u0017\u0000\u0146\u014a\u0003"+
		"0\u0018\u0000\u0147\u014a\u00034\u001a\u0000\u0148\u014a\u00036\u001b"+
		"\u0000\u0149\u0144\u0001\u0000\u0000\u0000\u0149\u0145\u0001\u0000\u0000"+
		"\u0000\u0149\u0146\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000"+
		"\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a+\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u00050\u0000\u0000\u014c\u014d\u0005!\u0000\u0000\u014d\u0152"+
		"\u00050\u0000\u0000\u014e\u014f\u0005#\u0000\u0000\u014f\u0151\u00050"+
		"\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000"+
		"\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000"+
		"\u0000\u0000\u0153\u0155\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0005\"\u0000\u0000\u0156-\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u00050\u0000\u0000\u0158\u0160\u0005!\u0000\u0000\u0159"+
		"\u015d\u00051\u0000\u0000\u015a\u015c\u00032\u0019\u0000\u015b\u015a\u0001"+
		"\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0161\u0001"+
		"\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0159\u0001"+
		"\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0005\"\u0000\u0000\u0165/\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\u00050\u0000\u0000\u0167\u0168\u0005!\u0000\u0000"+
		"\u0168\u016a\u00055\u0000\u0000\u0169\u016b\u00051\u0000\u0000\u016a\u0169"+
		"\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016d"+
		"\u0001\u0000\u0000\u0000\u016c\u016e\u00050\u0000\u0000\u016d\u016c\u0001"+
		"\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f\u0001"+
		"\u0000\u0000\u0000\u016f\u0170\u0005\"\u0000\u0000\u01701\u0001\u0000"+
		"\u0000\u0000\u0171\u017d\u0005\u000f\u0000\u0000\u0172\u017d\u00050\u0000"+
		"\u0000\u0173\u0175\u00055\u0000\u0000\u0174\u0176\u00051\u0000\u0000\u0175"+
		"\u0174\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176"+
		"\u0178\u0001\u0000\u0000\u0000\u0177\u0179\u00050\u0000\u0000\u0178\u0177"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017d"+
		"\u0001\u0000\u0000\u0000\u017a\u017d\u0005(\u0000\u0000\u017b\u017d\u0005"+
		"\u0012\u0000\u0000\u017c\u0171\u0001\u0000\u0000\u0000\u017c\u0172\u0001"+
		"\u0000\u0000\u0000\u017c\u0173\u0001\u0000\u0000\u0000\u017c\u017a\u0001"+
		"\u0000\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017d3\u0001\u0000"+
		"\u0000\u0000\u017e\u017f\u00050\u0000\u0000\u017f\u0180\u0005\"\u0000"+
		"\u0000\u01805\u0001\u0000\u0000\u0000\u0181\u0182\u0005\u001a\u0000\u0000"+
		"\u0182\u0183\u0005!\u0000\u0000\u0183\u0184\u00051\u0000\u0000\u0184\u0187"+
		"\u0005\u000f\u0000\u0000\u0185\u0186\u00051\u0000\u0000\u0186\u0188\u0005"+
		"\u000f\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001"+
		"\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0005"+
		"\"\u0000\u0000\u018a7\u0001\u0000\u0000\u0000\u018b\u018c\u0005\u001f"+
		"\u0000\u0000\u018c\u018d\u0005\u0011\u0000\u0000\u018d\u018e\u0005 \u0000"+
		"\u0000\u018e\u018f\u0005%\u0000\u0000\u018f\u0190\u0005\'\u0000\u0000"+
		"\u0190\u0191\u0003f3\u0000\u0191\u0192\u0005\'\u0000\u0000\u01929\u0001"+
		"\u0000\u0000\u0000\u0193\u0194\u0005\u0013\u0000\u0000\u0194\u0195\u0005"+
		"%\u0000\u0000\u0195\u0196\u0005/\u0000\u0000\u0196;\u0001\u0000\u0000"+
		"\u0000\u0197\u0198\u0005\u001d\u0000\u0000\u0198\u0199\u0005\u0013\u0000"+
		"\u0000\u0199\u019a\u0005\u001e\u0000\u0000\u019a\u019b\u0005%\u0000\u0000"+
		"\u019b\u019c\u0005\'\u0000\u0000\u019c\u019d\u0003T*\u0000\u019d\u019e"+
		"\u0005\'\u0000\u0000\u019e=\u0001\u0000\u0000\u0000\u019f\u01a0\u0005"+
		"\u0014\u0000\u0000\u01a0\u01a1\u0005%\u0000\u0000\u01a1\u01a2\u0005/\u0000"+
		"\u0000\u01a2?\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005\u001d\u0000\u0000"+
		"\u01a4\u01a5\u0005\u0014\u0000\u0000\u01a5\u01a6\u0005\u001e\u0000\u0000"+
		"\u01a6\u01a7\u0005%\u0000\u0000\u01a7\u01a8\u0005\'\u0000\u0000\u01a8"+
		"\u01ad\u0003T*\u0000\u01a9\u01aa\u00058\u0000\u0000\u01aa\u01ac\u0003"+
		"T*\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01af\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000"+
		"\u0000\u01ae\u01b0\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b1\u0005\'\u0000\u0000\u01b1A\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b3\u00058\u0000\u0000\u01b3\u01b4\u00050\u0000\u0000\u01b4\u01b5"+
		"\u0005%\u0000\u0000\u01b5\u01b6\u0005/\u0000\u0000\u01b6C\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b8\u0005\u0017\u0000\u0000\u01b8\u01b9\u0005%\u0000"+
		"\u0000\u01b9\u01ba\u0005/\u0000\u0000\u01baE\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bc\u0005\u001d\u0000\u0000\u01bc\u01bd\u0005\u001f\u0000\u0000\u01bd"+
		"\u01be\u00050\u0000\u0000\u01be\u01bf\u0005 \u0000\u0000\u01bf\u01c0\u0005"+
		"\u001e\u0000\u0000\u01c0\u01c1\u0005%\u0000\u0000\u01c1\u01c2\u0005\'"+
		"\u0000\u0000\u01c2\u01c3\u0003T*\u0000\u01c3\u01c4\u0005\'\u0000\u0000"+
		"\u01c4G\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005\u001f\u0000\u0000\u01c6"+
		"\u01c7\u0003T*\u0000\u01c7\u01c8\u0005 \u0000\u0000\u01c8\u01c9\u0005"+
		"%\u0000\u0000\u01c9\u01ca\u0005\'\u0000\u0000\u01ca\u01cb\u0003f3\u0000"+
		"\u01cb\u01cc\u0005\'\u0000\u0000\u01ccI\u0001\u0000\u0000\u0000\u01cd"+
		"\u01ce\u0005\u001d\u0000\u0000\u01ce\u01cf\u0005\u0010\u0000\u0000\u01cf"+
		"\u01d0\u0005$\u0000\u0000\u01d0\u01d1\u0003T*\u0000\u01d1\u01d2\u0005"+
		"\u001e\u0000\u0000\u01d2\u01d3\u0005%\u0000\u0000\u01d3\u01d4\u0005\'"+
		"\u0000\u0000\u01d4\u01d5\u0003T*\u0000\u01d5\u01d6\u0005+\u0000\u0000"+
		"\u01d6\u01d7\u0003T*\u0000\u01d7\u01d8\u0005!\u0000\u0000\u01d8\u01d9"+
		"\u0003T*\u0000\u01d9\u01da\u0005\'\u0000\u0000\u01daK\u0001\u0000\u0000"+
		"\u0000\u01db\u01dc\u0005\u0019\u0000\u0000\u01dc\u01dd\u0005%\u0000\u0000"+
		"\u01dd\u01de\u0005/\u0000\u0000\u01deM\u0001\u0000\u0000\u0000\u01df\u01f3"+
		"\u0003\"\u0011\u0000\u01e0\u01f3\u0003\u001e\u000f\u0000\u01e1\u01f3\u0003"+
		" \u0010\u0000\u01e2\u01f3\u0003R)\u0000\u01e3\u01e5\u0003T*\u0000\u01e4"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e9\u0001\u0000\u0000\u0000\u01e8\u01ea\u0005*\u0000\u0000\u01e9\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01f3"+
		"\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005\u001b\u0000\u0000\u01ec\u01ed"+
		"\u0005\u001b\u0000\u0000\u01ed\u01ee\u0003T*\u0000\u01ee\u01ef\u0005\u001c"+
		"\u0000\u0000\u01ef\u01f0\u0005\u001c\u0000\u0000\u01f0\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f3\u00058\u0000\u0000\u01f2\u01df\u0001\u0000\u0000"+
		"\u0000\u01f2\u01e0\u0001\u0000\u0000\u0000\u01f2\u01e1\u0001\u0000\u0000"+
		"\u0000\u01f2\u01e2\u0001\u0000\u0000\u0000\u01f2\u01e4\u0001\u0000\u0000"+
		"\u0000\u01f2\u01eb\u0001\u0000\u0000\u0000\u01f2\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f3O\u0001\u0000\u0000\u0000\u01f4\u01f5\u00052\u0000\u0000\u01f5"+
		"\u01f6\u00054\u0000\u0000\u01f6\u01f7\u00050\u0000\u0000\u01f7\u01f8\u0005"+
		"3\u0000\u0000\u01f8Q\u0001\u0000\u0000\u0000\u01f9\u01fa\u00052\u0000"+
		"\u0000\u01fa\u01fb\u0005*\u0000\u0000\u01fb\u01fc\u00058\u0000\u0000\u01fc"+
		"\u0200\u00058\u0000\u0000\u01fd\u01ff\u0003T*\u0000\u01fe\u01fd\u0001"+
		"\u0000\u0000\u0000\u01ff\u0202\u0001\u0000\u0000\u0000\u0200\u01fe\u0001"+
		"\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0203\u0001"+
		"\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0203\u0204\u0005"+
		"8\u0000\u0000\u0204\u0205\u00058\u0000\u0000\u0205\u0206\u00053\u0000"+
		"\u0000\u0206S\u0001\u0000\u0000\u0000\u0207\u020b\u0003V+\u0000\u0208"+
		"\u020b\u0005/\u0000\u0000\u0209\u020b\u00051\u0000\u0000\u020a\u0207\u0001"+
		"\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u0209\u0001"+
		"\u0000\u0000\u0000\u020bU\u0001\u0000\u0000\u0000\u020c\u0211\u00050\u0000"+
		"\u0000\u020d\u020e\u0005$\u0000\u0000\u020e\u0210\u00050\u0000\u0000\u020f"+
		"\u020d\u0001\u0000\u0000\u0000\u0210\u0213\u0001\u0000\u0000\u0000\u0211"+
		"\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212"+
		"W\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0214\u0215"+
		"\u0005\u0005\u0000\u0000\u0215\u0216\u0005\u0006\u0000\u0000\u0216\u0217"+
		"\u00050\u0000\u0000\u0217\u021b\u0005\u001b\u0000\u0000\u0218\u021a\u0003"+
		"Z-\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u021a\u021d\u0001\u0000\u0000"+
		"\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000"+
		"\u0000\u021c\u021e\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000"+
		"\u0000\u021e\u021f\u0005\u001c\u0000\u0000\u021fY\u0001\u0000\u0000\u0000"+
		"\u0220\u0224\u0003\\.\u0000\u0221\u0224\u0003^/\u0000\u0222\u0224\u0003"+
		"`0\u0000\u0223\u0220\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000"+
		"\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u0224[\u0001\u0000\u0000\u0000"+
		"\u0225\u0226\u00050\u0000\u0000\u0226\u0227\u0005%\u0000\u0000\u0227\u0228"+
		"\u0003T*\u0000\u0228\u0229\u0005\"\u0000\u0000\u0229]\u0001\u0000\u0000"+
		"\u0000\u022a\u022b\u00050\u0000\u0000\u022b\u022c\u0005!\u0000\u0000\u022c"+
		"\u022d\u00050\u0000\u0000\u022d\u022e\u0005\u001d\u0000\u0000\u022e\u022f"+
		"\u0005\u001e\u0000\u0000\u022f\u0230\u0005%\u0000\u0000\u0230\u0231\u0005"+
		"\u001d\u0000\u0000\u0231\u0232\u0005\u001e\u0000\u0000\u0232\u0233\u0005"+
		"\"\u0000\u0000\u0233_\u0001\u0000\u0000\u0000\u0234\u0235\u00050\u0000"+
		"\u0000\u0235\u0237\u0005\u001f\u0000\u0000\u0236\u0238\u0003b1\u0000\u0237"+
		"\u0236\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238"+
		"\u0239\u0001\u0000\u0000\u0000\u0239\u023a\u0005 \u0000\u0000\u023a\u023e"+
		"\u0005\u001b\u0000\u0000\u023b\u023d\u0003r9\u0000\u023c\u023b\u0001\u0000"+
		"\u0000\u0000\u023d\u0240\u0001\u0000\u0000\u0000\u023e\u023c\u0001\u0000"+
		"\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0241\u0001\u0000"+
		"\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0241\u0242\u0005\u001c"+
		"\u0000\u0000\u0242a\u0001\u0000\u0000\u0000\u0243\u0248\u0003d2\u0000"+
		"\u0244\u0245\u0005#\u0000\u0000\u0245\u0247\u0003d2\u0000\u0246\u0244"+
		"\u0001\u0000\u0000\u0000\u0247\u024a\u0001\u0000\u0000\u0000\u0248\u0246"+
		"\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249c\u0001"+
		"\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024b\u024c\u0005"+
		"0\u0000\u0000\u024c\u024d\u0005!\u0000\u0000\u024d\u024e\u00050\u0000"+
		"\u0000\u024ee\u0001\u0000\u0000\u0000\u024f\u0250\u0003T*\u0000\u0250"+
		"\u0252\u0005\u001f\u0000\u0000\u0251\u0253\u0003h4\u0000\u0252\u0251\u0001"+
		"\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0254\u0001"+
		"\u0000\u0000\u0000\u0254\u0255\u0005 \u0000\u0000\u0255g\u0001\u0000\u0000"+
		"\u0000\u0256\u025a\u0003j5\u0000\u0257\u025a\u0003l6\u0000\u0258\u025a"+
		"\u0003p8\u0000\u0259\u0256\u0001\u0000\u0000\u0000\u0259\u0257\u0001\u0000"+
		"\u0000\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u025ai\u0001\u0000\u0000"+
		"\u0000\u025b\u0260\u0003T*\u0000\u025c\u025d\u0005#\u0000\u0000\u025d"+
		"\u025f\u0003T*\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025f\u0262\u0001"+
		"\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0260\u0261\u0001"+
		"\u0000\u0000\u0000\u0261k\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000"+
		"\u0000\u0000\u0263\u026c\u0005\u001b\u0000\u0000\u0264\u0269\u0003n7\u0000"+
		"\u0265\u0266\u0005#\u0000\u0000\u0266\u0268\u0003n7\u0000\u0267\u0265"+
		"\u0001\u0000\u0000\u0000\u0268\u026b\u0001\u0000\u0000\u0000\u0269\u0267"+
		"\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026d"+
		"\u0001\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u0264"+
		"\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u026e"+
		"\u0001\u0000\u0000\u0000\u026e\u026f\u0005\u001c\u0000\u0000\u026fm\u0001"+
		"\u0000\u0000\u0000\u0270\u0271\u00050\u0000\u0000\u0271\u0274\u0005!\u0000"+
		"\u0000\u0272\u0275\u0003f3\u0000\u0273\u0275\u0005-\u0000\u0000\u0274"+
		"\u0272\u0001\u0000\u0000\u0000\u0274\u0273\u0001\u0000\u0000\u0000\u0275"+
		"o\u0001\u0000\u0000\u0000\u0276\u0277\u00050\u0000\u0000\u0277\u0278\u0005"+
		"%\u0000\u0000\u0278\u0279\u00053\u0000\u0000\u0279\u027a\u0003T*\u0000"+
		"\u027a\u027b\u0005*\u0000\u0000\u027b\u027c\u0005%\u0000\u0000\u027c\u027d"+
		"\u0005%\u0000\u0000\u027d\u027e\u0003T*\u0000\u027eq\u0001\u0000\u0000"+
		"\u0000\u027f\u0283\u0003t:\u0000\u0280\u0283\u0003v;\u0000\u0281\u0283"+
		"\u0003|>\u0000\u0282\u027f\u0001\u0000\u0000\u0000\u0282\u0280\u0001\u0000"+
		"\u0000\u0000\u0282\u0281\u0001\u0000\u0000\u0000\u0283s\u0001\u0000\u0000"+
		"\u0000\u0284\u0285\u0005.\u0000\u0000\u0285\u0286\u0003T*\u0000\u0286"+
		"\u0287\u0005\"\u0000\u0000\u0287u\u0001\u0000\u0000\u0000\u0288\u028b"+
		"\u0003x<\u0000\u0289\u028b\u0003z=\u0000\u028a\u0288\u0001\u0000\u0000"+
		"\u0000\u028a\u0289\u0001\u0000\u0000\u0000\u028bw\u0001\u0000\u0000\u0000"+
		"\u028c\u028d\u0003T*\u0000\u028d\u0290\u0005%\u0000\u0000\u028e\u0291"+
		"\u0003T*\u0000\u028f\u0291\u0003f3\u0000\u0290\u028e\u0001\u0000\u0000"+
		"\u0000\u0290\u028f\u0001\u0000\u0000\u0000\u0291\u0292\u0001\u0000\u0000"+
		"\u0000\u0292\u0293\u0005\"\u0000\u0000\u0293y\u0001\u0000\u0000\u0000"+
		"\u0294\u0295\u0003T*\u0000\u0295\u0296\u00058\u0000\u0000\u0296\u0297"+
		"\u00058\u0000\u0000\u0297\u0298\u0005\"\u0000\u0000\u0298{\u0001\u0000"+
		"\u0000\u0000\u0299\u029a\u0005\u0015\u0000\u0000\u029a\u029c\u0005\u001f"+
		"\u0000\u0000\u029b\u029d\u0003~?\u0000\u029c\u029b\u0001\u0000\u0000\u0000"+
		"\u029c\u029d\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000"+
		"\u029e\u029f\u0005 \u0000\u0000\u029f\u02a3\u0005\u001b\u0000\u0000\u02a0"+
		"\u02a2\u0003\u0080@\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a5"+
		"\u0001\u0000\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a4"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a6\u0001\u0000\u0000\u0000\u02a5\u02a3"+
		"\u0001\u0000\u0000\u0000\u02a6\u02a7\u0005\u001c\u0000\u0000\u02a7}\u0001"+
		"\u0000\u0000\u0000\u02a8\u02a9\u0003f3\u0000\u02a9\u007f\u0001\u0000\u0000"+
		"\u0000\u02aa\u02ab\u0003f3\u0000\u02ab\u02ac\u0005\"\u0000\u0000\u02ac"+
		"\u02af\u0001\u0000\u0000\u0000\u02ad\u02af\u0003x<\u0000\u02ae\u02aa\u0001"+
		"\u0000\u0000\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000\u02af\u0081\u0001"+
		"\u0000\u0000\u00003\u0085\u008b\u0092\u009c\u00ae\u00c0\u00cc\u00de\u00eb"+
		"\u00fa\u0103\u010a\u0114\u011d\u0126\u0137\u013f\u0149\u0152\u015d\u0162"+
		"\u016a\u016d\u0175\u0178\u017c\u0187\u01ad\u01e6\u01e9\u01f2\u0200\u020a"+
		"\u0211\u021b\u0223\u0237\u023e\u0248\u0252\u0259\u0260\u0269\u026c\u0274"+
		"\u0282\u028a\u0290\u029c\u02a3\u02ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}