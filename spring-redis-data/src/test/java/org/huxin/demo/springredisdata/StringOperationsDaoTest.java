package org.huxin.demo.springredisdata;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StringOperationsDaoTest {
	
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
		StringOperationsDao stringOperations  = (StringOperationsDao) context.getBean("stringOperations") ;
	    stringOperations.add("itcast", "hu");
	    
	}
	
	
	@Test
	public void test1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
		StringOperationsDao stringOperations  = (StringOperationsDao) context.getBean("stringOperations") ;
	    String value = stringOperations.find("itcast") ;
	    System.out.println(value);
	    
	}
	
	
	@Test
	public void test2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
		StringOperationsDao stringOperations  = (StringOperationsDao) context.getBean("stringOperations") ;
	    stringOperations.keys(); 
	    
	}
	
	

	@Test
	public void test3(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
		StringOperationsDao stringOperations  = (StringOperationsDao) context.getBean("stringOperations") ;
	   // stringOperations.
	    
	}
	
	
	@Test
	public void test4(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
		StringOperationsDao stringOperations  = (StringOperationsDao) context.getBean("stringOperations") ;
		stringOperations.delete();
	   // stringOperations.
	    
	}

}
