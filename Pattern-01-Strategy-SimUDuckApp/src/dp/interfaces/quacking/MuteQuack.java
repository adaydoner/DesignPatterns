package dp.interfaces.quacking;

public class MuteQuack implements IQuackBehaviour {

	@Override
	public void quack() {
		System.out.println("--- silence ---");
	}

}
