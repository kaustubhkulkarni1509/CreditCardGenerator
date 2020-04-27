package com.creditcardgenerator.factory.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.creditcard.VisaCreditCard;
import com.creditcardgenerator.factory.CreditCardFactory;
import com.creditcardgenerator.factory.VisaCreditCardFactory;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class VisaCreditCardFactoryTest {
	CreditCardGeneratorVO vo;
	CreditCard creditCard;
	CreditCardFactory creditCardFactory;
	
	@Before
	public void setUp() {
		vo = new CreditCardGeneratorVO("4400000000000000", "04/04/2024", "Johm Mclane");
		creditCard = new VisaCreditCard(vo);
		creditCardFactory = new VisaCreditCardFactory();
	}
	
	@Test
	public void createCreditCardTest() {
		Assert.assertEquals(creditCard, creditCardFactory.createCreditCard(vo));
	}
	

}
