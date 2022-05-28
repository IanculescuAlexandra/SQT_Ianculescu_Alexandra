package ianculescu.alexandra.g1098.ex4.state;

public class StayAtHomeState implements WeatherStateInterface {

	WeatherInterface weather;
	
	
	public StayAtHomeState(WeatherInterface weather) {
		super();
		this.weather = weather;
	}


	@Override
	public void alert() {
		if(this.weather.temperature()<-15) {
			System.out.println("Stay at home alert!");
		}
		
	}

}
