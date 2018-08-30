package com.dic.autom;

import static org.testng.Assert.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dic.testdata.TestDataFactory;

public class CalcTest {
	private Calc calc;
	@BeforeClass
	private void  init(){
	calc = new Calc();
	}
	
/*	@DataProvider(name = "calcData")
	public Object[][] calcTestData() {
		Object[][] objs =new Object[][]{
			{10,20,30},
			{30,10,20},
			{30,30,60}
		};
		 return objs;
	};*/
	
	
	@Test(dataProvider="calc_excel_data",dataProviderClass=TestDataFactory.class)
	public  void  testCompute1(int x,int y,int expected){
		int  actual = calc.conpute(x, y);
		assertEquals(actual, expected);
	}

/*	
	
	@Test
	public  void  testCompute2(){
		int  x =30,y = 20;
		int  expected = 10;
		int  actual = calc.conpute(x, y);
		assertEquals(actual, expected);
	}
	
	
	@Test
	public  void  testCompute3(){
		int  x =30,y = 30;
		int  expected = 60;
		int  actual = calc.conpute(x, y);
		assertEquals(actual, expected);
	}
	*/
}
