package design_pattren.behavior.strategy_patten.after;

public class Main {

	public static void main(String[] args) {
		System.out.println("Strategy Pattren After");
		System.out.println("----- CloudDuck -----");
		CloudDuck cloudDuck = new CloudDuck();
		cloudDuck.display();
		cloudDuck.quach();
		cloudDuck.fly();
		System.out.println("----- MoutainDuck -----");
		MoutainDuck moutainDuck = new MoutainDuck();
		moutainDuck.display();
		moutainDuck.quach();
		moutainDuck.fly();
	}
}
