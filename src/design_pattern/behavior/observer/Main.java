package design_pattern.behavior.observer;

import java.util.Random;

public class Main {

	public static void main(String args[]) {
		System.out.println("Observer Pattren");
		ConcreateObserveable concreateObserveable = new ConcreateObserveable();
		ConcreateObserver concreateObserver1 = new ConcreateObserver();
		ConcreateObserver concreateObserver2 = new ConcreateObserver();
		concreateObserveable.add(concreateObserver1);
		concreateObserveable.add(concreateObserver2);
		concreateObserveable.notifyObserve();
		System.out.println("Ex 1 Weather ");
		WeatherStation weatherStation = new WeatherStation();
		BangkokStationObserver bangkokStationObserver = new BangkokStationObserver();
		ParisStationObserver parisStationObserver = new ParisStationObserver();
		weatherStation.add(bangkokStationObserver);
		weatherStation.add(parisStationObserver);
		for (int i = 0; i < 5; i++) {
			System.out.println("Time " + i);
			Random random = new Random();
			weatherStation.setTemperature(Long.valueOf(String.valueOf(random.nextInt(100))));
			weatherStation.notifyObserve();
			System.out.println("Bangkok station " + i + " : " + bangkokStationObserver.getTemperature());
			System.out.println("Paris station " + i + " : " + parisStationObserver.getTemperature());
		}

	}

}
