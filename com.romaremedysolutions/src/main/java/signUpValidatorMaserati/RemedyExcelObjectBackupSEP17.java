package signUpValidatorMaserati;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RemedyExcelObjectBackupSEP17 {


	public Workbook metaDataWorkbookRemedy;
//	public Sheet metaDataSheetRemedy;
	
	
	public RemedyExcelObjectBackupSEP17 (String pathOfMetadaExcelFile) {

	
//		Workbook remedyMetadataExcelWorkBook = WorkbookFactory.create(new File("C:\\Users\\Remedy\\Desktop\\Dropbox\\RemedyWorkspace\\RemedyMetadata\\RemedySignUpViperMetadataOLD.xlsx"));
//		Workbook remedyMetadataExcelWorkBook = WorkbookFactory.create(new File("RemedyMetadata/RemedySignUpMetadata.xlsx"));
			try {
				metaDataWorkbookRemedy = WorkbookFactory.create(new File(pathOfMetadaExcelFile));			
				
			} catch (Exception ex) {
				System.out.println("An Exception occured - when trying to load MetaData Excel file! RR:("  + ex);
			}
			

		
	}
		

		public void remedyTestResultsExcelOutputMethod (Workbook outputTestResultsExcelToBeWritten) {


			System.out.println("\"remedyTestResultsExcelOutputMethod\" activated to create output excel file SEP16 RR ");
			
			// Excel output sequence RR
		    FileOutputStream outputRemedyFileResultsWriter;
			try {
				// testFinishDateTimePartOfOutputFileName String records the date/time of test finish to avoid overwriting previous results RR
				String testFinishDateTimePartOfOutputFileName = DateFormatUtils.format(new Date(), "MMMdd__HHmm").toString();
				outputRemedyFileResultsWriter = new FileOutputStream("RemedyTestResults/RemedyExcelResultsOUTPUTWOKRS"+testFinishDateTimePartOfOutputFileName+".xlsx");
				outputTestResultsExcelToBeWritten.write(outputRemedyFileResultsWriter);
				outputRemedyFileResultsWriter.close();
			} catch (IOException e) {
				 System.out.println(e);
			}
			
			
		}
		
		
}