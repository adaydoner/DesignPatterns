package observer.implementation;

import observer.interfaces.DisplayElement;
import observer.interfaces.Observer;
import subject.interfaces.Subject;

public class CurrentConditionsDisplay implements DisplayElement, Observer {

	private float temperature;
	private float humidity;
	private double heatIndex;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure, double heatIndex) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.heatIndex = heatIndex;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions for Current conditions display: " + temperature + "F degrees, " + humidity + "% humidity and " + heatIndex + "  heath index");

	}

}
