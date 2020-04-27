package com.creditcardgenerator.reader.test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.creditcardgenerator.exception.CreditCardGeneratorException;
import com.creditcardgenerator.reader.CreditCardGeneratorReaderJSON;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class CreditCardGeneratorReaderJSONTest {
	private String WORKING_DIR = System.getProperty("user.dir").replaceAll("\\\\", "////");
	private String input_file_path = WORKING_DIR + "/src/test/resources/Input/Sample.json";
	CreditCardGeneratorReaderJSON creditCardGeneratorReaderJSON; 
	ArrayList<CreditCardGeneratorVO> cardList;
	
	@Before
	public void setUp() {
		cardList = new ArrayList<CreditCardGeneratorVO>();
		creditCardGeneratorReaderJSON = new CreditCardGeneratorReaderJSON();
	}
	
	@Test
	public void readCSVFileTestCase1() throws CreditCardGeneratorException {
		Assert.assertEquals(cardList.getClass(), creditCardGeneratorReaderJSON.Read(input_file_path).getClass());
	}
	
	@Test(expected = CreditCardGeneratorException.class)
	public void readCSVFileTestCase2() throws CreditCardGeneratorException {
		creditCardGeneratorReaderJSON.Read("").getClass();
	}
}
