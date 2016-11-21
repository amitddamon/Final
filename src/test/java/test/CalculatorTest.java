package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAbs()
	{
		Calculator calc = new Calculator();
		int expected = -4;
		int actual = calc.abs(-4);
	    assertEquals(expected,actual);	
	}
}
