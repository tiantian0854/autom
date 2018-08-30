package com.river.demo;

import java.util.Properties;
import java.util.Set;

public class CheckSystem {
	public static void main(String[] args) {

		Properties pros = System.getProperties();
		Set<Object> keys = pros.keySet();
		for (Object key : keys) {
			System.out.println(key+":"+pros.get(key));
			
		}
	}

}
