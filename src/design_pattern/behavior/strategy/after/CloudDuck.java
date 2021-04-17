package design_pattern.behavior.strategy.after;

public class CloudDuck extends Duck {

	public CloudDuck() {
		super(new SimpleDisplay(),new NoQuach(), new JetFly());
	}

}
