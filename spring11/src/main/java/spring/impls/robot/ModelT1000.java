package spring.impls.robot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import spring.interfaces.Hand;
import spring.interfaces.Head;
import spring.interfaces.Leg;
import spring.interfaces.Robot;

public class ModelT1000 implements Robot,InitializingBean,DisposableBean {
    private Hand hand;
    private Head head;
    private Leg leg;
    private String color;
    private int year;
    private boolean isSoundEnabled;

    public void initObject(){
        System.out.println("init");
    }

    public void destroyObject(){
        System.out.println("destroy");
    }

    public void destroy() throws Exception {
        System.out.println(this + " - method destroy()");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println(this+" - method init()");
    }

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Head head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public ModelT1000(Hand hand, Head head, Leg leg, String color, int year, boolean isSoundEnabled) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
        this.color = color;
        this.year = year;
        this.isSoundEnabled = isSoundEnabled;
    }

    public ModelT1000(String color, int year, boolean isSoundEnabled) {
        this.color = color;
        this.year = year;
        this.isSoundEnabled = isSoundEnabled;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public void action() {
        hand.catchSomething();
        head.calc();
        leg.go();
    }

    public void dance() {
        System.out.println("Model T1000 dancing");
    }
}
