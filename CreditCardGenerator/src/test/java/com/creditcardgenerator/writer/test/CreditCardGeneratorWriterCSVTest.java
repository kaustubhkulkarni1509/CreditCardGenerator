package com.creditcardgenerator.writer.test;

import org.junit.Test;

import com.creditcardgenerator.exception.CreditCardGeneratorException;
import com.creditcardgenerator.writer.CreditCardGeneratorWriterCSV;

public class CreditCardGeneratorWriterCSVTest {
	CreditCardGeneratorWriterCSV creditCardGeneratorWriterCSV;

	@Test(expected = NullPointerException.class)
	public void writeCSVFileNegativeTest() throws CreditCardGeneratorException {

		creditCardGeneratorWriterCSV.writeoutput(null,null);
	}
}
