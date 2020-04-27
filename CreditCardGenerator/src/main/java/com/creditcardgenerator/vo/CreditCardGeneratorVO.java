package com.creditcardgenerator.vo;


public class CreditCardGeneratorVO {
	private String creditcardnumber;
	private String expitaiondate;
	private String name;

	public CreditCardGeneratorVO(String creditcardnumber, String expitaiondate, String name) {
		// TODO Auto-generated constructor stub
		this.creditcardnumber = creditcardnumber;
		this.expitaiondate = expitaiondate;
		this.name = name;
	}

	public String getCreditcardnumber() {
		return creditcardnumber;
	}

	public void setCreditcardnumber(String creditcardnumber) {
		this.creditcardnumber = creditcardnumber;
	}

	public String getExpitaiondate() {
		return expitaiondate;
	}

	public void setExpitaiondate(String expitaiondate) {
		this.expitaiondate = expitaiondate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creditcardnumber == null) ? 0 : creditcardnumber.hashCode());
		result = prime * result + ((expitaiondate == null) ? 0 : expitaiondate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		CreditCardGeneratorVO other = (CreditCardGeneratorVO) obj;
		if (creditcardnumber == null) {
			if (other.creditcardnumber != null)
				return false;
		} else if (!creditcardnumber.equals(other.creditcardnumber))
			return false;
		if (expitaiondate == null) {
			if (other.expitaiondate != null)
				return false;
		} else if (!expitaiondate.equals(other.expitaiondate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CreditCardGeneratorVO [creditcardnumber=" + creditcardnumber + ", expitaiondate=" + expitaiondate
				+ ", name=" + name + "]";
	}

}
