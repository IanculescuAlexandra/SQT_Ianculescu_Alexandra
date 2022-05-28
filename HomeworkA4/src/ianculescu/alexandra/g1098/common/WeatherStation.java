package ianculescu.alexandra.g1098.common;

import ianculescu.alexandra.g1098.ex1.chain.ConnectToSensor;
import ianculescu.alexandra.g1098.ex1.chain.Handler;
import ianculescu.alexandra.g1098.ex1.chain.PublishSensorData;
import ianculescu.alexandra.g1098.ex1.chain.ReadSensorData;
import ianculescu.alexandra.g1098.ex1.chain.Sensor;
import ianculescu.alexandra.g1098.ex1.chain.StoreSensorData;
import ianculescu.alexandra.g1098.ex2.strategy.DataCollection;
import ianculescu.alexandra.g1098.ex2.strategy.RESTData;
import ianculescu.alexandra.g1098.ex2.strategy.SMSData;
import ianculescu.alexandra.g1098.ex2.strategy.WEBSITEData;
import ianculescu.alexandra.g1098.ex3.observer.Clients;
import ianculescu.alexandra.g1098.ex3.observer.HandlerNotifyLocalAlertingSystem;
import ianculescu.alexandra.g1098.ex3.observer.HandlerNotifyLocalMeteoService;
import ianculescu.alexandra.g1098.ex3.observer.HandlerNotifyWeatherMobileApplication;
import ianculescu.alexandra.g1098.ex4.state.MeltingState;
import ianculescu.alexandra.g1098.ex4.state.Weather;
import ianculescu.alexandra.g1098.ex4.state.WeatherInterface;
import ianculescu.alexandra.g1098.ex5.command.AlertingSystem;
import ianculescu.alexandra.g1098.ex5.command.FillingAction;
import ianculescu.alexandra.g1098.ex5.command.FireDepartment;
import ianculescu.alexandra.g1098.ex5.command.LaunchAction;
import ianculescu.alexandra.g1098.ex5.command.SmsAction;
import ianculescu.alexandra.g1098.ex6.command.FollowGridBasedPath;
import ianculescu.alexandra.g1098.ex6.command.FollowToInvestigate;
import ianculescu.alexandra.g1098.ex6.command.MonitoringDrone;
import ianculescu.alexandra.g1098.ex6.command.Situation;

public class WeatherStation extends AbstractWeatherStation{

	@Override
	public void testSensor() {
		
			Handler connect=new ConnectToSensor();
			Handler read=new ReadSensorData();
			Handler store=new StoreSensorData();
			Handler publish=new PublishSensorData();
			
			connect.setSuccesor(read);
			read.setSuccesor(store);
			store.setSuccesor(publish);
			
			Sensor s1=new Sensor(200,"connect to sensor");
			Sensor s2=new Sensor(51,"read sensor data");
			Sensor s3=new Sensor(12,"store sensor data");
			Sensor s4=new Sensor(1,"publish sensor data");
			
			connect.manageRequest(s1);
			connect.manageRequest(s2);
			connect.manageRequest(s3);
			connect.manageRequest(s4);
	}

	@Override
	public void testDifDataMeans() {
		DataCollection data=new DataCollection("Raining");
		
		SMSData smsData=new SMSData();
		RESTData restData=new RESTData();
		WEBSITEData websiteData=new WEBSITEData();
		
		data.setStrategy(smsData);
		System.out.println("Weather: "+data.processData());
		
		data.setStrategy(restData);
		System.out.println("Weather: "+data.processData());
		
		data.setStrategy(websiteData);
		System.out.println("Weather: "+data.processData());
		
	}

	@Override
	public void testNotifyClients() {
         
		Clients client=new Clients();
		
		HandlerNotifyLocalMeteoService handlerNotifyLocalMeteoService=new HandlerNotifyLocalMeteoService();
		HandlerNotifyWeatherMobileApplication handlerNotifyWeatherMobileApplication=new HandlerNotifyWeatherMobileApplication();
		HandlerNotifyLocalAlertingSystem handlerNotifyLocalAlertingSystem=new HandlerNotifyLocalAlertingSystem();
		
		client.registerHandler(handlerNotifyLocalMeteoService);
		client.registerHandler(handlerNotifyWeatherMobileApplication);
		client.registerHandler(handlerNotifyLocalAlertingSystem);
		client.Notify();
		
		
		
	}

	@Override
	public void testSendAlertsWhenState() {
		WeatherInterface weather=new Weather(15, 31, 40);
		weather.AlertState();
		
	}

	@Override
	public void testFireDepAlertingSystem() {
		FireDepartment fireDep=new FireDepartment("Sector 1");
		int orderNumber=2;
		AlertingSystem alertingSystem=new AlertingSystem(orderNumber);
		alertingSystem.takeOrder(new SmsAction(fireDep));
		alertingSystem.takeOrder(new LaunchAction(fireDep));
		alertingSystem.takeOrder(new FillingAction(fireDep));
		alertingSystem.sendOrder();
		
		
	}

	@Override
	public void testDrone() {
		MonitoringDrone drone=new MonitoringDrone("ModelNo123");
		int noSituation=3;
		Situation situation=new Situation(noSituation);
		situation.takeOrder(new FollowGridBasedPath(drone));
		Boolean smokeDetected=true;
		if(smokeDetected==true)
			situation.takeOrder(new FollowToInvestigate(drone));
		situation.sendOrder();
	}

}
