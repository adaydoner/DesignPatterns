package dp.main;

import dp.interfaces.flying.FlyRocketPowered;
import dp.objects.DuckCall;
import dp.objects.MallardDuck;
import dp.objects.RubberDuck;

public class MainApp {

	public static void main(String[] args) {
		
		System.out.println("MallardDuck class's instance created...");
		MallardDuck md = new MallardDuck();
		
		System.out.print("Mallard duck object's perform quack method >>> ");
		md.performQuack();
		
		System.out.print("\nMallard duck object's perform fly method >>> ");
		md.performFly();
		
		System.out.print("\nMallard duck object's display method >>> ");
		md.display();
		
		System.out.println("\n------------------------------------------------------------------------------------------------------------------------\n");
		
		System.out.println("RubberDuck class's instance created...");
		RubberDuck rd = new RubberDuck();
		
		System.out.print("Rubber duck object's perform quack method >>> ");
		rd.performQuack();
		
		System.out.print("\nRubber duck object's perform fly method >>> ");
		rd.performFly();
		
		
		System.out.print("\nRubber duck object's display method >>> ");
		rd.display();
		
		System.out.println("\nRubber duck object's fly behaviour changed to \"fly rocket power\" at runtime");
		rd.setFlyBehaviour(new FlyRocketPowered());
		System.out.print("Rubber duck object's perform fly method >>> ");
		rd.performFly();
		
		
		System.out.println("\n------------------------------------------------------------------------------------------------------------------------\n");
		
		DuckCall device = new DuckCall();
		System.out.print("Duck call device quacking >>> ");
		device.performQuack();
		
		
		
		
	}
}
