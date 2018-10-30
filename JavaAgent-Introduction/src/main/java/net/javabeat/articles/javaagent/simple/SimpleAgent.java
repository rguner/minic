package net.javabeat.articles.javaagent.simple;

import java.lang.instrument.Instrumentation;

public class SimpleAgent {

	public static void premain(String agentArguments, Instrumentation instrumentation){
		
		System.out.println("Simple Agent");
		
		SimpleClassTransformer transformer = new SimpleClassTransformer();
		instrumentation.addTransformer(transformer);
	}
}
