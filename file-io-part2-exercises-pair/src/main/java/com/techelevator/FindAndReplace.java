package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) throws IOException {

		File newFile = new File("ReplacedTextFile");
		newFile.createNewFile();
		
		File inputFile = getInputFileFromUser();
		Scanner userFile = new Scanner(System.in);

		System.out.print("Please enter the search word >>>");
		String searchWord = userFile.nextLine();

		System.out.print("Please enter the replacement word >>>");
		String replacementWord = userFile.nextLine();

		try (Scanner fileScanner = new Scanner(inputFile); PrintWriter writer = new PrintWriter(newFile)) {
			while (fileScanner.hasNextLine()) { // while it can read file until no more new lines
				String line = fileScanner.nextLine();// grab the new line
				if (line.contains(searchWord)) {
					writer.println(line.replaceAll(searchWord, replacementWord));
				} else {
					writer.println(line);
				}
			}
		}
	}
	
	

	@SuppressWarnings("resource")
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