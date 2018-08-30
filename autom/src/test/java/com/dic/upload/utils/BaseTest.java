package com.dic.upload.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.dic.testdata.ConfigReader;
import com.dic.webdriver.utils.WebDriverUtils2;

public class BaseTest {
	public WebDriver driver;
	@BeforeMethod
	public void  openBrowser(){
		driver = WebDriverUtils2.getDriver(ConfigReader.BROWSER);
		String  wt = ConfigReader.WAITTIME;
		
		driver.manage().timeouts().implicitlyWait(Long.parseLong(wt), TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public  void  closeBrowser(){
		driver.quit();
		
	}
}
