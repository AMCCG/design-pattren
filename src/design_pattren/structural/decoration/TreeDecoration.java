package design_pattren.structural.decoration;

public abstract class TreeDecoration implements IChristmasTree {

	private IChristmasTree tree;

	public TreeDecoration(IChristmasTree tree) {
		this.tree = tree;
	}

	@Override
	public String decorate() {
		return tree.decorate();
	}

}
