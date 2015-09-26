package com.romaremedysolutions;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import signUpValidatorMaserati.PageObjectModel_HomePageFactoryElementsSep18;
import signUpValidatorMaserati.RemedyExcelObject;
	

@RunWith (Parameterized.class)
public class RemedyFrameWorkJunitEtta {
	
	
	
	
		
	@Parameter (value = 0)
	public String expectedTestCaseResultFromExcellSheetCell;
	
	@Parameter (value = 1)
	public String actualTestCaseResultFromExcellSheetCell;
	
	@Parameter (value = 2)
	public String volvo;
	
	@Parameter (value = 3)
	public String boom;

	
	@Parameters (name = "Test Case: {0}, -Descrition: {1}, -Element insected: {2}, -Expected result: {3} RR")
	
	public static Collection<Object[]> Remedy() {
		long remedyUnitTestStartTime = System.currentTimeMillis();
		System.out.println("Unit Test Started: " + System.currentTimeMillis() + " RR\r\n");
		
		String pathOfMetadaExcelFile6 = "RemedyMetadata/RemedySignUpMetadata.xlsx";
		RemedyExcelObject actualRemedyExcelObject6 = new RemedyExcelObject(pathOfMetadaExcelFile6);

		
		int howManyRowsInExcelObject2 = actualRemedyExcelObject6.metaDataWorkbookRemedy.getSheet("NewDataaaa").getLastRowNum();
		String santorini[][] = new String[howManyRowsInExcelObject2][4];
		
		for (int eee = 0; eee <howManyRowsInExcelObject2; eee++) {
		santorini[eee][0] = actualRemedyExcelObject6.metaDataWorkbookRemedy.getSheet("NewDataaaa").getRow(eee).getCell(1).getStringCellValue();
		santorini[eee][1] = actualRemedyExcelObject6.metaDataWorkbookRemedy.getSheet("NewDataaaa").getRow(eee).getCell(2).getStringCellValue();
		santorini[eee][2] = actualRemedyExcelObject6.metaDataWorkbookRemedy.getSheet("NewDataaaa").getRow(eee).getCell(3).getStringCellValue();
		santorini[eee][3] = actualRemedyExcelObject6.metaDataWorkbookRemedy.getSheet("NewDataaaa").getRow(eee).getCell(4).getStringCellValue();
		}		
		System.out.println("Finished creating List from RemedyExcelObjectMetaData " + System.currentTimeMillis() + " RR\r\n");
		
		
	
			return Arrays.asList(santorini);

			
			
			
			
			
			

	
	
	}

	@Test 
	public void remedyJunitActualTest() {
//	ExcelRemedyObjectOldthisisbeforesep14version actualExcelRemedyObject = new ExcelRemedyObjectOldthisisbeforesep14version("RemedyMetadata/RemedySignUpMetadata.xlsx", 1);
//	String sushi = actualExcelRemedyObject.metaDataWorkbookRemedy.getSheet("Testing_Data").getRow(3).getCell(1).getStringCellValue();
	
	System.out.println("Does this: " + expectedTestCaseResultFromExcellSheetCell + " AssertEquals to: " + actualTestCaseResultFromExcellSheetCell + " RR");
//	assertEquals(expectedTestCaseResultFromExcellSheetCell, actualTestCaseResultFromExcellSheetCell);
	assertEquals(expectedTestCaseResultFromExcellSheetCell, "TC-01.004");


	}
	
	
	
	
}
