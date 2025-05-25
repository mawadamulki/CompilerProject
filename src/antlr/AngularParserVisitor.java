// Generated from C:/Users/ROG STRIX/IdeaProjects/Compiler1ProjectComplete/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(AngularParser.AppContext ctx);
	/**
	 * Visit a parse tree produced by the {@code appInterface}
	 * labeled alternative in {@link AngularParser#appContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppInterface(AngularParser.AppInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code appComponent}
	 * labeled alternative in {@link AngularParser#appContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppComponent(AngularParser.AppComponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code appService}
	 * labeled alternative in {@link AngularParser#appContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppService(AngularParser.AppServiceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code appClass}
	 * labeled alternative in {@link AngularParser#appContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppClass(AngularParser.AppClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDecl(AngularParser.InterfaceDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportItems(AngularParser.ImportItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#serviceDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceDecl(AngularParser.ServiceDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDecl(AngularParser.ComponentDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code componentSelector}
	 * labeled alternative in {@link AngularParser#componentdata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentSelector(AngularParser.ComponentSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code componentStandalone}
	 * labeled alternative in {@link AngularParser#componentdata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentStandalone(AngularParser.ComponentStandaloneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code componentImports}
	 * labeled alternative in {@link AngularParser#componentdata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentImports(AngularParser.ComponentImportsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code componentStyleUrl}
	 * labeled alternative in {@link AngularParser#componentdata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentStyleUrl(AngularParser.ComponentStyleUrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code componentTamplateUrl}
	 * labeled alternative in {@link AngularParser#componentdata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentTamplateUrl(AngularParser.ComponentTamplateUrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code componentTamplate}
	 * labeled alternative in {@link AngularParser#componentdata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentTamplate(AngularParser.ComponentTamplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(AngularParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#standalone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalone(AngularParser.StandaloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(AngularParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styleUrls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrls(AngularParser.StyleUrlsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#templateUrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateUrl(AngularParser.TemplateUrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#templateDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDecl(AngularParser.TemplateDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlImage}
	 * labeled alternative in {@link AngularParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlImage(AngularParser.HtmlImageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlInput}
	 * labeled alternative in {@link AngularParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlInput(AngularParser.HtmlInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlComplete}
	 * labeled alternative in {@link AngularParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComplete(AngularParser.HtmlCompleteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlComment}
	 * labeled alternative in {@link AngularParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(AngularParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#imageTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageTag(AngularParser.ImageTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#inputTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputTag(AngularParser.InputTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#completeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompleteTag(AngularParser.CompleteTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(AngularParser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttStyling}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttStyling(AngularParser.HtmlAttStylingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttClick}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttClick(AngularParser.HtmlAttClickContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttSrc}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttSrc(AngularParser.HtmlAttSrcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttSrcFunc}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttSrcFunc(AngularParser.HtmlAttSrcFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttAlt}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttAlt(AngularParser.HtmlAttAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttAltFunc}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttAltFunc(AngularParser.HtmlAttAltFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttStarEle}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttStarEle(AngularParser.HtmlAttStarEleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttType}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttType(AngularParser.HtmlAttTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttBrack2}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttBrack2(AngularParser.HtmlAttBrack2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttBrack1}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttBrack1(AngularParser.HtmlAttBrack1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttQuestion}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttQuestion(AngularParser.HtmlAttQuestionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttPlaceholder}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttPlaceholder(AngularParser.HtmlAttPlaceholderContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyling(AngularParser.StylingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleElementAssign}
	 * labeled alternative in {@link AngularParser#styleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElementAssign(AngularParser.StyleElementAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleElementNumber}
	 * labeled alternative in {@link AngularParser#styleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElementNumber(AngularParser.StyleElementNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleElementColor}
	 * labeled alternative in {@link AngularParser#styleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElementColor(AngularParser.StyleElementColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleElementOnly}
	 * labeled alternative in {@link AngularParser#styleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElementOnly(AngularParser.StyleElementOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styleAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleAssign(AngularParser.StyleAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styleNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleNumber(AngularParser.StyleNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styleColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleColor(AngularParser.StyleColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extenPixil}
	 * labeled alternative in {@link AngularParser#extention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtenPixil(AngularParser.ExtenPixilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extenId}
	 * labeled alternative in {@link AngularParser#extention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtenId(AngularParser.ExtenIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extenHex}
	 * labeled alternative in {@link AngularParser#extention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtenHex(AngularParser.ExtenHexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extenPercent}
	 * labeled alternative in {@link AngularParser#extention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtenPercent(AngularParser.ExtenPercentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extenAuto}
	 * labeled alternative in {@link AngularParser#extention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtenAuto(AngularParser.ExtenAutoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styleOnly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleOnly(AngularParser.StyleOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#click}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClick(AngularParser.ClickContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#src}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSrc(AngularParser.SrcContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#srcFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSrcFunc(AngularParser.SrcFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#alt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlt(AngularParser.AltContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#altFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltFunc(AngularParser.AltFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#starEle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarEle(AngularParser.StarEleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AngularParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#bracket2Ele}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket2Ele(AngularParser.Bracket2EleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#bracket1Ele}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket1Ele(AngularParser.Bracket1EleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#questionEle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionEle(AngularParser.QuestionEleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#placeholder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaceholder(AngularParser.PlaceholderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagBodyCompleteTag}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagBodyCompleteTag(AngularParser.TagBodyCompleteTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagBodyImageTag}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagBodyImageTag(AngularParser.TagBodyImageTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagBodyInputTag}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagBodyInputTag(AngularParser.TagBodyInputTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagBodyCommentTag}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagBodyCommentTag(AngularParser.TagBodyCommentTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagBodyExpressionExc}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagBodyExpressionExc(AngularParser.TagBodyExpressionExcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagBodyExpression}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagBodyExpression(AngularParser.TagBodyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagBodyOperation}
	 * labeled alternative in {@link AngularParser#tagBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagBodyOperation(AngularParser.TagBodyOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(AngularParser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#commentTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentTag(AngularParser.CommentTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expId}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpId(AngularParser.ExpIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expString}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpString(AngularParser.ExpStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNumber}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNumber(AngularParser.ExpNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#dotIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotIdentifier(AngularParser.DotIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(AngularParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classBodyVariable}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyVariable(AngularParser.ClassBodyVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classBodyArray}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyArray(AngularParser.ClassBodyArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classBodyFunc}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyFunc(AngularParser.ClassBodyFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(AngularParser.VariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDecl(AngularParser.ArrayDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(AngularParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(AngularParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallBodyexp}
	 * labeled alternative in {@link AngularParser#functionCallBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallBodyexp(AngularParser.FuncCallBodyexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallBodyBracketBody}
	 * labeled alternative in {@link AngularParser#functionCallBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallBodyBracketBody(AngularParser.FuncCallBodyBracketBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallBodySpecial}
	 * labeled alternative in {@link AngularParser#functionCallBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallBodySpecial(AngularParser.FuncCallBodySpecialContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionBody(AngularParser.ExpressionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#bracketBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketBody(AngularParser.BracketBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(AngularParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial(AngularParser.SpecialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcBodyReturn}
	 * labeled alternative in {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBodyReturn(AngularParser.FuncBodyReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcBodyStatement}
	 * labeled alternative in {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBodyStatement(AngularParser.FuncBodyStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcBodyIf}
	 * labeled alternative in {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBodyIf(AngularParser.FuncBodyIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(AngularParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AngularParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(AngularParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#plusStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusStatement(AngularParser.PlusStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(AngularParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBody(AngularParser.IfBodyContext ctx);
}