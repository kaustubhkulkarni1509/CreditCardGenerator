package com.creditcardgenerator.writer.test;

import org.junit.Test;

import com.creditcardgenerator.exception.CreditCardGeneratorException;
import com.creditcardgenerator.writer.CreditCardGeneratorWriterJSON;

public class CreditCardGeneratorWriterJSONTest {
	CreditCardGeneratorWriterJSON creditCardGeneratorWriterJSON;

	@Test(expected = NullPointerException.class)
	public void writeCSVFileNegativeTest() throws CreditCardGeneratorException {

		creditCardGeneratorWriterJSON.writeoutput(null,null);
	}
}
