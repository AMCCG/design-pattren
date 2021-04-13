package design_pattren.behavior.strategy.after;

public class CannotFly implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("Cannot fly.");
	}

}
