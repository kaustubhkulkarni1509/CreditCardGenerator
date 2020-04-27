package com.creditcardgenerator.creditcard;

import com.creditcardgenerator.vo.CreditCardGeneratorVO;

public class AmericanExpressCreditCard implements CreditCard{
	private String cardNumber;
	private String expiryDate;
	private String cardHolderName;
	private String type = "AmericanExpress";
	
	public AmericanExpressCreditCard(CreditCardGeneratorVO vo){
		this.cardNumber = vo.getCreditcardnumber();
		this.expiryDate = vo.getExpitaiondate();
		this.cardHolderName = vo.getName();
	}
	
	
	@Override
	public String toString() {
		return "AmericanExpressCreditCard [cardNumber=" + cardNumber + ", expiryDate=" + expiryDate
				+ ", cardHolderName=" + cardHolderName + ", type=" + type + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardHolderName == null) ? 0 : cardHolderName.hashCode());
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AmericanExpressCreditCard other = (AmericanExpressCreditCard) obj;
		if (cardHolderName == null) {
			if (other.cardHolderName != null)
				return false;
		} else if (!cardHolderName.equals(other.cardHolderName))
			return false;
		if (cardNumber == null) {
			if (other.cardNumber != null)
				return false;
		} else if (!cardNumber.equals(other.cardNumber))
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}


	public String getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	public String getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}


	public String getCardHolderName() {
		return cardHolderName;
	}


	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
