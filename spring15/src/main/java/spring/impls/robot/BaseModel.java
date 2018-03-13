package spring.impls.robot;

import spring.interfaces.Hand;
import spring.interfaces.Head;
import spring.interfaces.Leg;
import spring.interfaces.Robot;

public abstract class BaseModel implements Robot {
    private Hand hand;
    private Head head;
    private Leg leg;

    public BaseModel() {
        System.out.println(this + " - BaseModel constructor");
    }

    public BaseModel(Hand hand, Head head, Leg leg) {
        this();
        this.hand = hand;
        this.head = head;
        this.leg = leg;
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
}
