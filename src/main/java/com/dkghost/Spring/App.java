package com.dkghost.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dkghost.beans.Mundo;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/dkghost/xml/beans.xml");
		Mundo m = (Mundo) appContext.getBean("mundo");
		Mundo m2 = (Mundo) appContext.getBean("mundillo");
		
		System.out.println(m.getSaludo());
		System.out.println(m2.getSaludo());
	}

}
