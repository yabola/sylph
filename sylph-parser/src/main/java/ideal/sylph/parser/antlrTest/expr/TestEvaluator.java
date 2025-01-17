package ideal.sylph.parser.antlrTest.expr;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Stack;

public class TestEvaluator {
    /** Sample "calculator" (special case of collector) */
    public static class Evaluator extends ExprBaseListener {
        Stack<Integer> stack = new Stack<Integer>();
        public void exitE(ExprParser.EContext ctx) {
            if ( ctx.getChildCount()==3 ) { // operations have 3 children
                int right = stack.pop();
                int left = stack.pop();
                if ( ctx.op.getType()==ExprParser.MULT ) {
                    stack.push( left * right );
                }
                else {
                    stack.push( left + right ); // must be add
                }
            }
        }

        public void visitTerminal(TerminalNode node) {
            Token symbol = node.getSymbol();
            if ( symbol.getType()==ExprParser.INT ) {
                stack.push( Integer.valueOf(symbol.getText()) );
            }
        }
    }

    /** Sample "calculator" using tree properties not stack */
    public static class EvaluatorWithProps extends ExprBaseListener {
        ParseTreeProperty<Integer> values = new ParseTreeProperty<Integer>();

        @Override
        public void exitS(ExprParser.SContext ctx) {
            values.put(ctx, values.get(ctx.getChild(0)));
        }

        public void exitE(ExprParser.EContext ctx) {
            if ( ctx.getChildCount()==3 ) { // operations have 3 children
                int left = values.get(ctx.e(0));
                int right = values.get(ctx.e(1));
                if ( ctx.op.getType()==ExprParser.MULT ) {
                    values.put(ctx, left * right);
                }
                else {
                    values.put(ctx, left + right);
                }
            }
            else {
                values.put(ctx, values.get(ctx.getChild(0))); // an INT
            }
        }

        public void visitTerminal(TerminalNode node) {
            Token symbol = node.getSymbol();
            if ( symbol.getType()==ExprParser.INT ) {
                values.put(node, Integer.valueOf(symbol.getText()));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        CodePointCharStream input = CharStreams.fromString("3+4*5");
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        parser.setBuildParseTree(true);      // tell ANTLR to build a parse tree
        ParseTree tree = parser.s(); // parse
        // show tree in text form
        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();

        Evaluator eval = new Evaluator();
        walker.walk(eval, tree);
        System.out.println("result = "+eval.stack.pop());

        EvaluatorWithProps eval2 = new EvaluatorWithProps();
        walker.walk(eval2, tree);
        System.out.println("result with tree props = "+eval2.values.get(tree));
    }
}
