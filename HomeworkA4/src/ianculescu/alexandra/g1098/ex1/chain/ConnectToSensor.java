package ianculescu.alexandra.g1098.ex1.chain;

public class ConnectToSensor extends Handler {

	@Override
	public void manageRequest(Sensor sensor) {
		if(sensor.getPriority()>100) {
			System.out.println("Connect to sensor");
		}
		if(this.succesor!=null) {
			this.succesor.manageRequest(sensor);
		}
		
	}

}
