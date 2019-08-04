package ideal.sylph.parser.antlrTest.prop;
import org.antlr.v4.misc.OrderedHashMap;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.Map;

public class TestPropertyFileVisitor {
    public static class PropertyFileVisitor extends
            PropertyFileBaseVisitor<Void>
    {
        Map<String,String> props = new OrderedHashMap<String, String>();
        public Void visitProp(PropertyFileParser.PropContext ctx) {
            String id = ctx.ID().getText(); // prop : ID '=' STRING '\n' ;
            String value = ctx.STRING().getText();
            props.put(id, value);
            return null; // Java says must return something even when Void
        }
    }

    public static void main(String[] args) throws Exception {
        PropertyFileLexer lexer = new PropertyFileLexer(CharStreams.fromString("user=\"parrt\"\npp=\"abc\"\n"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PropertyFileParser parser = new PropertyFileParser(tokens);
        ParseTree tree = parser.file();

        PropertyFileVisitor loader = new PropertyFileVisitor();
        loader.visit(tree);
        System.out.println(loader.props); // print results
    }

}
