package design_pattren.structural.decorator.berverage;

public class SCup extends AddOnDecoration {

	public SCup(IBeverage beverage) {
		super(beverage);
	}

	@Override
	public int cost() {
		return super.cost() + 1;
	}

	@Override
	public String desc() {
		return super.desc() + " with Small cup";
	}

	
}
