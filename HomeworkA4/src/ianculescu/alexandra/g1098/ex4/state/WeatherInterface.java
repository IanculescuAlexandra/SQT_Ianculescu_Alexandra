package ianculescu.alexandra.g1098.ex4.state;

public interface WeatherInterface {

	public abstract int humidity();
	public abstract int windspeed();
	public abstract int temperature();
	public abstract void setState(WeatherStateInterface state);
	public abstract void AlertState();
}
