package ianculescu.alexandra.g1098.ex6.command;

public class MonitoringDrone {

	private String model;

	public MonitoringDrone(String model) {
		super();
		this.model = model;
	}
	public void followGridBasedPath() {
		System.out.println("Normal activity on grid based path");
		
	}
	
	public void followToInvestigate() {
		System.out.println("Investigate because of smoke trails");
	}
}
