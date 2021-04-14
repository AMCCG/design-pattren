package design_pattren.structural.decorator.berverage;

public class Hot extends AddOnDecoration {

	public Hot(IBeverage beverage) {
		super(beverage);
	}

	@Override
	public int cost() {
		return super.cost() + 1;
	}

	@Override
	public String desc() {
		return super.desc() + " with hot";
	}

}
