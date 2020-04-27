package com.creditcardgenerator.responcibilities;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public interface CreditCardHandler {
	CreditCard next(CreditCardGeneratorVO vo);
	CreditCard handle(CreditCardGeneratorVO vo);
}
