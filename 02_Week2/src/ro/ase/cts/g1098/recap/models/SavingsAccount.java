package ro.ase.cts.g1098.recap.models;

import ro.ase.cts.g1098.recap.exceptions.IllegalTransferException;
import ro.ase.cts.g1098.recap.exceptions.InsufficitentFundsException;

public class SavingsAccount extends BankAccount {

	public static final double MIN_BALANCE=10;
	
	public SavingsAccount(String iban) {
		super(iban);
		try {
			this.deposit(SavingsAccount.MIN_BALANCE);
		} catch (IllegalTransferException e) {
			
		}
		
	}

	@Override
	public void withdraw(double amount) throws IllegalTransferException, InsufficitentFundsException {
		if(amount<=this.balance-SavingsAccount.MIN_BALANCE)
		super.withdraw(amount);
		else 
			throw new InsufficitentFundsException();
	}

	
}
