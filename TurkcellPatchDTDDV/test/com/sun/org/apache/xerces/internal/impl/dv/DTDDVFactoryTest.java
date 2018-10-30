package com.sun.org.apache.xerces.internal.impl.dv;

import static org.junit.Assert.*;

import org.junit.Test;

public class DTDDVFactoryTest {

	@Test
	public void test() {
		DTDDVFactory dtddvFactory = DTDDVFactory.getInstance();
		assertNotNull(dtddvFactory);

		DTDDVFactory dtddvFactory2 = DTDDVFactory.getInstance();
		assertNotNull(dtddvFactory2);
	}

}
