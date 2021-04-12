package design_pattren.behavior.strategy_patten.after;

public class CannotFly implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("Cannot fly.");
	}

}
