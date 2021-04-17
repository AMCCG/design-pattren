package design_pattern.creational.abstract_factory;

import design_pattern.creational.abstract_factory.animal.AnimalFactory;
import design_pattern.creational.abstract_factory.color.ColorFactory;

public class Main {

	public static void main(String[] args) {
		System.out.println("Factory");
		AnimalFactory animalFactory = new AnimalFactory();
		animalFactory.create("dog");
		animalFactory.create("bear");
		ColorFactory colorFactory = new ColorFactory();
		colorFactory.create("black");
		colorFactory.create("brown");
		System.out.println("-------- Abstact Factory --------");
		FactoryProvider factoryProvider = new FactoryProvider();
		AbstactFactory animalFact = factoryProvider.getFactory("Animal");
		animalFact.create("dog");
		AbstactFactory colorFact = factoryProvider.getFactory("Color");
		colorFact.create("brown");
	}

}
