package com.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {

	@Test
	public void sum_with3numbers() {
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] {1,2,3});
		
		assertEquals(6,result);
	
      
		
	}

}
