package spring.start;

import spring.interfaces.Hand;
import spring.interfaces.Head;
import spring.interfaces.Leg;
import spring.objects.SonyHand;
import spring.objects.SonyHead;
import spring.objects.SonyLeg;

public class Robot {
	
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
