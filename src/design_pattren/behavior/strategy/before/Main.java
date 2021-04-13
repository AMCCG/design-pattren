package design_pattren.behavior.strategy.before;

public class Main {

	public static void main(String[] args) {
		System.out.println("Strategy Pattren");
		System.out.println("----- Duck -----");
		Duck duck = new Duck();
		duck.display();
		duck.quach();
		duck.fly();
		duck.eat();
		System.out.println("----- WildDuck -----");
		WildDuck wildDuck = new WildDuck();
		wildDuck.quach();
		System.out.println("----- CityDuck -----");
		CityDuck cityDuck = new CityDuck();
		cityDuck.quach();
		System.out.println("----- RubberDuck -----");
		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.fly();
		rubberDuck.eat();
		System.out.println("----- MoutainDuck -----");
		MoutainDuck moutainDuck = new MoutainDuck();
		moutainDuck.fly();
		moutainDuck.eat();
		System.out.println("----- CloudDuck -----");
		CloudDuck cloudDuck = new CloudDuck();
		cloudDuck.quach();
		cloudDuck.fly();
		cloudDuck.eat();

	}
}
