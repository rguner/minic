package com.guner.sonar.denemeler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CompareTest  {
	
	@Test
	public void execute1() {
		try {
			Compare compare = new Compare();
			compare.execute1();
			assertEquals(true, true);
			
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void execute2() {
		try {
			Compare compare = new Compare();
			compare.execute2();
			assertEquals(true, true);
			
		} catch (Exception e) {
			fail();
		}
	}
	
	@BeforeClass
	public static void runBeforeClass() {
		System.out.println("runBeforeClass");	
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
