package com.creditcardgenerator.responcibilities;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.factory.DiscoverCreditCardFactory;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class DiscoverCardHandler implements CreditCardHandler {

	private CreditCardHandler nextHandler;

	public DiscoverCardHandler(CreditCardHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public CreditCard next(CreditCardGeneratorVO vo) {
		// TODO Auto-generated method stub
		return nextHandler.handle(vo);

	}

	public CreditCard handle(CreditCardGeneratorVO vo) {
		// TODO Auto-generated method stub
		if (this.canHandle(vo.getCreditcardnumber())) {
			DiscoverCreditCardFactory discoverCreditCardFactory = new DiscoverCreditCardFactory();
			return discoverCreditCardFactory.createCreditCard(vo);
		} else {
			return this.next(vo);
		}
		
	}

	public Boolean canHandle(String number) {

		if (number.length() == 16 && number.charAt(0) == '6' && number.charAt(1) == '0' && number.charAt(2) == '1'
				&& number.charAt(3) == '1') {
			return true;
		}
		return false;
	}

}
