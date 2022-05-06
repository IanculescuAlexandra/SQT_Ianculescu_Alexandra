package ianculescu.alexandra.g1098.singleton;

public class LogIn {

	private static LogIn login = null;

	String username;
	String password;

	private LogIn() {

	}

	private LogIn(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public static synchronized LogIn getInstance() {
		if (login == null) {
			login = new LogIn();
		}
		return login;
	}

	public static synchronized LogIn getInstance(String username, String password) {
		if (login == null) {
			login = new LogIn(username, password);
		}
		return login;
	}
}
