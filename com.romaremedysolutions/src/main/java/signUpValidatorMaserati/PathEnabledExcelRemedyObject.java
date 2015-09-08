package signUpValidatorMaserati;

import java.io.File;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PathEnabledExcelRemedyObject {


	protected Workbook metaDataWorkbookRemedy;
	protected Sheet metaDataSheetRemedy;
	
	
	public PathEnabledExcelRemedyObject (String workbookpath, int testing_DataSheetNumber) {

	
//		Workbook remedyMetadataExcelWorkBook = WorkbookFactory.create(new File("C:\\Users\\Remedy\\Desktop\\Dropbox\\RemedyWorkspace\\RemedyMetadata\\RemedySignUpViperMetadataOLD.xlsx"));
//		Workbook remedyMetadataExcelWorkBook = WorkbookFactory.create(new File("RemedyMetadata/RemedySignUpMetadata.xlsx"));
			try {
//				metaDataWorkbookRemedy = WorkbookFactory.create(new File("RemedyMetadata/RemedySignUpMetadata.xlsx"));
				metaDataWorkbookRemedy = WorkbookFactory.create(new File(workbookpath));
				metaDataSheetRemedy = metaDataWorkbookRemedy.getSheetAt(1);				
				
			} catch (Exception ex) {
				System.out.println("An Exception occured - when trying to load MetaData Excel file! RR:("  + ex);
			}
			
	}
	
		public PathEnabledExcelRemedyObject(String chocolatos) {
			String babmiii = chocolatos;
			
			System.out.println(babmiii);

	}
	
}