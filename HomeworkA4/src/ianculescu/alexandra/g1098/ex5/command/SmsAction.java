package ianculescu.alexandra.g1098.ex5.command;

public class SmsAction implements SystemOrder{

	private FireDepartment fireDepartment;
	
	@Override
	public void action() {
		fireDepartment.smsAction();
		
	}
	public SmsAction(FireDepartment fireDepartment) {
		super();
		this.fireDepartment = fireDepartment;
	}

	
}
