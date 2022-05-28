package ianculescu.alexandra.g1098.ex2.strategy;

public class WEBSITEData implements IProcessable {

	@Override
	public String processData(String data) {
		StringBuilder websiteData=new StringBuilder();
		websiteData.append("By website: ");
		websiteData.append(data);
		return websiteData.toString();
	}

}
