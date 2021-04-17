package design_pattern.behavior.strategy.after;

public class MoutainDuck extends Duck {

	public MoutainDuck() {
		super(new SimpleDisplay(), new SimpleQuach(), new CannotFly());
	}

}
