package design_pattern.behavior.strategy.before;

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
