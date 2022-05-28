package ianculescu.alexandra.g1098.ex4.state;

public class StormAlertState implements WeatherStateInterface{

	WeatherInterface weather;
	
	
	
	public StormAlertState(WeatherInterface weather) {
		super();
		this.weather = weather;
	}



	@Override
	public void alert() {
		if(this.weather.windspeed()>90) {
			System.out.println("Storm alert!");
		}
		
	}

}
