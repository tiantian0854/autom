package com.dic.upload.utils;

import org.testng.annotations.AfterSuite;

import com.dic.webdriver.utils.WebDriverUtils2;

public class AfterUpload {
	@AfterSuite
	public void  stopService(){
		WebDriverUtils2.stopService();
	}
}
