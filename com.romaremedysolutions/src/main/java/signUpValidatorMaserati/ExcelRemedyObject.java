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

public class ExcelRemedyObject {


	public Workbook metaDataWorkbookRemedy;
	public Sheet metaDataSheetRemedy;
	
	
	public ExcelRemedyObject (String metaDataWorkBookPath, int testing_DataSheetPositionInWorkbook) {

	
//		Workbook remedyMetadataExcelWorkBook = WorkbookFactory.create(new File("C:\\Users\\Remedy\\Desktop\\Dropbox\\RemedyWorkspace\\RemedyMetadata\\RemedySignUpViperMetadataOLD.xlsx"));
//		Workbook remedyMetadataExcelWorkBook = WorkbookFactory.create(new File("RemedyMetadata/RemedySignUpMetadata.xlsx"));
			try {
				metaDataWorkbookRemedy = WorkbookFactory.create(new File(metaDataWorkBookPath));
				metaDataSheetRemedy = metaDataWorkbookRemedy.getSheetAt(1);				
				
			} catch (Exception ex) {
				System.out.println("An Exception occured - when trying to load MetaData Excel file! RR:("  + ex);
			}
			
	}
	

		public ExcelRemedyObject (Workbook remedyMetadataExcelWorkBook) {
		
		Workbook babmoo = remedyMetadataExcelWorkBook;
		metaDataSheetRemedy = babmoo.getSheetAt(1);	
		System.out.println(metaDataSheetRemedy.getRow(5).getCell(1).getStringCellValue());
		
		
		
		 // output of xlsx sequance workbook RR (3 - 4)
		// the only problem is that i dont get a notification when the output is already exists it wont overwrite Sep07RR
	    FileOutputStream out;
		try {
			String testFinishDateTimePartOfOutputFileName = DateFormatUtils.format(new Date(), "MMMdd__HHmm").toString();
			out = new FileOutputStream("RemedyTestResults/RemedyExcelResults"+testFinishDateTimePartOfOutputFileName+".xlsx");
		    try {
				remedyMetadataExcelWorkBook.write(out);
			} catch (IOException e) {
				System.out.println(e);
			}
		    try {
				out.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		} catch (FileNotFoundException e) {
			 System.out.println(e);
		}
	}
	
}