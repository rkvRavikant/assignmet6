package com.greatlearning.dp1;

public class Runner {

	public static void main(String[] args) {

		BankAccount bankAccount1 = new BankAccountBuilder("hlhjlkjl", "savings",
				"kanpur", "50")
				.setAtmTransactions("transvalue")
				.setEmiSchedule("emivalue")
				.buildBankAccount();
		
	}
}
