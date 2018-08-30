package com.river.demo;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverDemo {
	public static void main(String[] args) {
		ChromeDriverService  service = new ChromeDriverService.Builder()
		         .usingDriverExecutable(new File("drivers/chromedriver.exe"))
		         .usingAnyFreePort()
		         .build();
		
		     try {
				service.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		    URL url = service.getUrl();
		     
		
		WebDriverDemo  w = new WebDriverDemo();
		w.openBaidu(url);
		w.openApache(url);
		
		service.stop();
	}

	public void openBaidu(URL url) {
		WebDriver driver = new RemoteWebDriver(url,DesiredCapabilities.chrome());
		driver.get("http://baidu.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
	}
	
	public void openApache(URL url) {
		WebDriver driver = new RemoteWebDriver(url,DesiredCapabilities.chrome());
		driver.get("http://www.apache.org");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
	}
}
