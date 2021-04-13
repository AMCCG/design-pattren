package design_pattren.behavior.observer;

public abstract interface IObserveableWeather {

	public void add(IObserverWeather iObserver);

	public void remove(IObserverWeather iObserver);

	public void notifyObserve();
}
