package ianculescu.alexandra.g1098.ex3.observer;

public class HandlerNotifyLocalMeteoService implements HandlerNotification {

	@Override
	public void doNotify() {
		System.out.println("Notify Local Meteo Service");
		
	}

}
