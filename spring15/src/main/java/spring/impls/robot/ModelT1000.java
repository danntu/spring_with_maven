package spring.impls.robot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import spring.interfaces.Hand;
import spring.interfaces.Head;
import spring.interfaces.Leg;
import spring.interfaces.Robot;

public class ModelT1000 extends BaseModel implements InitializingBean, DisposableBean {

    private String color;
    private int year;
    private boolean isSoundEnabled;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Head head, Leg leg) {
        super(hand, head, leg);
    }

    public ModelT1000(Hand hand, Head head, Leg leg, String color, int year, boolean isSoundEnabled) {
        super(hand, head, leg);
        this.color = color;
        this.year = year;
        this.isSoundEnabled = isSoundEnabled;
    }

    public ModelT1000(String color, int year, boolean isSoundEnabled) {
        this.color = color;
        this.year = year;
        this.isSoundEnabled = isSoundEnabled;
    }

    public void destroy() throws Exception {
        System.out.println(this + " - method destroy()");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println(this + " - method init()");
    }

    public void action() {
        getHead().calc();
        getHand().catchSomething();
        getLeg().go();
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("can play sound: " + isSoundEnabled);
    }

    public void dance() {
        System.out.println("T1000 is dancing!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return isSoundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        isSoundEnabled = soundEnabled;
    }
}
