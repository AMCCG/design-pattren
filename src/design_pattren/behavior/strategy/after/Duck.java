package design_pattren.behavior.strategy.after;

public abstract class Duck implements IQuachBehavior, IFlyBehavior, IDisplayBehavior {

	private IQuachBehavior iQuachBehavior;
	private IFlyBehavior iFlyBehavior;
	private IDisplayBehavior iDisplayBehavior;

	public Duck(IDisplayBehavior iDisplayBehavior, IQuachBehavior iQuachBehavior, IFlyBehavior iFlyBehavior) {
		this.iDisplayBehavior = iDisplayBehavior;
		this.iQuachBehavior = iQuachBehavior;
		this.iFlyBehavior = iFlyBehavior;
	}

	@Override
	public void display() {
		iDisplayBehavior.display();
	}

	@Override
	public void fly() {
		iFlyBehavior.fly();
	}

	@Override
	public void quach() {
		iQuachBehavior.quach();
	}

}
