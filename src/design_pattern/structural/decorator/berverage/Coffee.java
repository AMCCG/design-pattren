package design_pattern.structural.decorator.berverage;

public class Coffee implements IBeverage {

	@Override
	public int cost() {
		return 20;
	}

	@Override
	public String desc() {
		return "Coffee";
	}

}
