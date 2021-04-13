package design_pattren.behavior.observer;

public class ConcreateObserver implements IObserver {

	@Override
	public void update() {
		System.out.println("ConcreateObserver update.");
	}

}
