package com.romaremedysolutions;

import static org.junit.Assert.assertEquals; //It is "Import Static" because it allows to use member methods

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import signUpValidatorMaserati.DummyData;
import signUpValidatorMaserati.ExcelRemedyObjectOldthisisbeforesep14version;
import signUpValidatorMaserati.PageObjectModel_HomePageFactoryElementsSep18;
import signUpValidatorMaserati.RemedyExcelObject;


@RunWith (Parameterized.class)
public class RemedyFrameWorkJunitDelta {
	
	
	
	
		
	@Parameter (value = 0)
	public String expectedTestCaseResultFromExcellSheetCell;
	
	@Parameter (value = 1)
	public String actualTestCaseResultFromExcellSheetCell;

	@Parameters (name = "Hello im eating a banana + {0} + actual result is {1} ")
	
	public static Collection<Object[]> Remedy() {
		ExcelRemedyObjectOldthisisbeforesep14version actualExcelRemedyObject = new ExcelRemedyObjectOldthisisbeforesep14version("RemedyMetadata/RemedySignUpMetadata.xlsx", 1);
		String sushi = actualExcelRemedyObject.metaDataWorkbookRemedy.getSheet("Testing_Data").getRow(3).getCell(1).getStringCellValue();
		Object hotDogSushiEater[][] = new Object[][] { { "asdas", "asd"}, {"TC-01.003","TC-01.003"}, {"TC-01.003",sushi} };
		
		System.out.println("STARTING DUMMY DATA NOWWWWW!!!!!!!1");
		DummyData.main(null);
		
		System.out.println("After DUMMY DATA - It Just Finished!! :D");
		
		DummyData zumbabumba = new DummyData();
		zumbabumba.flightToIbiza();
		
		

			return Arrays.asList(hotDogSushiEater);

			
			
			
			
			
			

	
	
	}

	@Test  // this one always passes
	public void remedyJunitActualTestALHAMBRAAA() {
	ExcelRemedyObjectOldthisisbeforesep14version actualExcelRemedyObject = new ExcelRemedyObjectOldthisisbeforesep14version("RemedyMetadata/RemedySignUpMetadata.xlsx", 1);
	String sushi = actualExcelRemedyObject.metaDataWorkbookRemedy.getSheet("Testing_Data").getRow(3).getCell(1).getStringCellValue();
	System.out.println("Does this item: " + expectedTestCaseResultFromExcellSheetCell + " <----AssertEquals to this item----> " + actualTestCaseResultFromExcellSheetCell);
	assertEquals(expectedTestCaseResultFromExcellSheetCell, actualTestCaseResultFromExcellSheetCell);


	}
	
	
	
	
		
//		@Test // Fails
//		public void remedyJunitActualTestTRALLALALAzzzzzzzzzzzzOOOOOOMMMMM() {
//		ExcelRemedyObjectOldthisisbeforesep14version actualExcelRemedyObject = new ExcelRemedyObjectOldthisisbeforesep14version("RemedyMetadata/RemedySignUpMetadata.xlsx", 1);
//		String sushi = actualExcelRemedyObject.metaDataWorkbookRemedy.getSheet("Testing_Data").getRow(3).getCell(1).getStringCellValue();
//		System.out.println("Updated AssertEquals Test: " + expectedTestCaseResultFromExcellSheetCell + " <----Updated AssertEquals----> " + hotDogRepresentative.dog);
//		assertEquals(expectedTestCaseResultFromExcellSheetCell, hotDogRepresentative.dog);
//
//		}
//		
		
		@Test
		public void remedyJunitSep18test () {
			String pathOfMetadaExcelFile = "RemedyMetadata/RemedySignUpMetadata.xlsx";
			RemedyExcelObject actualRemedyExcelObject = new RemedyExcelObject(pathOfMetadaExcelFile);
			expectedTestCaseResultFromExcellSheetCell = actualRemedyExcelObject.metaDataWorkbookRemedy.getSheet("Testing Metadata Updated").getRow(3).getCell(1).getStringCellValue();
			WebDriver driver = new FirefoxDriver();
			driver.navigate().to("http://learn2test.net/qa/apps/sign_up/v1/");
			driver.close();
			PageObjectModel_HomePageFactoryElementsSep18 actualPageFactoryElementsSep18 = new PageObjectModel_HomePageFactoryElementsSep18(driver);
			actualTestCaseResultFromExcellSheetCell = "I need to take this variable from page object model";
//			String deleteme = actualPageFactoryElementsSep18.home
			assertEquals(expectedTestCaseResultFromExcellSheetCell, actualTestCaseResultFromExcellSheetCell);
			
		}
		
		
		
}

