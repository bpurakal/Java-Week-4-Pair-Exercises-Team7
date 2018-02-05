package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataStringCalculatorTest {
	
	@Test
	public void testIfStringIsEmpty() {
		assertEquals(0, KataStringCalculator.add(""));
		
	}
}
