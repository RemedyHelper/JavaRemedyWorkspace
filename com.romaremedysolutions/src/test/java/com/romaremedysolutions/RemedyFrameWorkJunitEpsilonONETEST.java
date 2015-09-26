package com.romaremedysolutions;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import signUpValidatorMaserati.PageObjectModel_HomePageFactoryElementsSep18;
import signUpValidatorMaserati.RemedyExcelObject;

public class RemedyFrameWorkJunitEpsilonONETEST {

	@Test
	public void remedyJunitSep18test () {
		
		String pathOfMetadaExcelFile = "RemedyMetadata/RemedySignUpMetadata.xlsx";
		RemedyExcelObject actualRemedyExcelObject = new RemedyExcelObject(pathOfMetadaExcelFile);
		String expectedTestCaseResultFromExcellSheetCell = actualRemedyExcelObject.metaDataWorkbookRemedy.getSheet("Testing Metadata Updated").getRow(3).getCell(1).getStringCellValue();
		
		String  actualTestCaseResultFromExcellSheetCell = "TC-01.003";
		assertEquals(expectedTestCaseResultFromExcellSheetCell, actualTestCaseResultFromExcellSheetCell);
}
	
}
