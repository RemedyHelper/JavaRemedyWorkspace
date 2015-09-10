package com.romaremedysolutions;



import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
	
	@RunWith (Parameterized.class)
	
	public class SUPERDUPERParameterizedTest_this_works_run_me_dependsonclass_Addition {
		//Fields
		private int expected;
		private int first;
		private int second;
		
		//Constructor instaedParameter for field injection
		public SUPERDUPERParameterizedTest_this_works_run_me_dependsonclass_Addition (int expectedResult, int firstNumber, int secondNumber) {
			expected = expectedResult;
			first = firstNumber;
			second = secondNumber;
																							}
			// Test data generator
			@Parameters 
//			@Parameters (name = "Parameter # {index}: {1} = {0}") // this just prints the test results in a pretty way 
//									but does not perform the actual tests
		
			
			public static Collection<Object[]> Remedy() {
				return Arrays.asList(new Object[][] {
						{new String [] {"chicken", "chicken"} , new String [] {"chicken", "chicken"} },
						{new String [] {"chicken", "chicken"} , new String [] {"chicken", "chicken"} },
						{2 , new String [] {"banana"} }
//						
				});}
			
			
			@Test // this performs the actual test using the parameters above
			public void summmmyy() {
				
				System.out.println(first + " = "+ expected);
				assertEquals(first, second);
			
			}
	}
