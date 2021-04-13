package design_pattren.behavior.strategy.before;

public class MoutainDuck extends Duck {

	@Override
	public void fly() {
		System.out.println("Same fly.");
	}
	
	@Override
	public void eat() {
		System.out.println("Cannot eat.");
	}

}
