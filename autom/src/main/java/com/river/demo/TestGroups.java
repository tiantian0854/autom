package com.river.demo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestGroups {

	
	@Test(groups={"windows.g1"})
	public  void  test1(){
		assertEquals(10, 10);
		System.out.println("test1Method..");
	}
	
	@Test(groups={"windows.g2"})
	public  void  test2(){
		assertEquals(10, 10);
		System.out.println("test2Method..");
	}
	
	@Test(groups={"linux.g1","windows.g23"})
	public  void  test3(){
		assertEquals(10, 10);
		System.out.println("test3Method..");
	}
	
	@Test(groups={"linux.g2"})
	public  void  test4(){
		assertEquals(10, 10);
		System.out.println("test4Method..");
	}
	
	@Test()
	public  void  test5(){
		assertEquals(10, 10);
		System.out.println("test5Method..");
	}
	
}
