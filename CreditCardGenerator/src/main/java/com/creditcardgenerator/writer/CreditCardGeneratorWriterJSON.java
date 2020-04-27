package com.creditcardgenerator.writer;

import java.util.ArrayList;

import org.json.JSONObject;
import org.json.simple.JSONArray;
import java.io.FileWriter;
import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.exception.CreditCardGeneratorException;

public class CreditCardGeneratorWriterJSON implements CreditCardGeneratorWriter {

	public void writeoutput(ArrayList<CreditCard> CreditCards, String output) throws CreditCardGeneratorException {
		// TODO Auto-generated method stub
		try {
			
			JSONArray creditCardsArray = new JSONArray();

			for (CreditCard creditCard : CreditCards) {
				JSONObject obj = new JSONObject();
				obj.put("CardNumber", creditCard.getCardNumber());

				if (creditCard.getType().equals("Default")) {
					obj.put("CardType", "Invalid");
					obj.put("Error", "InvalidCardNumber");
				} else {
					obj.put("CardType", creditCard.getType());
					obj.put("Error", "None");
				}

				creditCardsArray.add(obj);
			}

			FileWriter writer = new FileWriter(output);
			writer.write(creditCardsArray.toJSONString());
			writer.flush();
			writer.close();

		} catch (Exception e) {
			throw new CreditCardGeneratorException("Unable to write to JSON file");
		}

	}

}
