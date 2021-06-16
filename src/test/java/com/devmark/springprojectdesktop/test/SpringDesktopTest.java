/**
 * 
 */
package com.devmark.springprojectdesktop.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.devmark.springprojectdesktop.dao.IDisqueraDAO;

/**
 * @author marcos.hernandez
 * Clase de prueba unitaria que permite realizar test con el framework de Spring.
 */
class SpringDesktopTest {

	@Test
	void testContext() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertNotNull(context);
		
		IDisqueraDAO disqueraDAO1 = (IDisqueraDAO) context.getBean("disqueraDAO");
		assertNotNull(disqueraDAO1);
		
		IDisqueraDAO disqueraDAO2 = (IDisqueraDAO) context.getBean("disqueraDAO");
		assertNotNull(disqueraDAO2);
		
		System.out.println("Contexto cargado correctamente.");
		System.out.println("Bean generado correctamente: " + disqueraDAO1);
		System.out.println("Bean generado correctamente: " + disqueraDAO2);
		
		// =====================PROPERTIES===================================================
		Properties properties = (Properties) context.getBean("properties");
		System.out.println(properties.get("spring-username"));
		
	}

}
