package com.river.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

	@FindBy(id = "ls_username")
	private WebElement username_input;
	
	
	@FindBy(id = "ls_password")
	private WebElement password_input;
	
	
	@FindBy(css = "button.pn.vm")
	private WebElement login_btn;
	
	@FindBy(xpath = "//a[text()='短消息'][@id='pm_ntc']")
	private WebElement short_mgs;
	
	
	
	@FindBy(xpath = "//a[@href='http://localhost/upload/home.php?mod=space&do=pm&filter=systempm'][text()='系统消息']")
	private WebElement sys_mgs;	
	
	
	
	@FindBy(xpath = "//dd/p[@class='ptn xi2']/a[text()='查看详情»']")
	private WebElement look_detail;
	
	
	
	public  IndexPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public  void  doLoginin(String username,String password){
		username_input.sendKeys(username);
		password_input.sendKeys(password);
		login_btn.click();	
	}
	
	
	public  void  toMgs(){
		short_mgs.click();
		sys_mgs.click();
		look_detail.click();
		
	}
	
	
	
	
	
	
}
