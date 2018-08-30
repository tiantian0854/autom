package com.river.utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;

public class WebDriverUtils {
	private static DriverService service;

	static {
		service = new ChromeDriverService.Builder().usingDriverExecutable(new File("drivers/chromedriver.exe"))
				.usingAnyFreePort().build();

		try {
			service.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static WebDriver getChromeDriver() {
		URL url = service.getUrl();
		WebDriver driver = new RemoteWebDriver(url, DesiredCapabilities.chrome());

		return driver;
	}

	public void stopService() {
		service.stop();

	}

}
