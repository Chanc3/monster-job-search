/**
 * File Name: Info.java<br>
 * Shiflett, Chance<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 10, 2016
 */
package com.sqa.cs.util.helper;

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

	/**
	 * Static helper method displays the object toString
	 */
	public static void displayInfo(Object obj) {
		System.out.println(obj.getClass().getSimpleName().toString());
	}

	/**
	 * Static helper method displays the toString of the first two objects and
	 * then interates through an array
	 */
	public static void displayInfo(Object obj1, Object obj2, Object... objN) {
		System.out.println(obj1.getClass().getSimpleName().toString());
		System.out.println(obj2.getClass().getSimpleName().toString());
		for (int i = 0; i < objN.length; i++) {
			System.out.println(objN[i].getClass().getSimpleName().toString());
		}
	}

	/**
	 * Static helper method interates through an array of objects and displays
	 * the toString for each
	 */
	public static void displayInfo(Object[] obj) {
		for (int i = 1; i < obj.length; i++) {
			System.out.println(obj[i].getClass().getSimpleName().toString());
		}
	}

	/**
	 * Static helper method calls the toString of an object. Passes it to a
	 * String variable and then returns the String.
	 */
	public static String getInfo(Object obj) {
		String info;
		info = obj.getClass().getSimpleName().toString();
		return info;
	}

	public static void display2DInfo(Object[][] objects){
		for (int i = 0, j = 0; i < objects.length; i++, j++){
			i
		}
	}
}
