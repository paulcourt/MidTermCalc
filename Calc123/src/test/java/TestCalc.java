package Calc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class JUnitTests {
	
	private Calc test;
	
	@Before
	public void setUp() throws Exception {
		test = new Calc();
	}
		
	@Test
	public void testAdd() {
		double result = test.add(3, 2);
		assertEquals(5, result, 0.1);
	}

	@Test
	public void testSubt() {
		double result = test.subt(3, 2);
		assertEquals(1, result, 0.1);
	}

	@Test
	public void testMult() {
		double result = test.mult(3, 2);
		assertEquals(6, result, 0.1);
	}

	/** The next three tests are for the divide function.
	 * 
	 */
	@Test
	public void testDiv1() {
		double result = test.div(3, 2);
		assertEquals(1.5, result, 0.1);
	}

	@Test
	public void testDiv2() {
		double result = test.div(2, 3);
		assertEquals(0.66, result, 0.1);
	}

	@Test(expected = java.lang.ArithmeticException.class)
	public void testDiv3() {
			 double result = test.div(3, 0);
}
}
