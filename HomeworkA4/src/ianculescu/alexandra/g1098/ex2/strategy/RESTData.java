package ianculescu.alexandra.g1098.ex2.strategy;

public class RESTData implements IProcessable{

	@Override
	public String processData(String data) {
		StringBuilder restData=new StringBuilder();
		restData.append("By REST services: ");
		restData.append(data);
		return restData.toString();
	}

}
