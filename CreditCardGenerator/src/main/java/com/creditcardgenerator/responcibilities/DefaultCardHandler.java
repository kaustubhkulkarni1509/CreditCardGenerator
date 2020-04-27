package com.creditcardgenerator.responcibilities;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.factory.DefaultCreditCardFactory;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class DefaultCardHandler implements CreditCardHandler{
	private CreditCardHandler nextHandler;

	public CreditCardHandler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(CreditCardHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public DefaultCardHandler(CreditCardHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	DefaultCardHandler(){
		
	}

	public CreditCard next(CreditCardGeneratorVO vo) {
		// TODO Auto-generated method stub
		
		return null;

	}

	public CreditCard handle(CreditCardGeneratorVO vo) {
		// TODO Auto-generated method stub
		DefaultCreditCardFactory defaultCreditCardFactory = new DefaultCreditCardFactory();
		return defaultCreditCardFactory.createCreditCard(vo);	
	}
}
