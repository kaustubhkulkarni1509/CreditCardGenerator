package com.creditcardgenerator.responcibilities.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.creditcard.MasterCreditCard;
import com.creditcardgenerator.responcibilities.MasterCardHandler;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class MasterCardHandlerTest {
	CreditCardGeneratorVO vo;
	CreditCard creditCard;
	MasterCardHandler masterCardHandler;
	
	@Before
	public void setUp() {
		vo = new CreditCardGeneratorVO("5100000000000000", "04/04/2024", "Johm Mclane");
		creditCard = new MasterCreditCard(vo);
		masterCardHandler = new MasterCardHandler(null);
		
		
	}
	
	@Test
	public void createCreditCardTest() {
		Assert.assertEquals(creditCard, masterCardHandler.handle(vo));
	}
}
