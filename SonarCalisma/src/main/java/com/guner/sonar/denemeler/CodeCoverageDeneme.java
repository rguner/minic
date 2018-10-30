package com.guner.sonar.denemeler;

public class CodeCoverageDeneme {

	public static void main(String[] args) {
		System.out.println("Unit Test Code Coverage Denemesi");
		CodeCoverageDeneme codeCoverageDeneme = new CodeCoverageDeneme();
		codeCoverageDeneme.dongu3(null);
	}


	public int compare1(int i, int j) {
		if (i > j) {
			System.out.println("i buyuk");
			return 1;
		} else if (j > i) {
			System.out.println("j buyuk");
			return -1;
		} else {
			System.out.println("esit");
			return 0;
		}
	}
	
	public int compare2(int i, int j) {
		if (i > j) {
			System.out.println("i buyuk");
			return 1;
		} else if (j > i) {
			System.out.println("j buyuk");
			return -1;
		} else {
			System.out.println("esit");
			return 0;
		}
	}
	
	public boolean dongu1(int modParam) {
		
		for (int i = 1 ; i <10 ; i ++) {
			if ((i % modParam) == 0) {
				System.out.println(i + " " + modParam +  " a bolunebilir");	
				return true;
			}
		}
		return false;
	
	}
	
	public boolean dongu2(int modParam) {
		
		for (int i = 1 ; i < 10 ; i ++) {
			if ((i % modParam) == 0) {
				System.out.println(i + " " + modParam +  " a bolunebilir");	
				return true;
			}
		}
		return false;
	
	}
	
	public boolean dongu3(Integer modParam) {
		
		for (int i = 1 ; i < 10 ; i ++) {
			if ((i % modParam) == 0) {
				System.out.println(i + " " + modParam +  " a bolunebilir");	
				return true;
			}
		}
		return false;
	
	}
	
	

}
