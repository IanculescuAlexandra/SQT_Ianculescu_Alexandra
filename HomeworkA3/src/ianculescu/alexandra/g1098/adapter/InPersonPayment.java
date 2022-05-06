package ianculescu.alexandra.g1098.adapter;

public class InPersonPayment implements InPersonPaymentInterface {

	@Override
	public void ConfirmationPaymentInPerson(String text) {
		System.out.println("The confirmation was made in person " + text);
		
	}

}
