package remedyFramework;

/**
 * By Roma Remedy RR SEP18
 * HelpmeRemedy@gmail.com
 * 
 * Information about Class:
 * 
 * Class used to load test Metadata from the accompanying excel file "RemedySignUpMetadata.xlsx" 
 * Casss also writes the output of the test results into an excel file (based on the file it loaded for input)
 * 
 * 
 * 
 * Class is Dependent on the POI jar
 * to activate add dependency below into the Maven POM:
 * 
    <dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi</artifactId>
	<version>3.12-beta1</version>
	</dependency>
	
	<dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi-ooxml</artifactId>
		<version>3.12-beta1</version>
	</dependency>
 * 
 * 
 * 
 * 
 *
 *
 *
 *
 *
 * 
 *
 */



import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RemedyExcelObjectSep18 {


	public Workbook metaDataWorkbookRemedy;
	
	public RemedyExcelObjectSep18 (String pathOfMetadaExcelFile) {

			try {
				metaDataWorkbookRemedy = WorkbookFactory.create(new File(pathOfMetadaExcelFile));			
				
			} catch (Exception ex) {
				System.out.println("An Exception occured - when trying to load MetaData Excel file! RR:("  + ex);
			}
															}
		

	
	
		public void remedyTestResultsExcelOutputMethod (Workbook outputTestResultsExcelToBeWritten) {

			System.out.println("\rHello World - \"remedyTestResultsExcelOutputMethod\" will output excel file SEP16 RR \r");
			// Excel output sequence RR
		    FileOutputStream outputRemedyFileResultsWriter;
			try {
				// testFinishDateTimePartOfOutputFileName String records the date/time of test finish to avoid overwriting previous results RR
				String testFinishDateTimePartOfOutputFileName = new SimpleDateFormat("MMMdd__HHmm").format(new Date());
				outputRemedyFileResultsWriter = new FileOutputStream("RemedyTestResults/RemedyExcelResults"+testFinishDateTimePartOfOutputFileName+".xlsx");
				outputTestResultsExcelToBeWritten.write(outputRemedyFileResultsWriter);
				outputRemedyFileResultsWriter.close();
			} catch (IOException e) {
				 System.out.println(e);
			}
																									}
		
		
}