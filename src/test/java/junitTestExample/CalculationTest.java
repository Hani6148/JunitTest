package junitTestExample;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import junitExample.Calculation;

public class CalculationTest {

	static Calculation cal;
	
	@BeforeEach
	public void init2() {
		cal = new Calculation();
	}
	
	@Test
	public void AdditionTest() {
		assertEquals(cal.add(10,20),30);
	}
	
	@Test
	public void DemoTest() {
		assertFalse(cal.check(20, 30));
	}
	@Test
	public void DemoTest2() {
		assertTrue(cal.check(20, 30));
	}
	@Nested 
	 class NewAddTest {
		
		@Test
		 void AdditionTest() {
			assertEquals(cal.add(10,20),30);
		}
		
		@Test
		 void DemoTest() {
			assertFalse(cal.check(20, 30));
		}
		@Test
		 void DemoTest2() {
			assertTrue(cal.check(20, 30));
		}
	}
	
	@Test
	void MultiplyTest() {
		assertAll(
				()-> assertEquals(0, cal.multi(1,0)),()-> assertEquals(1, cal.multi(1,1)),
						()-> assertEquals(1, cal.multi(1,2)));
		
		
	}
	@Test
	void ArExTest() {
		assertThrows(ArithmeticException.class, () -> cal.div(1,1),"msg");
	}
}
