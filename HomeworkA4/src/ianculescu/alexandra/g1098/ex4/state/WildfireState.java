package ianculescu.alexandra.g1098.ex4.state;

public class WildfireState implements WeatherStateInterface {

	WeatherInterface weather;
	
	
	public WildfireState(WeatherInterface weather) {
		super();
		this.weather = weather;
	}


	@Override
	public void alert() {
		if(this.weather.humidity()<30&&this.weather.windspeed()>30&&this.weather.temperature()>39) {
			System.out.println("Alert local fire department!");
		}
		
	}

}
