package com.creditcardgenerator.responcibilities;
import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.factory.VisaCreditCardFactory;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class VisaCardHandler implements CreditCardHandler{
	
private CreditCardHandler nextHandler ;
	
	public VisaCardHandler(CreditCardHandler nextHandler){
		this.nextHandler = nextHandler;
	}

	public CreditCard next(CreditCardGeneratorVO vo) {
		// TODO Auto-generated method stub
		return nextHandler.handle(vo);
		
	}

	public CreditCard handle(CreditCardGeneratorVO vo) {
		// TODO Auto-generated method stub
		if(this.canHandle(vo.getCreditcardnumber())) {
			VisaCreditCardFactory visaCreditCardFactory = new VisaCreditCardFactory();
			return visaCreditCardFactory.createCreditCard(vo);
		}
		else {
			return this.next(vo);
		}
		
	}
	
	public Boolean canHandle(String number) {

		if ((number.length() == 16 || number.length() == 13) && number.charAt(0) == '4') {
			return true;
		}
		return false;
	}

}
