package me.niketpatel;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;


public class InItHelloWorld implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("Before initialization of: " + beanName);
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("After initialization of: " + beanName);
		return bean;
	}

}
