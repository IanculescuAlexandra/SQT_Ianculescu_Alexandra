package ianculescu.alexandra.g1098.ex3.observer;

public class Clients extends Notifiable {

	private boolean isNotified=false;
	
	public void setNotified() {
		if(!isNotified) {
			isNotified=true;
			this.notifyObservers();
		}else
			isNotified=false;
	}
	
	public void Notify() {
		System.out.println("Client notified");
		setNotified();
	}
}
