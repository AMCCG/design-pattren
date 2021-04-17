package design_pattern.structural.decorator.berverage;

public abstract class AddOnDecoration implements IBeverage {

	private IBeverage beverage;

	public AddOnDecoration(IBeverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public int cost() {
		return this.beverage.cost();
	}

	@Override
	public String desc() {
		return this.beverage.desc();
	}

}
