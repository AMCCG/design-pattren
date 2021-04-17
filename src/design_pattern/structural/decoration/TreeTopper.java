package design_pattern.structural.decoration;

public class TreeTopper extends TreeDecoration {

	public TreeTopper(IChristmasTree tree) {
		super(tree);
	}

	@Override
	public String decorate() {
		return super.decorate() + this.decorateWithTreeTopper();
	}

	private String decorateWithTreeTopper() {
		return " with Tree Topper";
	}

}
