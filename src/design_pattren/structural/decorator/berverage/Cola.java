package design_pattren.structural.decorator.berverage;

public class Cola implements IBeverage {

	@Override
	public int cost() {
		return 15;
	}

	@Override
	public String desc() {
		return "Cola";
	}

}
