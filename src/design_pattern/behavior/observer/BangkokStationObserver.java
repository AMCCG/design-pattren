package design_pattern.behavior.observer;

public class BangkokStationObserver implements IObserverWeather {

	private long temperature;

	@Override
	public void update(long temperature) {
		this.setTemperature(temperature);
	}

	public long getTemperature() {
		return temperature;
	}

	public void setTemperature(long temperature) {
		this.temperature = temperature;
	}
}
