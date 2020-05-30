package dp.objects;

import dp.interfaces.flying.IFlyBehaviour;
import dp.interfaces.quacking.IQuackBehaviour;

public abstract class Duck{
	
	
	public IFlyBehaviour flyType;
	public IQuackBehaviour quackType;
	public abstract void display();
	
	public Duck (){
		
	}
	
	public void performQuack(){
		quackType.quack();
	}
	
	public void performFly(){
		flyType.fly();
	}
	
	public void swim(){
		System.out.println("All ducks float, even decoys!");
	}
	
	public void setFlyBehaviour(IFlyBehaviour fb){
		flyType = fb;
	}
	
	public void setQuackBehaviour(IQuackBehaviour qb){
		quackType = qb;
	}
}
