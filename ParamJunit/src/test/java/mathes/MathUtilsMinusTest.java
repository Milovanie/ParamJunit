package mathes;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import mathes.MathUtils;

@RunWith(value = Parameterized.class)
public class MathUtilsMinusTest {
	private int numberA;
	private int numberB;
	private int expected;

	// parameters pass via this constructor
	public MathUtilsMinusTest(int numberA, int numberB, int expected) {
		this.numberA = numberA;
		this.numberB = numberB;
		this.expected = expected;
	}

	/*
	 * http://www.javacodegeeks.com/2013/12/parameterized-junit-tests-with-
	 * junitparams.html
	 */
	// Declares parameters here
	/**
	 * method public static int minus(int a, int b) {return a - b;}<br>
	 * ----------------<br>
	 * What is ({0}-{1})={2}? <br>
	 * If parameter is “{ 3, 4, 7 }”, then <br>
	 * {0} = 3,<br>
	 * {1} = 4,<br>
	 * {2} = 7. <br>
	 * Refer to below output :<br>
	 * { 3, 1, 2 } same : <br>
	 * 3 is a first arg ==> resultat of a - b<br>
	 * [0: add(3 - 1) = 2
	 */
	@Parameters(name = "{index}: minus({0}-{1})={2}")
	public static Iterable<Object[]> data1() {
		return Arrays.asList(new Object[][] { 
			{ 3, 1, 2 },
			{ 4, 2, 2 }, 
			{ 18, 8, 10 },
			{ 14, 5, 9 } 
			});
	}

	@Before
	public void setUp() throws Exception {
		assertEquals(expected, MathUtils.minus(numberA, numberB));
	}

	@Test
	public void test() {
	}

}
