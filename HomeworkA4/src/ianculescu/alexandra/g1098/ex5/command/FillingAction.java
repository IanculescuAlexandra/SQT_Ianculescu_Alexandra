package ianculescu.alexandra.g1098.ex5.command;

public class FillingAction implements SystemOrder {

	private FireDepartment fireDepartment;
	@Override
	public void action() {
		fireDepartment.fillingAction();
	}
	public FillingAction(FireDepartment fireDepartment) {
		super();
		this.fireDepartment = fireDepartment;
	}
	

}
