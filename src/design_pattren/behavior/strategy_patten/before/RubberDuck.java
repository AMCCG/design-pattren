package design_pattren.behavior.strategy_patten.before;

public class RubberDuck extends Duck {

	@Override
	public void fly() {
		System.out.println("RubberDuck Cannot Fly.");
	}

	@Override
	public void eat() {
		System.out.println("Cannot eat.");
	}
	
	

}
