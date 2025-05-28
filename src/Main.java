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


<<<<<<< HEAD
        String source = "C:\\Users\\ROG STRIX\\IdeaProjects\\Compiler1ProjectComplete\\src\\samples\\sampleBindingError";
=======
        String source = "C:\\Users\\DELL\\IdeaProjects\\CompilerProject\\src\\samples\\sampleFunctionCallError";
>>>>>>> b8b033330c02b5d4b4abb1409c6b13ebf666ea47
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
