// Generated from CFTransmission.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CFTransmissionParser}.
 */
public interface CFTransmissionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(CFTransmissionParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(CFTransmissionParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterComponentBody(CFTransmissionParser.ComponentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitComponentBody(CFTransmissionParser.ComponentBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#componentElement}.
	 * @param ctx the parse tree
	 */
	void enterComponentElement(CFTransmissionParser.ComponentElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#componentElement}.
	 * @param ctx the parse tree
	 */
	void exitComponentElement(CFTransmissionParser.ComponentElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(CFTransmissionParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(CFTransmissionParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(CFTransmissionParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(CFTransmissionParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(CFTransmissionParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(CFTransmissionParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#argumentsDefinition}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsDefinition(CFTransmissionParser.ArgumentsDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#argumentsDefinition}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsDefinition(CFTransmissionParser.ArgumentsDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#argumentDefinition}.
	 * @param ctx the parse tree
	 */
	void enterArgumentDefinition(CFTransmissionParser.ArgumentDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#argumentDefinition}.
	 * @param ctx the parse tree
	 */
	void exitArgumentDefinition(CFTransmissionParser.ArgumentDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#argumentName}.
	 * @param ctx the parse tree
	 */
	void enterArgumentName(CFTransmissionParser.ArgumentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#argumentName}.
	 * @param ctx the parse tree
	 */
	void exitArgumentName(CFTransmissionParser.ArgumentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(CFTransmissionParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(CFTransmissionParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CFTransmissionParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CFTransmissionParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#saveContentStatement}.
	 * @param ctx the parse tree
	 */
	void enterSaveContentStatement(CFTransmissionParser.SaveContentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#saveContentStatement}.
	 * @param ctx the parse tree
	 */
	void exitSaveContentStatement(CFTransmissionParser.SaveContentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(CFTransmissionParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(CFTransmissionParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#nonVarVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterNonVarVariableStatement(CFTransmissionParser.NonVarVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#nonVarVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitNonVarVariableStatement(CFTransmissionParser.NonVarVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CFTransmissionParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CFTransmissionParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CFTransmissionParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CFTransmissionParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(CFTransmissionParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(CFTransmissionParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CFTransmissionParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CFTransmissionParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CFTransmissionParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CFTransmissionParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CFTransmissionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CFTransmissionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#expressionFirst}.
	 * @param ctx the parse tree
	 */
	void enterExpressionFirst(CFTransmissionParser.ExpressionFirstContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#expressionFirst}.
	 * @param ctx the parse tree
	 */
	void exitExpressionFirst(CFTransmissionParser.ExpressionFirstContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#validSecond}.
	 * @param ctx the parse tree
	 */
	void enterValidSecond(CFTransmissionParser.ValidSecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#validSecond}.
	 * @param ctx the parse tree
	 */
	void exitValidSecond(CFTransmissionParser.ValidSecondContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#expressionMethod}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMethod(CFTransmissionParser.ExpressionMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#expressionMethod}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMethod(CFTransmissionParser.ExpressionMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CFTransmissionParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CFTransmissionParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#quotedVariableName}.
	 * @param ctx the parse tree
	 */
	void enterQuotedVariableName(CFTransmissionParser.QuotedVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#quotedVariableName}.
	 * @param ctx the parse tree
	 */
	void exitQuotedVariableName(CFTransmissionParser.QuotedVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(CFTransmissionParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(CFTransmissionParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#variableNameFirst}.
	 * @param ctx the parse tree
	 */
	void enterVariableNameFirst(CFTransmissionParser.VariableNameFirstContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#variableNameFirst}.
	 * @param ctx the parse tree
	 */
	void exitVariableNameFirst(CFTransmissionParser.VariableNameFirstContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(CFTransmissionParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(CFTransmissionParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(CFTransmissionParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(CFTransmissionParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void enterKeyValue(CFTransmissionParser.KeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void exitKeyValue(CFTransmissionParser.KeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#argumentValue}.
	 * @param ctx the parse tree
	 */
	void enterArgumentValue(CFTransmissionParser.ArgumentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#argumentValue}.
	 * @param ctx the parse tree
	 */
	void exitArgumentValue(CFTransmissionParser.ArgumentValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(CFTransmissionParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(CFTransmissionParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CFTransmissionParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(CFTransmissionParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CFTransmissionParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(CFTransmissionParser.BooleanLiteralContext ctx);
}