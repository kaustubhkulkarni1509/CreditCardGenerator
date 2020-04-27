package com.creditcardgenerator.reader;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import com.creditcardgenerator.exception.CreditCardGeneratorException;
import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class CreditCardGeneratorReaderXML implements CreditCardGeneratorReader{
	
	public ArrayList<CreditCardGeneratorVO> Read (String input) throws CreditCardGeneratorException {
		ArrayList<CreditCardGeneratorVO> inputObjects = new ArrayList<CreditCardGeneratorVO>();
		try {
			JSONObject jsondata = XML.toJSONObject(new FileReader(input));
			JSONArray  jsonarray = (JSONArray) ((JSONObject) jsondata.get("root")).get("row");
			for(Object singleinputcard:jsonarray) {
				JSONObject inputCardObject = (JSONObject) singleinputcard;
				CreditCardGeneratorVO tempObject = new CreditCardGeneratorVO(inputCardObject.get("CardNumber").toString(), inputCardObject.get("ExpirationDate").toString(), inputCardObject.get("NameOfCardholder").toString());
				inputObjects.add(tempObject);
			}
			return inputObjects;
		}catch(Exception e){
			throw new CreditCardGeneratorException("Unable to read xml file");
		}
		
		
	}
}
