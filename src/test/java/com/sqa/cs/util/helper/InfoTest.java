/**
 * File Name: InfoTest.java<br>
 * Shiflett, Chance<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 10, 2016
 */
package com.sqa.cs.util.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * InfoTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Shiflett, Chance
 * @version 1.0.0
 * @since 1.0
 */
public class InfoTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Runs before the Class executes");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Runs after the Class executes");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("Do Setup for Test Method");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("Do Tear down for test method");
	}

	/**
	 * Test method for
	 * {@link com.sqa.cs.util.helper.Info#display2DInfo(java.lang.Object[][])}.
	 */
	@Test
	public void testDisplay2DInfo() {
		System.out.println("test for display2DInfo");
	}

	/**
	 * Test method for
	 * {@link com.sqa.cs.util.helper.Info#displayInfo(java.lang.Object)}.
	 */
	@Test
	public void testDisplayInfoObject() {
		System.out.println("test for displayInfoObject");
	}

	/**
	 * Test method for
	 * {@link com.sqa.cs.util.helper.Info#displayInfo(java.lang.Object[])}.
	 */
	@Test
	public void testDisplayInfoObjectArray() {
		System.out.println("test for displayInfoObjectArray");
	}

	/**
	 * Test method for
	 * {@link com.sqa.cs.util.helper.Info#displayInfo(java.lang.Object, java.lang.Object, java.lang.Object[])}
	 * .
	 */
	@Test
	public void testDisplayInfoObjectObjectObjectArray() {
		System.out.println("test for displayInfoObjectObjectObjectArray");
	}

	/**
	 * Test method for
	 * {@link com.sqa.cs.util.helper.Info#get2DInfo(java.lang.Object[][])}.
	 */
	@Test
	public void testGet2DInfo() {
		System.out.println("test for get2DInfo");
	}

	/**
	 * Test method for
	 * {@link com.sqa.cs.util.helper.Info#getInfo(java.lang.Object)}.
	 */
	@Test
	public void testGetInfo() {
		System.out.println("test for getInfo");
	}
}
