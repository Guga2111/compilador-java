package gen;// Generated from C:/Users/Micro/IdeaProjects/LucasCOMP/src/myLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link myLangParser}.
 */
public interface myLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link myLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(myLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(myLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(myLangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(myLangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(myLangParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(myLangParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(myLangParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(myLangParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(myLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(myLangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(myLangParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(myLangParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(myLangParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(myLangParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(myLangParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(myLangParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(myLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(myLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(myLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(myLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(myLangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(myLangParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#controlStruct}.
	 * @param ctx the parse tree
	 */
	void enterControlStruct(myLangParser.ControlStructContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#controlStruct}.
	 * @param ctx the parse tree
	 */
	void exitControlStruct(myLangParser.ControlStructContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#forDecl}.
	 * @param ctx the parse tree
	 */
	void enterForDecl(myLangParser.ForDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#forDecl}.
	 * @param ctx the parse tree
	 */
	void exitForDecl(myLangParser.ForDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#caseList}.
	 * @param ctx the parse tree
	 */
	void enterCaseList(myLangParser.CaseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#caseList}.
	 * @param ctx the parse tree
	 */
	void exitCaseList(myLangParser.CaseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#caseDecl}.
	 * @param ctx the parse tree
	 */
	void enterCaseDecl(myLangParser.CaseDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#caseDecl}.
	 * @param ctx the parse tree
	 */
	void exitCaseDecl(myLangParser.CaseDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#structDecl}.
	 * @param ctx the parse tree
	 */
	void enterStructDecl(myLangParser.StructDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#structDecl}.
	 * @param ctx the parse tree
	 */
	void exitStructDecl(myLangParser.StructDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(myLangParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(myLangParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#arrayInit}.
	 * @param ctx the parse tree
	 */
	void enterArrayInit(myLangParser.ArrayInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#arrayInit}.
	 * @param ctx the parse tree
	 */
	void exitArrayInit(myLangParser.ArrayInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(myLangParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(myLangParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpr(myLangParser.LogicExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpr(myLangParser.LogicExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(myLangParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(myLangParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithExpr(myLangParser.ArithExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithExpr(myLangParser.ArithExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(myLangParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(myLangParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(myLangParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(myLangParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(myLangParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(myLangParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(myLangParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(myLangParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(myLangParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(myLangParser.PrimaryContext ctx);
}