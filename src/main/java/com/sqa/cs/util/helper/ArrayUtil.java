/**
 * File Name: ArrayUtil.java<br>
 * Shiflett, Chance<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 10, 2016
 */
package com.sqa.cs.util.helper;

import java.util.Arrays;

/**
 * ArrayUtil //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Shiflett, Chance
 * @version 1.0.0
 * @since 1.0
 */
public class ArrayUtil {

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
}
