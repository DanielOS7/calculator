package com.qa.mathoperations;

import org.junit.Assert;
import org.junit.Test;

public class AdderTest {

	@Test
	public void test() {
		Adder adderTest = new Adder();
		int actual = adderTest.add(2,2);
		Assert.assertEquals(4, actual);
	}

}
