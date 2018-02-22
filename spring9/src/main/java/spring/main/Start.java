package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.impls.robot.ModelT1000;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//		ModelT1000 t1000 =(ModelT1000) context.getBean("t1000");
//		//t1000.dance();
//		System.out.println();
//		System.out.println("Call method with object");
//		t1000.actionInterface();
//
//		System.out.println();
//		System.out.println("Call method without object");
//		t1000.actionWithoutInterface();
//
//		System.out.println();
//		System.out.println("Call method with object and value");
//		t1000.actionMixup();

		ModelT1000 t1000namespace = (ModelT1000) context.getBean("t1000namespace");
		System.out.println();
		System.out.println("Call method with object");
		t1000namespace.actionInterface();

		System.out.println();
		System.out.println("Call method without object");
		t1000namespace.actionWithoutInterface();

		System.out.println();
		System.out.println("Call method with object and value");
		t1000namespace.actionMixup();
	}
}
