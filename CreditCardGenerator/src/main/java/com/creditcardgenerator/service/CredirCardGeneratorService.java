package com.creditcardgenerator.service;

import java.util.ArrayList;

import org.apache.commons.io.FilenameUtils;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.exception.CreditCardGeneratorException;
import com.creditcardgenerator.reader.CreditCardGeneratorReader;
import com.creditcardgenerator.reader.CreditCardGeneratorReaderCSV;
import com.creditcardgenerator.reader.CreditCardGeneratorReaderJSON;
import com.creditcardgenerator.reader.CreditCardGeneratorReaderXML;
import com.creditcardgenerator.responcibilities.CreditCardHandler;
import com.creditcardgenerator.responcibilities.Responcibilities;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;
import com.creditcardgenerator.writer.CreditCardGeneratorWriter;
import com.creditcardgenerator.writer.CreditCardGeneratorWriterCSV;
import com.creditcardgenerator.writer.CreditCardGeneratorWriterJSON;
import com.creditcardgenerator.writer.CreditCardGeneratorWriterXML;

public class CredirCardGeneratorService {
	public void creditCardGeneratorServiceMethod(String input, String output) throws CreditCardGeneratorException {
		try {
			String extentionInput = FilenameUtils.getExtension(input);
			String extentionOutput = FilenameUtils.getExtension(output);

			if (extentionInput.equals(extentionOutput)) {
				if (extentionInput.equals("json") || extentionInput.equals("csv") || extentionInput.equals("xml")) {
					ArrayList<CreditCardGeneratorVO> allInputObject = new ArrayList<CreditCardGeneratorVO>();

					if (extentionInput.equals("json")) {
						CreditCardGeneratorReader inputs = new CreditCardGeneratorReaderJSON();
						allInputObject = inputs.Read(input);
					}
					if (extentionInput.equals("csv")) {
						CreditCardGeneratorReader inputs = new CreditCardGeneratorReaderCSV();
						allInputObject = inputs.Read(input);
					}
					if (extentionInput.equals("xml")) {
						CreditCardGeneratorReader inputs = new CreditCardGeneratorReaderXML();
						allInputObject = inputs.Read(input);
					}

					CreditCardHandler cardhandler = Responcibilities.setResponcibility();
					ArrayList<CreditCard> allCreditCards = new ArrayList<CreditCard>();
					for (int i = 0; i < allInputObject.size(); i++) {
						CreditCard cc = cardhandler.handle(allInputObject.get(i));
						allCreditCards.add(cc);
						//System.out.println(cc);
					}

					if (extentionOutput.equals("json")) {
						CreditCardGeneratorWriter op = new CreditCardGeneratorWriterJSON();
						op.writeoutput(allCreditCards, output);
					}
					if (extentionOutput.equals("csv")) {
						CreditCardGeneratorWriter op = new CreditCardGeneratorWriterCSV();
						op.writeoutput(allCreditCards, output);
					}
					if (extentionOutput.equals("xml")) {
						CreditCardGeneratorWriter op = new CreditCardGeneratorWriterXML();
						op.writeoutput(allCreditCards, output);
					}
					
					System.out.println("Program execution completed. Please check output file.");
					
				} else {
					throw new CreditCardGeneratorException("Input and Output file type should match and they must be 1.csv or 2.json or 3.xml");
				}
			} else {
				throw new CreditCardGeneratorException("Input and Output file type should match and they must be 1.csv or 2.json or 3.xml");
			}

		} catch (Exception e) {
			throw new CreditCardGeneratorException("Input and Output file type should match and they must be 1.csv or 2.json or 3.xml");
		}

	}
}
