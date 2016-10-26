package com.mindtree;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	int a[]={1,2,3,4,5};
	@Test
	public void testFindMax() 
	{ 
		assertEquals(5, App.findMax(a));//positive test 
		assertNotEquals(10, App.findMax(a));//negative test 
		System.out.println(App.findMax(a));	
	}
	@Test(expected = ArithmeticException.class)
	public void testOperation()
	{
	assertFalse(App.Operation());	
	}
}
