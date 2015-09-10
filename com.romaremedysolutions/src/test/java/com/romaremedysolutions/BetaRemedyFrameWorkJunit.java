package com.romaremedysolutions;

import static org.junit.Assert.assertEquals; //It is "Import Static" because it allows to use member methods

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import signUpValidatorMaserati.ExcelRemedyObject;


@RunWith (Parameterized.class)
public class BetaRemedyFrameWorkJunit {
	
	


	@Before 
		public void zoom() {
		int pumba = 3; }
//	public void initialize() {
//	// this is uneeded unless I want to incert another object  to the result testing???
//	}
	
	@Parameter (value = 0)
	public String expectedTestCaseResultFromExcellSheetCell;
	
	@Parameter (value = 1)
	public String actualTestCaseResultFromExcellSheetCell;

	@Parameters (name = "Hello im eating a banana + {0} + actual result is {1} ")
	
	public static Collection<Object[]> Remedy() {
		ExcelRemedyObject actualExcelRemedyObject = new ExcelRemedyObject("RemedyMetadata/RemedySignUpMetadata.xlsx", 1);
		String sushi = actualExcelRemedyObject.metaDataSheetRemedy.getRow(3).getCell(1).getStringCellValue();
//		for (int z = 0; z<2;z++){
		Object[][] data = new Object[][] {
				{"aa", "bb"} ,
				{"TC-01.003","TC-01.003"} , 
				{"horse","zebra"} , 
				{"TC-01.003",sushi}
				};//}

		
//		Object[][] data = new Object[][] {
//				{"aa", "bb"} ,
//				{"TC-01.003","TC-01.003"} , 
//				{"horse","zebra"} , 
//				{"TC-01.003",sushi}
//				};
		
			return Arrays.asList(data);
	}
	
	
	@Test
		public void remedyJunitActualTest() {
		ExcelRemedyObject actualExcelRemedyObject = new ExcelRemedyObject("RemedyMetadata/RemedySignUpMetadata.xlsx", 1);
		String sushi = actualExcelRemedyObject.metaDataSheetRemedy.getRow(3).getCell(1).getStringCellValue();
		System.out.println("I am a Banana! " + expectedTestCaseResultFromExcellSheetCell + " and its true because: " + actualTestCaseResultFromExcellSheetCell);
		assertEquals(expectedTestCaseResultFromExcellSheetCell, actualTestCaseResultFromExcellSheetCell);
		//		System.out.println(sushi);
//		assertEquals("fai;ire = strings are not equalss RR", "TC-01.003",sushi);
		
	}

}
