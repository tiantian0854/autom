package com.river.demo;

import org.openqa.selenium.WebDriver;

import com.river.utils.WebDriverUtils;



public class OpenBaidu {
	
	public static void main(String[] args) {
		
		WebDriver driver = WebDriverUtils.getChromeDriver();
		driver.get("https://www.baidu.com");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	driver.close();
	}
	
	
}
