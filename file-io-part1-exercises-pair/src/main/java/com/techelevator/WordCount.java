package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {

		File inputFile = getInputFileFromUser();
		int finalWordCount = 0;
		int finalSentenceCount = 0;
		try (Scanner fileScanner = new Scanner(inputFile)) {
			while (fileScanner.hasNextLine()) { // while it can read file until no more new lines
				String line = fileScanner.nextLine(); // grab the new line
				String[] numberOfWordsInALine = line.split("\\s+"); // a regular expression; split by all white spaces including tabs, etc (Search line for spaces)
				finalWordCount += numberOfWordsInALine.length; //adding to finalWordCount, .length retrieves number of Strings separated by the split strings and puts into array
				if(line.contains(".") || line.contains("?") || line.contains("!")) {
					finalSentenceCount += 1;
				}
			}
		}
		System.out.println("Word Count: " + finalWordCount);
		System.out.println("Sentence Count: " + finalSentenceCount);
	}

	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();

		File inputFile = new File(path);
		if (inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path + " does not exist");
			System.exit(1); // Ends the program
		} else if (inputFile.isFile() == false) { // a file is normal if it is not a directory
			System.out.println(path + " is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}

}
