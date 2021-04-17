package design_pattren.creational.abstract_factory.animal;

import design_pattren.creational.abstract_factory.AbstactFactory;

public class AnimalFactory implements AbstactFactory<IAnimal> {

	private IAnimal animal;

	@Override
	public IAnimal create(String type) {
		switch (type) {
		case "dog":
			this.animal = new Dog();
			break;
		case "bear":
			this.animal = new Bear();
			break;
		default:
			throw new IllegalArgumentException("don't know type.");
		}
		System.out.println("type : " + this.animal.getType());
		System.out.println("sound : " + this.animal.makeSound());
		return this.animal;
	}

}
