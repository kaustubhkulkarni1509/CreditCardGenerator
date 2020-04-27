package com.creditcardgenerator.responcibilities;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.factory.AmericanExpressCreditCardFactory;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class AmericanExpressHandler implements CreditCardHandler{
	private CreditCardHandler nextHandler;

	public AmericanExpressHandler(CreditCardHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public CreditCard next(CreditCardGeneratorVO vo) {
		// TODO Auto-generated method stub
		return nextHandler.handle(vo);

	}

	public CreditCard handle(CreditCardGeneratorVO vo) {
		// TODO Auto-generated method stub
		if(this.canHandle(vo.getCreditcardnumber())) {
			AmericanExpressCreditCardFactory americanExpressCreditCardFactory = new AmericanExpressCreditCardFactory();
			return americanExpressCreditCardFactory.createCreditCard(vo);
		}
		else {
			return this.next(vo);	
		}
		
	}
	
	public Boolean canHandle(String number) {

		if (number.length() == 15 && number.charAt(0) == '3' && (number.charAt(1) == '4' || number.charAt(1) == '7')) {
			return true;
		}
		return false;
	}

}
