package dp.objects;

import dp.interfaces.flying.FlyNoWay;
import dp.interfaces.quacking.MuteQuack;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		flyType = new FlyNoWay();
		quackType = new MuteQuack();
	}
	
	@Override
	public void display(){
		System.out.println("Its a rubber duck.");
	}

}
