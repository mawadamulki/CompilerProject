package Visitor;

import AST.*;
import AST.ClassDecleration.*;
import AST.ComponentDecleration.*;
import AST.ComponentDecleration.HTML.*;
import AST.ComponentDecleration.HTML.Style.*;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import SemanticErrors.*;
import java.util.List;
import java.util.ArrayList;


public class AngularVisitor extends AngularParserBaseVisitor {

    SelectorCollisionsSymbolTable selectorCollisionsSymbolTable = new SelectorCollisionsSymbolTable();
    TemplateMissingSymbolTable templateMissingSymbolTable = new TemplateMissingSymbolTable();


    @Override
    public App visitApp(AngularParser.AppContext ctx) {
        App app = new App();

        for(int i= 0; i < ctx.importStatement().size(); i++) {
            if(ctx.importStatement(i)!=null){
                app.getImportStatement().add(visitImportStatement(ctx.importStatement(i)));
            }
        }


        for (AngularParser.AppContentContext contentCtx : ctx.appContent()) {
            AppContent content = (AppContent) visit(contentCtx);
            if (content != null) {
                app.getAppContent().add(content);
            }
        }

        //System.out.println(app.toString());

        return app;
    }


    //________________________ IMPORT ___________________________
    @Override
    public ImportStatement visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();

        importStatement.setImportItems(visitImportItems(ctx.importItems()));
        importStatement.setImportString(ctx.STRING().getText());

        return importStatement;
    }

    @Override
    public ImportItems visitImportItems(AngularParser.ImportItemsContext ctx) {
        ImportItems importItems = new ImportItems();
        for(int i= 0; i < ctx.IDENTIFIER().size(); i++) {
            if(ctx.IDENTIFIER(i)!=null){
                importItems.getImportItems().add(ctx.IDENTIFIER(i).getText());
            }
        }
        return importItems;
    }



    //_________________________ INTERFACE ________________________
    @Override
    public AppInterface visitAppInterface(AngularParser.AppInterfaceContext ctx) {

        return visitInterfaceDecl(ctx.interfaceDecl());
    }

    @Override
    public AppInterface visitInterfaceDecl(AngularParser.InterfaceDeclContext ctx) {
        AppInterface appInterface = new AppInterface();


        if (ctx.IDENTIFIER() != null)
            appInterface.setIdentifier(ctx.IDENTIFIER().getText());

        // Process parameters
        for (AngularParser.ParameterContext paramCtx : ctx.parameter()) {
            Parameter param = visitParameter(paramCtx);
            if (param != null) {
                appInterface.getInterfaceDecl().add(param);
            }
        }

        //System.out.println("Parsed interface: " + appInterface.toString());
        //System.out.println(ctx.toStringTree());
        return appInterface;

    }

    @Override
    public Parameter visitParameter(AngularParser.ParameterContext ctx) {
        Parameter param = new Parameter();

        if (ctx.IDENTIFIER().size() >= 2) {
            param.setId1(ctx.IDENTIFIER(0).getText());
            param.setId2(ctx.IDENTIFIER(1).getText());
        }
        return param;
    }

    @Override
    public ParamList visitParamList(AngularParser.ParamListContext ctx) {
        ParamList paramList = new ParamList();

        for(int i = 0 ; i < ctx.parameter().size() ; i++)
            if(ctx.parameter(i) != null)
                paramList.getParameter().add(visitParameter(ctx.parameter(i)));

        return paramList;
    }




    //_______________________ SERVICE _________________________
    @Override
    public AppContent visitAppService(AngularParser.AppServiceContext ctx) {

        return visitServiceDecl(ctx.serviceDecl());
    }

    @Override
    public AppContent visitServiceDecl(AngularParser.ServiceDeclContext ctx) {
        AppService appService = new AppService();
        appService.setService(ctx.STRING().getText());
        return appService;
    }




    // _____________________ CLASS _____________________
    @Override
    public AppContent visitAppClass(AngularParser.AppClassContext ctx) {

        return visitClassDecl(ctx.classDecl());
    }

    @Override
    public AppContent visitClassDecl(AngularParser.ClassDeclContext ctx) {
        AppClass appClass = new AppClass();

        for (AngularParser.ClassBodyContext bodyCtx : ctx.classBody()) {
            ClassBody body = (ClassBody) visit(bodyCtx);
            if (body != null) {
                appClass.getAppClass().add(body);
            }
        }

        //System.out.println(appClass);
        return appClass;
    }

    @Override
    public ClassBodyArray visitClassBodyArray(AngularParser.ClassBodyArrayContext ctx) {

        return visitArrayDecl(ctx.arrayDecl());
    }

    @Override
    public ClassBodyArray visitArrayDecl(AngularParser.ArrayDeclContext ctx) {
        ClassBodyArray classBodyArray = new ClassBodyArray();

        classBodyArray.setString1(ctx.IDENTIFIER(0).getText());
        classBodyArray.setString2(ctx.IDENTIFIER(1).getText());

        //System.out.println(classBodyArray);
        return classBodyArray;
    }

    @Override
    public ClassBody visitClassBodyVariable(AngularParser.ClassBodyVariableContext ctx) {

        return visitVariableDecl(ctx.variableDecl());
    }

    @Override
    public ClassBody visitVariableDecl(AngularParser.VariableDeclContext ctx) {
        ClassBodyVariable classBodyVariable = new ClassBodyVariable();

        classBodyVariable.setIdentifier(ctx.IDENTIFIER().getText());
        classBodyVariable.setExpression((Expression) visit(ctx.expression()));

        return classBodyVariable;
    }

    @Override
    public ClassBody visitClassBodyFunc(AngularParser.ClassBodyFuncContext ctx) {

        return visitFunctionDecl(ctx.functionDecl());
    }

    @Override
    public ClassBody visitFunctionDecl(AngularParser.FunctionDeclContext ctx) {
        ClassBodyFunc classBodyFunc = new ClassBodyFunc();

        classBodyFunc.setIdentifier(ctx.IDENTIFIER().getText());

        if(ctx.paramList() != null)
            classBodyFunc.setParamList(visitParamList(ctx.paramList()));

        for(int i = 0 ; i < ctx.functionBody().size() ; i++){
            if(ctx.functionBody(i) != null){
                classBodyFunc.getFunctionBody().add((FunctionBody) visit(ctx.functionBody(i)));
            }
        }

        return classBodyFunc;
    }



    @Override
    public FunctionBody visitFuncBodyReturn(AngularParser.FuncBodyReturnContext ctx) {

        return visitReturnStmt(ctx.returnStmt());
    }

    @Override
    public FunctionBody visitReturnStmt(AngularParser.ReturnStmtContext ctx) {
        FuncBodyReturn functionBody = new FuncBodyReturn();
        functionBody.setExpression((Expression) visit(ctx.expression()));
        return functionBody;
    }

    @Override
    public FunctionBody visitFuncBodyStatement(AngularParser.FuncBodyStatementContext ctx) {

        return visitStatement(ctx.statement());
    }


    @Override
    public FunctionBody visitStatement(AngularParser.StatementContext ctx) {
        FuncBodyStatement funcBodyStatement = new FuncBodyStatement();
        if(ctx.assignStatement()!= null)
            funcBodyStatement.setAssignStatement(visitAssignStatement(ctx.assignStatement()));
        if(ctx.plusStatement()!= null)
            funcBodyStatement.setPlusStatement(visitPlusStatement(ctx.plusStatement()));

        return funcBodyStatement;
    }

    @Override
    public AssignStatement visitAssignStatement(AngularParser.AssignStatementContext ctx) {
        AssignStatement assignStatement = new AssignStatement();
        assignStatement.setExpression1((Expression) visit(ctx.expression(0)));
        if(ctx.expression(1) != null)
            assignStatement.setExpression2((Expression) visit(ctx.expression(1)));
        if(ctx.functionCall() != null)
            assignStatement.setFunctionCall(visitFunctionCall(ctx.functionCall()));

        return assignStatement;
    }

    @Override
    public PlusStatement visitPlusStatement(AngularParser.PlusStatementContext ctx) {
        PlusStatement plusStatement = new PlusStatement();
        plusStatement.setExpression((Expression) visit(ctx.expression()));
        plusStatement.setOp1(ctx.OPERATION(1).getText());

        return plusStatement;
    }

    @Override
    public FunctionBody visitFuncBodyIf(AngularParser.FuncBodyIfContext ctx) {

        return visitIfStatement(ctx.ifStatement());
    }

    @Override
    public FunctionBody visitIfStatement(AngularParser.IfStatementContext ctx) {
        FuncBodyIf funcBodyIf = new FuncBodyIf();
        funcBodyIf.setIfCondition(visitIfCondition(ctx.ifCondition()));

        for(int i = 0 ; i < ctx.ifBody().size() ; i++)
            if(ctx.ifBody(i) != null)
                funcBodyIf.getIfBody().add(visitIfBody(ctx.ifBody(i)));

        return funcBodyIf;
    }

    @Override
    public IfCondition visitIfCondition(AngularParser.IfConditionContext ctx) {
        IfCondition ifCondition = new IfCondition();
        ifCondition.setFunctionCall(visitFunctionCall(ctx.functionCall()));
        return ifCondition;
    }

    @Override
    public IfBody visitIfBody(AngularParser.IfBodyContext ctx) {
        IfBody ifBody = new IfBody();
        if(ctx.functionCall() != null)
            ifBody.setFunctionCall(visitFunctionCall(ctx.functionCall()));
        if(ctx.assignStatement() != null)
            ifBody.setAssignStatement(visitAssignStatement(ctx.assignStatement()));
        return ifBody;
    }

    @Override
    public FunctionCall visitFunctionCall(AngularParser.FunctionCallContext ctx) {
        FunctionCall functionCall = new FunctionCall();
        if(ctx.functionCallBody() != null)
            functionCall.setFunctionCallBody((FunctionCallBody) visit(ctx.functionCallBody()));

        functionCall.setExpression((Expression) visit(ctx.expression()));
        return functionCall;
    }

    @Override
    public FunctionCallBody visitFuncCallBodyexp(AngularParser.FuncCallBodyexpContext ctx) {

        return visitExpressionBody(ctx.expressionBody());
    }

    @Override
    public FuncCallBodyexp visitExpressionBody(AngularParser.ExpressionBodyContext ctx) {
        FuncCallBodyexp funcCallBodyexp = new FuncCallBodyexp();

        for(int i = 0 ;i < ctx.expression().size(); i++)
        {
            if(ctx.expression(i)!= null){
                funcCallBodyexp.getExpressions().add((Expression) visit(ctx.expression(i)));
            }
        }
        return funcCallBodyexp;
    }


    @Override
    public FunctionCallBody visitFuncCallBodySpecial(AngularParser.FuncCallBodySpecialContext ctx) {

        return visitSpecial(ctx.special());
    }

    @Override
    public FunctionCallBody visitSpecial(AngularParser.SpecialContext ctx) {
        FuncCallBodySpecial funcCallBodySpecial = new FuncCallBodySpecial();

        funcCallBodySpecial.setIdentirier(ctx.IDENTIFIER().getText());
        funcCallBodySpecial.setExpression1((Expression) visit(ctx.expression(0)));
        funcCallBodySpecial.setExpression2((Expression) visit(ctx.expression(1)));

        return funcCallBodySpecial;
    }

    @Override
    public FunctionCallBody visitFuncCallBodyBracketBody(AngularParser.FuncCallBodyBracketBodyContext ctx) {

        return visitBracketBody(ctx.bracketBody());
    }

    @Override
    public FunctionCallBody visitBracketBody(AngularParser.BracketBodyContext ctx) {
        FuncCallBodyBracketBody funcCallBodyBracketBody = new FuncCallBodyBracketBody();
        for(int i = 0 ; i < ctx.body().size() ; i++ ){
            if(ctx.body(i)!= null)
                funcCallBodyBracketBody.getBody().add(visitBody(ctx.body(i)));
        }
        return funcCallBodyBracketBody;
    }

    @Override
    public Body visitBody(AngularParser.BodyContext ctx) {
        Body body = new Body();
        if(ctx.BOOLEAN() != null)
            body.setBool(ctx.BOOLEAN().getText());

        body.setIdentifier(ctx.IDENTIFIER().getText());

        if(ctx.functionCall() != null)
            body.setFunctionCall(visitFunctionCall(ctx.functionCall()));

        return body;
    }



    //______________________ COMPONENT ___________________________

    @Override
    public AppContent visitAppComponent(AngularParser.AppComponentContext ctx) {

        return visitComponentDecl(ctx.componentDecl());
    }

    @Override
    public AppContent visitComponentDecl(AngularParser.ComponentDeclContext ctx) {
        AppComponent appComponent = new AppComponent();

        for(int i = 0 ; i < ctx.componentdata().size() ; i++ )
            if(ctx.componentdata(i) != null)
                appComponent.getComponentData().add((ComponentData) visit(ctx.componentdata(i)));


        int checkMissingTemplate =templateMissingSymbolTable.templateSize();
        if(checkMissingTemplate==0){
            TemplateMissingException error=new TemplateMissingException(
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());

            ErrorHandler.logTemplateMissing(error);
        }

        return appComponent;
    }

    @Override
    public ComponentData visitComponentSelector(AngularParser.ComponentSelectorContext ctx) {

        return visitSelector(ctx.selector());
    }

    @Override
    public ComponentData visitSelector(AngularParser.SelectorContext ctx) {
        ComponentSelector componentSelector = new ComponentSelector();
        componentSelector.setString(ctx.STRING().getText());

        // Check Selector Collision Error And Add If It don't Exist to Symbol Table
        boolean checkSelectorError = selectorCollisionsSymbolTable.checkIfExist(ctx.STRING().getText());
        if(checkSelectorError){
            SelectorCollisionsException error = new SelectorCollisionsException(
                    ctx.STRING().getText(),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());

            ErrorHandler.logSelectorCollision(error);
        }
        else
            selectorCollisionsSymbolTable.addItem(ctx.STRING().getText());

        return componentSelector;
    }

    @Override
    public ComponentData visitComponentStandalone(AngularParser.ComponentStandaloneContext ctx) {

        return visitStandalone(ctx.standalone());
    }

    @Override
    public ComponentData visitStandalone(AngularParser.StandaloneContext ctx) {
        ComponentStandalone componentStandalone = new ComponentStandalone();
        componentStandalone.setBool(ctx.BOOLEAN().getText());
        return componentStandalone;
    }

    @Override
    public ComponentData visitComponentImports(AngularParser.ComponentImportsContext ctx) {

        return visitImports(ctx.imports());
    }

    @Override
    public ComponentData visitImports(AngularParser.ImportsContext ctx) {
        ComponentImports componentImports = new ComponentImports();

        for(int i = 0 ; i < ctx.IDENTIFIER().size() ; i++)
            if(ctx.IDENTIFIER(i) != null)
                componentImports.getIdentifier().add(ctx.IDENTIFIER(i).getText());

        return componentImports;
    }

    @Override
    public ComponentData visitComponentStyleUrl(AngularParser.ComponentStyleUrlContext ctx) {

        return visitStyleUrls(ctx.styleUrls());
    }

    @Override
    public ComponentData visitStyleUrls(AngularParser.StyleUrlsContext ctx) {
        ComponentStyleUrl componentStyleUrl = new ComponentStyleUrl();

        for(int i = 0 ; i < ctx.STRING().size() ; i++)
            if(ctx.STRING(i) != null)
                componentStyleUrl.getStrings().add(ctx.STRING(i).getText());

        return componentStyleUrl;
    }

    @Override
    public ComponentData visitComponentTamplateUrl(AngularParser.ComponentTamplateUrlContext ctx) {

        return visitTemplateUrl(ctx.templateUrl());
    }

    @Override
    public ComponentData visitTemplateUrl(AngularParser.TemplateUrlContext ctx) {
        ComponentTamplateUrl componentTamplateUrl = new ComponentTamplateUrl();

        componentTamplateUrl.setString(ctx.STRING().getText());
        templateMissingSymbolTable.addItem(ctx.TEMPLATEURL().getText());

        return componentTamplateUrl;
    }

    @Override
    public ComponentData visitComponentTamplate(AngularParser.ComponentTamplateContext ctx) {

        return visitTemplateDecl(ctx.templateDecl());
    }

    @Override
    public ComponentData visitTemplateDecl(AngularParser.TemplateDeclContext ctx) {
        ComponentTamplate componentTamplate = new ComponentTamplate();
        templateMissingSymbolTable.addItem(ctx.TEMPLATE().getText());

        for( int i = 0 ; i < ctx.html().size() ; i++ )
            if(ctx.html(i) != null)
                componentTamplate.getHtml().add((Html) visit(ctx.html(i)));

        return componentTamplate;
    }


    //_____________________ HTML ______________________
    @Override
    public Html visitHtmlImage(AngularParser.HtmlImageContext ctx) {

        return visitImageTag(ctx.imageTag());
    }

    @Override
    public Html visitImageTag(AngularParser.ImageTagContext ctx) {
        HtmlImage htmlImage = new HtmlImage();

        for(int i = 0 ; i < ctx.attributeHTML().size() ; i ++)
            if(ctx.attributeHTML(i)!= null)
                htmlImage.getAttributeHTML().add((AttributeHTML) visit(ctx.attributeHTML(i)));

        return htmlImage;
    }

    @Override
    public Html visitHtmlInput(AngularParser.HtmlInputContext ctx) {

        return visitInputTag(ctx.inputTag());
    }

    @Override
    public Html visitInputTag(AngularParser.InputTagContext ctx) {
        HtmlInput htmlInput = new HtmlInput();

        for(int i = 0 ; i < ctx.attributeHTML().size() ; i ++)
            if(ctx.attributeHTML(i)!= null)
                htmlInput.getAttributeHTML().add((AttributeHTML) visit(ctx.attributeHTML(i)));

        return htmlInput;
    }

    @Override
    public Html visitHtmlComment(AngularParser.HtmlCommentContext ctx) {

        return visitCommentTag(ctx.commentTag());
    }

    @Override
    public Html visitCommentTag(AngularParser.CommentTagContext ctx) {
        HtmlComment htmlComment = new HtmlComment();

        for(int i = 0 ; i < ctx.expression().size() ; i++)
            if(ctx.expression(i) != null)
                htmlComment.getExpression().add((Expression) visit(ctx.expression(i)));

        return htmlComment;
    }

    @Override
    public Html visitHtmlComplete(AngularParser.HtmlCompleteContext ctx) {

        return visitCompleteTag(ctx.completeTag());
    }

    @Override
    public Html visitCompleteTag(AngularParser.CompleteTagContext ctx) {
        HtmlComplete htmlComplete = new HtmlComplete();

        htmlComplete.setOpenTag(visitOpenTag(ctx.openTag()));
        htmlComplete.setCloseTag(visitCloseTag(ctx.closeTag()));

        for(int i = 0 ; i <ctx.tagBody().size() ; i++ )
            if(ctx.tagBody(i) != null)
                htmlComplete.getTagBody().add((TagBody) visit(ctx.tagBody(i)));

        return htmlComplete;
    }

    @Override
    public OpenTag visitOpenTag(AngularParser.OpenTagContext ctx) {
        OpenTag openTag = new OpenTag();

        openTag.setIdentifier(ctx.IDENTIFIER().getText());
         for(int i = 0; i < ctx.attributeHTML().size() ; i++)
             if(ctx.attributeHTML() != null)
                 openTag.getAttributeHTML().add((AttributeHTML) visit(ctx.attributeHTML(i)));

        return openTag;
    }

    @Override
    public CloseTag visitCloseTag(AngularParser.CloseTagContext ctx) {
        CloseTag closeTag = new CloseTag();

        closeTag.setIdentifier(ctx.IDENTIFIER().getText());

        return closeTag;
    }

    @Override
    public TagBody visitTagBodyCompleteTag(AngularParser.TagBodyCompleteTagContext ctx) {
        return (TagBody) visitCompleteTag(ctx.completeTag());
    }

    @Override
    public TagBody visitTagBodyImageTag(AngularParser.TagBodyImageTagContext ctx) {
        return (TagBody) visitImageTag(ctx.imageTag());
    }

    @Override
    public TagBody visitTagBodyInputTag(AngularParser.TagBodyInputTagContext ctx) {
        return (TagBody) visitInputTag(ctx.inputTag());
    }

    @Override
    public TagBody visitTagBodyCommentTag(AngularParser.TagBodyCommentTagContext ctx) {
        return (TagBody) visitCommentTag(ctx.commentTag());
    }

    @Override
    public TagBody visitTagBodyExpression(AngularParser.TagBodyExpressionContext ctx) {
        TagBodyExpression tagBodyExpression = new TagBodyExpression();
        tagBodyExpression.setExpression((Expression) visit(ctx.expression()));
        return tagBodyExpression;
    }

    @Override
    public TagBody visitTagBodyExpressionExc(AngularParser.TagBodyExpressionExcContext ctx) {
        TagBodyExpressionExc tagBodyExpressionExc = new TagBodyExpressionExc();
        for(int i = 0 ; i < ctx.expression().size(); i++)
            if(ctx.expression(i) != null)
                tagBodyExpressionExc.getExpression().add((Expression) visit(ctx.expression(i)));

        if(ctx.EXCLAMATION() != null)
            tagBodyExpressionExc.setC(ctx.EXCLAMATION().getText());
        return tagBodyExpressionExc;
    }

    @Override
    public TagBody visitTagBodyOperation(AngularParser.TagBodyOperationContext ctx) {
        TagBodyOperation tagBodyOperation = new TagBodyOperation();
        tagBodyOperation.setOp(ctx.OPERATION().getText());
        return tagBodyOperation;
    }


    //____________________ STYLE _____________________


    @Override
    public AttributeHTML visitHtmlAttClick(AngularParser.HtmlAttClickContext ctx) {
        return visitClick(ctx.click());
    }

    @Override
    public AttributeHTML visitClick(AngularParser.ClickContext ctx) {
        HtmlAttClick htmlAttClick = new HtmlAttClick();

        htmlAttClick.setFunctionCall(visitFunctionCall(ctx.functionCall()));

        return htmlAttClick;
    }

    @Override
    public AttributeHTML visitHtmlAttSrc(AngularParser.HtmlAttSrcContext ctx) {
        return visitSrc(ctx.src());
    }

    @Override
    public AttributeHTML visitSrc(AngularParser.SrcContext ctx) {
        HtmlAttSrc htmlAttSrc = new HtmlAttSrc();
        htmlAttSrc.setString(ctx.STRING().getText());
        return htmlAttSrc;
    }

    @Override
    public AttributeHTML visitHtmlAttSrcFunc(AngularParser.HtmlAttSrcFuncContext ctx) {
        return visitSrcFunc(ctx.srcFunc());
    }

    @Override
    public AttributeHTML visitSrcFunc(AngularParser.SrcFuncContext ctx) {
        HtmlAttSrcFunc htmlAttSrcFunc = new HtmlAttSrcFunc();
        htmlAttSrcFunc.setExpression((Expression) visit(ctx.expression()));
        return htmlAttSrcFunc;
    }

    @Override
    public AttributeHTML visitHtmlAttAlt(AngularParser.HtmlAttAltContext ctx) {
        return visitAlt(ctx.alt());
    }

    @Override
    public AttributeHTML visitAlt(AngularParser.AltContext ctx) {
        HtmlAttAlt htmlAttAlt = new HtmlAttAlt();
        htmlAttAlt.setString(ctx.STRING().getText());
        return htmlAttAlt;
    }

    @Override
    public AttributeHTML visitHtmlAttAltFunc(AngularParser.HtmlAttAltFuncContext ctx) {
        return visitAltFunc(ctx.altFunc());
    }

    @Override
    public AttributeHTML visitAltFunc(AngularParser.AltFuncContext ctx) {
        HtmlAttAltFunc htmlAttAltFunc = new HtmlAttAltFunc();
        for(int i= 0 ; i < ctx.expression().size() ; i++)
            if(ctx.expression(i)!= null)
                htmlAttAltFunc.getExpression().add((Expression) visit(ctx.expression(i)));
        return htmlAttAltFunc;
    }

    @Override
    public AttributeHTML visitHtmlAttStarEle(AngularParser.HtmlAttStarEleContext ctx) {
        return visitStarEle(ctx.starEle());
    }

    @Override
    public AttributeHTML visitStarEle(AngularParser.StarEleContext ctx) {
        HtmlAttStarEle htmlAttStarEle = new HtmlAttStarEle();
        htmlAttStarEle.setIdentifier(ctx.IDENTIFIER().getText());
        htmlAttStarEle.setString(ctx.STRING().getText());
        return htmlAttStarEle;
    }

    @Override
    public AttributeHTML visitHtmlAttType(AngularParser.HtmlAttTypeContext ctx) {
        return visitType(ctx.type());
    }

    @Override
    public AttributeHTML visitType(AngularParser.TypeContext ctx) {
        HtmlAttType htmlAttType = new HtmlAttType();
        htmlAttType.setString(ctx.STRING().getText());
        return htmlAttType;
    }

    @Override
    public AttributeHTML visitHtmlAttBrack2(AngularParser.HtmlAttBrack2Context ctx) {
        return visitBracket2Ele(ctx.bracket2Ele());
    }

    @Override
    public AttributeHTML visitBracket2Ele(AngularParser.Bracket2EleContext ctx) {
        HtmlAttBrack2 htmlAttBrack2 = new HtmlAttBrack2();
        htmlAttBrack2.setExpression((Expression) visit(ctx.expression()));
        htmlAttBrack2.setString(ctx.IDENTIFIER().getText());
        return htmlAttBrack2;
    }

    @Override
    public AttributeHTML visitHtmlAttBrack1(AngularParser.HtmlAttBrack1Context ctx) {
        return visitBracket1Ele(ctx.bracket1Ele());
    }

    @Override
    public AttributeHTML visitBracket1Ele(AngularParser.Bracket1EleContext ctx) {
        HtmlAttBrack1 htmlAttBrack1 = new HtmlAttBrack1();
        htmlAttBrack1.setExpression((Expression) visit(ctx.expression()));
        htmlAttBrack1.setFunctionCall(visitFunctionCall(ctx.functionCall()));
        return htmlAttBrack1;
    }

    @Override
    public AttributeHTML visitHtmlAttQuestion(AngularParser.HtmlAttQuestionContext ctx) {
        return visitQuestionEle(ctx.questionEle());
    }

    @Override
    public AttributeHTML visitQuestionEle(AngularParser.QuestionEleContext ctx) {
        HtmlAttQuestion htmlAttQuestion = new HtmlAttQuestion();
        htmlAttQuestion.setExpression1((Expression) visit(ctx.expression(0)));
        htmlAttQuestion.setExpression2((Expression) visit(ctx.expression(1)));
        htmlAttQuestion.setExpression3((Expression) visit(ctx.expression(2)));
        htmlAttQuestion.setExpression4((Expression) visit(ctx.expression(3)));
        return htmlAttQuestion;
    }

    @Override
    public AttributeHTML visitHtmlAttPlaceholder(AngularParser.HtmlAttPlaceholderContext ctx) {
        return visitPlaceholder(ctx.placeholder());
    }

    @Override
    public AttributeHTML visitPlaceholder(AngularParser.PlaceholderContext ctx) {
        HtmlAttPlaceholder htmlAttPlaceholder = new HtmlAttPlaceholder();
        htmlAttPlaceholder.setString(ctx.STRING().getText());
        return htmlAttPlaceholder;
    }

    @Override
    public AttributeHTML visitHtmlAttStyling(AngularParser.HtmlAttStylingContext ctx) {
        return visitStyling(ctx.styling());
    }

    @Override
    public AttributeHTML visitStyling(AngularParser.StylingContext ctx) {
        HtmlAttStyling htmlAttStyling = new HtmlAttStyling();

        for(int i = 0 ; i < ctx.styleElement().size() ; i++)
            if(ctx.styleElement(i) != null)
                htmlAttStyling.getStyleElement().add((StyleElement) visit(ctx.styleElement(i)));

        return htmlAttStyling;
    }


    @Override
    public StyleElement visitStyleElementAssign(AngularParser.StyleElementAssignContext ctx) {
        return visitStyleAssign(ctx.styleAssign());
    }

    @Override
    public StyleElement visitStyleAssign(AngularParser.StyleAssignContext ctx) {
        StyleElementAssign styleElementAssign = new StyleElementAssign();

        styleElementAssign.setString(ctx.IDENTIFIER(0).getText());
        for(int i = 1 ; i < ctx.IDENTIFIER().size() ; i++ )
            if(ctx.IDENTIFIER(i) != null)
                styleElementAssign.getIdentifer().add(ctx.IDENTIFIER(i).getText());

        return styleElementAssign;
    }

    @Override
    public StyleElement visitStyleElementColor(AngularParser.StyleElementColorContext ctx) {
        return visitStyleColor(ctx.styleColor());
    }

    @Override
    public StyleElement visitStyleColor(AngularParser.StyleColorContext ctx) {
        StyleElementColor styleElementColor = new StyleElementColor();

        if(ctx.IDENTIFIER(0) != null)
            styleElementColor.setIdentifier1(ctx.IDENTIFIER(0).getText());
        if(ctx.IDENTIFIER(1) != null)
            styleElementColor.setIdentifier2(ctx.IDENTIFIER(1).getText());
        if(ctx.NUMBER() != null)
            styleElementColor.setNumber(ctx.NUMBER().getText());
        return styleElementColor;
    }

    @Override
    public StyleElement visitStyleElementOnly(AngularParser.StyleElementOnlyContext ctx) {
        return visitStyleOnly(ctx.styleOnly());
    }

    @Override
    public StyleElement visitStyleOnly(AngularParser.StyleOnlyContext ctx) {
        StyleElementOnly styleElementOnly = new StyleElementOnly();
        styleElementOnly.setString(ctx.IDENTIFIER().getText());
        return styleElementOnly;
    }

    @Override
    public StyleElement visitStyleElementPadding(AngularParser.StyleElementPaddingContext ctx) {
        return visitStylePadding(ctx.stylePadding());
    }

    @Override
    public StyleElement visitStylePadding(AngularParser.StylePaddingContext ctx) {
        StyleElementPadding styleElementPadding = new StyleElementPadding();

        styleElementPadding.setNumber1(ctx.NUMBER(0).getText());
        if(ctx.NUMBER(1) != null)
            styleElementPadding.setNumber2(ctx.NUMBER(1).getText());

        return styleElementPadding;
    }

    @Override
    public StyleElement visitStyleElementNumber(AngularParser.StyleElementNumberContext ctx) {
        return visitStyleNumber(ctx.styleNumber());
    }


    @Override
    public StyleElement visitStyleNumber(AngularParser.StyleNumberContext ctx) {
        StyleElementNumber styleNumber = new StyleElementNumber();
        styleNumber.setIdentifier(ctx.IDENTIFIER().getText());

        styleNumber.setNumber(ctx.NUMBER(0).getText());
        List<Extention> extentions = new ArrayList<>();


        for(int j = 0 ; j < ctx.extention().size() ;j++)
            extentions.add(j,(Extention) visit(ctx.extention(j)));



        styleNumber.setExtentions(extentions);

        return styleNumber;
    }


    @Override
    public Extention visitExtenPixil(AngularParser.ExtenPixilContext ctx) {

        return new ExtenPixil();
    }

    @Override
    public Extention visitExtenAuto(AngularParser.ExtenAutoContext ctx) {

        return new ExtenAuto();
    }

    @Override
    public Extention visitExtenHex(AngularParser.ExtenHexContext ctx) {
        ExtenHex extenHex = new ExtenHex();
        if(ctx.NUMBER() != null)
            extenHex.setNumber(ctx.NUMBER().getText());
        if(ctx.IDENTIFIER() != null)
            extenHex.setIdentifier(ctx.IDENTIFIER().getText());
        return extenHex;
    }

    @Override
    public Extention visitExtenPercent(AngularParser.ExtenPercentContext ctx) {

        return new ExtenPercent();
    }

    @Override
    public Extention visitExtenId(AngularParser.ExtenIdContext ctx) {
        ExtenId extention = new ExtenId();
        extention.setString(ctx.IDENTIFIER().getText());
        return extention;
    }

    //_________________ Expression __________________
    @Override
    public Expression visitExpId(AngularParser.ExpIdContext ctx) {
        ExpId expression = new ExpId();
        expression.setDotIdentifier(visitDotIdentifier(ctx.dotIdentifier()));
        return expression;
    }

    @Override
    public DotIdentifier visitDotIdentifier(AngularParser.DotIdentifierContext ctx) {
        DotIdentifier dotIdentifier = new DotIdentifier();

        for(int i= 0; i < ctx.IDENTIFIER().size(); i++) {
            if(ctx.IDENTIFIER(i)!=null){
                dotIdentifier.getIdentifier().add(ctx.IDENTIFIER(i).getText());
            }
        }
        return dotIdentifier;
    }

    @Override
    public Expression visitExpNumber(AngularParser.ExpNumberContext ctx) {
        ExpNumber expNumber= new ExpNumber();
        expNumber.setNumber(ctx.NUMBER().getText());
        return expNumber;
    }

    @Override
    public Expression visitExpString(AngularParser.ExpStringContext ctx) {
        ExpString expString = new ExpString();
        expString.setString(ctx.STRING().getText());
        return expString;
    }

}
