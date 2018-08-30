package com.dic.webdriver.utils;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteLogWebDriver extends  RemoteWebDriver {

	private Logger logger;
	public RemoteLogWebDriver(URL url,Capabilities caps,Class<?> cazz){
		super(url,caps);
		logger = LogManager.getLogger(cazz);
		
	}
	
	@Override
	public WebElement findElementById(String using) {
		try{
		WebElement element = super.findElementById(using);
		logger.info(using+"定位已找到元素");
		return element;
		}catch(NoSuchElementException e){
		logger.info(using+"定位w未找到元素");	
		throw e;
		}
	}
	
	@Override
	public WebElement findElementByCssSelector(String using) {
		try{
		WebElement element = super.findElementByCssSelector(using);
		logger.info(using+"定位已找到元素");
		return element;
		}catch(NoSuchElementException e){
		logger.info(using+"定位w未找到元素");	
		throw e;
		}
	}
	
	@Override
	public WebElement findElementByXPath(String using) {
		try{
		WebElement element = super.findElementByXPath(using);
		logger.info(using+"定位已找到元素");
		return element;
		}catch(NoSuchElementException e){
		logger.info(using+"定位w未找到元素");	
		throw e;
		}
	}
	
	

}
