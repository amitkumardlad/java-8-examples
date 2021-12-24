/**
 * 
 */
package com.java8.interviewtask;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import code.java8.interviewtask.DigitCount;

/**
 * @author ladam
 *
 */
class DigitCountTest {

	@Test
	void test() {
		assertEquals(7, DigitCount.count("23"));
		assertEquals(11, DigitCount.count("0081"));
		assertEquals(9, DigitCount.count("022"));
	}
	
	@Test
	void emptyStringTest() {
		assertEquals(0, DigitCount.count(""));
	}
	
	@Test
	void largeStringTest() {
		assertEquals(3, DigitCount.count("9"));
		assertEquals(7, DigitCount.count("99"));
		assertEquals(10, DigitCount.count("999"));
		assertEquals(13, DigitCount.count("9999"));
		assertEquals(16, DigitCount.count("99999"));
	}
	
	@Test
	void largeStringWithZeroTest() {
		assertEquals(15, DigitCount.count("00009"));
		assertEquals(16, DigitCount.count("00099"));
		assertEquals(16, DigitCount.count("00999"));
		assertEquals(16, DigitCount.count("09999"));
		assertEquals(19, DigitCount.count("099999"));
	}


}
