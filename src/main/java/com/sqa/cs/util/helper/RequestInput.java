/**
 * File Name: RequestInput.java<br>
 * Shiflett, Chance<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 27, 2016
 */
package com.sqa.cs.util.helper;

import java.util.Arrays;
import java.util.Scanner;

/**
 * RequestInput //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Shiflett, Chance
 * @version 1.0.0
 * @since 1.0
 */
public class RequestInput {

	// Scanner object
	public static Scanner keyboard = new Scanner(System.in);

	// Create a method that takes a String array and increases it's value by one
	// element
	public static String[] addStringElement(String[] elements, String addString) {
		// local variables
		String[] newStringArray;
		// Check if the supplied String array is null and if so, we will be
		// adding one element
		if (elements != null) {
			// supplied array contains elements so the new size will be increase
			// by one
			newStringArray = Arrays.copyOf(elements, elements.length + 1);
			// Set the last element to supplied String addString
			newStringArray[elements.length] = addString;
		} else {
			// Supplied array does not contain any elements yet
			newStringArray = new String[1];
			newStringArray[0] = addString;
		}
		return newStringArray;
	}

	/**
	 * Static helper method asks the user a specified question and as long as
	 * they give a valid response will return a boolean variable.
	 *
	 * @return Boolean value
	 */
	public static boolean getBoolean(String question) {
		String input;
		while (true) {
			// Ask user question relative to input
			System.out.print(question + "Yes/y or No/n ");
			// Set input based on what the user enters
			input = keyboard.nextLine();
			// Check if user has entered yes
			if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
				// Return true if the user chose yes
				return true;
				// Check if the user has entered no
			} else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
				// Return false is user has entered no
				return false;
			} else {
				// Repeat loop if input was not valid
				System.out.println("You have not entered a valid option please enter yes/y or no/n.");
				continue;
			}
		}
	}

	public static char getChar(String question) {
		// Local variable to hold temp char
		String input;
		char character = ' ';
		while (true) {
			try {
				// Ask user a question to get relative input
				System.out.print(question);
				// Set the number based on what the user inputs
				input = keyboard.nextLine();
				// return number of pets entered
				if (input.length() < 1) {
					throw new IllegalArgumentException("Too few chars");
				} else if (input.length() > 1) {
					throw new IllegalArgumentException("Too many chars");
				}
				character = input.charAt(0);
			} catch (Exception e) {
				// Output to the user that the number is not valid
				e.getMessage();
				// Continue the loop to get a valid number
				continue;
			}
			// Return character
			return character;
		}
	}

	public static char getChar(String question, char... characters) {
		while (true) {
			// Local variable to hold boolean
			boolean present = false;
			// Call helper method to verify char and store in variable
			char letter = RequestInput.getChar(question);
			// Iterate through the valid chars supplied
			for (int i = 0; i < characters.length; i++) {
				// If input provide matches valid chars assign boolean true
				if (Character.compare(characters[i], letter) == 0) {
					present = true;
				}
			}
			// If true return the user supplied char
			if (present == true) {
				return letter;
				// Continue the loop if char input was invalid
			} else {
				System.out.println("You have not entered a valid character (" + letter + ").");
				continue;
			}
		}
	}

	/**
	 * Static helper method asks the user a specified question and as long as
	 * they give a valid number will return the number as an double type
	 * variable.
	 *
	 * @return Valid number
	 */
	public static double getDouble(String question) {
		// Local variable to hold temp number
		double num;
		while (true) {
			try {
				// Ask user a question to get relative input
				System.out.print(question);
				// Set the number based on what the user inputs
				num = Double.parseDouble(keyboard.nextLine());
				// return number of pets entered
				break;
			} catch (NumberFormatException e) {
				// Output to the user that the number is not valid
				System.out.println("You have not entered a valid number.");
				// Continue the loop to get a valid number
				continue;
			}
		}
		// Return the number
		return num;
	}

	/**
	 * Static helper method asks the user a specified question and as long as
	 * they give a valid number will return the number as an int type variable.
	 *
	 * @return Valid number
	 */
	public static int getInt(String question) {
		// Local variable to hold temp number
		int num;
		while (true) {
			try {
				// Ask user a question to get relative input
				System.out.print(question);
				// Set the number based on what the user inputs
				num = Integer.parseInt(keyboard.nextLine());
				// return number of pets entered
				break;
			} catch (NumberFormatException e) {
				// Output to the user that the number is not valid
				System.out.println("You have not entered a valid number.");
				// Continue the loop to get a valid number
				continue;
			}
		}
		// Return the number
		return num;
	}

	public static String getString(String question) {
		String input;
		System.out.print(question);
		// Request input and store in temp variable
		input = keyboard.nextLine();
		return input;
	}

	public static String getString(String question, String... words) {
		while (true) {
			// Local variable to hold boolean
			boolean present = false;
			// Request input and store in temp variable
			String input = RequestInput.getString(question);
			// iterate through the array of valid words comparing them to user
			// input
			for (int i = 0; i < words.length; i++) {
				if (words[i].equals(input)) {
					present = true;
				}
			}
			if (present == true) {
				return input;
			} else {
				// Repeat the while loop if user input is invalid
				System.out.println("You have not entered a valid word (" + input + ").");
				continue;
			}
		}
	}
}
