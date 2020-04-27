package com.creditcardgenerator.responcibilities.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.creditcard.VisaCreditCard;
import com.creditcardgenerator.responcibilities.VisaCardHandler;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class VisaCardHandlerTest {
	CreditCardGeneratorVO vo;
	CreditCard creditCard;
	VisaCardHandler visaCardHandler;
	
	@Before
	public void setUp() {
		vo = new CreditCardGeneratorVO("4000000000000", "04/04/2024", "Johm Mclane");
		creditCard = new VisaCreditCard(vo);
		visaCardHandler = new VisaCardHandler(null);
	}
	
	@Test
	public void createCreditCardTest() {
		Assert.assertEquals(creditCard, visaCardHandler.handle(vo));
	}
	
}
