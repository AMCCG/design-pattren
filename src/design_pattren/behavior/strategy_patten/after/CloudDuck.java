package design_pattren.behavior.strategy_patten.after;

public class CloudDuck extends Duck {

	public CloudDuck() {
		super(new SimpleDisplay(),new NoQuach(), new JetFly());
	}

}
