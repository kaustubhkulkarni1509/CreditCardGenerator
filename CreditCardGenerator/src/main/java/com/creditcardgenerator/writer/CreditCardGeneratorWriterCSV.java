package com.creditcardgenerator.writer;

import java.io.FileWriter;
import java.util.ArrayList;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.exception.CreditCardGeneratorException;

import au.com.bytecode.opencsv.CSVWriter;

public class CreditCardGeneratorWriterCSV implements CreditCardGeneratorWriter{

	public void writeoutput(ArrayList<CreditCard> cc, String output) throws CreditCardGeneratorException {
		// TODO Auto-generated method stub
		try {
			
			String Line1 = "CardNumber,CardType,Error";
			
			String csv = output;
		    CSVWriter writer = new CSVWriter(new FileWriter(csv));
		    String [] line1 = Line1.split(",");
	    	writer.writeNext(line1);
		    for(int i = 0; i<cc.size();i++) {
		    	CreditCard c = cc.get(i);
		    	String tempoutput;
		    	if(c.getType().equals("Default")) {
		    		tempoutput = c.getCardNumber() + "," + "Invalid,InvalidCardNumber";
		    	}
		    	else {
		    		tempoutput = c.getCardNumber() + "," + c.getType() + "," + "None";
		    	}
		    	String [] record = tempoutput.split(",");
		    	writer.writeNext(record);
		    	
		    }
		      writer.close();
			
		}
		catch(Exception e){
			throw new CreditCardGeneratorException("Unable to write to csv file");
		}
		
	}

}
