package com.dic.upload.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dic.testdata.TestDataFactory;
import com.dic.upload.pages.IndexPage;
import com.dic.upload.utils.BaseTest2;


public class LoginTest2 extends BaseTest2 {
	@DataProvider(name = "upload_login_data")
	@Test(dataProviderClass=TestDataFactory.class,dataProvider="upload_login_data")
	public void loginTest1(String username,String password,String expected) {
		driver.get("http://localhost/upload/portal.php");
		IndexPage indexpage = new IndexPage(driver);
		indexpage.doLoginin(username, password);
		indexpage.assertLoginResult(expected);
	}

}
