package gen;// Generated from C:/Users/Micro/IdeaProjects/LucasCOMP/src/myLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link myLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface myLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link myLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(myLangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(myLangParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(myLangParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(myLangParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(myLangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(myLangParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(myLangParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(myLangParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(myLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(myLangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(myLangParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#controlStruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlStruct(myLangParser.ControlStructContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#forDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDecl(myLangParser.ForDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#caseList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseList(myLangParser.CaseListContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#caseDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseDecl(myLangParser.CaseDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#structDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDecl(myLangParser.StructDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(myLangParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#arrayInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInit(myLangParser.ArrayInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(myLangParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpr(myLangParser.LogicExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#relExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(myLangParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#arithExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithExpr(myLangParser.ArithExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(myLangParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(myLangParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpr(myLangParser.PostfixExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(myLangParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link myLangParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(myLangParser.PrimaryContext ctx);
}