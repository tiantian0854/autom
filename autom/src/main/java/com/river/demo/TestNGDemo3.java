package com.river.demo;
import static org.testng.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo3 {
	
	
	
	@BeforeClass
	public  void   beforeClass(){
		System.out.println("beforeDemo3Class...");
	}
	
	@AfterClass
	public  void   afterClass(){
		System.out.println("beforeDemo3Class...");
	}
	
	
	
	@BeforeMethod
	public  void   beforeMethod(){
		System.out.println("beforeDemo3Method...");
	}
	
	@AfterMethod
	public  void   afterMethod(){
		System.out.println("afterDemo3Method...");
	}
	
	@Test
	public  void  test3(){
		assertEquals(10, 10);
		System.out.println("test3Method..");
	}
	
	@Test
	public  void  test4(){
		assertEquals(10, 10);
		System.out.println("tets4Method...");
	}	
	
	
	
}
