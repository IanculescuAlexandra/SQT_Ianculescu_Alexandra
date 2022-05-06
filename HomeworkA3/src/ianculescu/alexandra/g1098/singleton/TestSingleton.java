package ianculescu.alexandra.g1098.singleton;

public class TestSingleton {
	
	public void test() {
		LogIn logininstance1 = LogIn.getInstance();
		LogIn logininstance2 = LogIn.getInstance();

		if (logininstance1 == logininstance2) {
			System.out.println("same object");
		}

		LogIn logininstance3 = LogIn.getInstance("Ale", "1234");

		if (logininstance1 == logininstance3) {
			System.out.println("same object");
		}
	}

}
