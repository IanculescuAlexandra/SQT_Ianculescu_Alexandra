package ianculescu.alexandra.g1098.adapter;

import java.util.ArrayList;

public class TestAdapter {

	public void test() {
		ArrayList<OnlinePaymentInterface> onlinePayments = new ArrayList<>();
		
		OnlinePaymentInterface onlinePaymentFullPrice = new OnlinePayment();
		OnlinePaymentInterface onlinePaymentPriceInRates = new OnlinePayment();

		onlinePayments.add(onlinePaymentFullPrice);
		onlinePayments.add(onlinePaymentPriceInRates);
		
		InPerson2OnlinePaymentAdapter inPersonPaymentFullPrice = new InPerson2OnlinePaymentAdapter();
		
		onlinePayments.add(inPersonPaymentFullPrice);
		
		for(OnlinePaymentInterface payment : onlinePayments) {
			payment.ConfirmationPaymentOnline("Confirm");
		}
		}

}
