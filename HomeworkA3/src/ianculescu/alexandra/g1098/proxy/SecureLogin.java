package ianculescu.alexandra.g1098.proxy;

import java.util.HashMap;

public class SecureLogin implements ILogin {

	ILogin initialLogin = null;
	HashMap<String, Integer> counterLogin = new HashMap<>();
	public static final int MAX_ATTEMPTS = 5;
	
	@Override
	public boolean login(String user, String pass) {
		
		Integer noLogs = counterLogin.get(user);
		if(noLogs == null) {
			counterLogin.put(user, 0);
			noLogs = 0;
		}
		
		if(noLogs >= MAX_ATTEMPTS)
		{
			System.out.println("Alarm " + user);
			return false;
		}
		
		if(this.initialLogin != null) {
			boolean result = 
					this.initialLogin.login(user, pass);
			if(result == false) {
				noLogs+=1;
				counterLogin.put(user, noLogs);
			}
			else
			{
				noLogs = 0;
				counterLogin.put(user, noLogs);
			}
			return result;
		}
		else
			throw new UnsupportedOperationException();
	}
}


