package com.romaremedysolutions;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import signUpValidatorMaserati.PageObjectModel_HomePageFactoryElementsSep18;
import signUpValidatorMaserati.RemedyExcelObject;

public class RemedyFrameWorkJunitDeltaSECONDSEP19 {

	@Test
	public void remedyJunitSep18test () {
		String pathOfMetadaExcelFile = "RemedyMetadata/RemedySignUpMetadata.xlsx";
		RemedyExcelObject actualRemedyExcelObject = new RemedyExcelObject(pathOfMetadaExcelFile);
		String expectedTestCaseResultFromExcellSheetCell = actualRemedyExcelObject.metaDataWorkbookRemedy.getSheet("Testing Metadata Updated").getRow(3).getCell(1).getStringCellValue();
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://learn2test.net/qa/apps/sign_up/v1/");
		driver.close();
		PageObjectModel_HomePageFactoryElementsSep18 actualPageFactoryElementsSep18 = new PageObjectModel_HomePageFactoryElementsSep18(driver);
		String  actualTestCaseResultFromExcellSheetCell = "TC-01.003";
//		String deleteme = actualPageFactoryElementsSep18.home
		assertEquals(expectedTestCaseResultFromExcellSheetCell, actualTestCaseResultFromExcellSheetCell);
}
	
}
