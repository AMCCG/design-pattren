package design_pattern.structural.decorator.berverage;

public class LCup extends AddOnDecoration {

	public LCup(IBeverage beverage) {
		super(beverage);
	}

	@Override
	public int cost() {
		return super.cost() + 5;
	}

	@Override
	public String desc() {
		return super.desc() + " with Large cup";
	}

}
