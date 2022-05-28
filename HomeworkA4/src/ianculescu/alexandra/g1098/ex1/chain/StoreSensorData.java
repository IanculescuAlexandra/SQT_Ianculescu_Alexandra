package ianculescu.alexandra.g1098.ex1.chain;

public class StoreSensorData extends Handler {

	@Override
	public void manageRequest(Sensor sensor) {
		if(sensor.getPriority()<=50&&sensor.getPriority()>10) {
			System.out.println("Store sensor data in local database");
		}
		if(this.succesor!=null) {
			this.succesor.manageRequest(sensor);
		}
		
	}

}
