package ianculescu.alexandra.g1098.ex5.command;

public class LaunchAction implements SystemOrder{

	private FireDepartment fireDepartment;
	@Override
	public void action() {
		fireDepartment.launchAction();
	}
	public LaunchAction(FireDepartment fireDepartment) {
		super();
		this.fireDepartment = fireDepartment;
	}

	
}
