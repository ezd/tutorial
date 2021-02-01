import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyCalculatorTestCase {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void additionTest() {
		Calculator calculator = new Calculator();
		int num1 = 10;
		int num2= 33;
		int resultfromcalc = calculator.add(num1, num2);
		assertEquals(43, resultfromcalc);
	}

}
