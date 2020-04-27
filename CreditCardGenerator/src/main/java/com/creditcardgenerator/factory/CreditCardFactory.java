package com.creditcardgenerator.factory;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public interface CreditCardFactory {
	CreditCard createCreditCard(CreditCardGeneratorVO vo);
}
