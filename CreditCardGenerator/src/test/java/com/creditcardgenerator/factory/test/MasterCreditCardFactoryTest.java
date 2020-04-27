package com.creditcardgenerator.factory.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.creditcard.MasterCreditCard;
import com.creditcardgenerator.factory.CreditCardFactory;
import com.creditcardgenerator.factory.MasterCreditCardFactory;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class MasterCreditCardFactoryTest {
	CreditCardGeneratorVO vo;
	CreditCard creditCard;
	CreditCardFactory creditCardFactory;
	@Before
	public void setUp() {
		vo = new CreditCardGeneratorVO("5400000000000000", "04/04/2024", "Johm Mclane");
		creditCard = new MasterCreditCard(vo);
		creditCardFactory = new MasterCreditCardFactory();
	}
	
	@Test
	public void createCreditCardTest() {
		Assert.assertEquals(creditCard, creditCardFactory.createCreditCard(vo));
	}
	
}
