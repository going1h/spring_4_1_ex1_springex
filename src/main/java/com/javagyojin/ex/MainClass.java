package com.javagyojin.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
	String configLocation = "classpath:applicationCTX.xml";
	AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
	MyInfo myInfo1 = ctx.getBean("myInfo1", MyInfo.class);
	MyInfo myInfo2 = ctx.getBean("myInfo2", MyInfo.class);
	
	myInfo1.getInfoPrint();
	System.out.println();
	myInfo2.getInfoPrint();
	
	ctx.close();
	}
}
