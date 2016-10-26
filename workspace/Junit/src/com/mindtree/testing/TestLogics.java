package com.mindtree.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLogics {
	
	@BeforeClass
	public static void BeforeClass()
	{
		System.out.println("in before class");
	}
	@Before
	public  void Before()
	{
		System.out.println("in before the test method will call");
	}
	int a[]={1,2,3,4,5};
	@Test
	public void testFindMax() 
	{ 
		assertEquals(5, DoingTest.findMax(a));//positive test 
		assertNotEquals(10, DoingTest.findMax(a));//negative test 
		System.out.println(DoingTest.findMax(a));	
	}
	@After
	public void After()
	{
		System.out.println("in after the method test is over");
	}
	@AfterClass
	public static void AfterClass()
	{
		System.out.println("in after ");
	}
//	@Test(expected = ArithmeticException.class)
//	public void testOperation()
//	{
//	assertFalse(DoingTest.Operation());	
//	}
}
