package signUpValidatorMaserati;

import java.io.File;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRemedyObjectOLDDELETEMESEP07 {


	protected Workbook metaDataWorkbookRemedy;
	protected Sheet metaDataSheetRemedy;
	
	
	public ExcelRemedyObjectOLDDELETEMESEP07() {
	

	
//		Workbook remedyMetadataExcelWorkBook = WorkbookFactory.create(new File("C:\\Users\\Remedy\\Desktop\\Dropbox\\RemedyWorkspace\\RemedyMetadata\\RemedySignUpViperMetadataOLD.xlsx"));
//		Workbook remedyMetadataExcelWorkBook = WorkbookFactory.create(new File("RemedyMetadata/RemedySignUpMetadata.xlsx"));
			try {
				metaDataWorkbookRemedy = WorkbookFactory.create(new File("RemedyMetadata/RemedySignUpMetadata.xlsx"));
				metaDataSheetRemedy = metaDataWorkbookRemedy.getSheetAt(1);				
				
			} catch (Exception ex) {
				System.out.println("An Exception occured - when trying to load MetaData Excel file! RR:("  + ex);
			}
			
	}
	
}
