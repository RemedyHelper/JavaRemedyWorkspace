package signUpValidatorMaserati;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRemedyObjectOldthisisbeforesep14version {


	public Workbook metaDataWorkbookRemedy;
//	public Sheet metaDataSheetRemedy;
	
	
	public ExcelRemedyObjectOldthisisbeforesep14version (String metaDataWorkBookPath, int testing_DataSheetPositionInWorkbook) {

	
//		Workbook remedyMetadataExcelWorkBook = WorkbookFactory.create(new File("C:\\Users\\Remedy\\Desktop\\Dropbox\\RemedyWorkspace\\RemedyMetadata\\RemedySignUpViperMetadataOLD.xlsx"));
//		Workbook remedyMetadataExcelWorkBook = WorkbookFactory.create(new File("RemedyMetadata/RemedySignUpMetadata.xlsx"));
			try {
				metaDataWorkbookRemedy = WorkbookFactory.create(new File(metaDataWorkBookPath));
//				metaDataSheetRemedy = metaDataWorkbookRemedy.getSheetAt(testing_DataSheetPositionInWorkbook);				
				
			} catch (Exception ex) {
				System.out.println("An Exception occured - when trying to load MetaData Excel file! RR:("  + ex);
			}
			
	}
	

		public ExcelRemedyObjectOldthisisbeforesep14version (Workbook remedyMetadataExcelWorkBook) {
		
		Workbook babmoo = remedyMetadataExcelWorkBook;
//		metaDataSheetRemedy = babmoo.getSheetAt(1);	
//		System.out.println(metaDataSheetRemedy.getRow(5).getCell(1).getStringCellValue());
		
		
		
		// Excel output sequence RR
	    FileOutputStream outputRemedyFileResultsWriter;
		try {
			// testFinishDateTimePartOfOutputFileName String records the date/time of test finish to avoid overwriting previous results RR
			String testFinishDateTimePartOfOutputFileName = DateFormatUtils.format(new Date(), "MMMdd__HHmm").toString();
			outputRemedyFileResultsWriter = new FileOutputStream("RemedyTestResults/RemedyExcelResults"+testFinishDateTimePartOfOutputFileName+".xlsx");
		    try {
				remedyMetadataExcelWorkBook.write(outputRemedyFileResultsWriter);
			} catch (IOException e) {
				System.out.println(e);
			}
		    try {
				outputRemedyFileResultsWriter.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		} catch (FileNotFoundException e) {
			 System.out.println(e);
		}
	}
	
}