package ianculescu.alexandra.g1098.ex2.strategy;

public class SMSData implements IProcessable {

	@Override
	public String processData(String data) {
		StringBuilder smsData=new StringBuilder();
		smsData.append("By SMS: ");
		smsData.append(data);
		return smsData.toString();
	}

}
