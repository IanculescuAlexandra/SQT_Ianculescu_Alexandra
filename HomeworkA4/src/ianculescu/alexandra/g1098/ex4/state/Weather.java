package ianculescu.alexandra.g1098.ex4.state;

public class Weather implements WeatherInterface {

	int humidityPercentage;
	int wind;
	int airtemperture;
	
	WeatherStateInterface weatherState;
	
	
	
	public Weather(int humidityPercentage, int wind, int airtemperture) {
		super();
		this.humidityPercentage = humidityPercentage;
		this.wind = wind;
		this.airtemperture = airtemperture;
		this.setState(new WildfireState(this));
	}

	@Override
	public int humidity() {
		return this.humidityPercentage;
		
	}

	@Override
	public int windspeed() {
		return this.wind;
		
	}

	@Override
	public int temperature() {
		return this.airtemperture;
		
	}

	@Override
	public void setState(WeatherStateInterface state) {
		this.weatherState = state;

	}
	@Override
	public void AlertState() {
		this.weatherState.alert();
		
	}

	

}
