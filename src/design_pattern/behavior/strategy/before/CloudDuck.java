package design_pattern.behavior.strategy.before;

public class CloudDuck extends Duck {

	@Override
	public void fly() {
		System.out.println("Same fly.");
	}
	
	@Override
	public void eat() {
		System.out.println("CloudDuck eat.");
	}
	
	@Override
	public void quach() {
		System.out.println("Cannot quach.");
	}


}
