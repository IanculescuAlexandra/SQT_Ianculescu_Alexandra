package stage6;

public class AccountCalculator {

	public static double calculate(Account[] accounts) {
		double totalFee = 0.0;
		Account account;
		int temp = 365;
		for (int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			if (account.getAccountType() == AccountType.PREMIUM || account.getAccountType() == AccountType.SUPER_PREMIUM)
				totalFee += .0125 * ( // 1.25% broker's fee
				account.getLoanValue() * Math.pow(account.getRate(), (account.getDaysActive() / 365)) - account.getLoanValue()); // interest-principal
		}
		return totalFee;
	}
}
