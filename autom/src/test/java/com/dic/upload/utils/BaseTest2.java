package com.dic.upload.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.dic.webdriver.utils.WebDriverUtils3;

public class BaseTest2 {
	public WebDriver driver;
	@BeforeMethod
	public void  openBrowser(){
		driver = WebDriverUtils3.getDriver("chrome",this.getClass());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public  void  closeBrowser(){
		driver.quit();
		
	}
}
