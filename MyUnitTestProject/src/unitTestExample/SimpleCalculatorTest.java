package unitTestExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalculatorTest {
	// {expected, value1, value2},{7,3,4}, {0,0,0},{10,5,5}
	
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.add(3, 4);
		assertEquals(7, calc.getResult());
		// fail("Not yet implemented");
	}

	@Test
	public void testZero() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.add(0, 0);
		assertEquals(0, calc.getResult());
		// fail("Not yet implemented");
	}

	@Test
	public void testInc() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.add(1, 2); // result = 3
		calc.inc(10); // result == 13
		assertEquals(13, calc.getResult());
		// fail("Not yet implemented");
	}
	// test 케이스가 잘못된경우. 10에서 13으로 수정하면 해결.

}
