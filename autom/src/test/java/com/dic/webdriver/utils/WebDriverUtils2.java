package com.dic.webdriver.utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;

public class WebDriverUtils2 {
	private static DriverService service;
	
	private WebDriverUtils2(){};

	public static WebDriver getDriver(String browserName) {
		WebDriver driver = null;
		if (service == null) {
			if ("chrome".equalsIgnoreCase(browserName)) {
				service = new ChromeDriverService.Builder().usingDriverExecutable(new File("drivers/chromedriver.exe"))
						.usingAnyFreePort().build();

			} else if ("firefox".equalsIgnoreCase(browserName)) {
				service = new GeckoDriverService.Builder()
						.usingDriverExecutable(new File("drivers/firefox/geckodriver.exe")).usingAnyFreePort().build();

			} else if ("ie".equalsIgnoreCase(browserName)) {
				service = new InternetExplorerDriverService.Builder()
						.usingDriverExecutable(new File("drivers/ie/chromedriver.exe")).usingAnyFreePort().build();
			} else {
				System.err.println("浏览器类型不支持");
				return null;
			}

			try {
				service.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if ("chrome".equalsIgnoreCase(browserName)) {
			driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());

		} else if ("firefox".equalsIgnoreCase(browserName)) {
			driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.firefox());

		} else if ("ie".equalsIgnoreCase(browserName)) {
			driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.internetExplorer());

		} else {
			System.err.println("浏览器类型不支持");
			return null;
		}
		return driver;

	}

	public	static void stopService() {
		if(service !=null)
		service.stop();

	}

}
