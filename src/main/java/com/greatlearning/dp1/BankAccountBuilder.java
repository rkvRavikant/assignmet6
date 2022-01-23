package com.greatlearning.dp1;


public class BankAccountBuilder {
	private String bankAccountNo;
	
	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getBranch() {
		return branch;
	}

	public String getBalance() {
		return balance;
	}

	public String getAtmTransactions() {
		return atmTransactions;
	}

	public String getEmiSchedule() {
		return emiSchedule;
	}

	private String accountType;
	
	private String branch;
	
	private String balance;
	
	private String atmTransactions;
	
	private String emiSchedule;

	public BankAccountBuilder(String bankAccountNo, String accountType, String branch, String balance) {
		this.bankAccountNo = bankAccountNo;
		this.accountType = accountType;
		this.branch = branch;
		this.balance = balance;
	}
	
	public BankAccountBuilder setAtmTransactions(String atmTransactions) {
		this.atmTransactions = atmTransactions;
		return this;
	}
	
	public BankAccountBuilder setEmiSchedule(String emiSchedule) {
		this.emiSchedule = emiSchedule;
		return this;
	}
	
	public BankAccount buildBankAccount() {
		return new BankAccount(this);
	}
}
