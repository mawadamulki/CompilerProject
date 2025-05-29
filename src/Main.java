import AST.*;
import antlr.*;

import Visitor.AngularVisitor;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {

    public static void main(String args[]) throws IOException {


        String source = "C:\\Users\\ROG STRIX\\IdeaProjects\\Compiler1ProjectComplete\\src\\samples\\sampleTemplateMissing";
        CharStream cs = fromFileName(source);
        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);
        ParseTree tree = parser.app();
        App app = (App) new AngularVisitor().visit(tree);
        System.out.println(app);


        /*
        AngularLexer lexer = new AngularLexer(CharStreams.fromString("samples/sample1"));
        AngularParser parser = new AngularParser(new CommonTokenStream(lexer));
        AngularVisitor visitor = new AngularVisitor();

        visitor.visit(parser.app());

         */
    }
}
