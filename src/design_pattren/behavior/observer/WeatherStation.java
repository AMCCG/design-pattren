package design_pattren.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObserveableWeather {

	private long temperature;

	private List<IObserverWeather> iObservers = new ArrayList<>();

	@Override
	public void add(IObserverWeather iObserver) {
		this.iObservers.add(iObserver);
	}

	@Override
	public void remove(IObserverWeather iObserver) {
		this.iObservers.remove(iObserver);
	}

	@Override
	public void notifyObserve() {
		for (IObserverWeather iObserver : iObservers) {
			iObserver.update(this.getTemperature());
		}
	}

	public long getTemperature() {
		return temperature;
	}

	public void setTemperature(long temperature) {
		this.temperature = temperature;
	}

}
