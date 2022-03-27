package ro.ase.cts.g1098.clean.code.stage5;

public class AccountMarketingStrategy {

	static final int MAX_ACCOUNT_AGE = 10;
	static final float MAX_ACCOUNT_DISCOUNT = 0.15f;
	
	public float getAccountDiscount(int accountAgeInYears) {
		return (accountAgeInYears > MAX_ACCOUNT_AGE) ? MAX_ACCOUNT_DISCOUNT : (float)accountAgeInYears/100;
	}
	
	//inainte: accountDiscount =(accountAgeInYears > MAX_ACCOUNT_AGE) ? MAX_ACCOUNT_DISCOUNT : (float)accountAgeInYears/100
	
	//facem o clasa care sa se ocupe numai de strategia de 
	//marketing - account discount
	
	// static final se muta in clasa asta pentru ca 
	//sunt atribute care tin de account si se scot din product
	
	//si o functie getAccountDiscount si luam formuala
	//Daca conditia e true, 
	//atunci ia valoarea MAX_ACCOUNT_DISCOUNT, 
	//Daca nu, ia valoarea care e dupa :

	//Etapa asta: facem o clasa separata unde sunt atributele
	//care tin de account&discount
	
	// SOLID - Single Responsibility
	// outsource the implementation of the account discount computation
	// outsource the computation of a discount value
	// outsource the computation of the price with discount

	
}
