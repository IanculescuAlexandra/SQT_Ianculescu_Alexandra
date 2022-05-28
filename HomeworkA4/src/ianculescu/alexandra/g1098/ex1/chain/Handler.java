package ianculescu.alexandra.g1098.ex1.chain;

public abstract class Handler {

	protected Handler succesor=null;
	public void setSuccesor(Handler succesor) {
		this.succesor=succesor;
	}
	public abstract void manageRequest(Sensor sensor);
}
