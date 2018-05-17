package com.qa.mathoperations;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Test;
import org.junit.Test;

public class multiplyTest {

	@Test
	public void test() {
		
		Multiply multiply  = new Multiply();
		int actual = multiply.multiply(10,5);
		Assert.assertEquals(50, actual);
		
	}

}
