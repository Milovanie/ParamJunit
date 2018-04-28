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
public class MathUtilsTest {
	
	private int numberA;
	private int numberB;
	private int expected;
	
	//parameters pass via this constructor
		public MathUtilsTest(int numberA, int numberB, int expected) {
			this.numberA = numberA;
			this.numberB = numberB;
			this.expected = expected;
		}

		//Declares parameters here
		@Parameters(name = "{index}: add({0}+{1})={2}")
		public static Iterable<Object[]> data1() {
			return Arrays.asList(new Object[][] { 
				{ 1, 1, 2 }, 
				{ 2, 2, 4 }, 
				{ 8, 2, 10 }, 
				{ 4, 5, 9 } 
			});
		}
		
	@Before
	public void setUp() throws Exception {
		assertEquals(expected,MathUtils.add(numberA, numberB));
	}

	@Test
	public void testAdd() {
	}

	@Test
	public void testMinus() {
	}

	@Test
	public void testDel() {
	}

	@Test
	public void testMulti() {
	}

}
