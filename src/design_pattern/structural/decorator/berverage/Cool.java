package design_pattern.structural.decorator.berverage;

public class Cool extends AddOnDecoration {

	public Cool(IBeverage beverage) {
		super(beverage);
	}

	@Override
	public int cost() {
		return super.cost() + 2;
	}

	@Override
	public String desc() {
		return super.desc() + " with cool";
	}
}
