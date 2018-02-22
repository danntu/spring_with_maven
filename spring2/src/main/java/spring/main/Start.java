package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.impls.robot.ModelT1000;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		System.out.println();
		System.out.println("default");
		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
		t1000.dance();
		t1000.fire();

		System.out.println("");
		System.out.println("Bean for Sony");
		ModelT1000 t1000Sony = (ModelT1000) context.getBean("t1000Sony");
		t1000Sony.dance();
		t1000Sony.fire();

		System.out.println("");
		System.out.println("Bean for Toshiba");
		ModelT1000 t1000Toshiba = (ModelT1000) context.getBean("t1000Toshiba");
		t1000Toshiba.dance();
		t1000Toshiba.fire();
	}
}
