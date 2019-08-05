// Generated from /workspace/sylph/sylph-parser/src/main/antlr/ideal/sylph/parser/antlr4/SqlBase.g4 by ANTLR 4.7.2

package ideal.sylph.parser.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlBaseParser}.
 */
public interface SqlBaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(SqlBaseParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(SqlBaseParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(SqlBaseParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(SqlBaseParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectQuery}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSelectQuery(SqlBaseParser.SelectQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectQuery}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSelectQuery(SqlBaseParser.SelectQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(SqlBaseParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(SqlBaseParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(SqlBaseParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(SqlBaseParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createStreamAsSelect}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateStreamAsSelect(SqlBaseParser.CreateStreamAsSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createStreamAsSelect}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateStreamAsSelect(SqlBaseParser.CreateStreamAsSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertInto}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInsertInto(SqlBaseParser.InsertIntoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertInto}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInsertInto(SqlBaseParser.InsertIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#watermark}.
	 * @param ctx the parse tree
	 */
	void enterWatermark(SqlBaseParser.WatermarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#watermark}.
	 * @param ctx the parse tree
	 */
	void exitWatermark(SqlBaseParser.WatermarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#queryStream}.
	 * @param ctx the parse tree
	 */
	void enterQueryStream(SqlBaseParser.QueryStreamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#queryStream}.
	 * @param ctx the parse tree
	 */
	void exitQueryStream(SqlBaseParser.QueryStreamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void enterTableElement(SqlBaseParser.TableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void exitTableElement(SqlBaseParser.TableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#proctime}.
	 * @param ctx the parse tree
	 */
	void enterProctime(SqlBaseParser.ProctimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#proctime}.
	 * @param ctx the parse tree
	 */
	void exitProctime(SqlBaseParser.ProctimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(SqlBaseParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(SqlBaseParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(SqlBaseParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(SqlBaseParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(SqlBaseParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(SqlBaseParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#sampleType}.
	 * @param ctx the parse tree
	 */
	void enterSampleType(SqlBaseParser.SampleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#sampleType}.
	 * @param ctx the parse tree
	 */
	void exitSampleType(SqlBaseParser.SampleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#columnAliases}.
	 * @param ctx the parse tree
	 */
	void enterColumnAliases(SqlBaseParser.ColumnAliasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#columnAliases}.
	 * @param ctx the parse tree
	 */
	void exitColumnAliases(SqlBaseParser.ColumnAliasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SqlBaseParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SqlBaseParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(SqlBaseParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(SqlBaseParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(SqlBaseParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(SqlBaseParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterComparison(SqlBaseParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitComparison(SqlBaseParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(SqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(SqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(SqlBaseParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(SqlBaseParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(SqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(SqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(SqlBaseParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(SqlBaseParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(SqlBaseParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(SqlBaseParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(SqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(SqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specialDateTimeFunction}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSpecialDateTimeFunction(SqlBaseParser.SpecialDateTimeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specialDateTimeFunction}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSpecialDateTimeFunction(SqlBaseParser.SpecialDateTimeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentPath}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentPath(SqlBaseParser.CurrentPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentPath}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentPath(SqlBaseParser.CurrentPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substring}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubstring(SqlBaseParser.SubstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substring}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubstring(SqlBaseParser.SubstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLiteral(SqlBaseParser.BinaryLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLiteral(SqlBaseParser.BinaryLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentUser}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentUser(SqlBaseParser.CurrentUserContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentUser}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentUser(SqlBaseParser.CurrentUserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extract}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExtract(SqlBaseParser.ExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExtract(SqlBaseParser.ExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SqlBaseParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SqlBaseParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayConstructor(SqlBaseParser.ArrayConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayConstructor(SqlBaseParser.ArrayConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameter}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SqlBaseParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameter}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SqlBaseParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalize}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNormalize(SqlBaseParser.NormalizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalize}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNormalize(SqlBaseParser.NormalizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPosition(SqlBaseParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPosition(SqlBaseParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(SqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(SqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basicStringLiteral}
	 * labeled alternative in {@link SqlBaseParser#string}.
	 * @param ctx the parse tree
	 */
	void enterBasicStringLiteral(SqlBaseParser.BasicStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basicStringLiteral}
	 * labeled alternative in {@link SqlBaseParser#string}.
	 * @param ctx the parse tree
	 */
	void exitBasicStringLiteral(SqlBaseParser.BasicStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unicodeStringLiteral}
	 * labeled alternative in {@link SqlBaseParser#string}.
	 * @param ctx the parse tree
	 */
	void enterUnicodeStringLiteral(SqlBaseParser.UnicodeStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unicodeStringLiteral}
	 * labeled alternative in {@link SqlBaseParser#string}.
	 * @param ctx the parse tree
	 */
	void exitUnicodeStringLiteral(SqlBaseParser.UnicodeStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#comparisonQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterComparisonQuantifier(SqlBaseParser.ComparisonQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#comparisonQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitComparisonQuantifier(SqlBaseParser.ComparisonQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(SqlBaseParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(SqlBaseParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#normalForm}.
	 * @param ctx the parse tree
	 */
	void enterNormalForm(SqlBaseParser.NormalFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#normalForm}.
	 * @param ctx the parse tree
	 */
	void exitNormalForm(SqlBaseParser.NormalFormContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SqlBaseParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SqlBaseParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(SqlBaseParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(SqlBaseParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(SqlBaseParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(SqlBaseParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qualifiedArgument}
	 * labeled alternative in {@link SqlBaseParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedArgument(SqlBaseParser.QualifiedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qualifiedArgument}
	 * labeled alternative in {@link SqlBaseParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedArgument(SqlBaseParser.QualifiedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unqualifiedArgument}
	 * labeled alternative in {@link SqlBaseParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedArgument(SqlBaseParser.UnqualifiedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unqualifiedArgument}
	 * labeled alternative in {@link SqlBaseParser#pathElement}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedArgument(SqlBaseParser.UnqualifiedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#pathSpecification}.
	 * @param ctx the parse tree
	 */
	void enterPathSpecification(SqlBaseParser.PathSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#pathSpecification}.
	 * @param ctx the parse tree
	 */
	void exitPathSpecification(SqlBaseParser.PathSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#privilege}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege(SqlBaseParser.PrivilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#privilege}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege(SqlBaseParser.PrivilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(SqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(SqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(SqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(SqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(SqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(SqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backQuotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterBackQuotedIdentifier(SqlBaseParser.BackQuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backQuotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitBackQuotedIdentifier(SqlBaseParser.BackQuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code digitIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterDigitIdentifier(SqlBaseParser.DigitIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code digitIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitDigitIdentifier(SqlBaseParser.DigitIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(SqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(SqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(SqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(SqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(SqlBaseParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(SqlBaseParser.NonReservedContext ctx);
}