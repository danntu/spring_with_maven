package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.impls.robot.ModelT1000;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");
        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
//        ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");
//        System.out.println("Singleton scope");
//        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
//        System.out.println(t1000.getLeg());
//        t1000=(ModelT1000) context.getBean("t1000");
//        System.out.println(t1000.getHead());
//
//        System.out.println();
//        System.out.println("Protype scope");
//        ModelT1000 t1000all = (ModelT1000) context.getBean("t1000all");
//        System.out.println(t1000all);
//        t1000all=(ModelT1000) context.getBean("t1000all");
//        System.out.println(t1000all);
//
//        System.out.println();
//        System.out.println("Protype scope getSonyLeg");
//        t1000all = (ModelT1000) context.getBean("t1000all");
//        System.out.println(t1000all.getLeg());
//        t1000all=(ModelT1000) context.getBean("t1000all");
//        System.out.println(t1000all.getLeg());
//
//        System.out.println();
//        System.out.println("Singleton scope getToshibaHand");
//        t1000all = (ModelT1000) context.getBean("t1000all");
//        System.out.println(t1000all.getHand());
//        t1000all=(ModelT1000) context.getBean("t1000all");
//        System.out.println(t1000all.getHand());

    }
}
