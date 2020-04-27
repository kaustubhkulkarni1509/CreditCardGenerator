package com.creditcardgenerator.factory;

import com.creditcardgenerator.creditcard.AmericanExpressCreditCard;
import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class AmericanExpressCreditCardFactory implements CreditCardFactory{
	
	private CreditCard card;
	
	public CreditCard createCreditCard(CreditCardGeneratorVO vo) {
		// TODO Auto-generated method stub
		card = new AmericanExpressCreditCard(vo);
		return card;
	}

}
