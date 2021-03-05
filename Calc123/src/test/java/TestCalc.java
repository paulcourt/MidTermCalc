
import static org.junit.Assert.*;
import org.junit.Test;


public class TestCalc {
	
@Test
public void testAdd() {
	Calc test = new Calc();
	int result = test.add(3, 2);
	assertEquals(5, result);
}

@Test
public void testSubt() {
	Calc test = new Calc();
	int result = test.subt(3, 2);
	assertEquals(1, result);
}

@Test
public void testMult() {
	Calc test = new Calc();
	int result = test.mult(3, 2);
	assertEquals(6, result);
}

@Test
public void testDiv() {
	Calc test = new Calc();
	result = test.div(3, 2);
	assertEquals(1.5, result);
}
}
