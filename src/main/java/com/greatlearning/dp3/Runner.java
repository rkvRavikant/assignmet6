package com.greatlearning.dp3;


public class Runner {

	public static void main(String[] args) {
		CurrencyConvertor cc = getConverter("GBP");
		
		double inrAmount = cc.convertToINR(2);
		System.out.println(inrAmount);
		cc = getConverter("DOLLAR");
		
		inrAmount = cc.convertToINR(2);
		System.out.println(inrAmount);
	}
	
	public static CurrencyConvertor getConverter(String currency) {
		switch (currency) {
		case "GBP":
			return new GBPConverter();
		case "DOLLAR":
			return new DollarConvertor();
	}
		return null;
}
}
