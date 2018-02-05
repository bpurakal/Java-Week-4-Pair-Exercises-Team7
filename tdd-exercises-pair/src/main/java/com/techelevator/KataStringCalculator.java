package com.techelevator;

public class KataStringCalculator {

	public static int add(String  numbers) {
		int sum = 0;
		
		if(numbers.equals("")) {
			
		} else if(numbers.startsWith("//")) {
			String delimiter = numbers.substring(2,3);
			String numbersWithoutSetup = numbers.substring(4);
			sum = sumCrazyShit(delimiter, numbersWithoutSetup);
		} else {
			String numbersWithoutNewLines = numbers.replace("\n", ",");
			sum = sumCrazyShit(",", numbersWithoutNewLines);
		}
		return sum;
	}

	private static int sumCrazyShit(String delimiter, String numbersWithoutSetup) {
		int sum = 0;
		String[] arrayOfNumbers = numbersWithoutSetup.split(delimiter);
		for(String element : arrayOfNumbers) {
			int parsedNumbersString = Integer.parseInt(element);
			sum += parsedNumbersString;
		}
		return sum;
	}
	
}
