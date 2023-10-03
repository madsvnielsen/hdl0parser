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

        String head = """
                <head><title>"""+ filename + """
                                 </title>
                                 <script src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
                                 <script type="text/javascript" id="MathJax-script"
                                 async src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-chtml.js">
                                 </script></head>
                """;

        String body = "<body>"+interpreter.visit(parseTree) + "</body>";
        String htmlDoc = "<!DOCTYPE html><html>" + head + body + "</html>";
        System.out.println(htmlDoc);

    }
}

class Interpreter extends AbstractParseTreeVisitor<String> implements ccVisitor<String>{

    @Override
    public String visitStart(ccParser.StartContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        for(ccParser.CommandsContext com : ctx.c){
            stringBuilder.append(visit(com));
        }
        return stringBuilder.toString();
    }

    @Override
    public String visitHwcmd(ccParser.HwcmdContext ctx) {
        return "<h1>" + ctx.sig.getText() + "</h1>";
    }

    @Override
    public String visitIncmd(ccParser.IncmdContext ctx) {
        StringBuilder signals = new StringBuilder();
        for(Token sig : ctx.sig){
            signals.append(sig.getText()).append("<br/>");
        }
        return "<h2> Inputs </h2>" + signals.toString();
    }

    @Override
    public String visitOucmd(ccParser.OucmdContext ctx) {
        StringBuilder signals = new StringBuilder();
        for(Token sig : ctx.sig){
            signals.append(sig.getText()).append("<br/>");
        }
        return "<h2> Outputs </h2>" + signals.toString();
    }

    @Override
    public String visitUpcmd(ccParser.UpcmdContext ctx) {
        StringBuilder updates = new StringBuilder();
        for(ccParser.AssignmentContext ass : ctx.ass){
            updates.append(visit(ass));
        }
        return "<h2> Updates </h2>" + updates.toString();
    }

    @Override
    public String visitLacmd(ccParser.LacmdContext ctx) {
        StringBuilder latchAssignments = new StringBuilder();
        for(ccParser.LatchContext lat : ctx.lat){
            latchAssignments.append(visit(lat));
        }
        return "<h2> Latches </h2>" + latchAssignments.toString();
    }

    @Override
    public String visitSicmd(ccParser.SicmdContext ctx) {
        StringBuilder sim = new StringBuilder();
        for(ccParser.IovalueContext io : ctx.io){
            sim .append(visit(io));
        }
        return "<h2> Simulation inputs </h2>" + sim.toString();
    }
    @Override
    public String visitAssignment(ccParser.AssignmentContext ctx) {
        return ctx.sig.getText() +"&larr;" + "\\("+ visit(ctx.e) + "\\)" + "<br/>";
    }

    @Override
    public String visitLatch(ccParser.LatchContext ctx) {

        return ctx.sig1.getText() +"&rarr;" + ctx.sig2.getText() +"<br/>";
    }

    @Override
    public String visitIovalue(ccParser.IovalueContext ctx) {
        return "<b>"+ctx.sig1.getText() + "</b>:" + ctx.bin.getText()+"<br/>";
    }

    @Override
    public String visitSigOp(ccParser.SigOpContext ctx) {
        return "\\mathrm{"+ctx.sig.getText()+"}";
    }

    @Override
    public String visitOrOp(ccParser.OrOpContext ctx) {
        return visit(ctx.e1) + " \\vee " + visit(ctx.e2);
    }

    @Override
    public String visitParenOp(ccParser.ParenOpContext ctx) {
        return "("+visit(ctx.e)+")";
    }

    @Override
    public String visitNotOp(ccParser.NotOpContext ctx) {
        return "\\neg "+visit(ctx.e);
    }

    @Override
    public String visitAndOp(ccParser.AndOpContext ctx) {
        return visit(ctx.e1) + "\\wedge " + visit(ctx.e2);
    }


    @Override
    public String visitIgnore(ccParser.IgnoreContext ctx) {
        return "";
    }
}
