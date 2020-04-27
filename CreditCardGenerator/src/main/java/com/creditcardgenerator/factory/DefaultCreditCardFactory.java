package com.creditcardgenerator.factory;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.creditcard.DefaultCreditCard;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class DefaultCreditCardFactory implements CreditCardFactory{

	private CreditCard card;
	
	public CreditCard createCreditCard(CreditCardGeneratorVO vo) {
		// TODO Auto-generated method stub
		card = new DefaultCreditCard(vo);
		return card;
	}

}
