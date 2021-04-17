package design_pattern.behavior.strategy.after;

public class SimpleFly implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("Simple fly.");
	}

}
