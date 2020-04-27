package com.creditcardgenerator.writer.test;

import org.junit.Test;

import com.creditcardgenerator.exception.CreditCardGeneratorException;
import com.creditcardgenerator.writer.CreditCardGeneratorWriterXML;

public class CreditCardGeneratorWriterXMLTest {
	CreditCardGeneratorWriterXML creditCardGeneratorWriterXML;

	@Test(expected = NullPointerException.class)
	public void writeCSVFileNegativeTest() throws CreditCardGeneratorException {

		creditCardGeneratorWriterXML.writeoutput(null,null);
	}
}
