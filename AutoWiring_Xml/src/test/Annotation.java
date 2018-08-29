package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Airport;


public class Annotation {

public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotations.xml");
		
		Airport c = (Airport) ac.getBean("c");
		c.disp();
		
	}
}
