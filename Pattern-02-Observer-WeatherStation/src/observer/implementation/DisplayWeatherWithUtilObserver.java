package observer.implementation;

import java.util.Observable;
import java.util.Observer;

import observer.interfaces.DisplayElement;
import subject.implementation.WeatherDataWithJavaObservable;

public class DisplayWeatherWithUtilObserver implements Observer, DisplayElement {
	private Observable observable;
	private float temperature;
	private double heatIndex;
	
	public DisplayWeatherWithUtilObserver(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	@Override
	public void update(Observable obs, Object arg1) {
		if(obs instanceof WeatherDataWithJavaObservable){
			WeatherDataWithJavaObservable wData = (WeatherDataWithJavaObservable)obs;
			this.temperature = wData.getTemperature();
			this.heatIndex = wData.getHeatIndex();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current conditions for Display Weather With Util Observer display: " + temperature + "F degrees, and " + heatIndex + "  heath index");
		
	}
}
