package com.guner.sonar.denemeler;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CodeCoverageTest  {
	
	private static CodeCoverageDeneme codeCoverageDeneme = null;
	
	@Test
	public void compare1() {
		try {			
			int result = codeCoverageDeneme.compare1(100, 1);
			assertEquals(result, 1);
			
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void compare2() {
		try {			
			int result = codeCoverageDeneme.compare2(1, 100);
			assertEquals(result, -1);
			
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void dongu1() {
		try {			
			boolean result = codeCoverageDeneme.dongu1(5);
			assertTrue(result);
			
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void dongu2() {
		try {			
			boolean result = codeCoverageDeneme.dongu2(20);
			assertFalse(result);
			
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void dongu3() {
		try {			
			boolean result = codeCoverageDeneme.dongu3(null);
			assertFalse(result);
			
		} catch (Exception e) {
			fail();
		}
	}
		
	@BeforeClass
	public static void runBeforeClass() {
		System.out.println("runBeforeClass");
		codeCoverageDeneme = new CodeCoverageDeneme();
	}

	@AfterClass
	public static void runAfterClass() {
		System.out.println("runAfterClass");
	}
	
	@Before
	public void runBeforeEveryTest(){
		System.out.println("runBeforeEveryTest");
	}
}
