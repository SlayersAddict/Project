package com.mycompany.app.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.app.test.Roman;

/**
 *
 * @author Alex
 *
 */
public class RomanTest {
	Roman r;

	/**
	 * fonction before
	 */
	@Before
	public final void before() {
		r = new Roman();
	}

	@Test
	public final void testI() {
		assertEquals(1, r.decode("I"));
	}

	@Test
	public final void testIV() {
		assertEquals(4, r.decode("IV"));
	}

	@Test
	public final void testV() {
		assertEquals(5, r.decode("V"));
	}

	@Test
	public final void testVI() {
		assertEquals(6, r.decode("VI"));
	}

	@Test
	public final void testIX() {
		assertEquals(9, r.decode("IX"));
	}

	@Test
	public final void testX() {
		assertEquals(10, r.decode("X"));
	}

	@Test
	public final void testXIV() {
		assertEquals(14, r.decode("XIV"));
	}

	@Test
	public final void testXL() {
		assertEquals(40, r.decode("XL"));
	}

	@Test
	public final void testL() {
		assertEquals(50, r.decode("L"));
	}

	@Test
	public final void testLX() {
		assertEquals(60, r.decode("LX"));
	}

	@Test
	public final void testXC() {
		assertEquals(90, r.decode("XC"));
	}

	@Test
	public final void testC() {
		assertEquals(100, r.decode("C"));
	}

	@Test
	public final void testCX() {
		assertEquals(110, r.decode("CX"));
	}

	@Test
	public final void testCD() {
		assertEquals(400, r.decode("CD"));
	}

	@Test
	public final void testD() {
		assertEquals(500, r.decode("D"));
	}

	@Test
	public final void testDC() {
		assertEquals(600, r.decode("DC"));
	}

	@Test
	public final void testCM() {
		assertEquals(900, r.decode("CM"));
	}

	@Test
	public final void testM() {
		assertEquals(1000, r.decode("M"));
	}

	@Test
	public final void testMC() {
		assertEquals(1100, r.decode("MC"));
	}

	@Test
	public final void testMMDCCLI() {
		assertEquals(2751, r.decode("MMDCCLI"));
	}

	@Test
	public final void testCDXLVIII() {
		assertEquals(448, r.decode("CDXLVIII"));
	}
}
