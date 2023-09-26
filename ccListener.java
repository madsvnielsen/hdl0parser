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
	 * Enter a parse tree produced by {@link ccParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(ccParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(ccParser.CommandsContext ctx);
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
	 * Enter a parse tree produced by {@link ccParser#updatescmd}.
	 * @param ctx the parse tree
	 */
	void enterUpdatescmd(ccParser.UpdatescmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#updatescmd}.
	 * @param ctx the parse tree
	 */
	void exitUpdatescmd(ccParser.UpdatescmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#latchescmd}.
	 * @param ctx the parse tree
	 */
	void enterLatchescmd(ccParser.LatchescmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#latchescmd}.
	 * @param ctx the parse tree
	 */
	void exitLatchescmd(ccParser.LatchescmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#simulatedcmd}.
	 * @param ctx the parse tree
	 */
	void enterSimulatedcmd(ccParser.SimulatedcmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#simulatedcmd}.
	 * @param ctx the parse tree
	 */
	void exitSimulatedcmd(ccParser.SimulatedcmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ccParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ccParser.ExpContext ctx);
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