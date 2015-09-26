package signUpValidatorMaserati;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class DummyData {

	
	
	public static void main(String[] args) {

		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://learn2test.net/qa/apps/sign_up/v1/");
		PageFactory.initElements(driver, AlphaRemedyPageFactoryObject.class); // PageFactory Initialization Sep13RR
//		System.out.println(String.valueOf(homeidftitlePageFactory.getText()));
		
		
		
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
	    ExcelRemedyObjectOldthisisbeforesep14version actualExcelRemedyObject = new ExcelRemedyObjectOldthisisbeforesep14version(metaDataWorkBookPath, ttttesting_DataSheetPositionInWorkbook);
//	    EvolutionazedPathEnabledExcelRemedyObject chocolatezzz = new EvolutionazedPathEnabledExcelRemedyObject(mmmmetaDataWorkBookPath, ttttesting_DataSheetPositionInWorkbook);
	    new ExcelRemedyObjectOldthisisbeforesep14version(actualExcelRemedyObject.metaDataWorkbookRemedy);
	    
	    
	    
	    
	    
	    
	    
	    
	    FantasticTrippleRemedyLogger actualFantasticTrippleRemedyLogger = new FantasticTrippleRemedyLogger();
	    int remedytestcaseiteratorpassing = 200;
	    int remedytestcaseiteratorfailing = 9229933;
	    actualFantasticTrippleRemedyLogger.remedyLoggerPassed(remedytestcaseiteratorpassing);
	    actualFantasticTrippleRemedyLogger.remedyLoggerFailed(remedytestcaseiteratorfailing);
	    
	    
	    System.out.println("im here! :)");
	    

	    
	    
	    class pizeria {
	    int cheese = 8;
	    
	    public  pizeria (int cheese) {
	    	System.out.println(cheese);
	    	int Mushroom = this.cheese;
	    	cheese = cheese+1;
	    	int pepperoni = 221;
	    	this.cheese = pepperoni;
	    	System.out.println(cheese);
	    	System.out.println(pepperoni);
	    	System.out.println(this.cheese);
	    	System.out.println(cheese);
	    	System.out.println(Mushroom);
	    	return;
	    }
	    }
	    
	    pizeria pizzaCheff = new pizeria(333);
	    System.out.println(pizzaCheff.cheese);	    
	    
	    
	    }
	    
	public Object[][] flightToIbiza() {
		System.out.println("IbizaIslandArrivedByFlightMethod :D RR");
	    Object ibizaIsland[][] = new Object[][] {
	    		{"beachAndSunshine", "beachAndSunshine"}, {"Magic", "Madness"}};
	    return ibizaIsland;

	}
	
	
	}


