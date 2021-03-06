package ianculescu.alexandra.g1098.ex3.observer;

import java.util.ArrayList;

public abstract class Notifiable {

	ArrayList<HandlerNotification> observers=new ArrayList<>();
	
	public void registerHandler(HandlerNotification handler){
		if(observers!=null)
			observers.add(handler);
	}
	public void unregisterHandler(HandlerNotification handler){
		if(observers!=null)
			observers.remove(handler);
	}
	public void notifyObservers(){
		if(observers!=null)
			for(int i = 0;i<observers.size();i++)
				observers.get(i).doNotify();
	}
}
