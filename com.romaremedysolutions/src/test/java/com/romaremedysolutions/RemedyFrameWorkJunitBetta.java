package com.romaremedysolutions;

import static org.junit.Assert.assertEquals; //It is "Import Static" because it allows to use member methods

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import signUpValidatorMaserati.DummyData;
import signUpValidatorMaserati.ExcelRemedyObjectOldthisisbeforesep14version;
import signUpValidatorMaserati.RemedyExcelObject;


@RunWith (Parameterized.class)
public class RemedyFrameWorkJunitBetta {
	
	
	class hotdogstand {
		int dog;
		
		public hotdogstand(int dog) {
			int anschoby = 124;
			this.dog = anschoby;
			dog = 222333111;
			return;
		}
		
	}

//	@Before 
//		public void zoom() {				// this does note do anything? RR Sep09
//		int pumba = 3; }				// this does note do anything? RR Sep09
		hotdogstand hotDogRepresentative = new hotdogstand(133);

	
	
	
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
	System.out.println(hotDogRepresentative.dog);
	assertEquals(expectedTestCaseResultFromExcellSheetCell, actualTestCaseResultFromExcellSheetCell);


	}
	
	
	
	
		
		@Test // Fails
		public void remedyJunitActualTestTRALLALALAzzzzzzzzzzzzOOOOOOMMMMM() {
		ExcelRemedyObjectOldthisisbeforesep14version actualExcelRemedyObject = new ExcelRemedyObjectOldthisisbeforesep14version("RemedyMetadata/RemedySignUpMetadata.xlsx", 1);
		String sushi = actualExcelRemedyObject.metaDataWorkbookRemedy.getSheet("Testing_Data").getRow(3).getCell(1).getStringCellValue();
		System.out.println("Updated AssertEquals Test: " + expectedTestCaseResultFromExcellSheetCell + " <----Updated AssertEquals----> " + hotDogRepresentative.dog);
		System.out.println(hotDogRepresentative.dog);
		System.out.println(hotDogRepresentative.dog);
		System.out.println(hotDogRepresentative.dog);
		assertEquals(expectedTestCaseResultFromExcellSheetCell, hotDogRepresentative.dog);

		}
		
		

}

