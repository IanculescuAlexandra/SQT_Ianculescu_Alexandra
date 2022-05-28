package ianculescu.alexandra.g1098.common;

public class Main {

	public static void main(String[] args) {
		
		AbstractWeatherStation weather=new WeatherStation();
		weather.testSensor();
		System.out.println(" ---- ");
		weather.testDifDataMeans();
		System.out.println(" ---- ");
		weather.testNotifyClients();
		System.out.println(" ---- ");
		weather.testSendAlertsWhenState();
		System.out.println(" ---- ");
		weather.testFireDepAlertingSystem();
		System.out.println(" ---- ");
		weather.testDrone();
		System.out.println(" ---- ");
		
	}

}
