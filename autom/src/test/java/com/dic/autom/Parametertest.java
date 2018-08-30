package com.dic.autom;

import  static org.testng.Assert.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertest {
	@Parameters({ "name","age" })
	@Test
	public void  test1(String name ,int age){
		System.out.println("..."+name+","+age);
		assertEquals(name, "小明");
		
	}


	
	
}
