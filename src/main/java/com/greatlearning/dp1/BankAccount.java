package com.greatlearning.dp1;

public class BankAccount {

	private String bankAccountNo;
	
	private String accountType;
	
	private String branch;
	
	private String balance;
	
	private String atmTransactions;
	
	private String emiSchedule;
	

	public BankAccount(BankAccountBuilder bankAccountBuilder) {
		this.bankAccountNo = bankAccountBuilder.getBankAccountNo();
		this.accountType = bankAccountBuilder.getAccountType();
		this.branch = bankAccountBuilder.getBranch();
		this.balance = bankAccountBuilder.getBalance();
		this.atmTransactions = bankAccountBuilder.getAtmTransactions();
		this.emiSchedule = bankAccountBuilder.getEmiSchedule(); 
	}

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

}
