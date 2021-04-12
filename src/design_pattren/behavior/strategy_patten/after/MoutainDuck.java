package design_pattren.behavior.strategy_patten.after;

public class MoutainDuck extends Duck {

	public MoutainDuck() {
		super(new SimpleDisplay(), new SimpleQuach(), new CannotFly());
	}

}
