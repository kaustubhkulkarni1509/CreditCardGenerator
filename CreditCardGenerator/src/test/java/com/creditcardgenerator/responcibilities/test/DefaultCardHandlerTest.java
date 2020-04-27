package com.creditcardgenerator.responcibilities.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.creditcard.DefaultCreditCard;
import com.creditcardgenerator.responcibilities.DefaultCardHandler;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class DefaultCardHandlerTest {
	CreditCardGeneratorVO vo;
	CreditCard creditCard;
	DefaultCardHandler defaultCardHandler;
	
	@Before
	public void setUp() {
		vo = new CreditCardGeneratorVO("0000000000000000", "04/04/2024", "Johm Mclane");
		creditCard = new DefaultCreditCard(vo);
		defaultCardHandler = new DefaultCardHandler(null);
		
		
	}
	
	@Test
	public void createCreditCardTest() {
		Assert.assertEquals(creditCard, defaultCardHandler.handle(vo));
	}
}
