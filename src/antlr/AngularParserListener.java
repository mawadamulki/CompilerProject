// Generated from C:/Users/ROG STRIX/IdeaProjects/Compiler1ProjectComplete/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#app}.
	 * @param ctx the parse tree
	 */
	void enterApp(AngularParser.AppContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#app}.
	 * @param ctx the parse tree
	 */
	void exitApp(AngularParser.AppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code appInterface}
	 * labeled alternative in {@link AngularParser#appContent}.
	 * @param ctx the parse tree
	 */
	void enterAppInterface(AngularParser.AppInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code appInterface}
	 * labeled alternative in {@link AngularParser#appContent}.
	 * @param ctx the parse tree
	 */
	void exitAppInterface(AngularParser.AppInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code appComponent}
	 * labeled alternative in {@link AngularParser#appContent}.
	 * @param ctx the parse tree
	 */
	void enterAppComponent(AngularParser.AppComponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code appComponent}
	 * labeled alternative in {@link AngularParser#appContent}.
	 * @param ctx the parse tree
	 */
	void exitAppComponent(AngularParser.AppComponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code appService}
	 * labeled alternative in {@link AngularParser#appContent}.
	 * @param ctx the parse tree
	 */
	void enterAppService(AngularParser.AppServiceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code appService}
	 * labeled alternative in {@link AngularParser#appContent}.
	 * @param ctx the parse tree
	 */
	void exitAppService(AngularParser.AppServiceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code appClass}
	 * labeled alternative in {@link AngularParser#appContent}.
	 * @param ctx the parse tree
	 */
	void enterAppClass(AngularParser.AppClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code appClass}
	 * labeled alternative in {@link AngularParser#appContent}.
	 * @param ctx the parse tree
	 */
	void exitAppClass(AngularParser.AppClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceDecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDecl(AngularParser.InterfaceDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceDecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDecl(AngularParser.InterfaceDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importItems}.
	 * @param ctx the parse tree
	 */
	void enterImportItems(AngularParser.ImportItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importItems}.
	 * @param ctx the parse tree
	 */
	void exitImportItems(AngularParser.ImportItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#serviceDecl}.
	 * @param ctx the parse tree
	 */
	void enterServiceDecl(AngularParser.ServiceDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#serviceDecl}.
	 * @param ctx the parse tree
	 */
	void exitServiceDecl(AngularParser.ServiceDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentDecl}.
	 * @param ctx the parse tree
	 */
	void enterComponentDecl(AngularParser.ComponentDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentDecl}.
	 * @param ctx the parse tree
	 */
	void exitComponentDecl(AngularParser.ComponentDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code componentSelector}
	 * labeled alternative in {@link AngularParser#componentdata}.
	 * @param ctx the parse tree
	 */
	void enterComponentSelector(AngularParser.ComponentSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code componentSelector}
	 * labeled alternative in {@link AngularParser#componentdata}.
	 * @param ctx the parse tree
	 */
	void exitComponentSelector(AngularParser.ComponentSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code componentStandalone}
	 * labeled alternative in {@link AngularParser#componentdata}.
	 * @param ctx the parse tree
	 */
	void enterComponentStandalone(AngularParser.ComponentStandaloneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code componentStandalone}
	 * labeled alternative in {@link AngularParser#componentdata}.
	 * @param ctx the parse tree
	 */
	void exitComponentStandalone(AngularParser.ComponentStandaloneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code componentImports}
	 * labeled alternative in {@link AngularParser#componentdata}.
	 * @param ctx the parse tree
	 */
	void enterComponentImports(AngularParser.ComponentImportsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code componentImports}
	 * labeled alternative in {@link AngularParser#componentdata}.
	 * @param ctx the parse tree
	 */
	void exitComponentImports(AngularParser.ComponentImportsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code componentStyleUrl}
	 * labeled alternative in {@link AngularParser#componentdata}.
	 * @param ctx the parse tree
	 */
	void enterComponentStyleUrl(AngularParser.ComponentStyleUrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code componentStyleUrl}
	 * labeled alternative in {@link AngularParser#componentdata}.
	 * @param ctx the parse tree
	 */
	void exitComponentStyleUrl(AngularParser.ComponentStyleUrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code componentTamplateUrl}
	 * labeled alternative in {@link AngularParser#componentdata}.
	 * @param ctx the parse tree
	 */
	void enterComponentTamplateUrl(AngularParser.ComponentTamplateUrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code componentTamplateUrl}
	 * labeled alternative in {@link AngularParser#componentdata}.
	 * @param ctx the parse tree
	 */
	void exitComponentTamplateUrl(AngularParser.ComponentTamplateUrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code componentTamplate}
	 * labeled alternative in {@link AngularParser#componentdata}.
	 * @param ctx the parse tree
	 */
	void enterComponentTamplate(AngularParser.ComponentTamplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code componentTamplate}
	 * labeled alternative in {@link AngularParser#componentdata}.
	 * @param ctx the parse tree
	 */
	void exitComponentTamplate(AngularParser.ComponentTamplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(AngularParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(AngularParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#standalone}.
	 * @param ctx the parse tree
	 */
	void enterStandalone(AngularParser.StandaloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#standalone}.
	 * @param ctx the parse tree
	 */
	void exitStandalone(AngularParser.StandaloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(AngularParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(AngularParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styleUrls}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrls(AngularParser.StyleUrlsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styleUrls}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrls(AngularParser.StyleUrlsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#templateUrl}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUrl(AngularParser.TemplateUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#templateUrl}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUrl(AngularParser.TemplateUrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#templateDecl}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDecl(AngularParser.TemplateDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#templateDecl}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDecl(AngularParser.TemplateDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlImage}
	 * labeled alternative in {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtmlImage(AngularParser.HtmlImageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlImage}
	 * labeled alternative in {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtmlImage(AngularParser.HtmlImageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlInput}
	 * labeled alternative in {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtmlInput(AngularParser.HtmlInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlInput}
	 * labeled alternative in {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtmlInput(AngularParser.HtmlInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlComplete}
	 * labeled alternative in {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComplete(AngularParser.HtmlCompleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlComplete}
	 * labeled alternative in {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComplete(AngularParser.HtmlCompleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlComment}
	 * labeled alternative in {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(AngularParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlComment}
	 * labeled alternative in {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(AngularParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#imageTag}.
	 * @param ctx the parse tree
	 */
	void enterImageTag(AngularParser.ImageTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#imageTag}.
	 * @param ctx the parse tree
	 */
	void exitImageTag(AngularParser.ImageTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#inputTag}.
	 * @param ctx the parse tree
	 */
	void enterInputTag(AngularParser.InputTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#inputTag}.
	 * @param ctx the parse tree
	 */
	void exitInputTag(AngularParser.InputTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#completeTag}.
	 * @param ctx the parse tree
	 */
	void enterCompleteTag(AngularParser.CompleteTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#completeTag}.
	 * @param ctx the parse tree
	 */
	void exitCompleteTag(AngularParser.CompleteTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(AngularParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(AngularParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttStyling}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttStyling(AngularParser.HtmlAttStylingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttStyling}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttStyling(AngularParser.HtmlAttStylingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttClick}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttClick(AngularParser.HtmlAttClickContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttClick}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttClick(AngularParser.HtmlAttClickContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttSrc}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttSrc(AngularParser.HtmlAttSrcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttSrc}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttSrc(AngularParser.HtmlAttSrcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttSrcFunc}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttSrcFunc(AngularParser.HtmlAttSrcFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttSrcFunc}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttSrcFunc(AngularParser.HtmlAttSrcFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttAlt}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttAlt(AngularParser.HtmlAttAltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttAlt}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttAlt(AngularParser.HtmlAttAltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttAltFunc}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttAltFunc(AngularParser.HtmlAttAltFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttAltFunc}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttAltFunc(AngularParser.HtmlAttAltFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttStarEle}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttStarEle(AngularParser.HtmlAttStarEleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttStarEle}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttStarEle(AngularParser.HtmlAttStarEleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttType}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttType(AngularParser.HtmlAttTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttType}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttType(AngularParser.HtmlAttTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttBrack2}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttBrack2(AngularParser.HtmlAttBrack2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttBrack2}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttBrack2(AngularParser.HtmlAttBrack2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttBrack1}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttBrack1(AngularParser.HtmlAttBrack1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttBrack1}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttBrack1(AngularParser.HtmlAttBrack1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttQuestion}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttQuestion(AngularParser.HtmlAttQuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttQuestion}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttQuestion(AngularParser.HtmlAttQuestionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttPlaceholder}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttPlaceholder(AngularParser.HtmlAttPlaceholderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttPlaceholder}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttPlaceholder(AngularParser.HtmlAttPlaceholderContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styling}.
	 * @param ctx the parse tree
	 */
	void enterStyling(AngularParser.StylingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styling}.
	 * @param ctx the parse tree
	 */
	void exitStyling(AngularParser.StylingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleElementAssign}
	 * labeled alternative in {@link AngularParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElementAssign(AngularParser.StyleElementAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleElementAssign}
	 * labeled alternative in {@link AngularParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElementAssign(AngularParser.StyleElementAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleElementNumber}
	 * labeled alternative in {@link AngularParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElementNumber(AngularParser.StyleElementNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleElementNumber}
	 * labeled alternative in {@link AngularParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElementNumber(AngularParser.StyleElementNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleElementColor}
	 * labeled alternative in {@link AngularParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElementColor(AngularParser.StyleElementColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleElementColor}
	 * labeled alternative in {@link AngularParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElementColor(AngularParser.StyleElementColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleElementOnly}
	 * labeled alternative in {@link AngularParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElementOnly(AngularParser.StyleElementOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleElementOnly}
	 * labeled alternative in {@link AngularParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElementOnly(AngularParser.StyleElementOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleElementPadding}
	 * labeled alternative in {@link AngularParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElementPadding(AngularParser.StyleElementPaddingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleElementPadding}
	 * labeled alternative in {@link AngularParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElementPadding(AngularParser.StyleElementPaddingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styleAssign}.
	 * @param ctx the parse tree
	 */
	void enterStyleAssign(AngularParser.StyleAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styleAssign}.
	 * @param ctx the parse tree
	 */
	void exitStyleAssign(AngularParser.StyleAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styleNumber}.
	 * @param ctx the parse tree
	 */
	void enterStyleNumber(AngularParser.StyleNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styleNumber}.
	 * @param ctx the parse tree
	 */
	void exitStyleNumber(AngularParser.StyleNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styleColor}.
	 * @param ctx the parse tree
	 */
	void enterStyleColor(AngularParser.StyleColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styleColor}.
	 * @param ctx the parse tree
	 */
	void exitStyleColor(AngularParser.StyleColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extenPixil}
	 * labeled alternative in {@link AngularParser#extention}.
	 * @param ctx the parse tree
	 */
	void enterExtenPixil(AngularParser.ExtenPixilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extenPixil}
	 * labeled alternative in {@link AngularParser#extention}.
	 * @param ctx the parse tree
	 */
	void exitExtenPixil(AngularParser.ExtenPixilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extenId}
	 * labeled alternative in {@link AngularParser#extention}.
	 * @param ctx the parse tree
	 */
	void enterExtenId(AngularParser.ExtenIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extenId}
	 * labeled alternative in {@link AngularParser#extention}.
	 * @param ctx the parse tree
	 */
	void exitExtenId(AngularParser.ExtenIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extenHex}
	 * labeled alternative in {@link AngularParser#extention}.
	 * @param ctx the parse tree
	 */
	void enterExtenHex(AngularParser.ExtenHexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extenHex}
	 * labeled alternative in {@link AngularParser#extention}.
	 * @param ctx the parse tree
	 */
	void exitExtenHex(AngularParser.ExtenHexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extenPercent}
	 * labeled alternative in {@link AngularParser#extention}.
	 * @param ctx the parse tree
	 */
	void enterExtenPercent(AngularParser.ExtenPercentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extenPercent}
	 * labeled alternative in {@link AngularParser#extention}.
	 * @param ctx the parse tree
	 */
	void exitExtenPercent(AngularParser.ExtenPercentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extenAuto}
	 * labeled alternative in {@link AngularParser#extention}.
	 * @param ctx the parse tree
	 */
	void enterExtenAuto(AngularParser.ExtenAutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extenAuto}
	 * labeled alternative in {@link AngularParser#extention}.
	 * @param ctx the parse tree
	 */
	void exitExtenAuto(AngularParser.ExtenAutoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styleOnly}.
	 * @param ctx the parse tree
	 */
	void enterStyleOnly(AngularParser.StyleOnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styleOnly}.
	 * @param ctx the parse tree
	 */
	void exitStyleOnly(AngularParser.StyleOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#stylePadding}.
	 * @param ctx the parse tree
	 */
	void enterStylePadding(AngularParser.StylePaddingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#stylePadding}.
	 * @param ctx the parse tree
	 */
	void exitStylePadding(AngularParser.StylePaddingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#click}.
	 * @param ctx the parse tree
	 */
	void enterClick(AngularParser.ClickContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#click}.
	 * @param ctx the parse tree
	 */
	void exitClick(AngularParser.ClickContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#src}.
	 * @param ctx the parse tree
	 */
	void enterSrc(AngularParser.SrcContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#src}.
	 * @param ctx the parse tree
	 */
	void exitSrc(AngularParser.SrcContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#srcFunc}.
	 * @param ctx the parse tree
	 */
	void enterSrcFunc(AngularParser.SrcFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#srcFunc}.
	 * @param ctx the parse tree
	 */
	void exitSrcFunc(AngularParser.SrcFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#alt}.
	 * @param ctx the parse tree
	 */
	void enterAlt(AngularParser.AltContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#alt}.
	 * @param ctx the parse tree
	 */
	void exitAlt(AngularParser.AltContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#altFunc}.
	 * @param ctx the parse tree
	 */
	void enterAltFunc(AngularParser.AltFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#altFunc}.
	 * @param ctx the parse tree
	 */
	void exitAltFunc(AngularParser.AltFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#starEle}.
	 * @param ctx the parse tree
	 */
	void enterStarEle(AngularParser.StarEleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#starEle}.
	 * @param ctx the parse tree
	 */
	void exitStarEle(AngularParser.StarEleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AngularParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AngularParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#bracket2Ele}.
	 * @param ctx the parse tree
	 */
	void enterBracket2Ele(AngularParser.Bracket2EleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#bracket2Ele}.
	 * @param ctx the parse tree
	 */
	void exitBracket2Ele(AngularParser.Bracket2EleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#bracket1Ele}.
	 * @param ctx the parse tree
	 */
	void enterBracket1Ele(AngularParser.Bracket1EleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#bracket1Ele}.
	 * @param ctx the parse tree
	 */
	void exitBracket1Ele(AngularParser.Bracket1EleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#questionEle}.
	 * @param ctx the parse tree
	 */
	void enterQuestionEle(AngularParser.QuestionEleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#questionEle}.
	 * @param ctx the parse tree
	 */
	void exitQuestionEle(AngularParser.QuestionEleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholder(AngularParser.PlaceholderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholder(AngularParser.PlaceholderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagBodyCompleteTag}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 */
	void enterTagBodyCompleteTag(AngularParser.TagBodyCompleteTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagBodyCompleteTag}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 */
	void exitTagBodyCompleteTag(AngularParser.TagBodyCompleteTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagBodyImageTag}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 */
	void enterTagBodyImageTag(AngularParser.TagBodyImageTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagBodyImageTag}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 */
	void exitTagBodyImageTag(AngularParser.TagBodyImageTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagBodyInputTag}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 */
	void enterTagBodyInputTag(AngularParser.TagBodyInputTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagBodyInputTag}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 */
	void exitTagBodyInputTag(AngularParser.TagBodyInputTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagBodyCommentTag}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 */
	void enterTagBodyCommentTag(AngularParser.TagBodyCommentTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagBodyCommentTag}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 */
	void exitTagBodyCommentTag(AngularParser.TagBodyCommentTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagBodyExpressionExc}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 */
	void enterTagBodyExpressionExc(AngularParser.TagBodyExpressionExcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagBodyExpressionExc}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 */
	void exitTagBodyExpressionExc(AngularParser.TagBodyExpressionExcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagBodyExpression}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 */
	void enterTagBodyExpression(AngularParser.TagBodyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagBodyExpression}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 */
	void exitTagBodyExpression(AngularParser.TagBodyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagBodyOperation}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 */
	void enterTagBodyOperation(AngularParser.TagBodyOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagBodyOperation}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 */
	void exitTagBodyOperation(AngularParser.TagBodyOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(AngularParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(AngularParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#commentTag}.
	 * @param ctx the parse tree
	 */
	void enterCommentTag(AngularParser.CommentTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#commentTag}.
	 * @param ctx the parse tree
	 */
	void exitCommentTag(AngularParser.CommentTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expId}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpId(AngularParser.ExpIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expId}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpId(AngularParser.ExpIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expString}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpString(AngularParser.ExpStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expString}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpString(AngularParser.ExpStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNumber}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpNumber(AngularParser.ExpNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNumber}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpNumber(AngularParser.ExpNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#dotIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterDotIdentifier(AngularParser.DotIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#dotIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitDotIdentifier(AngularParser.DotIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(AngularParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(AngularParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classBodyVariable}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyVariable(AngularParser.ClassBodyVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classBodyVariable}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyVariable(AngularParser.ClassBodyVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classBodyArray}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyArray(AngularParser.ClassBodyArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classBodyArray}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyArray(AngularParser.ClassBodyArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classBodyFunc}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyFunc(AngularParser.ClassBodyFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classBodyFunc}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyFunc(AngularParser.ClassBodyFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(AngularParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(AngularParser.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDecl(AngularParser.ArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDecl(AngularParser.ArrayDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(AngularParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(AngularParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(AngularParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(AngularParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngularParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallBodyexp}
	 * labeled alternative in {@link AngularParser#functionCallBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallBodyexp(AngularParser.FuncCallBodyexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallBodyexp}
	 * labeled alternative in {@link AngularParser#functionCallBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallBodyexp(AngularParser.FuncCallBodyexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallBodyBracketBody}
	 * labeled alternative in {@link AngularParser#functionCallBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallBodyBracketBody(AngularParser.FuncCallBodyBracketBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallBodyBracketBody}
	 * labeled alternative in {@link AngularParser#functionCallBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallBodyBracketBody(AngularParser.FuncCallBodyBracketBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallBodySpecial}
	 * labeled alternative in {@link AngularParser#functionCallBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallBodySpecial(AngularParser.FuncCallBodySpecialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallBodySpecial}
	 * labeled alternative in {@link AngularParser#functionCallBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallBodySpecial(AngularParser.FuncCallBodySpecialContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBody(AngularParser.ExpressionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBody(AngularParser.ExpressionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#bracketBody}.
	 * @param ctx the parse tree
	 */
	void enterBracketBody(AngularParser.BracketBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#bracketBody}.
	 * @param ctx the parse tree
	 */
	void exitBracketBody(AngularParser.BracketBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(AngularParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(AngularParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#special}.
	 * @param ctx the parse tree
	 */
	void enterSpecial(AngularParser.SpecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#special}.
	 * @param ctx the parse tree
	 */
	void exitSpecial(AngularParser.SpecialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcBodyReturn}
	 * labeled alternative in {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBodyReturn(AngularParser.FuncBodyReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcBodyReturn}
	 * labeled alternative in {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBodyReturn(AngularParser.FuncBodyReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcBodyStatement}
	 * labeled alternative in {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBodyStatement(AngularParser.FuncBodyStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcBodyStatement}
	 * labeled alternative in {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBodyStatement(AngularParser.FuncBodyStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcBodyIf}
	 * labeled alternative in {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBodyIf(AngularParser.FuncBodyIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcBodyIf}
	 * labeled alternative in {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBodyIf(AngularParser.FuncBodyIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(AngularParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(AngularParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AngularParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AngularParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(AngularParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(AngularParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#plusStatement}.
	 * @param ctx the parse tree
	 */
	void enterPlusStatement(AngularParser.PlusStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#plusStatement}.
	 * @param ctx the parse tree
	 */
	void exitPlusStatement(AngularParser.PlusStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(AngularParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(AngularParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(AngularParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(AngularParser.IfBodyContext ctx);
}