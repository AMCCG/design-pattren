package design_pattern.structural.decoration;

public class BubbleLights extends TreeDecoration {

	public BubbleLights(IChristmasTree tree) {
		super(tree);
	}

	@Override
	public String decorate() {
		// TODO Auto-generated method stub
		return super.decorate() + this.decorateWithBubbleLights();
	}

	private String decorateWithBubbleLights() {
		return " with Bubble Lights";
	}
}