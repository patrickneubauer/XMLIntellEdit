package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.CollectionType;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.SendSignalAction;
import org.eclipse.ocl.expressions.AssociationClassCallExp;
import org.eclipse.ocl.expressions.BooleanLiteralExp;
import org.eclipse.ocl.expressions.CollectionItem;
import org.eclipse.ocl.expressions.CollectionLiteralExp;
import org.eclipse.ocl.expressions.CollectionRange;
import org.eclipse.ocl.expressions.EnumLiteralExp;
import org.eclipse.ocl.expressions.IfExp;
import org.eclipse.ocl.expressions.IntegerLiteralExp;
import org.eclipse.ocl.expressions.InvalidLiteralExp;
import org.eclipse.ocl.expressions.IterateExp;
import org.eclipse.ocl.expressions.IteratorExp;
import org.eclipse.ocl.expressions.LetExp;
import org.eclipse.ocl.expressions.MessageExp;
import org.eclipse.ocl.expressions.NullLiteralExp;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.expressions.RealLiteralExp;
import org.eclipse.ocl.expressions.StateExp;
import org.eclipse.ocl.expressions.StringLiteralExp;
import org.eclipse.ocl.expressions.TupleLiteralExp;
import org.eclipse.ocl.expressions.TupleLiteralPart;
import org.eclipse.ocl.expressions.TypeExp;
import org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.expressions.UnspecifiedValueExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.expressions.VariableExp;
import org.eclipse.ocl.util.OCLStandardLibraryUtil;
import org.eclipse.ocl.utilities.ExpressionInOCL;
import org.eclipse.ocl.utilities.PredefinedType;
import org.eclipse.ocl.utilities.Visitor;

public class OCL2JavaVisitor implements Visitor<String, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint> {
	
	private final StringBuilder sb = new StringBuilder();
	private final Map<String, String> variables = new HashMap<>();
	private int varNr = 0;
	
	public StringBuilder getStringBuilder() {
		return sb;
	}
	
	public static String toJava(EClass context, String expression) {
		OCL ocl = OCL.newInstance();
		Helper oclHelper = ocl.createOCLHelper();

		oclHelper.setContext(context);
		OCL2JavaVisitor visitor = new OCL2JavaVisitor();
		
		try {
			OCLExpression expr = oclHelper.createQuery(expression);
			String r = expr.accept(visitor);
			StringBuilder sb = visitor.getStringBuilder();
			sb.append("return ").append(r).append(';');
			return sb.toString();
		} catch (Throwable e) {
			throw new RuntimeException("Failed to generate Java Code for context '" + context.getName() + "' and expression: " + expression, e);
		}
	}
	
	@Override
	public String visitVariableExp(VariableExp<EClassifier, EParameter> variableExp) {
		return variableExp.getReferredVariable().accept(this);
	}

	@Override
	public String visitLetExp(LetExp<EClassifier, EParameter> letExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitIfExp(IfExp<EClassifier> ifExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitTypeExp(TypeExp<EClassifier> typeExp) {
		return typeExp.getReferredType().getName();
	}

	private String getJavaClassName(EClassifier type) {
		if (type.getInstanceClass() == null) {
			throw new RuntimeException("The XMI-generated EClass instance was not wired up with the generated model classes for type: " + type.getName());
		} else {
			if (type instanceof CollectionType) {
				String elementName = ((CollectionType) type).getElementType().getInstanceClassName();
				return "java.util.Collection" + '<' + elementName + '>';
			} else {
				return type.getInstanceClassName();
			}
		}
	}
	
	@Override
	public String visitPropertyCallExp(PropertyCallExp<EClassifier, EStructuralFeature> callExp) {
		String varName = callExp.getSource().accept(this);
		
		sb.append("final ");
		sb.append(getJavaClassName(callExp.getType()));
		sb.append(' ');
		
		String targetVarName = getVarname();
		sb.append(targetVarName);
		sb.append(" = ");
		sb.append(varName);
		sb.append('.');
		
		String getterName = getGetter(callExp.getReferredProperty());
		sb.append(getterName);
		sb.append("()");
		
		sb.append(";\n");

		return targetVarName;
	}
	
	private String getGetter(EStructuralFeature property) {
		String attribute = property.getName();
		StringBuilder sb = new StringBuilder(attribute.length() + 3);
		
		if (property.getEType().getInstanceClass() == Boolean.TYPE) {
			sb.append("is");
		} else {
			sb.append("get");
		}
		
		sb.append(Character.toUpperCase(attribute.charAt(0)));
		sb.append(attribute, 1, attribute.length());
		return sb.toString();
	}
	
	private String getVarname() {
		return "var" + (varNr++);
	}

	@Override
	public String visitOperationCallExp(OperationCallExp<EClassifier, EOperation> callExp) {
		final int code = callExp.getOperationCode();
		switch (code) {
		case PredefinedType.PLUS:
			if (callExp.getArgument().size() == 0) {
				return "+" + callExp.getSource().accept(this);
			} else {
				throw new UnsupportedOperationException("Unsupported operation code: " + code);
			}
		case PredefinedType.MINUS:
			if (callExp.getArgument().size() == 0) {
				return "-" + callExp.getSource().accept(this);
			} else {
				throw new UnsupportedOperationException("Unsupported operation code: " + code);
			}
		case PredefinedType.AND:
			return applyBinaryOperator(callExp, "&&");
		case PredefinedType.OR:
			return applyBinaryOperator(callExp, "||");
		case PredefinedType.SIZE:
			if (callExp.getSource().getType().getInstanceClass() == String.class) {
				return applyFunctionCall(callExp, "length");
			} else if (Collection.class.isAssignableFrom(callExp.getSource().getType().getInstanceClass())) {
				return applyFunctionCall(callExp, "size");
			} else {
				throw new UnsupportedOperationException("Unsupported source value type for size function: " + callExp.getSource().getType().getInstanceClass());
			}
		case PredefinedType.XOR:
			return applyBinaryOperator(callExp, "^");
		case PredefinedType.EQUAL:
			if (callExp.getSource().getType().getInstanceClass().isPrimitive()) {
				return applyBinaryOperator(callExp, "==");
			} else {
				return applyStaticFunctionCall(callExp, "at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCL2JavaSupport.equals");
			}
		case PredefinedType.NOT_EQUAL:
			if (callExp.getSource().getType().getInstanceClass().isPrimitive()) {
				return applyBinaryOperator(callExp, "!=");
			} else {
				return applyStaticFunctionCall(callExp, "!at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCL2JavaSupport.equals");
			}
		case PredefinedType.OCL_AS_TYPE: {
			String left = callExp.getSource().accept(this);
			String right = callExp.getArgument().get(0).accept(this);
			EClassifier type = callExp.getType();
			
			sb.append("final ");
			sb.append(getJavaClassName(type));
			sb.append(' ');
			
			String targetVarName = getVarname();
			sb.append(targetVarName);
			sb.append(" = ");

			sb.append('(');
			sb.append(getJavaClassName(type));
			sb.append(") ");
			sb.append(left);

			sb.append(";\n");
			
			return targetVarName;
		}
		case PredefinedType.GREATER_THAN:
			return applyBinaryOperator(callExp, ">");
		case PredefinedType.GREATER_THAN_EQUAL:
			return applyBinaryOperator(callExp, ">=");
		case PredefinedType.LESS_THAN:
			return applyBinaryOperator(callExp, "<");
		case PredefinedType.LESS_THAN_EQUAL:
			return applyBinaryOperator(callExp, "<=");
		case PredefinedType.AT:
			return applyFunctionCall(callExp, "substring", "java.lang.String", l -> l, r -> r + " - 1, " + r);
		case PredefinedType.IMPLIES:
			return applyBinaryOperator(callExp, "||", l -> '!' + l, Function.identity());
		case PredefinedType.FIRST:
			return applyFunctionCall(callExp, "iterator().next");
		case PredefinedType.AS_ORDERED_SET:
			return applyStaticFunctionCall(callExp, "new java.util.LinkedHashSet");
		case PredefinedType.OCL_IS_KIND_OF: {
			String left = callExp.getSource().accept(this);
			String right = callExp.getArgument().get(0).accept(this);

			sb.append("final boolean ");
			
			String targetVarName = getVarname();
			sb.append(targetVarName);
			sb.append(" = ");
			
			sb.append("evalEnv.isKindOf(");
			sb.append(left);
			sb.append(", ePackage.getEClassifier(\"");
			sb.append(right);
			sb.append("\"))");

			sb.append(";\n");
			return targetVarName;
		}
		case PredefinedType.ALL_INSTANCES: {
			String left = callExp.getSource().accept(this);

			sb.append("final ");
			sb.append("java.util.Set<");
			sb.append(getJavaClassName((EClass) ((TypeExp<?>) callExp.getSource()).getReferredType()));
			sb.append("> ");
			
			String targetVarName = getVarname();
			sb.append(targetVarName);
			sb.append(" = ");
			
			sb.append(" (java.util.Set) extents.get(");
			
			sb.append("ePackage.getEClassifier(\"");
			sb.append(left);
			sb.append("\"))");

			sb.append(";\n");
			return targetVarName;
		}
		case PredefinedType.INCLUDES:
			return applyStaticFunctionCall(callExp, "org.eclipse.ocl.util.CollectionUtil.includes", "boolean");
		case PredefinedType.INCLUDES_ALL:
			return applyStaticFunctionCall(callExp, "org.eclipse.ocl.util.CollectionUtil.includesAll", "boolean");
		case PredefinedType.EXCLUDES:
			return applyStaticFunctionCall(callExp, "org.eclipse.ocl.util.CollectionUtil.excludes", "boolean");
		case PredefinedType.EXCLUDES_ALL:
			return applyStaticFunctionCall(callExp, "org.eclipse.ocl.util.CollectionUtil.excludesAll", "boolean");
		case PredefinedType.UNION:
			return applyStaticFunctionCall(callExp, "org.eclipse.ocl.util.CollectionUtil.union");
		case PredefinedType.INTERSECTION:
			return applyStaticFunctionCall(callExp, "org.eclipse.ocl.util.CollectionUtil.intersection");
		case PredefinedType.INCLUDING:
			return applyStaticFunctionCall(callExp, "org.eclipse.ocl.util.CollectionUtil.including");
		case PredefinedType.EXCLUDING:
			return applyStaticFunctionCall(callExp, "org.eclipse.ocl.util.CollectionUtil.excluding");
		case PredefinedType.IS_EMPTY:
			return applyFunctionCall(callExp, "isEmpty", "boolean");
		case PredefinedType.MATCHES:
			return applyFunctionCall(callExp, "matches", "boolean", l -> {
				Class<?> instanceClass = callExp.getSource().getType().getInstanceClass();
				// TODO: handle other primitive?
				if (char.class == instanceClass) {
					return "Character.toString(" + l + ')';
				} else if (String.class == instanceClass) {
					return l;
				} else {
					return l + ".toString()";
				}
			}, Function.identity());
		case PredefinedType.SELECT_BY_KIND: {
			String left = callExp.getSource().accept(this);
			String right = callExp.getArgument().get(0).accept(this);
			EClass type = (EClass) ((TypeExp<?>) callExp.getArgument().get(0)).getReferredType();
			
			sb.append("final ");
			sb.append("java.util.Collection<");
			sb.append(getJavaClassName(type));
			sb.append("> ");
			
			String targetVarName = getVarname();
			sb.append(targetVarName);
			sb.append(" = ");

			sb.append("(java.util.Collection) ");
			sb.append("at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCL2JavaSupport.selectByKind");
			sb.append('(');
			sb.append(left);
			sb.append(", o -> {\n");
			
			sb.append("return evalEnv.isKindOf(");
			sb.append("o");
			sb.append(", ePackage.getEClassifier(\"");
			sb.append(right);
			sb.append("\"))");
			sb.append(';');
			
			sb.append("});\n");
			
			return targetVarName;
		}
		}
		
		throw new UnsupportedOperationException("Unsupported operation code: " + code);
	}

	public String applyBinaryOperator(OperationCallExp<EClassifier, EOperation> callExp, String operator) {
		return applyBinaryOperator(callExp, operator, Function.identity(), Function.identity());
	}
	
	public String applyBinaryOperator(OperationCallExp<EClassifier, EOperation> callExp, String operator, Function<String, String> leftFunction, Function<String, String> rightFunction) {
		List<String> operands = new ArrayList<String>(callExp.getArgument().size() + 1);
		
		operands.add(callExp.getSource().accept(this));
		for (org.eclipse.ocl.expressions.OCLExpression<EClassifier> exp : callExp.getArgument()) {
			operands.add(exp.accept(this));
		}
		
		sb.append("final boolean ");
		
		String targetVarName = getVarname();
		sb.append(targetVarName);
		sb.append(" = ");
		
		for (int i = 0; i < operands.size(); i++) {
			if (i != 0) {
				sb.append(' ');
				sb.append(operator);
				sb.append(' ');
				sb.append(rightFunction.apply(operands.get(i)));
			} else {
				sb.append(leftFunction.apply(operands.get(i)));
			}
		}
		
		sb.append(";\n");
		return targetVarName;
	}

	public String applyFunctionCall(OperationCallExp<EClassifier, EOperation> callExp, String functionName) {
		return applyFunctionCall(callExp, functionName, getJavaClassName(callExp.getType()), null, Function.identity(), Function.identity(), false, false);
	}

	public String applyFullFunctionCall(OperationCallExp<EClassifier, EOperation> callExp, String functionName, String returnType) {
		return applyFunctionCall(callExp, functionName, returnType, null, Function.identity(), Function.identity(), true, false);
	}

	public String applyStaticFunctionCall(OperationCallExp<EClassifier, EOperation> callExp, String functionName) {
		return applyStaticFunctionCallPrefixed(callExp, functionName, null);
	}
	
	public String applyStaticFunctionCallPrefixed(OperationCallExp<EClassifier, EOperation> callExp, String functionName, String prefix) {
		return applyStaticFunctionCallPrefixed(callExp, functionName, getJavaClassName(callExp.getType()), prefix);
	}

	public String applyStaticFunctionCall(OperationCallExp<EClassifier, EOperation> callExp, String functionName, String returnType) {
		return applyStaticFunctionCallPrefixed(callExp, functionName, returnType, null);
	}
	
	public String applyStaticFunctionCallPrefixed(OperationCallExp<EClassifier, EOperation> callExp, String functionName, String returnType, String prefix) {
		return applyFunctionCall(callExp, functionName, returnType, prefix, Function.identity(), Function.identity(), false, true);
	}
	
	public String applyFunctionCall(OperationCallExp<EClassifier, EOperation> callExp, String functionName, String returnType) {
		return applyFunctionCall(callExp, functionName, returnType, null, Function.identity(), Function.identity(), false, false);
	}

	public String applyFunctionCall(OperationCallExp<EClassifier, EOperation> callExp, String functionName, String returnType, Function<String, String> leftFunction, Function<String, String> rightFunction) {
		return applyFunctionCall(callExp, functionName, returnType, null, leftFunction, rightFunction, false, false);
	}
	
	public String applyFunctionCall(OperationCallExp<EClassifier, EOperation> callExp, String functionName, String returnType, String prefix, Function<String, String> leftFunction, Function<String, String> rightFunction, boolean hasParenthesis, boolean staticCall) {
		String left = callExp.getSource().accept(this);
		String right;
		
		if (callExp.getArgument().isEmpty()) {
			right = null;
		} else {
			right = callExp.getArgument().get(0).accept(this);
		}

		sb.append("final ");
		sb.append(returnType);
		sb.append(' ');
		
		String targetVarName = getVarname();
		sb.append(targetVarName);
		sb.append(" = ");
		
		if (prefix != null) {
			sb.append(prefix);
		}
		
		if (!staticCall) {
			sb.append(leftFunction.apply(left));
			sb.append('.');
		}
		
		sb.append(functionName);
		
		if (right == null) {
			if (staticCall) {
				sb.append('(');
				sb.append(leftFunction.apply(left));
				sb.append(')');
			} else {
				if (!hasParenthesis) {
					sb.append("()");
				}
			}
		} else {
			sb.append('(');
			if (staticCall) {
				sb.append(leftFunction.apply(left));
				sb.append(", ");
			}
			sb.append(rightFunction.apply(right));
			sb.append(')');
		}

		sb.append(";\n");
		return targetVarName;
	}

	@Override
	public String visitAssociationClassCallExp(
			AssociationClassCallExp<EClassifier, EStructuralFeature> callExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitIteratorExp(IteratorExp<EClassifier, EParameter> callExp) {
		String left = callExp.getSource().accept(this);
		
		sb.append("final ");
		sb.append(getJavaClassName(callExp.getType()));
		sb.append(' ');
		
		String targetVarName = getVarname();
		sb.append(targetVarName);
		sb.append(" = ");
		
		List<Variable<EClassifier, EParameter>> variableList = callExp.getIterator();
		final String[] varNames = new String[variableList.size()];
		for (int i = 0; i < varNames.length; i++) {
			Variable<EClassifier, EParameter> iterVar = variableList.get(i);
			String varName = getVarname();
			varNames[i] = varName;
			variables.put(iterVar.getName(), varName);
		}
		
		try {
			switch (OCLStandardLibraryUtil.getOperationCode(callExp.getName())) {
			case PredefinedType.EXISTS:
				throw new UnsupportedOperationException("Iteration type '" + callExp.getName() + "' not yet implemented!");
			case PredefinedType.FOR_ALL:
				return applyFunctionPredicate(left, "at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCL2JavaSupport.forAll", callExp, targetVarName, varNames);
			case PredefinedType.SELECT: 
				return applyFunctionPredicate(left, "at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCL2JavaSupport.select", callExp, targetVarName, varNames);
			case PredefinedType.REJECT:
				throw new UnsupportedOperationException("Iteration type '" + callExp.getName() + "' not yet implemented!");
			case PredefinedType.COLLECT:
				if (Collection.class.isAssignableFrom(callExp.getBody().getType().getInstanceClass())) {
					return applyFunctionPredicate(left, "at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCL2JavaSupport.collectCollection", callExp, targetVarName, varNames);
				} else {
					return applyFunctionPredicate(left, "at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCL2JavaSupport.collect", callExp, targetVarName, varNames);
				}
			case PredefinedType.COLLECT_NESTED:
				throw new UnsupportedOperationException("Iteration type '" + callExp.getName() + "' not yet implemented!");
			case PredefinedType.ONE:
				throw new UnsupportedOperationException("Iteration type '" + callExp.getName() + "' not yet implemented!");
			case PredefinedType.ANY:
				throw new UnsupportedOperationException("Iteration type '" + callExp.getName() + "' not yet implemented!");
			case PredefinedType.SORTED_BY:
				throw new UnsupportedOperationException("Iteration type '" + callExp.getName() + "' not yet implemented!");
			case PredefinedType.IS_UNIQUE:
				throw new UnsupportedOperationException("Iteration type '" + callExp.getName() + "' not yet implemented!");
			case PredefinedType.CLOSURE:
				if (Collection.class.isAssignableFrom(callExp.getBody().getType().getInstanceClass())) {
					return applyFunctionPredicate(left, "at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCL2JavaSupport.closureCollection", callExp, targetVarName, varNames);
				} else {
					return applyFunctionPredicate(left, "at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCL2JavaSupport.closure", callExp, targetVarName, varNames);
				}
			}
		} finally {
			for (int i = 0; i < varNames.length; i++) {
				Variable<EClassifier, EParameter> iterVar = variableList.get(i);
				variables.remove(iterVar.getName());
			}
		}
		
		throw new UnsupportedOperationException("Unknown iteration type '" + callExp.getName() + "'!");
	}
	
	private String applyFunctionPredicate(String left, String functionName, IteratorExp<EClassifier, EParameter> callExp, String returnVariable, String[] varNames) {
		sb.append(functionName);
		sb.append('(');
		
		sb.append(left);
		sb.append(", ");
		
		if (varNames.length == 1) {
			sb.append(varNames[0]);
			sb.append(" -> {\n");
		} else {
			sb.append(varNames.length);
			sb.append(", ");
			
			String list = getVarname();
			sb.append(list);
			sb.append(" -> {\n");
			for (int i = 0; i < varNames.length; i++) {
				sb.append("final ");
				sb.append(getJavaClassName(callExp.getIterator().get(i).getType()));
				sb.append(' ');
				sb.append(varNames[i]);
				sb.append(" = ");
				sb.append(list);
				sb.append(".get(");
				sb.append(i);
				sb.append(");\n");
			}
		}
		
		String resultVar = callExp.getBody().accept(this);
		sb.append("return ");
		sb.append(resultVar);
		sb.append(";\n});\n");
		return returnVariable;
	}

	@Override
	public String visitIterateExp(IterateExp<EClassifier, EParameter> callExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitUnspecifiedValueExp(UnspecifiedValueExp<EClassifier> unspecExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitIntegerLiteralExp(IntegerLiteralExp<EClassifier> literalExp) {
		if (literalExp.getLongSymbol() != null) {
			return literalExp.getLongSymbol().toString();
		} else {
			return literalExp.getIntegerSymbol().toString();
		}
	}

	@Override
	public String visitUnlimitedNaturalLiteralExp(UnlimitedNaturalLiteralExp<EClassifier> literalExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitRealLiteralExp(RealLiteralExp<EClassifier> literalExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitStringLiteralExp(StringLiteralExp<EClassifier> literalExp) {
		return '"' + literalExp.getStringSymbol() + '"';
	}

	@Override
	public String visitBooleanLiteralExp(BooleanLiteralExp<EClassifier> literalExp) {
		return literalExp.getBooleanSymbol().toString();
	}

	@Override
	public String visitEnumLiteralExp(EnumLiteralExp<EClassifier, EEnumLiteral> literalExp) {
		return literalExp.getType().getInstanceClassName() + ".get(" + literalExp.getReferredEnumLiteral().getValue() + ')';
	}

	@Override
	public String visitCollectionLiteralExp(CollectionLiteralExp<EClassifier> literalExp) {
		if (literalExp.getPart().size() != 1) {
			throw new UnsupportedOperationException("Expected literal part size 1, not yet implemented for: " + literalExp.getPart().size());
		}
		
		String left = literalExp.getPart().get(0).accept(this);
		
		String collectionType = "java.util.Collection";
		String parameterType = getJavaClassName(((CollectionType) literalExp.getType()).getElementType());
		
		sb.append("final ");
		sb.append(collectionType);
		sb.append('<');
		sb.append(parameterType);
		sb.append("> ");
		
		String targetVarName = getVarname();
		sb.append(targetVarName);
		sb.append(" = ");
		
		sb.append("java.util.Arrays.asList(");
		sb.append(left);
		sb.append(')');

		sb.append(";\n");
		return targetVarName;
	}

	@Override
	public String visitCollectionItem(CollectionItem<EClassifier> item) {
		return item.getItem().accept(this);
	}

	@Override
	public String visitCollectionRange(CollectionRange<EClassifier> range) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitTupleLiteralExp(TupleLiteralExp<EClassifier, EStructuralFeature> literalExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitTupleLiteralPart(TupleLiteralPart<EClassifier, EStructuralFeature> part) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitInvalidLiteralExp(InvalidLiteralExp<EClassifier> literalExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitNullLiteralExp(NullLiteralExp<EClassifier> literalExp) {
		return "null";
	}

	@Override
	public String visitStateExp(StateExp<EClassifier, EObject> stateExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitMessageExp(MessageExp<EClassifier, CallOperationAction, SendSignalAction> messageExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitVariable(Variable<EClassifier, EParameter> variable) {
		String varName = variables.get(variable.getName());
		
		if (varName != null) {
			return varName;
		}
		
		if (!"self".equals(variable.getName())) {
			throw new IllegalArgumentException("Unknown variable '" + variable.getName() + "'");
		}
		
		if (variable.getInitExpression() != null) {
			// TODO: implement
			throw new UnsupportedOperationException("Not yet implemented!");
		}
		if (variable.getRepresentedParameter() != null) {
			// TODO: implement
			throw new UnsupportedOperationException("Not yet implemented!");
		}
		
		return "self";
	}

	@Override
	public String visitExpressionInOCL(ExpressionInOCL<EClassifier, EParameter> expression) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitConstraint(Constraint constraint) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

}