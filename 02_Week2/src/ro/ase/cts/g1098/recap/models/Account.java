package ro.ase.cts.g1098.recap.models;

import ro.ase.cts.g1098.recap.exceptions.IllegalTransferException;
import ro.ase.cts.g1098.recap.exceptions.InsufficitentFundsException;

public abstract class Account {

	public abstract double getBalance();
	public abstract void deposit(double amount) throws IllegalTransferException;
	public abstract void withdraw(double amount) throws IllegalTransferException, InsufficitentFundsException;
	public abstract void transfer(Account destination, double amount) throws IllegalTransferException, InsufficitentFundsException;
}
