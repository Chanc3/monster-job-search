/**
 * File Name: Info.java<br>
 * Shiflett, Chance<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 10, 2016
 */
package com.sqa.cs.util.helper;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Info //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Shiflett, Chance
 * @version 1.0.0
 * @since 1.0
 */
public class Info {

	public static void display2DInfo(Object[][] objects) {
		// Iterate through two dimensional array of objects by row
		for (int i = 0; i < objects.length; i++) {
			System.out.println("");
			for (int j = 0; j < objects[i].length; j++) {
				System.out.print("\t" + objects[i][j]);
			}
		}
		System.out.println("\n");
	}

	public static void displayFields(Object obj) {
		// Place object fields into array
		Field[] fields = obj.getClass().getDeclaredFields();
		// Print fields statement
		System.out.print("The fields are: ");
		// Iterate through the fields array
		for (int i = 0; i < fields.length; i++) {
			// Print the name and type of each field
			System.out.print(fields[i].getName() + " = " + fields[i].getType().getName() + ", ");
		}
	}

	/**
	 * Static helper method displays the object name, number of modifiers, field
	 * names and type, method names and type, toString
	 */
	public static void displayInfo(Object obj) {
		// Print object type
		System.out.println("The object is of type: " + obj.getClass().getSimpleName());
		// Print number of modifiers
		System.out.println("The number of modifiers are: " + obj.getClass().getModifiers());
		// Print object fields
		displayFields(obj);
		// Print object methods
		displayMethods(obj);
		// Print object toString
		System.out.println("The object toString: " + obj.toString());
	}

	/**
	 * Static helper method displays the toString of the first two objects and
	 * then interates through an array
	 */
	public static void displayInfo(Object obj1, Object obj2, Object... objN) {
		displayInfo(obj1);
		displayInfo(obj2);
		for (Object object : objN) {
			displayInfo(object);
		}
	}

	/**
	 * Static helper method interates through an array of objects and displays
	 * the toString for each
	 */
	public static void displayInfo(Object[] obj) {
		for (Object object : obj) {
			displayInfo(object);
		}
	}

	public static void displayMethods(Object obj) {
		// Place object methods into array
		Method[] methods = obj.getClass().getDeclaredMethods();
		// Print methods statement
		System.out.print("\nThe methods are: ");
		// Iterate through the fields array
		for (int i = 0; i < methods.length; i++) {
			// Print name and type of each method
			System.out.print(methods[i].getName() + "(),");
		}
	}

	// public static String get2DInfo(Object[][] objects) {
	// String info;
	// return info;
	// }
	/**
	 * Static helper method calls the toString of an object. Passes it to a
	 * String variable and then returns the String.
	 */
	public static String getInfo(Object obj) {
		String info;
		info = obj.getClass().getSimpleName().toString();
		return info;
	}
}
