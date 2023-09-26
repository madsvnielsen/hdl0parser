import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class main{
    public static void main(String[] args) throws IOException {
        String filename = args[0];

        CharStream input = CharStreams.fromFileName(filename);
        ccLexer lex = new ccLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lex);

        ccParser parser = new ccParser(tokens);

        ParseTree parseTree = parser.start();

        Interpreter interpreter = new Interpreter();

        String result = interpreter.visit(parseTree) ;
        System.out.println(result);
    }
}

class Interpreter extends AbstractParseTreeVisitor<String> implements ccVisitor<String>{

    @Override
    public String visitStart(ccParser.StartContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < ctx.getChildCount(); i++){
            stringBuilder.append(visit(ctx.getChild(i)));
        }
        return stringBuilder.toString();
    }

    @Override
    public String visitHwcmd(ccParser.HwcmdContext ctx) {
        return "<HARDWARE COMMAND> SIGNAL: " + ctx.sig.getText();
    }

    @Override
    public String visitIncmd(ccParser.IncmdContext ctx) {

        StringBuilder signals = new StringBuilder();

        for(int i = 0; i < ctx.getChildCount(); i++){
            signals.append(ctx.getChild(i).getText());
        }

        return "<VISIT COMMAND> SIGNALS: " + signals.toString();

    }

    @Override
    public String visitOucmd(ccParser.OucmdContext ctx) {
        return null;
    }

    @Override
    public String visitUpcmd(ccParser.UpcmdContext ctx) {
        return null;
    }

    @Override
    public String visitLacmd(ccParser.LacmdContext ctx) {
        return null;
    }

    @Override
    public String visitSicmd(ccParser.SicmdContext ctx) {
        return null;
    }
    @Override
    public String visitAssignment(ccParser.AssignmentContext ctx) {
        System.out.println(ctx.sig.getText());

        return null;
    }

    @Override
    public String visitLatch(ccParser.LatchContext ctx) {
        return null;
    }

    @Override
    public String visitIovalue(ccParser.IovalueContext ctx) {
        return null;
    }

    @Override
    public String visitSigOp(ccParser.SigOpContext ctx) {
        return null;
    }

    @Override
    public String visitOrOp(ccParser.OrOpContext ctx) {
        return null;
    }

    @Override
    public String visitParenOp(ccParser.ParenOpContext ctx) {
        return null;
    }

    @Override
    public String visitNotOp(ccParser.NotOpContext ctx) {
        return null;
    }

    @Override
    public String visitAndOp(ccParser.AndOpContext ctx) {
        return null;
    }



    @Override
    public String visitIgnore(ccParser.IgnoreContext ctx) {
        return null;
    }
}
