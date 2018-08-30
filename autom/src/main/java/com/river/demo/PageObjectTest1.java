package com.river.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.river.pages.IndexPage;
import com.river.utils.WebDriverUtils;

public class PageObjectTest1 {
	public static void main(String[] args) {
		WebDriver driver = WebDriverUtils.getChromeDriver();
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		
		driver.get("http://localhost/upload/portal.php");
		//IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class); 
		IndexPage indexPage =new IndexPage(driver); 
		indexPage.doLoginin("river001", "river001");
		indexPage.toMgs();		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
	}
}
