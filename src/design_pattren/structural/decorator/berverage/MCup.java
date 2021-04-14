package design_pattren.structural.decorator.berverage;

public class MCup extends AddOnDecoration {

	public MCup(IBeverage beverage) {
		super(beverage);
	}

	@Override
	public int cost() {
		return super.cost() + 3;
	}

	@Override
	public String desc() {
		return super.desc() + " with Medium cup";
	}

}
