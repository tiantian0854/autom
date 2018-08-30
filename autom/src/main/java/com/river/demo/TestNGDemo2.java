package com.river.demo;
import static org.testng.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo2 {
	

	
	@BeforeClass
	public  void   beforeClass(){
		System.out.println("beforeDemo2Class...");
	}
	
	@AfterClass
	public  void   afterClass(){
		System.out.println("beforeDemo2Class...");
	}
	
	
	
	@BeforeMethod
	public  void   beforeMethod(){
		System.out.println("beforeDemo2Method...");
	}
	
	@AfterMethod
	public  void   afterMethod(){
		System.out.println("afterDemo2Method...");
	}
	
	@Test
	public  void  test1(){
		assertEquals(10, 10);
		System.out.println("test1Demo2Method..");
	}
	
	@Test
	public  void  test2(){
		assertEquals(10, 10);
		System.out.println("tets2Demo2Method...");
	}	
	
	
	
}
