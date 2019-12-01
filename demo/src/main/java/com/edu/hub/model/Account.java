package com.edu.hub.model;

public class Account {

	private String accountLevel;
	private String accountId;

	public Account() {
	}

	public Account(String accountLevel, String accountId) {
		this.accountLevel = accountLevel;
		this.accountId = accountId;
	}

	public String getAccountLevel() {
		return accountLevel;
	}

	public void setAccountLevel(String accountLevel) {
		this.accountLevel = accountLevel;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "Account [accountLevel=" + accountLevel + ", accountId=" + accountId + "]";
	}

}
