package design_pattren.creational.factory_method;

public class Main {

	public static void main(String[] args) {
		System.out.println("Creational Pattre - Factory Method");
		System.out.println("------------------------------------");
		System.out.println("Pizza Factory");
		PizzaFactory pizzaFactory = new PizzaFactory();
		Pizza cheesePizza = pizzaFactory.createPizza("cheese");
		Pizza peperoni = pizzaFactory.createPizza("peperoni");
	}

}
