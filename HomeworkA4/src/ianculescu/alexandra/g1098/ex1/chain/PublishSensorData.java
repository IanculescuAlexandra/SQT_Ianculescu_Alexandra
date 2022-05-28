package ianculescu.alexandra.g1098.ex1.chain;

public class PublishSensorData extends Handler{

	@Override
	public void manageRequest(Sensor sensor) {
		if(sensor.getPriority()<=10) {
			System.out.println("Publish sensor data");
		}
//		if(this.succesor!=null) {
//			this.succesor.manageRequest(sensor);
//		}
		
	}

}
