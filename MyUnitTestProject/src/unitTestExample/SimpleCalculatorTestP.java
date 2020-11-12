package unitTestExample;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SimpleCalculatorTestP {
	private int expected, value1, value2;
	@Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][] {
			{30,10,20}, 
			{0,0,0},
			{100,30,70},
			{-1,-5,4},
			{0,-3,3}
		});
		
	}
	public SimpleCalculatorTestP(int expected, int value1, int value2) {
		this.expected=expected;
		this.value1 = value1;
		this.value2 = value2;
	}
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.add(value1, value2);
		assertEquals(expected, calc.getResult());
	}

}
