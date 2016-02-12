/**
 * File Name: MatrixViewTest.java<br>
 * Shiflett, Chance<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 11, 2016
 */
package com.sqa.cs.util.helper;

import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;

/**
 * MatrixViewTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Shiflett, Chance
 * @version 1.0.0
 * @since 1.0
 */
public class MatrixViewTest {

	/**
	 * Test method for
	 * {@link com.sqa.cs.util.helper.Info#display2DInfo(java.lang.Object[][])}.
	 */
	@Test
	public void testDisplay2DInfo() {
		Integer[][] numbers = { { new Integer(1), new Integer(2), new Integer(3) },
				{ new Integer(4), new Integer(5), new Integer(6) }, { new Integer(7), new Integer(8), new Integer(9) },
				{ new Integer(10), new Integer(11), new Integer(12) } };
		Info.display2DInfo(numbers);
	}

	/**
	 * Test method for
	 * {@link com.sqa.cs.util.helper.Info#get2DInfo(java.lang.Object[][])}.
	 */
	@Test
	@Ignore
	public void testGet2DInfo() {
		fail("Not yet implemented");
	}
}
