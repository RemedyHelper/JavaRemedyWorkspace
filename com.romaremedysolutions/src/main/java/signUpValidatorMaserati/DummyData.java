package signUpValidatorMaserati;

import java.nio.file.Path;

import org.apache.poi.ss.usermodel.Workbook;

public class DummyData {

	public static void main(String[] args) {

   
		
		
	    FakeMockExcelObj actualFakeMockExcelObj = new FakeMockExcelObj();
	    System.out.println(actualFakeMockExcelObj.shinningSheet);
	    
	    

//	    ExcelRemedyObject actualExcelRemedyObject = new ExcelRemedyObject();
//	    System.out.println(actualExcelRemedyObject.metaDataSheetRemedy.getRow(1).getCell(1).getStringCellValue());
	    
	    
//	    String metaDataWorkBookPath = "RemedyMetadata/RemedySignUpMetadata.xlsx";
//	    int testing_DataSheetPositionInWorkbook = 1;
//	    PathEnabledExcelRemedyObject actualPathEnabledExcelRemedyObject = new PathEnabledExcelRemedyObject(metaDataWorkBookPath, testing_DataSheetPositionInWorkbook);
//	    System.out.println(actualPathEnabledExcelRemedyObject.metaDataSheetRemedy.getRow(3).getCell(1).getStringCellValue());
//	
	    
	    String metaDataWorkBookPath = "RemedyMetadata/RemedySignUpMetadata.xlsx";
	    int ttttesting_DataSheetPositionInWorkbook = 1;
	    ExcelRemedyObject actualExcelRemedyObject = new ExcelRemedyObject(metaDataWorkBookPath, ttttesting_DataSheetPositionInWorkbook);
//	    EvolutionazedPathEnabledExcelRemedyObject chocolatezzz = new EvolutionazedPathEnabledExcelRemedyObject(mmmmetaDataWorkBookPath, ttttesting_DataSheetPositionInWorkbook);
	    new ExcelRemedyObject(actualExcelRemedyObject.metaDataWorkbookRemedy);
	    
	    
	    
	    
	    
	    
	    
	    
	    FantasticTrippleRemedyLogger actualFantasticTrippleRemedyLogger = new FantasticTrippleRemedyLogger();
	    int remedytestcaseiteratorpassing = 200;
	    int remedytestcaseiteratorfailing = 9229933;
	    actualFantasticTrippleRemedyLogger.remedyLoggerPassed(remedytestcaseiteratorpassing);
	    actualFantasticTrippleRemedyLogger.remedyLoggerFailed(remedytestcaseiteratorfailing);
	    
	    
	    
	}

}
