package com.creditcardgenerator.reader;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.creditcardgenerator.exception.CreditCardGeneratorException;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class CreditCardGeneratorReaderJSON implements CreditCardGeneratorReader {

	public ArrayList<CreditCardGeneratorVO> Read(String input) throws CreditCardGeneratorException {
		// TODO Auto-generated method stub
		JSONParser jsonParser = new JSONParser();
		try {
			FileReader reader = new FileReader(input);
			// Read JSON file
			Object obj = jsonParser.parse(reader);
			JSONArray inputs = (JSONArray) obj;
			ArrayList<CreditCardGeneratorVO> inputObjects = new ArrayList<CreditCardGeneratorVO>();
			for(Object singleinputcard:inputs) {
				JSONObject inputCardObject = (JSONObject) singleinputcard;
				CreditCardGeneratorVO tempObject = new CreditCardGeneratorVO(inputCardObject.get("CardNumber").toString(), inputCardObject.get("ExpirationDate").toString(), inputCardObject.get("NameOfCardholder").toString());
				inputObjects.add(tempObject);
			}
			
			return inputObjects;
			// Iterate over employee array

		} catch(Exception e){
			throw new CreditCardGeneratorException("Unable to read json file");
		}

		
	}
}
