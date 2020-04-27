package com.creditcardgenerator.responcibilities.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.creditcard.DiscoverCreditCard;
import com.creditcardgenerator.responcibilities.DiscoverCardHandler;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class DiscoverCardHandlerTest {
	CreditCardGeneratorVO vo;
	CreditCard creditCard;
	DiscoverCardHandler discoverCardHandler;

	@Before
	public void setUp() {
		vo = new CreditCardGeneratorVO("6011000000000000", "04/04/2024", "Johm Mclane");
		creditCard = new DiscoverCreditCard(vo);
		discoverCardHandler = new DiscoverCardHandler(null);
		
		
	}
	
	@Test
	public void createCreditCardTest() {
		Assert.assertEquals(creditCard, discoverCardHandler.handle(vo));
	}
	
}
