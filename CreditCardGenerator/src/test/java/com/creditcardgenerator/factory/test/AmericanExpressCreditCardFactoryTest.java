package com.creditcardgenerator.factory.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.creditcardgenerator.creditcard.AmericanExpressCreditCard;
import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.factory.AmericanExpressCreditCardFactory;
import com.creditcardgenerator.factory.CreditCardFactory;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class AmericanExpressCreditCardFactoryTest {
	CreditCardGeneratorVO vo;
	CreditCard creditCard;
	CreditCardFactory creditCardFactory;
	
	@Before
	public void setUp() {
		vo = new CreditCardGeneratorVO("340000000000000", "04/04/2024", "Johm Mclane");
		creditCard = new AmericanExpressCreditCard(vo);
		creditCardFactory = new AmericanExpressCreditCardFactory();
	}
	
	@Test
	public void createCreditCardTest() {
		Assert.assertEquals(creditCard, creditCardFactory.createCreditCard(vo));
	}
}
