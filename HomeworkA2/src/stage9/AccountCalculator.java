package stage9;

public class AccountCalculator {

	public static final int DAYS_IN_THE_YEAR = 365;
	public static final float BROKER_FEE = .0125f;
	public static double calculate(Account[] accounts) {
		double totalFee = 0.0;
		Account account;
		for (int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			if (account.getAccountType() == AccountType.PREMIUM || account.getAccountType() == AccountType.SUPER_PREMIUM)
				totalFee += BROKER_FEE * ( // 1.25% broker's fee
				account.getLoanValue() * Math.pow(account.getRate(), (account.getDaysActive() / DAYS_IN_THE_YEAR)) - account.getLoanValue()); // interest-principal
		}
		return totalFee;
	}
}
