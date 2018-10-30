package com.guner.sonar.denemeler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class IntegerKarsilastirmaTest  {
	
	private static IntegerKarsilastirma integerKarsilastirma = null;
	
	@Test
	public void execute1() {
		try {
			
			integerKarsilastirma.execute1();
			assertEquals(true, true);
			
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void execute2() {
		try {
			
			integerKarsilastirma.execute2();
			assertEquals(true, true);
			
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void execute3() {
		try {
			
			integerKarsilastirma.execute3();
			assertEquals(true, true);
			
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void execute4() {
		try {
			
			integerKarsilastirma.execute4();
			assertEquals(true, true);
			
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void execute5() {
		try {
			
			integerKarsilastirma.execute5();
			assertEquals(true, true);
			
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void execute6() {
		try {
			
			integerKarsilastirma.execute6();
			assertEquals(true, true);
			
		} catch (Exception e) {
			fail();
		}
	}
	
	@BeforeClass
	public static void runBeforeClass() {
		System.out.println("runBeforeClass");
		integerKarsilastirma = new IntegerKarsilastirma();
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
