package com.creditcardgenerator.factory.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.creditcard.DiscoverCreditCard;
import com.creditcardgenerator.factory.CreditCardFactory;
import com.creditcardgenerator.factory.DiscoverCreditCardFactory;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class DiscoverCreditCardFactoryTest {
	CreditCardGeneratorVO vo;
	CreditCard creditCard;
	CreditCardFactory creditCardFactory;
	
	@Before
	public void setUp() {
		vo = new CreditCardGeneratorVO("6011000000000000", "04/04/2024", "Johm Mclane");
		creditCard = new DiscoverCreditCard(vo);
		creditCardFactory = new DiscoverCreditCardFactory();
	}
	
	@Test
	public void createCreditCardTest() {
		Assert.assertEquals(creditCard, creditCardFactory.createCreditCard(vo));
	}
}
