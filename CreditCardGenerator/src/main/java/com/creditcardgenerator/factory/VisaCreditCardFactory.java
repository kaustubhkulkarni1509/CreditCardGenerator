package com.creditcardgenerator.factory;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.creditcard.VisaCreditCard;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class VisaCreditCardFactory implements CreditCardFactory{

	private CreditCard card;
	
	public CreditCard createCreditCard(CreditCardGeneratorVO vo) {
		// TODO Auto-generated method stub
		card = new VisaCreditCard(vo);
		return card;
	}

}
