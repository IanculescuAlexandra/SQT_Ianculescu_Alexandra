package ianculescu.alexandra.g1098.ex1.chain;

public class ReadSensorData extends Handler{

	@Override
	public void manageRequest(Sensor sensor) {
		if(sensor.getPriority()>50&&sensor.getPriority()<=100) {
			System.out.println("Read sensor data");
		}
		if(this.succesor!=null) {
			this.succesor.manageRequest(sensor);
		}
		
	}

}
