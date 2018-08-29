package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;


public class Client2 {

	public static void main(String[] args) {
		
ApplicationContext ac = new ClassPathXmlApplicationContext("beans3.xml");
		
		Bus b = (Bus) ac.getBean("b");
		b.disp();
	}

}
