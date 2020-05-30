package dp.objects;

import dp.interfaces.quacking.IQuackBehaviour;
import dp.interfaces.quacking.Quack;

public class DuckCall {
	
	IQuackBehaviour quackBehaviourForDevice;
	
	public DuckCall(){
		quackBehaviourForDevice = new Quack();
	}

	public void setQuackBehaviourForDevice(IQuackBehaviour quackBehaviourForDevice) {
		this.quackBehaviourForDevice = quackBehaviourForDevice;
	}
	
	public void performQuack(){
		quackBehaviourForDevice.quack();
	}
	
	
}
