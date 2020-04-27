package com.creditcardgenerator.reader;

import java.util.ArrayList;

import com.creditcardgenerator.exception.CreditCardGeneratorException;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public interface CreditCardGeneratorReader {
	public ArrayList<CreditCardGeneratorVO> Read(String input) throws CreditCardGeneratorException;
}
