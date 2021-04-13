package design_pattren.behavior.observer;

public abstract interface IObserveable {

	public void add(IObserver iObserver);

	public void remove(IObserver iObserver);

	public void notifyObserve();
}
