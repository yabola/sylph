package ideal.sylph.parser.antlrTest.prop;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class PropertyListenerTest extends PropertyFileParser {

    public PropertyListenerTest(TokenStream input) {
        super(input);
    }

    public static void main(String[] args) {

        PropertyFileLexer lexer = new PropertyFileLexer(CharStreams.fromString("user=\"parrt\"\npp=\"abc\"\n"));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        PropertyListenerTest parser = new PropertyListenerTest(tokens);

        ParseTree tree = parser.file();// launch our special version of the parser


        // create a standard ANTLR parse treewalker

        ParseTreeWalker walker = new ParseTreeWalker();

// create listener then feed to walker

        PropertyFileLoader loader = new PropertyFileLoader();

        walker.walk(loader, tree); // walk parse tree
//
        System.out.println(loader.props);// print results
    }

    void defineProperty(Token name, Token value) {
        System.out.println("进来啦～～");
        System.out.println(name.getText()+"="+value.getText());

    }
}
