package com.creditcardgenerator.responcibilities;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.factory.MasterCreditCardFactory;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class MasterCardHandler implements CreditCardHandler {

	private CreditCardHandler nextHandler;

	public MasterCardHandler(CreditCardHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public CreditCard next(CreditCardGeneratorVO vo) {
		// TODO Auto-generated method stub
		return nextHandler.handle(vo);

	}

	public CreditCard handle(CreditCardGeneratorVO vo) {
		// TODO Auto-generated method stub
		if (this.canHandle(vo.getCreditcardnumber())) {
			MasterCreditCardFactory masterCreditCardFactory = new MasterCreditCardFactory();
			return masterCreditCardFactory.createCreditCard(vo);
		} else {
			return this.next(vo);
		}

		
	}

	public Boolean canHandle(String number) {

		if (number.length() == 16 && number.charAt(0) == '5' && Character.getNumericValue(number.charAt(1)) >= 1
				&& Character.getNumericValue(number.charAt(1)) <= 5) {
			return true;
		}
		return false;
	}

}
