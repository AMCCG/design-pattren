package design_pattern.creational.abstract_factory;

import design_pattern.creational.abstract_factory.animal.AnimalFactory;
import design_pattern.creational.abstract_factory.color.ColorFactory;

public class FactoryProvider {

	public AbstactFactory getFactory(String type) {
		switch (type) {
		case "Animal":
			return new AnimalFactory();
		case "Color":
			return new ColorFactory();
		default:
			throw new IllegalArgumentException("don't know type.");
		}
	}

}
