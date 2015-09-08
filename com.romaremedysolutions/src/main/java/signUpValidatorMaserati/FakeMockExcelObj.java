package signUpValidatorMaserati;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FakeMockExcelObj {
	
	protected String shinningSheet;
//	private int r;
	

//	public String getShinningSheet() {
//		return shinningSheet;
//	}
//
//
//	public void setShinningSheet(String shinningSheet) {
//		this.shinningSheet = shinningSheet;
//	}


	public FakeMockExcelObj () {
	

	

			try {
				Workbook remedyMetadataExcelWorkBookdeleteme = WorkbookFactory.create(new File("RemedyMetadata/RemedySignUpMetadata.xlsx"));
				Sheet remedyExcelWebElementsSheet = remedyMetadataExcelWorkBookdeleteme.getSheetAt(2);
				System.out.println("hellooooo " + remedyExcelWebElementsSheet.getRow(3-1).getCell(2-1).getStringCellValue());
				shinningSheet = "1231232131231" + remedyExcelWebElementsSheet.getRow(3-1).getCell(2-1).getStringCellValue();
//				setShinningSheet("1231232131231"); // + remedyExcelWebElementsSheet.getRow(3-1).getCell(2-1).getStringCellValue();
			} catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}
	
}
