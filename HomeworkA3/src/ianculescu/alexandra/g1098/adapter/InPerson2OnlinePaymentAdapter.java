package ianculescu.alexandra.g1098.adapter;

public class InPerson2OnlinePaymentAdapter implements InPersonPaymentInterface, OnlinePaymentInterface {

	@Override
	public void ConfirmationPaymentOnline(String text) {
		System.out.println("The confirmation was made online " + text);
		
	}

	@Override
	public void ConfirmationPaymentInPerson(String text) {
		System.out.println("The confirmation was made in person " + text);
		
	}

}
