package ianculescu.alexandra.g1098.ex2.strategy;

public class DataCollection {

	protected String data;
	protected IProcessable externalEntity;
	
	public DataCollection(String data) {
		this.data=data;
	}
	
	public void setStrategy(IProcessable entity) {
		this.externalEntity=entity;
		
	}
	
	public String processData() {
		if(externalEntity!=null) {
			return externalEntity.processData(data);
		}else
			throw new UnsupportedOperationException();
	}
}
