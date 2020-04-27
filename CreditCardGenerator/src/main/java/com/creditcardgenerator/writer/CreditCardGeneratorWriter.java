package com.creditcardgenerator.writer;

import java.util.ArrayList;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.exception.CreditCardGeneratorException;

public interface CreditCardGeneratorWriter {
	public void writeoutput(ArrayList<CreditCard> vo, String output) throws CreditCardGeneratorException;
}
