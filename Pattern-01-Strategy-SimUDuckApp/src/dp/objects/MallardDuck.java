package dp.objects;

import dp.interfaces.flying.FlyWithWings;
import dp.interfaces.quacking.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		
		flyType = new FlyWithWings();
		quackType = new Quack();
	}
	
	@Override
	public void display(){
		System.out.println("I'm a mallard duck.");
	}
	
}
