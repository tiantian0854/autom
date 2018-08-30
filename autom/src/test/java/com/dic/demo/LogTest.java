package com.dic.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LogTest {
private static  Logger logger =   LogManager.getLogger();


@Test
public  void logTest1() {
	logger.info("哈哈，Test1");
}	

@Test
public  void logTest2() {
	logger.warn("哈哈，Test2");
}	

@Test
public  void logTest3() {
	logger.debug("哈哈，Test3");
}	

@Test
public  void logTest4() {
	logger.error("哈哈，Test4");
}	

@Test
public  void logTest5() {
	logger.error("哈哈，5");
}	

}
