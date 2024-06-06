package com.dkghost.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dkghost.beans.AppConfig;
import com.dkghost.beans.AppConfig2;
import com.dkghost.beans.Ciudad;
import com.dkghost.beans.Mundo;
import com.dkghost.beans.Persona;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
//		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/dkghost/xml/beans.xml");
/*-----------Configuracion con anotaciones----------------
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.register(AppConfig.class);
		appContext.register(AppConfig2.class);
		appContext.refresh();
		
		Mundo m = (Mundo) appContext.getBean("marte");
		
		System.out.println(m.getSaludo());
----------------------------------------------------------*/
		
//----------------------------------Inyeccion de constructores y objetos ------------------------------------------------
//		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/dkghost/xml/beans.xml");
//		Persona per = (Persona) appContext.getBean("persona");			
//		
//		System.out.println(per.getId()+" "+per.getNombre()+" "+per.getApodo()+" "+ per.getPais().getNombre()+" "+per.getCiudad().getNombre());
	
		
//----------------------------------Ejemplo de Bean Scope----------------------------------------------------------------		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/dkghost/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");
		per.setId(0);
		per.setNombre("Neegga");
		per.setApodo("Lee");
//		Persona per2 = (Persona) appContext.getBean("persona");
		
		System.out.println(per.getId()+" "+per.getNombre()+" "+per.getApodo()+" "+ per.getPais().getNombre()+" "+per.getCiudad().getNombre());
//		System.out.println(per2.getId()+" "+per2.getNombre()+" "+per2.getApodo()+" "+ per2.getPais().getNombre()+" "+per2.getCiudad().getNombre());
		
		
		((ConfigurableApplicationContext) appContext).close();
	}

} 
