package com.creditcardgenerator.writer;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.creditcardgenerator.creditcard.CreditCard;
import com.creditcardgenerator.exception.CreditCardGeneratorException;

public class CreditCardGeneratorWriterXML implements CreditCardGeneratorWriter {

	public void writeoutput(ArrayList<CreditCard> CreditCards, String output) throws CreditCardGeneratorException {
		// TODO Auto-generated method stub
		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();
			Element rootElement = doc.createElement("root");
			doc.appendChild(rootElement);
			for (CreditCard creditCard : CreditCards) {
				Element row = doc.createElement("row");
				rootElement.appendChild(row);

				Element cardNumber = doc.createElement("CardNumber");
				cardNumber.appendChild(doc.createTextNode(creditCard.getCardNumber()));
				row.appendChild(cardNumber);

				if (creditCard.getType().equals("Default")) {
					Element cardType = doc.createElement("CardType");
					cardType.appendChild(doc.createTextNode("Invalid"));
					row.appendChild(cardType);

					Element error = doc.createElement("Error");
					error.appendChild(doc.createTextNode("InvalidCardNUmber"));
					row.appendChild(error);
				} else {
					Element cardType = doc.createElement("CardType");
					cardType.appendChild(doc.createTextNode(creditCard.getType()));
					row.appendChild(cardType);

					Element error = doc.createElement("Error");
					error.appendChild(doc.createTextNode("None"));
					row.appendChild(error);

				}

				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);

				StreamResult result = new StreamResult(new File(output));
				transformer.transform(source, result);

			}

		} catch (Exception e) {
			throw new CreditCardGeneratorException("Unable to write to XML file");
		}

	}

}
