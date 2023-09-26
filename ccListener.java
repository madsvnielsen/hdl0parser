// Generated from cc.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ccParser}.
 */
public interface ccListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ccParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ccParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Hwcmd}
	 * labeled alternative in {@link ccParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterHwcmd(ccParser.HwcmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Hwcmd}
	 * labeled alternative in {@link ccParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitHwcmd(ccParser.HwcmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Incmd}
	 * labeled alternative in {@link ccParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterIncmd(ccParser.IncmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Incmd}
	 * labeled alternative in {@link ccParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitIncmd(ccParser.IncmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Oucmd}
	 * labeled alternative in {@link ccParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterOucmd(ccParser.OucmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Oucmd}
	 * labeled alternative in {@link ccParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitOucmd(ccParser.OucmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Upcmd}
	 * labeled alternative in {@link ccParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterUpcmd(ccParser.UpcmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Upcmd}
	 * labeled alternative in {@link ccParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitUpcmd(ccParser.UpcmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lacmd}
	 * labeled alternative in {@link ccParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterLacmd(ccParser.LacmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lacmd}
	 * labeled alternative in {@link ccParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitLacmd(ccParser.LacmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sicmd}
	 * labeled alternative in {@link ccParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterSicmd(ccParser.SicmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sicmd}
	 * labeled alternative in {@link ccParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitSicmd(ccParser.SicmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ccParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ccParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#latch}.
	 * @param ctx the parse tree
	 */
	void enterLatch(ccParser.LatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#latch}.
	 * @param ctx the parse tree
	 */
	void exitLatch(ccParser.LatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#iovalue}.
	 * @param ctx the parse tree
	 */
	void enterIovalue(ccParser.IovalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#iovalue}.
	 * @param ctx the parse tree
	 */
	void exitIovalue(ccParser.IovalueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SigOp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSigOp(ccParser.SigOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SigOp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSigOp(ccParser.SigOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrOp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOrOp(ccParser.OrOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrOp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOrOp(ccParser.OrOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenOp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParenOp(ccParser.ParenOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenOp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParenOp(ccParser.ParenOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotOp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNotOp(ccParser.NotOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotOp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNotOp(ccParser.NotOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAndOp(ccParser.AndOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOp}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAndOp(ccParser.AndOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#ignore}.
	 * @param ctx the parse tree
	 */
	void enterIgnore(ccParser.IgnoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#ignore}.
	 * @param ctx the parse tree
	 */
	void exitIgnore(ccParser.IgnoreContext ctx);
}