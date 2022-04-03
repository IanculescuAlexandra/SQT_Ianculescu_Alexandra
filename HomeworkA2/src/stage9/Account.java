package stage9;

import stage9.exceptions.NegativeLoanValueException;
import stage9.interfaces.MonthlyRateCalculatorInterface;

public class Account implements MonthlyRateCalculatorInterface {
	private double loanValue, rate;
	private int daysActive;
	private AccountType accountType;

	public int getDaysActive() {
		return daysActive;
	}

	public void setDaysActive(int daysActive) {
		this.daysActive = daysActive;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getLoanValue() {
		System.out.println("The loan value is " + this.loanValue);
		return loanValue;
	}

	public double getRate() {
		System.out.println("The rate is " + rate);
		return this.rate;
	}

	// must have method - the lead has requested it in all classes
	@Override
	public double getMonthlyRate() {
		return loanValue * rate;
	}

	public void setLoanValue(double value) throws Exception {
		if (value < 0)
			throw new NegativeLoanValueException();
		else {
			loanValue = value;
		}
	}

	@Override
	public String toString() {
		return "Loan: " + this.loanValue + "; rate: " + this.rate + "; days active:" + daysActive + "; Type: "
				+ accountType + ";";
	}

	public Account(double value, double rate, AccountType accountType) throws Exception {
		if (value < 0)
			throw new NegativeLoanValueException();
		else {
			loanValue = value;
		}
		this.rate = rate;
		this.accountType = accountType;
	}

}

