package ianculescu.alexandra.g1098.adapter;

public class OnlinePayment implements OnlinePaymentInterface {

	@Override
	public void ConfirmationPaymentOnline(String text) {
		System.out.println("The confirmation was made online " + text);
		
	}

}
