package ianculescu.alexandra.g1098.ex4.state;

public class MeltingState implements WeatherStateInterface{

	WeatherInterface weather;
	
	
	
	public MeltingState(WeatherInterface weather) {
		super();
		this.weather = weather;
	}

	@Override
	public void alert() {
		if(this.weather.humidity()<30&&this.weather.windspeed()<5&&this.weather.temperature()>39) {
			System.out.println("Alert ice cream department!");
		}
	}

}
