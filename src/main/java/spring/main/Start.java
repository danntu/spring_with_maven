package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.impls.robot.ModelT1000;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println("=============== Object1 ===================");
        ModelT1000 t10001 = (ModelT1000)context.getBean("t10001");
        t10001.action();
        System.out.println("=============== Object2 ===================");
        ModelT1000 t10002 = (ModelT1000)context.getBean("t10002");
        t10002.action();
        System.out.println("=============== Object3 ===================");
        ModelT1000 t10003 = (ModelT1000)context.getBean("t10003");
        t10003.action();
    }
}
