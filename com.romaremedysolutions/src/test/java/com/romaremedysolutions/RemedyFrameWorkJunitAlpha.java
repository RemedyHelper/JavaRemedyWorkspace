package com.romaremedysolutions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import org.testng.annotations.Test;
import signUpValidatorMaserati.ExcelRemedyObjectOldthisisbeforesep14version;

public class RemedyFrameWorkJunitAlpha {
	
	@Test
	public void testAssertEquals() {
		
		ExcelRemedyObjectOldthisisbeforesep14version actualExcelRemedyObject = new ExcelRemedyObjectOldthisisbeforesep14version("RemedyMetadata/RemedySignUpMetadata.xlsx", 1);
		String sushi = actualExcelRemedyObject.metaDataSheetRemedy.getRow(3).getCell(1).getStringCellValue();
		System.out.println(sushi);
		assertEquals("fai;ire = strings are not equalss RR", "oki",sushi);

	}

}
