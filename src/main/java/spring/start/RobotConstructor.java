package spring.start;

import spring.impls.sony.SonyHand;
import spring.impls.sony.SonyHead;
import spring.impls.sony.SonyLeg;
import spring.impls.toshiba.ToshibaLeg;

public class RobotConstructor {
    public static void main(String[] args) {
        SonyHead sonyHead = new SonyHead();
        SonyHand sonyHand = new SonyHand();
        ToshibaLeg toshibaLeg = new ToshibaLeg();

        Robot robot = new Robot(sonyHand,toshibaLeg,sonyHead);
        robot.action();
    }
}
