package com.creditcardgenerator.responcibilities;

public class Responcibilities {

	public static CreditCardHandler setResponcibility() {

		return new MasterCardHandler(
				new VisaCardHandler(new DiscoverCardHandler(new AmericanExpressHandler(new DefaultCardHandler()))));

	}
}
