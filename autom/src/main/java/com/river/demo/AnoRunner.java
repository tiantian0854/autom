package com.river.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnoRunner {
	public static void main(String[] args) {
		Class<?> clazz = AnoTest.class;
		Method[] methods = clazz.getDeclaredMethods();
		Object object = null;
		
		try {
			object = clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		if(object ==null){
			System.err.println("类不能实例化");
			
		}
		
		for (Method method : methods) {
			RunNumber runNumber =	method.getAnnotation(RunNumber.class);
			if(runNumber ==null) continue;
			int  num =runNumber.value();
			for (int i = 0; i < num; i++) {
				try {
					method.invoke(object, "小王"+(i+1));
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}

}
