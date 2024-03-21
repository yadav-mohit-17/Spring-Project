package com.icici.account;
public class AccountDetail {
	private String personName;
	private long accountNumber;
	
	public AccountDetail()
	{
		System.out.println("AccountDetails Object Created...");	
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
}
