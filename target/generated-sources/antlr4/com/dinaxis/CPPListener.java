// Generated from com\dinaxis\CPP.g4 by ANTLR 4.9.3
package com.dinaxis;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CPPParser}.
 */
public interface CPPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CPPParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CPPParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CPPParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CPPParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CPPParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CPPParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CPPParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CPPParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CPPParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CPPParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CPPParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CPPParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CPPParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CPPParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CPPParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(CPPParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(CPPParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(CPPParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(CPPParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CPPParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CPPParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CPPParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CPPParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(CPPParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(CPPParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(CPPParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(CPPParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#objectCreation}.
	 * @param ctx the parse tree
	 */
	void enterObjectCreation(CPPParser.ObjectCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#objectCreation}.
	 * @param ctx the parse tree
	 */
	void exitObjectCreation(CPPParser.ObjectCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(CPPParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(CPPParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(CPPParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(CPPParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CPPParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CPPParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectCreationExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectCreationExpr(CPPParser.ObjectCreationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectCreationExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectCreationExpr(CPPParser.ObjectCreationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(CPPParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(CPPParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(CPPParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(CPPParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(CPPParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(CPPParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubMulDivExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubMulDivExpr(CPPParser.AddSubMulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubMulDivExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubMulDivExpr(CPPParser.AddSubMulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(CPPParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(CPPParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(CPPParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(CPPParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(CPPParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(CPPParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberAccessExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessExpr(CPPParser.MemberAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberAccessExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessExpr(CPPParser.MemberAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(CPPParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link CPPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(CPPParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#coutStatement}.
	 * @param ctx the parse tree
	 */
	void enterCoutStatement(CPPParser.CoutStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#coutStatement}.
	 * @param ctx the parse tree
	 */
	void exitCoutStatement(CPPParser.CoutStatementContext ctx);
}