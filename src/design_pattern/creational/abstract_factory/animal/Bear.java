package design_pattern.creational.abstract_factory.animal;

public class Bear implements IAnimal {

	@Override
	public String getType() {
		return "Bear";
	}

	@Override
	public String makeSound() {
		return "bearrr !";
	}

}
