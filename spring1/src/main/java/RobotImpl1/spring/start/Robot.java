package RobotImpl1.spring.start;

import RobotImpl1.spring.object.SonyHand;
import RobotImpl1.spring.object.SonyHead;
import RobotImpl1.spring.object.SonyLeg;

class Robot {
    private SonyHead head = new SonyHead();
    private SonyHand hand = new SonyHand();
    private SonyLeg leg = new SonyLeg();


    public void action(){
        head.calc();
        hand.catchSomething();
        leg.go();
    }
}
