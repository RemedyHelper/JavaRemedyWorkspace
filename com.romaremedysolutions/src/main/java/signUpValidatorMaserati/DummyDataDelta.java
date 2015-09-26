package signUpValidatorMaserati;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class DummyDataDelta {//extends BettaRemedyPageFactoryObject {

//	@FindBy(id="id_quotes")
//	  @CacheLookup
//	  protected static WebElement homeidquotesPageFactory;
	
	public static void main(String[] args) {
		

		// Declares the Object driver that will have the properties of our tested web site RR
		// The Object driver will also be used as a base for pre-loading "PageFactory" Elements. RR
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://learn2test.net/qa/apps/sign_up/v1/");
		System.out.println("DummyDataBetta turned on about t call AlphaRemedyPageFactryObject");
		
		

		  
		  
		ValidatorHomePage actualyValidatorHomePageObject = PageFactory.initElements(driver, ValidatorHomePage.class); // PageFactory Initialization Sep13RR
//		System.out.println(String.valueOf(actualyValidatorHomePageObject.homeidquotesPageFactory).toString()); // --> This returns:
//		   				// [[FirefoxDriver: firefox on WINDOWS (69dbab10-5726-4769-9ce7-5daefb9786e5)] -> id: id_quotes]
		   

		  
		String quoteFromValidatorHomePageObject = actualyValidatorHomePageObject.gethomeidquotesPageFactory(); 	 // --> This doesnt do anything
		System.out.println(quoteFromValidatorHomePageObject);
		System.out.println(quoteFromValidatorHomePageObject);
		System.out.println(quoteFromValidatorHomePageObject);
		  
		
		
		
		
		
		
		BettaValidatorHomePage actualbeBettaValidatorHomePage = PageFactory.initElements(driver, BettaValidatorHomePage.class);
		
		System.out.println(actualbeBettaValidatorHomePage.homecopyrightPageFactory.getText());
		
		
		
		
		
		
		// below works in initializing the excel object and printing the correct value indicated by row and cell SEP15 RR
		////////////////////////////////////////////////////////////////////////////////////////////////////////
//		/below we load excel with the newly created ExcelRemedyObject SEP07 RR (Works Sep15 RR)
	    String pathOfMetadaExcelFile = "RemedyMetadata/RemedySignUpMetadata.xlsx";
	    RemedyExcelObject actualExcelRemedyObject = new RemedyExcelObject(pathOfMetadaExcelFile);
	    Sheet sheetzzzz = actualExcelRemedyObject.metaDataWorkbookRemedy.getSheet("Testing_Data");

	    
			int remedyExpectedResultsColumnNumberFromWB = 5-1;
	  	
    	System.out.println(sheetzzzz.getRow(3).getCell(remedyExpectedResultsColumnNumberFromWB)
		.getStringCellValue().toString());
    	System.out.println(sheetzzzz.getRow(2).getCell(remedyExpectedResultsColumnNumberFromWB)
    			.getStringCellValue().toString());
    	System.out.println(sheetzzzz.getRow(2).getCell(remedyExpectedResultsColumnNumberFromWB)
    			.getStringCellValue().toString());
		/////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
		
		
		driver.close();
		
		
		
		
	}

}
