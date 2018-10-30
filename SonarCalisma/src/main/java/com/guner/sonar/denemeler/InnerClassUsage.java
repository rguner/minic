package com.guner.sonar.denemeler;

public class InnerClassUsage {
	
	public final static InnerClass innerClass = new InnerClass();
	
	public static void main(String[] args) {
		InnerClassUsage innerClassUsage = new InnerClassUsage();
		innerClassUsage.execute();
		innerClassUsage.execute2();
	}
	
	public void execute() {
		
		executeWithInner(new InnerClass());		
	}
	
	public void execute2() {
		executeWithInner(innerClass);
		executeWithInner(innerClass);
	}
	
	private void executeWithInner(InnerClass innerClass) {
		
		System.out.println(innerClass.toString());
	}
	
	public static class InnerClass 	
	{
		private String deneme="ramazan";
		
		public InnerClass() {
			System.out.println(deneme);
		}
		
	}

}
