package com.creditcardgenerator.reader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.creditcardgenerator.exception.CreditCardGeneratorException;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

import au.com.bytecode.opencsv.CSVReader;

public class CreditCardGeneratorReaderCSV implements CreditCardGeneratorReader {
	public ArrayList<CreditCardGeneratorVO> Read(String input) throws CreditCardGeneratorException {
		try {
			ArrayList<CreditCardGeneratorVO> inputObjects = new ArrayList<CreditCardGeneratorVO>();

			CSVReader reader = new CSVReader(new FileReader(input), ',', '"', 1);
			List<String[]> allRows = reader.readAll();
			for (String[] row : allRows) {
				CreditCardGeneratorVO tempObject = new CreditCardGeneratorVO(row[0].toString(), row[1].toString(),
						row[2].toString());
				inputObjects.add(tempObject);
			}
			reader.close();
			return inputObjects;
		} catch(Exception e){
			throw new CreditCardGeneratorException("Unable to read csv file");
		}
		

	}
}
