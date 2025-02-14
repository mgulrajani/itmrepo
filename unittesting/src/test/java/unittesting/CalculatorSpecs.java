package unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorSpecs {
static Calculator c1;
	//this method will run once before all the test cases
	@BeforeAll
	
	public static void setUp() {
		c1 = new Calculator();
		
	}
	
	@BeforeEach
	public static void beforeEach() {
		System.out.println("before each test");
		
	}
	
	@Test
	void testAdd() {
		//arrange
	
		//act
		int result = c1.add(3, 5);
		//assert
		assertEquals(8, result);
		
	}
	
	@Test
	
	void testDivide() {
		
		
		
		assertThrows(IllegalArgumentException.class,()->c1.divide(3, 0));
		
		
		
		
	}

}
