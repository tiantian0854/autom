package com.dic.autom;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class TestNGDemo1 {
	@Test()
	public void test1(){
		assertEquals(10, 10);
		
	}
	
	@Test(dependsOnMethods="test1",alwaysRun=true)
	public void test2(){
		assertEquals(10, 10);		
	}
	
	@Test(enabled = true)
	public void test3(){
		assertEquals(10, 10);		
	}
	
	@Test(invocationCount = 4,threadPoolSize =4)
	public void test4(){
		assertEquals(10, 10);		
	}	
	
	@Test
	public void test5(){
		assertEquals(10, 11);		
	}	
}
