
import static org.junit.Assert.*;
import org.junit.Test;


public class TestCalc {
	
@Test
public void testAdd() {
	Calc test = new Calc();
	int result = test.add(2, 3);
	assertEquals(5, result);
}

@Test
public void testSubt() {
	Calc test = new Calc();
	int result = test.subt(2, 3);
	assertEquals(-1, result);
}

@Test
public void testMult() {
	Calc test = new Calc();
	int result = test.mult(2, 3);
	assertEquals(6, result);
}

@Test
public void testDiv() {
	Calc test = new Calc();
	double result = test.div(2, 3);
	assertEquals(0.666, result);
}
}
