package design_pattren.creational.factory_method;

public class PizzaFactory extends BasePizzaFactory {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		switch (type) {
		case "cheese":
			pizza = new CheesePizza();
			break;
		case "peperoni":
			pizza = new PepperoniPizza();
			break;
		default:
			throw new IllegalArgumentException("No such pizza.");
		}
		pizza.addIngredients();
		pizza.bakePizza();
		return pizza;
	}

}
