package com.dic.upload.utils;

import java.io.File;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

public class UploadTestListener extends TestListenerAdapter {
	WebDriver driver = null;
	
	
	
	
	@Override
	public void onTestFailure(ITestResult tr) {
		String name=tr.getMethod().getMethodName();
		Object obj = tr.getInstance();
		Class<?> clazz = obj.getClass();
		try {
			Field field =clazz.getField("driver");
			driver =(WebDriver)field.get(obj);
			
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String  path  ="screenshot";
		
		SimpleDateFormat df  =new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		String  filename = clazz.getName()+"_"+name+df.format(new Date())+".png";
		File pathfile = new File(path,filename);
		screenshot.renameTo(pathfile);
		
		Reporter.log("<label style='color:red'>"+name+"执行失败，请看详细日志,截图存放在screenshot目录中"+"</label>");
	}
	
}
