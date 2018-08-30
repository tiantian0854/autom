package com.dic.testdata;

import java.util.Properties;
import java.util.Set;

import org.testng.annotations.DataProvider;

public class TestDataFactory {

	@DataProvider(name="calc_test_data")
	public static Object[][] getcalcTestData() {
		Object[][] objs =new Object[][]{
			{10,20,30},
			{30,10,20},
			{30,30,60}
		};
		 return objs;
	};
	
	
	@DataProvider(name = "calc_excel_data")
	public static  Object[][] getCalcExcelData(){
		
		return ReadExcelUtils.getExcelData("calcTestData1.xls");
	}
	
	
	@DataProvider(name = "calc_mysql_data")
	public static Object[][] getCalcMysqlData(){
		String   className ="com.mysql.jdbc.Driver";
		String   url = "jdbc:mysql:///test?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
		String   usename ="root";
		String  password ="";
		String  tablename = "calctestdata";//calctestdata
			return  ReadDatabaseUtils.getDataFromDB(className, url, usename, password, tablename);
	}
	
	@DataProvider(name = "upload_login_data")
	public static  Object[][] getuploadLoginData(){
		
/*		Properties pros = System.getProperties();
		Set<Object> keys = pros.keySet();
		for (Object key : keys) {
			System.err.println(key+":"+pros.get(key));
		}*/
		return ReadCSVUtils.getCSVData("uploadLogginTestData.csv");
	}	
	
	
}
