package spring.impls.robot;

import spring.impls.sony.SonyHand;
import spring.impls.sony.SonyHead;
import spring.impls.toshiba.ToshibaLeg;
import spring.interfaces.Hand;
import spring.interfaces.Head;
import spring.interfaces.Leg;
import spring.interfaces.Robot;

public class ModelT1000 implements Robot {

    private Hand hand;
    private Leg leg;
    private Head head;

    public ModelT1000() {
        hand = new SonyHand();
        leg = new ToshibaLeg();
        head = new SonyHead();
    }

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }


    public void fire() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }


    public void dance() {
        System.out.println("T1000 танцует!");
    }

}
