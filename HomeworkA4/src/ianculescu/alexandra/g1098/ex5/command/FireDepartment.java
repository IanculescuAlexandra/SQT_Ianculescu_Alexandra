package ianculescu.alexandra.g1098.ex5.command;

public class FireDepartment {

	private String name;

	public FireDepartment(String name) {
		super();
		this.name = name;
	}
	
	public void smsAction() {
		System.out.println("Message to firemen to get to the station");
	}
	
	public void launchAction() {
		System.out.println("Launch drone");
	}
	
	public void fillingAction() {
		System.out.println("Filling fire truck with water");
	}
}
