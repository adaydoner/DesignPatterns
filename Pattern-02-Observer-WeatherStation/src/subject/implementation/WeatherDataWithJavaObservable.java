package subject.implementation;

import java.util.ArrayList;
import java.util.Observable;

import observer.interfaces.Observer;

public class WeatherDataWithJavaObservable extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	private double heatIndex;
	
	public WeatherDataWithJavaObservable() {
	}

	public WeatherDataWithJavaObservable(ArrayList<Observer> observers, float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		calculateHeatIndex();
		measurementsChanged();
		
	}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature , float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public void setTemperature(float temperature) {
		this.temperature = temperature;
		calculateHeatIndex();
		measurementsChanged();
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
		calculateHeatIndex();
		measurementsChanged();
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
		measurementsChanged();
	}
	
	private void calculateHeatIndex (){
		
		double C1 = -42.379;
        double C2 = 2.04901523;
        double C3 = 10.14333127;
        double C4 = -0.22475541;
        double C5 = -.00683783;
        double C6 = -5.481717E-2;
        double C7 = 1.22874E-3;
        double C8 = 8.5282E-4;
        double C9 = -1.99E-6;
        
        heatIndex = C1 + (C2 * temperature) + (C3 * humidity) + (C4 * temperature * humidity) + (C5 * temperature * temperature) + (C6 * humidity * humidity) + (C7 * temperature * temperature * humidity) + (C8 * temperature * humidity * humidity) + (C9 * temperature * temperature * humidity * humidity);
	}


	public double getHeatIndex() {
		return heatIndex;
	}

	public float getTemperature() {
		return temperature;
		
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
}
