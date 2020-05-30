package dp.interfaces.flying;

public class FlyNoWay implements IFlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I cant fly");
	}

}
