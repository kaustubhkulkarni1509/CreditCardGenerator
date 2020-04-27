package com.creditcardgenerator.responcibilities.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.creditcardgenerator.creditcard.AmericanExpressCreditCard;
import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.responcibilities.AmericanExpressHandler;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class AmericanExpressHandlerTest {
	CreditCardGeneratorVO vo;
	CreditCard creditCard;
	AmericanExpressHandler americanExpressHandler;
	
	@Before
	public void setUp() {
		vo = new CreditCardGeneratorVO("370000000000000", "04/04/2024", "Johm Mclane");
		creditCard = new AmericanExpressCreditCard(vo);
		americanExpressHandler = new AmericanExpressHandler(null);
		
		
	}
	
	@Test
	public void createCreditCardTest() {
		Assert.assertEquals(creditCard, americanExpressHandler.handle(vo));
	}

}
