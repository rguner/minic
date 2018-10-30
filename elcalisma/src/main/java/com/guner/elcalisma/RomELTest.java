/*
 * Copyright (c) 2008 McDowell Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files
 * (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions: The
 * above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software. THE SOFTWARE IS PROVIDED "AS IS",
 * WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
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

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * A simple application that demonstrates the use of the Unified Expression Language.
 * 
 * @author McDowell
 */
public class RomELTest {

	/**
	 * takes the javax.el.ExpressionFactory implementation class as an argument
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		/*
		 * ClassLoader cl = RomEL.class.getClassLoader(); Class<?> expressionFactoryClass = cl.loadClass("com.sun.el.ExpressionFactoryImpl"); ExpressionFactory
		 * expressionFactory = (ExpressionFactory) expressionFactoryClass.newInstance();
		 */

		com.sun.el.ExpressionFactoryImpl expressionFactory = new ExpressionFactoryImpl();

		// create a map with some variables in it
		Map<Object, Object> userMap = new HashMap<Object, Object>();
		userMap.put("x", Integer.valueOf(123));
		userMap.put("y", Integer.valueOf(456));
		userMap.put("ad", "Ramazan");
		userMap.put("soyad", "Guner");
		userMap.put("customerType", "bireysel");
		userMap.put("double", 12.1);
		ArrayList rList = new ArrayList();
		rList.add("ramazan");
		userMap.put("rlist", rList);

		// get the method for ${myprefix:hello(string)}
		Method sayHello = RomELTest.class.getMethod("sayHello", new Class[] {String.class});
		Method sayList = RomELTest.class.getMethod("sayList", new Class[] {ArrayList.class});

		// create the context
		ELResolver demoELResolver = new RomELResolver(userMap);
		final VariableMapper variableMapper = new RomVariableMapper();
		final RomFunctionMapper functionMapper = new RomFunctionMapper();
		functionMapper.addFunction("myprefix", "hello", sayHello);
		functionMapper.addFunction("myprefix", "sayListMethod", sayList);
		final CompositeELResolver compositeELResolver = new CompositeELResolver();
		compositeELResolver.add(demoELResolver);
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

		// create and resolve a value expression
		String sumExpr = "${x+y+2}";
		ValueExpression ve = expressionFactory.createValueExpression(context, sumExpr, Object.class);
		Object result = ve.getValue(context);
		System.out.println("Result=" + result);

		// call a function
		String fnExpr = "#{myprefix:hello('Dave')}";
		ValueExpression fn = expressionFactory.createValueExpression(context, fnExpr, Object.class);
		fn.getValue(context);

		String sumExpr2 = "${12*12}";
		ValueExpression ve2 = expressionFactory.createValueExpression(context, sumExpr2, Object.class);
		Object result2 = ve2.getValue(context);
		System.out.println("Result=" + result2);

		// String sumExpr3 = "${(12==12 and ad == 'Ramazan' and soyad == 'Guner ') or customerType eq 'bireysel2'}";
		String sumExpr3 = "${double==12.2}";
		ValueExpression ve3 = expressionFactory.createValueExpression(context, sumExpr3, Object.class);
		Object result3 = ve3.getValue(context);
		System.out.println("Uzun ifade Result=" + result3);

		String fnExpr2 = "#{myprefix:sayListMethod(rList)}";
		ValueExpression fn2 = expressionFactory.createValueExpression(context, fnExpr2, ArrayList.class);
		fn2.getValue(context);
	}

	public static String sayHello(String argument) {
		System.out.println("Hello, " + argument);
		return "OK";
	}

	public static String sayList(ArrayList ramList) {
		System.out.println("Ram List, " + ramList.size());
		return "OK";
	}
}
