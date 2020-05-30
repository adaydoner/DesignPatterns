package main;

import observer.implementation.CurrentConditionsDisplay;
import observer.implementation.DisplayWeatherWithUtilObserver;
import subject.implementation.WeatherData;
import subject.implementation.WeatherDataWithJavaObservable;

public class MainApp {

	public static void main(String[] args) {
		
		System.out.println(">>>>>>>>> Observer Pattern With custom Observable and Observer");
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		weatherData.setTemperature(1);
		
		System.out.println("--------------------------------------------------------------------");
		
		
		System.out.println(">>>>>>>>> Observer Pattern With java.util Observable and Observer");
		WeatherDataWithJavaObservable wData = new WeatherDataWithJavaObservable();
		DisplayWeatherWithUtilObserver displayObserver = new DisplayWeatherWithUtilObserver(wData);
		wData.setTemperature(20);
		wData.setHumidity(34);
		wData.setPressure(3);
	}

}
