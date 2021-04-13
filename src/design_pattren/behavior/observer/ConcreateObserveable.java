package design_pattren.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreateObserveable implements IObserveable {

	private Object state;
	private List<IObserver> iObservers = new ArrayList<>();

	@Override
	public void add(IObserver iObserver) {
		this.iObservers.add(iObserver);
	}

	@Override
	public void remove(IObserver iObserver) {
		this.iObservers.remove(iObserver);
	}

	@Override
	public void notifyObserve() {
		System.out.println("notifyObserve " + iObservers.size());
		for (IObserver iObserver : iObservers) {
			iObserver.update();
		}
	}

	public Object getState() {
		return this.state;
	}

	public void setState(Object obj) {
		this.state = obj;
		this.notifyObserve();
	}

}
