
import static org.junit.Assert.*;
import org.junit.Test;


public class TestCalc {
	
@Test
public void testAdd() {
	Calc test = new Calc();
	double result = test.add(3, 2);
	assertEquals(5, result, 0.01);
}

@Test
public void testSubt() {
	Calc test = new Calc();
	double result = test.subt(3, 2);
	assertEquals(1, result, 0.01);
}

@Test
public void testMult() {
	Calc test = new Calc();
	double result = test.mult(3, 2);
	assertEquals(6, result, 0.01);
}

@Test
public void testDiv() {
	Calc test = new Calc();
	double result = test.div(3, 2);
	assertEquals(1.5, result, 0.01);
}
@Test
public void testDiv2() {
	Calc test = new Calc();
	double result = test.div(2, 3);
	assertEquals(0.66, result, 0.01);
}
@Test(expected = java.lang.ArithmeticException.class)
public void testDiv3() {
	Calc test = new Calc();
	double result = test.div(3, 0);		
}	
}
