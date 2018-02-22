package RobotImpl2.spring.start;

import RobotImpl2.spring.interfaces.Hand;
import RobotImpl2.spring.interfaces.Head;
import RobotImpl2.spring.interfaces.Leg;

class Robot {
    private Hand hand;
    private Leg leg;
    private Head head;

    public Robot(Hand hand, Leg leg, Head head) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public void action(){
        head.calc();
        hand.catchSomething();
        leg.go();
    }
}
