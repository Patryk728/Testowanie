package kalkulator;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junitKalkulator {

	@Test
	void test() {
		 Kalkulator2 test = new Kalkulator2();
		float output = test.dodawanie(5, 10);
		assertEquals(15,output);
		output = test.odejmowanie(10,5);
		assertEquals(5,output);
		output = test.mnozenie(5, 2);
		assertEquals(10,output);
		output = test.dzielenie(10, 5);
		assertEquals(2,output);
		
		
		
	}

}
