package design_pattren.creational.abstract_factory.color;

import design_pattren.creational.abstract_factory.AbstactFactory;

public class ColorFactory implements AbstactFactory<IColor> {

	private IColor color;

	@Override
	public IColor create(String type) {
		switch (type) {
		case "black":
			this.color = new Black();
			break;
		case "brown":
			this.color = new Brown();
			break;
		default:
			throw new IllegalArgumentException("don't know type.");
		}
		System.out.println("color : " + this.color.getColor());
		return this.color;
	}

}
