package net.javabeat.articles.javaagent.statistics;

import java.lang.instrument.Instrumentation;

public class StatisticsAgent {

	public static void premain(String agentArguments, Instrumentation instrumentation){
		
		StatisticsClassTransformer transformer = new StatisticsClassTransformer();
		instrumentation.addTransformer(transformer);		
	}
}
