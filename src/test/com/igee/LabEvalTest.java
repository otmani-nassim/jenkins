package test.com.igee;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import main.com.igee.LabEval;


class LabEvalTest {

	LabEval labEval;
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Starting the pile of tests");
	}
	@AfterAll
	static void afterAll() {
		System.out.println("All tests are executed, check the results");
	}
	
	@BeforeEach
	void beforeEach() {
		labEval = new LabEval();
	}
	
	@AfterEach
	void print() {
		labEval = null;
	}
 



	@Nested
	@DisplayName("Reverse sign (Getting started)(Estm. 2 mins)")
	class CheckingReversedSign{
 
		
		@Test
		void shouldReturnNegativeNumber() {		
			//given
			int value = 10;
			//when
			int reversed = labEval.reverseSign(value);
			//then
			assertEquals(reversed, -10);
		}
		
		@Test
		void shouldReturnPositiveNumber() {		
			//given
			int value = -10;
			//when
			int reversed = labEval.reverseSign(value);
			//then
			assertEquals(reversed, 10);
		}		
	}
	
	

	
}
