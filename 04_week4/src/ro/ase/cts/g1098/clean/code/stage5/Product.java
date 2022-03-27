package ro.ase.cts.g1098.clean.code.stage5;

//stage 5
//SOLID - Single Responsibility
//outsource the implementation of the account discount computation
//outsource the computation of a discount value
//outsource the computation of the price with discount

public class Product {

    AccountMarketingStrategy accountDiscountStrategy = null;
	//se scot atributele care nu tin de account
    //AccountMarketingStrategy accountDiscountStrategy este
    //un obiect care se initializeaza cu null si are constantele
    //static final care tin de account si functia getAccountDiscount
    
    
	public float getPriceDiscount(float initialPrice, ProductType productType) {
		return initialPrice * productType.getDiscount();
	}
	//se fac functii pentru formule
	//productType de tip ProductType are functia getDiscount() cu return this.discountValue;
	//getPriceDiscount returneaza pretul initial*discountul in functie de tipul produsului
	//returneaza cat e discountul
	
	public float getPriceWithDiscount(float initialPrice, ProductType productType) {
		return initialPrice - this.getPriceDiscount(initialPrice, productType);
	}
	//se fac functii pentru formule
	//returneaza pret initial - cat e discountul produsului
	
	public float computeFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears)
	  {	
	    float finalPrice = 0;
	    float accountDiscount = 0;
	    
	    if(productType != ProductType.NEW) {
	    	accountDiscount = accountDiscountStrategy.getAccountDiscount(accountAgeInYears);
	    }
	   //la fel ca inainte, daca e new ramane 0
	    //altfel se aplica formula
	    
	    finalPrice = this.getPriceWithDiscount(initialPrice, productType) *(1 - accountDiscount);
	    
	    return finalPrice;
	  }
}
