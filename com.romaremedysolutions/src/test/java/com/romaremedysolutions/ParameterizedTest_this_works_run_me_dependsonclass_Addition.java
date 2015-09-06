package com.romaremedysolutions;



import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
	
	@RunWith (Parameterized.class)
	
	public class ParameterizedTest_this_works_run_me_dependsonclass_Addition {
		//Fields
		private int expected;
		private int first;
		private int second;
		
		//Constructor instaedParameter for field injection
		public ParameterizedTest_this_works_run_me_dependsonclass_Addition (int expectedResult, int firstNumber, int secondNumber) {
			expected = expectedResult;
			first = firstNumber;
			second = secondNumber;
																							}
			// Test data generator
//			@Parameters 
			@Parameters (name = "Parameter # {index}: {1} + {2} = {0}") // this just prints the test results in a pretty way 
//									but does not perform the actual tests
			public static Collection<Integer[]> addedNumbers() {
				return Arrays.asList(new Integer[][] {
						{ 3, 1, 4},
						{ 5, 2, 3},
						{ 7, 3, 4},
						{ 9, 4, 5},
				});}
			@Test // this performs the actual test using the parameters above
			public void sum() {
				Addition add = new Addition();
				System.out.println(first + " + " + second + " = "+ expected);
				assertEquals(expected, add.addNumbers(first, second));
			
			}
	}
