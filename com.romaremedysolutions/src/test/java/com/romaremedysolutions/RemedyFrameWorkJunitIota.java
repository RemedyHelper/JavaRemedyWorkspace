package com.romaremedysolutions;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import signUpValidatorMaserati.DummyData;
import signUpValidatorMaserati.ExcelRemedyObjectOldthisisbeforesep14version;
import signUpValidatorMaserati.PageObjectModel_HomePageFactoryElementsSep18;
import signUpValidatorMaserati.RemedyExcelObject;
	

@RunWith (Parameterized.class)
public class RemedyFrameWorkJunitIota {
	
	
	
	
		
	@Parameter (value = 0)
	public String unitTestId;
	
	@Parameter (value = 1)
	public String unitTestDescription;
	
	@Parameter (value = 2)
	public String elementInspected;
	
	@Parameter (value = 3)
	public String expectedUnitTestFromExcelResut;

	@Parameter (value = 4)
	public String actualUnitTestResult;
	
	
	@Parameters (name = "unitTestId: {0}, -Descrition: {1}, -Element insected: {2}, -Expected result: {3}, -ActualUnitTestResut: {4},  -RR")
	
	public static Collection<Object[]> Remedy() {
		long remedyUnitTestStartTime = System.currentTimeMillis();
		System.out.println("Unit Test Started: " + remedyUnitTestStartTime + " RR\r\n");
		
		String pathOfMetadaExcelFile6 = "RemedyMetadata/RemedySignUpMetadata.xlsx";
		RemedyExcelObject actualRemedyExcelObject6 = new RemedyExcelObject(pathOfMetadaExcelFile6);

		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://learn2test.net/qa/apps/sign_up/v1/");
		PageObjectModel_HomePageFactoryElementsSep18 atualGammaValidatorHomePage = PageFactory.initElements(driver, PageObjectModel_HomePageFactoryElementsSep18.class);
		driver.close();
		boolean shikaka = atualGammaValidatorHomePage.homeidquotesPageFactory.isDisplayed();
		String shikoko = String.valueOf(shikaka);
		
		int howManyRowsInExcelObject2 = actualRemedyExcelObject6.metaDataWorkbookRemedy.getSheet("NewDataaaa").getLastRowNum();
		String santorini[][] = new String[howManyRowsInExcelObject2][5];
		
		for (int eee = 0; eee <howManyRowsInExcelObject2; eee++) {
		santorini[eee][0] = actualRemedyExcelObject6.metaDataWorkbookRemedy.getSheet("NewDataaaa").getRow(eee).getCell(1).getStringCellValue();
		santorini[eee][1] = actualRemedyExcelObject6.metaDataWorkbookRemedy.getSheet("NewDataaaa").getRow(eee).getCell(2).getStringCellValue();
		santorini[eee][2] = actualRemedyExcelObject6.metaDataWorkbookRemedy.getSheet("NewDataaaa").getRow(eee).getCell(3).getStringCellValue();
		santorini[eee][3] = actualRemedyExcelObject6.metaDataWorkbookRemedy.getSheet("NewDataaaa").getRow(eee).getCell(4).getStringCellValue();
		santorini[eee][4] = shikoko;
		}		
		System.out.println("Finished creating List from RemedyExcelObjectMetaData " + System.currentTimeMillis() + " RR\r\n");
		
		
	
			return Arrays.asList(santorini);

			
			
			
			
			
			

	
	
	}

	@Test 
	public void remedyJunitTestAnnotation() {
	System.out.println("Does this: " + expectedUnitTestFromExcelResut + " AssertEquals to: " + actualUnitTestResult + " RR");
	assertEquals(expectedUnitTestFromExcelResut, actualUnitTestResult);
	}
	
	
}
