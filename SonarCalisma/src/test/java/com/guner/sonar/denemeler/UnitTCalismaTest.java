package com.guner.sonar.denemeler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnitTCalismaTest  {

	@Test
	public void compare() {
		try {
			UnitTCalisma unitTCalisma = new UnitTCalisma();
			boolean returnValue=unitTCalisma.compare("ramazan","ramazan");
			assertEquals(true, returnValue);
			
			boolean returnValue2=unitTCalisma.compare("ramazan","ramazan2");
			assertEquals(false, returnValue2);
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
