package signUpValidatorMaserati;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.thoughtworks.selenium.Wait;

public class DummyDataEpsilon {//extends BettaRemedyPageFactoryObject {

//	@FindBy(id="id_quotes")
//	  @CacheLookup
//	  protected static WebElement homeidquotesPageFactory;
	
	public static void main(String[] args) {
		
		if (args.length > 0 && args[0].equals("roma")){
			System.out.println("\r\nThis was ren with the word \"roma\" :D RR\r\n");
		} else {
			System.out.println("\r\nThere were either arguments used or not, but they were not equal to \"roma\" :/ RR \r\n");
		}
		
		
		
		
		
		
		
		
		
		
		

		// Smoke test newest Sep13 RR
		int smokeTestOnFeatureSwitch = 1;
		System.out.println(String.format("\r\n\t\tStarting Smoke test - the parameter is showing: %d", smokeTestOnFeatureSwitch));	
		if (smokeTestOnFeatureSwitch ==1) {
			
			String pathToRemedyMetadata = "RemedyMetadata/RemedySignUpMetadata.xlsx";
			if (new File(pathToRemedyMetadata).isFile()) {
				System.out.println(String.format("\r\n\t\tSmoke Test PASS - Metadata %s RemedySignUpMetada is present! :) RR \r\n", pathToRemedyMetadata));
			} else {
					System.exit(smokeTestOnFeatureSwitch);		
					}
			

			
			String urlll = "http://learn2test.net/qa/apps/sign_up/v1/";
			int timeout = 2000;
			
			   try {
			        HttpURLConnection connection = (HttpURLConnection) new URL(urlll).openConnection();
			        connection.setConnectTimeout(timeout);
			        connection.setReadTimeout(timeout);
			        connection.setRequestMethod("HEAD");
			        int responseCode = connection.getResponseCode();
			    } catch (IOException exception) {
			        System.out.println("\r\n\t\tSmoke Test Failed: " +urlll +" is not reachable."
			        		+ "check URL for correct spelling and internet connection or firewall presense:( RR\r\n");
			    }
			   System.out.println(String.format("\r\n\t\tSmoke Test Pass - Internet connection present and %s is reachable RR\r\n", urlll));

			
			
			
				//			
//			WebDriver actualHtmlUnitDriver = new HtmlUnitDriver(); // If I change this to firefoxdriver it works but
//			//     but as htmlunit driver it does not work :(
//			actualHtmlUnitDriver.navigate().to("http://learn2test.net/qa/apps/sign_up/v1/");
//			
//			// I tried to amke the program wait but this didnt help
//			
//			WebElement smokeTestCopyrightelement = actualHtmlUnitDriver.findElement(By.id("copyright"));
//			System.out.println(smokeTestCopyrightelement.getText());

			

			
			
			
			
//			actualHtmlUnitDriver.quit();
//			System.out.println("\r\n\t\t Smoke Test - Internet Connection and Sign_up website are reachable!! :) RR \r\n");
		
//			System.out.println("\r\n\t\t Smoke Test Completed Successfully!! RR \r\n");
		}
		
		
		
		
		
		
		
		
		
		
		
		
//
//		// Declares the Object driver that will have the properties of our tested web site RR
//		// The Object driver will also be used as a base for pre-loading "PageFactory" Elements. RR
//		WebDriver driver = new FirefoxDriver();
//		driver.navigate().to("http://learn2test.net/qa/apps/sign_up/v1/");
//		System.out.println("DummyDataBetta turned on about t call AlphaRemedyPageFactryObject");
//		
//		
//
//		  
//		  
//		ValidatorHomePage actualyValidatorHomePageObject = PageFactory.initElements(driver, ValidatorHomePage.class); // PageFactory Initialization Sep13RR
////		System.out.println(String.valueOf(actualyValidatorHomePageObject.homeidquotesPageFactory).toString()); // --> This returns:
////		   				// [[FirefoxDriver: firefox on WINDOWS (69dbab10-5726-4769-9ce7-5daefb9786e5)] -> id: id_quotes]
//		   
//
//		  
//		String quoteFromValidatorHomePageObject = actualyValidatorHomePageObject.gethomeidquotesPageFactory(); 	 // --> This doesnt do anything
//		System.out.println(quoteFromValidatorHomePageObject);
//		System.out.println(quoteFromValidatorHomePageObject);
//		System.out.println(quoteFromValidatorHomePageObject);
//		  
//		
//		
//		
//		
//		
//		
//		BettaValidatorHomePage actualbeBettaValidatorHomePage = PageFactory.initElements(driver, BettaValidatorHomePage.class);
//		
//		System.out.println(actualbeBettaValidatorHomePage.homecopyrightPageFactory.getText());
//		
//		
		
		
		
		
		// below works in initializing the excel object and printing the correct value indicated by row and cell SEP15 RR
		////////////////////////////////////////////////////////////////////////////////////////////////////////
//		/below we load excel with the newly created ExcelRemedyObject SEP07 RR (Works Sep15 RR)
	    String pathOfMetadaExcelFile = "RemedyMetadata/RemedySignUpMetadata.xlsx";
	    RemedyExcelObject actualExcelRemedyObject = new RemedyExcelObject(pathOfMetadaExcelFile);
	    Sheet sheetzzzz = actualExcelRemedyObject.metaDataWorkbookRemedy.getSheet("Testing_Data");

	    
			int remedyExpectedResultsColumnNumberFromWB = 5-1;

			String username = "lala";
			int age = 22;
			System.out.println(String.format("%s, your age is %d", username, age));

			
    	System.out.println(sheetzzzz.getRow(3).getCell(remedyExpectedResultsColumnNumberFromWB)
		.getStringCellValue().toString());
    	System.out.println(sheetzzzz.getRow(2).getCell(remedyExpectedResultsColumnNumberFromWB)
    			.getStringCellValue().toString());
    	System.out.println(sheetzzzz.getRow(2).getCell(remedyExpectedResultsColumnNumberFromWB)
    			.getStringCellValue().toString());
		/////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
		
		
//		driver.close();
		
    	
    	
    	
    	
    	abstract class MyabsClass 
    	{
    	  abstract String orderDescription();
    	}

    	
    	MyabsClass mac = new MyabsClass(){
            public String orderDescription()
            {
                   return "This is description";
            }
       };
       mac.orderDescription();
		
	}

}
