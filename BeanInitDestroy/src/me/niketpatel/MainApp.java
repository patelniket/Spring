package me.niketpatel;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		BeanLifeCycle object = (BeanLifeCycle) context.getBean("beanLifeCycle");
		object.setMessage("I was initialized for object");
		object.getMessage();
		
		context.registerShutdownHook();

	}

}
