package com.creditcardgenerator.factory;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.creditcard.DiscoverCreditCard;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class DiscoverCreditCardFactory implements CreditCardFactory {
	
	private CreditCard card;
	
	public CreditCard createCreditCard(CreditCardGeneratorVO vo) {
		// TODO Auto-generated method stub
		card = new DiscoverCreditCard(vo);
		return card;
	}

}
