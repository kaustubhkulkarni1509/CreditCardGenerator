package com.creditcardgenerator.client;

import com.creditcardgenerator.exception.CreditCardGeneratorException;
import com.creditcardgenerator.service.CredirCardGeneratorService;

public class CreditCardGeneratorClient {
	public static void main(String[] args) {
		try {
		if (args.length >= 0){
			// "C:\\SJSU\\2nd_sem\\202\\CMPE202_Individual_Project_Kaustubh_Kulkarni\\CreditCardGenerator\\src\\main\\resources\\Sample.csv"
			// "C:\\SJSU\\2nd_sem\\202\\CMPE202_Individual_Project_Kaustubh_Kulkarni\\CreditCardGenerator\\src\\main\\resources\\SampleOutput.csv"
			String input = args[0];
			String output = args[1];
			CredirCardGeneratorService credirCardGeneratorService = new CredirCardGeneratorService();
			credirCardGeneratorService.creditCardGeneratorServiceMethod(input, output);
		} else {
			System.out.println("No inputs are given to the program. Orogram needs two inputs. 1.Input path 2.Output path");
		}
		}
		catch(CreditCardGeneratorException e){
			System.out.println(e.getMessage());
		}

	}
}
