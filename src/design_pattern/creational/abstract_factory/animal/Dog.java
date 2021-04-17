package design_pattern.creational.abstract_factory.animal;

public class Dog implements IAnimal {

	@Override
	public String getType() {
		return "Dog";
	}

	@Override
	public String makeSound() {
		return "hoof hoof !";
	}

}
