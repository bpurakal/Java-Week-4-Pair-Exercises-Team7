package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataStringCalculatorTest {
	
	@Test
	public void testIfStringIsEmpty() {
		assertEquals(0, KataStringCalculator.add(""));
	}
	
	@Test
	public void testIfStringIsOne() {
		assertEquals(1, KataStringCalculator.add("1"));
	}
	
	@Test
	public void testIfStringIsTwo() {
		assertEquals(2, KataStringCalculator.add("2"));
	}
	
	@Test
	public void testIfCalculatedStringIsThree() {
		assertEquals(3, KataStringCalculator.add("1,2"));
	}
	
	@Test
	public void testIfCalculatedStringIsFiftySix() {
		assertEquals(56, KataStringCalculator.add("49,7"));
	}
	
	@Test
	public void testIfTripleCalculatedStringIsFiftySix() {
		assertEquals(56, KataStringCalculator.add("45,7,4"));
	}
	
	@Test
	public void testIfTripleCalculatedStringIsSix() {
		assertEquals(6, KataStringCalculator.add("4,1\n1"));
	}
	
	@Test
	public void testIfDifferentDelimiter() {
		assertEquals(9, KataStringCalculator.add("//;\n1;8"));
	}

}
