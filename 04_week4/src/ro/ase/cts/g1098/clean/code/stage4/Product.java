package ro.ase.cts.g1098.clean.code.stage4;

public class Product {

	//stage 4
	// use the received productType and not the generic enum symbol
	// remove the switch because all branches do the same stuff (except NEW)

	static final int MAX_ACCOUNT_AGE = 10;
	static final float MAX_ACCOUNT_DISCOUNT = 0.15f;
	
	
	public float computeFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears)
	  {	
	    float finalPrice = 0;
	    float accountDiscount = 0; //punem 0 deoarece daca e de tip
	    // (enum) NEW atunci nu avem discount si ramane 0
	    
	    if(productType != ProductType.NEW) {
	    accountDiscount = 
	    		(accountAgeInYears > MAX_ACCOUNT_AGE) ? MAX_ACCOUNT_DISCOUNT : (float)accountAgeInYears/100; 
	    }
	   
	    //daca e diferit de new avem discount si punem aici
	    //formula care era si inainte la  accountDiscount
	    
	    finalPrice = (initialPrice - (productType.getDiscount() * initialPrice)) - 
    			accountDiscount * (initialPrice - (productType.getDiscount() * initialPrice));
	    
	    //la NEW dupa formula ramane tot inital price pentru ca
	    //accountDiscount=0 si productType.getDiscount() e return this.discountValue care e 0
	    // pentru ca NEW(1, 0) unde discountValue=0
	    
	    //se aplica formula indiferent ce tip e
	    //la NEW dupa formula ramane tot inital
	    //la restul se calculeaza dupa discount
	    
	    //Concluzie: calculeaza ac lucruri doar ca in mai putine
	    //randuri pentru ca nu ne repetam. new este fara discount
	    //deci o sa fie initial dar tot se aplica formula, dar are
	    //si valori de 0.
	    //se gaseste o formula generala care sa fie buna pentru
	    //toate cazurile 
	    //in cazul nostru s-a luat formula care era la celelalte dupa case...:
	    
	    return finalPrice;
	  }
}
