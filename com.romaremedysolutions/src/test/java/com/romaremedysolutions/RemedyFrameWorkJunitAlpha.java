package com.romaremedysolutions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import signUpValidatorMaserati.ExcelRemedyObject;

public class RemedyFrameWorkJunitAlpha {
	
	@Test
	public void testAssertEquals() {
		
		ExcelRemedyObject actualExcelRemedyObject = new ExcelRemedyObject("RemedyMetadata/RemedySignUpMetadata.xlsx", 1);
		String sushi = actualExcelRemedyObject.metaDataSheetRemedy.getRow(3).getCell(1).getStringCellValue();
		System.out.println(sushi);
		assertEquals("fai;ire = strings are not equalss RR", "oki",sushi);
		
	}

}
