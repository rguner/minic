
package com.guner.elcalisma;

import com.sun.el.ExpressionFactoryImpl;
import javax.el.ArrayELResolver;
import javax.el.BeanELResolver;
import javax.el.CompositeELResolver;
import javax.el.ELContext;
import javax.el.ELResolver;
import javax.el.FunctionMapper;
import javax.el.ListELResolver;
import javax.el.MapELResolver;
import javax.el.ValueExpression;
import javax.el.VariableMapper;

import java.util.HashMap;
import java.util.Map;

public class RomEL {

	public static ExpressionFactoryImpl getExpressionFactory() {
		com.sun.el.ExpressionFactoryImpl expressionFactory = new ExpressionFactoryImpl();
		return expressionFactory;
	}

	public static ELContext getELContext(Map<Object, Object> userMap) {
		// create the context
		ELResolver elResolver = new RomELResolver(userMap);
		final VariableMapper variableMapper = new RomVariableMapper();
		final RomFunctionMapper functionMapper = new RomFunctionMapper();
		final CompositeELResolver compositeELResolver = new CompositeELResolver();
		compositeELResolver.add(elResolver);
		compositeELResolver.add(new ArrayELResolver());
		compositeELResolver.add(new ListELResolver());
		compositeELResolver.add(new BeanELResolver());
		compositeELResolver.add(new MapELResolver());

		ELContext context = new ELContext() {

			@Override
			public ELResolver getELResolver() {
				return compositeELResolver;
			}

			@Override
			public FunctionMapper getFunctionMapper() {
				return functionMapper;
			}

			@Override
			public VariableMapper getVariableMapper() {
				return variableMapper;
			}
		};

		return context;
	}

	public static void main(String[] args) throws Exception {
		Map<Object, Object> userMap = new HashMap<Object, Object>();
		userMap.put("x", Integer.valueOf(123));
		userMap.put("y", Integer.valueOf(456));
		ExpressionFactoryImpl expressionFactory = getExpressionFactory();
		ELContext elContext = getELContext(userMap);

		// create and resolve a value expression
		String sumExpr = "${x+y+2}";
		ValueExpression ve = expressionFactory.createValueExpression(elContext, sumExpr, Object.class);
		Object result = ve.getValue(elContext);
		System.out.println("Result=" + result);

		String sumExpr2 = "${12*12}";
		ValueExpression ve2 = expressionFactory.createValueExpression(elContext, sumExpr2, Object.class);
		Object result2 = ve2.getValue(elContext);
		System.out.println("Result=" + result2);

	}

}
