package com.river.demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PreDesTest {

	@BeforeTest
	public  void  beforeTest(){
		System.out.println("beforeTest...");
	}
	
	@AfterTest
	public  void  afterTest(){
		System.out.println("beforeTest...");
	}
}
