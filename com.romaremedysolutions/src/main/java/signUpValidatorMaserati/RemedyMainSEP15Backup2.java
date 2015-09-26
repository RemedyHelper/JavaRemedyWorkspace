package signUpValidatorMaserati;
/**
 * @author Roma Remedy
 * Last Modified Jun01/15
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.romaremedysolutions.GamaRemedyFrameWorkJunit;






// The main Executioner of the RemedySignUpValidator Viper - this is the ignition and steering wheel of the program
public class RemedyMainSEP15Backup2 
  extends RemedySignUpCommonMethodsAndVarriables
//  implements RemedyRegexInterfacer
{
	 
	@FindBy(id="id_quotes")
	  @CacheLookup
	  protected static WebElement homeidquotesPageFactory;
	
	
	
	
	
	
//
//@FindBy(id="id_f_title")
//@CacheLookup
//protected static WebElement homeidftitlePageFactory;




public static void main(final String[] signUpValidator)
  {
	
	

//		
//	
//	
//	//Page Factory as a separate object? Sep13 RR
//	AlphaRemedyPageFactoryObject actualAlphaRemedyPageFactoryObject = new AlphaRemedyPageFactoryObject();
//	
//	
//	
////	System.out.println(String.valueOf(homeidftitlePageFactory.getText()));
//	
//	
//	
//
//	
//	// Smoke test newest Sep13 RR
//	int smokeTestOn = 1;
//	System.out.println("Starting Smoke test - the parameter is showing: " + smokeTestOn);	
//	if (smokeTestOn ==1) {
//		RemedySignUpCommonMethodsAndVarriables.driver.quit();
//		RemedySignUpCommonMethodsAndVarriables.driverSecondaryBrowser.quit();
//		System.exit(smokeTestOn);
//	}
	
	
	//Below is reading and loading of properties file into propRemedy and inputRemedy APR05 RR
    Properties propRemedy = new Properties(); //Properties file reader APR04 RR
    try
    {
      propRemedy.load(new FileInputStream("RemedySignUp.properties")); 
    }
    catch (IOException ex)
    {
      ex.printStackTrace();
    }
    // end of loading properties file APR05 RR
    
    
    
    
    
    
    // I need to re-arrange the start up sequance so that excel file gets loaded first,
    // if the excel file has an "RemedyAutorun" setting for it to auto execute it will auto run with default email
    // if the excel file has a "User mode" setting than it will prompt user for information
    
    
  
    
    
//    
//    // Bellow is the password requirement that will ask for the email password for the email that will be used
//    // to send the results of the script operation RR Aug18 
//    Scanner scanner = new Scanner(System.in);
//    
//	System.out.println("Hi please enter your name for the \"Test Casese Report\". RR");
//	final String testCasesReportUser = scanner.nextLine();
//	System.out.println("if you want a separate email to be sent as report enter it now, otherwise press enter for an email to be sent t \"default\". RR");
//	final String testCasesReportEmail = scanner.nextLine();
//    //if statement that validates email with a regex function
//	System.out.println("For security reasons the password for the Test Case Report email is not hardcoded. "
//			+ "please enter the password for email to continue. RR");
//	final String testCasesReportEmailPassword = scanner.nextLine();
//	
    String testCasesReportEmailPassword = "huhu";
	
	
	

    PageFactory.initElements(driver, RemedyMainSEP15Backup2.class); // PAGEFACTORY RR	sep14 RR
//    
	
    /**
     * @author Roma Remedy
     * Executes the remedyStartSequences methods that loads all necessary 
     */
    try {
		remedyStartSequence(propRemedy);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    
    
    System.out.println(driver.findElement(By.id("id_quotes")).getText());
    System.out.println(String.valueOf(homeidquotesPageFactory.getText()));
  System.out.println(String.valueOf(homeidquotesPageFactory.getText()));
  System.out.println(String.valueOf(homeidquotesPageFactory.getText()));
	
    
    
  
//  	Feature Switch to turn smoke test off or on SEP 15 RR
  		String featurSwitchSmokeTest = "off";
  		if (featurSwitchSmokeTest == "on") {
    //////////////////// Smoke test!
    driver.navigate().to(propRemedy.getProperty("url"));
    String expectedCopyrightForsmokeTest = "mock copyright - PLEASE UPDATE VALUE - SEP10 RR";
    WebElement actualCopyrightForSmokeTest = driver.findElement(By.id("copyright"));
    if (expectedCopyrightForsmokeTest.equals((actualCopyrightForSmokeTest).toString())) {
    	System.out.println("Smoke Test Pass!! :)))))))0");
    } else {
    	System.out.println("Smoke test failed!!! - program exiting now. SEP10 RR");
    	System.exit(0);
    	}
  											}
    
    
    
//    GammaValidatorHomePage atualGammaValidatorHomePage = new GammaValidatorHomePage(driver); Sep15 RR
  		
  		
  		
    
    
    
 
    
 //below we load excel with the newly created ExcelRemedyObject SEP07 RR (Works Sep15 RR)
    String metaDataWorkBookPath = "RemedyMetadata/RemedySignUpMetadata.xlsx";
    int testing_DataSheetPositionInWorkbook = 1;
    RemedyExcelObject__ actualExcelRemedyObject = new RemedyExcelObject__(metaDataWorkBookPath, testing_DataSheetPositionInWorkbook);
    Workbook remedyMetadataExcelWorkBook = actualExcelRemedyObject.metaDataWorkbookRemedy;
    Sheet remedyMetadataExcelReaderSheet = actualExcelRemedyObject.metaDataSheetRemedy;
    
		int remedyExpectedResultsColumnNumberFromWB = 5-1;
		
		
		
		
		
		//Bellow I will load the New FantasticTrippleRemedyLogger Sep07 RR
		FantasticTrippleRemedyLogger actualFantasticTrippleRemedyLogger = new FantasticTrippleRemedyLogger();
		
		
    
    
	    // I initiate remedyTestCaseIterator at 1 because there is no test case 0, the first one is TC-1
	    for (int remedyTestCaseIterator = 1; remedyTestCaseIterator < remedyMetadataExcelReaderSheet.getLastRowNum()+1; remedyTestCaseIterator++) {
	    	
	    	try //this try catch activates if element is not present RR SEP05 
	        {
	    	
	    	// Loading the test cases actual results using HashTable instead of HashMap to keep it Synchronized
	    	final Hashtable<String, String> remedyMainTestCasesHashMap = RemedyTestCasesActual.remedyTestCases(remedyTestCaseIterator, driver);
//	    	

	    	
	    	// xlsx workbook adding of result RR (2 - 4)
	    	Sheet remedyExcelResultsSheet = remedyMetadataExcelWorkBook.getSheetAt(1);
	    	Row remedyExcelResultsRow = remedyExcelResultsSheet.getRow(remedyTestCaseIterator);
	    	    
	    	
	    	
	    	
	    	
	    		// Tests weather the test Passed or Failed RR Jul06
	    	    if (remedyMetadataExcelReaderSheet.getRow(remedyTestCaseIterator).getCell(remedyExpectedResultsColumnNumberFromWB)
	    	    		.getStringCellValue().toString().equals(remedyMainTestCasesHashMap.get("hashKeyTestCaseActual").toString()))
	    	    {
	    	    	remedyExcelResultsRow.createCell(1-1).setCellValue("Passed");
	    	    	actualFantasticTrippleRemedyLogger.remedyLoggerPassed(remedyTestCaseIterator);
	    	    	
	    	    	
	    	    }
	    	    else
	    	    {
	    	    	remedyExcelResultsRow.createCell(1-1).setCellValue("Failed");
	    	    	exitStatusFailedTestsCounter += 1;
	    	    	actualFantasticTrippleRemedyLogger.remedyLoggerFailed(remedyTestCaseIterator);
	    	    }
	    	    
	    	    remedyExcelResultsRow.createCell(7-1).setCellValue(remedyMainTestCasesHashMap.get("hashKeyTestCaseActual").toString());
            }
	    	catch (Exception e)
	        {
	    		exitStatusFailedTestsCounter += 1;
	    		actualFantasticTrippleRemedyLogger.remedyExceptionHandler(remedyTestCaseIterator, e);
	    		
	        }
	    }
    
    
    
    

	    
    
    
    
	    new RemedyExcelObject__(actualExcelRemedyObject.metaDataWorkbookRemedy); 
//	// how to setzoom level in iexplorer before or when starting it Jul05
//    // code below successfully opens internet explorer RR Jun29
//	File filess = new File("RemedyMetadata/Webdriver Essentials/IEDriverServer.exe");
//    System.setProperty("webdriver.ie.driver", filess.getAbsolutePath() );  
//    WebDriver driverosa = new InternetExplorerDriver();
//    driverosa.navigate().to(propRemedy.getProperty("url"));
//  	String driverosatitle = driverosa.getTitle();
//    System.out.println(driverosatitle);
//	driverosa.quit();
	
    
    
    
    
    
    
    
    
    
    // I should use the strategy of using headlessbrowser for static elements (is displayed)
    // and use a regular driver for dynamic items or 
    // Research "Ternary Operators" to include in my code - in Ruby its "?:" (pg 29)
    // its basically using and if statement in one line

    
    //  for statement depending on the lengthy of excel column
    // for i = 1, excelcolumn.length, i++) {
    

    
  
    /**
     * @author Roma Remedy
     * 
     */
    try {
		remedyExitSequance(signUpValidator.length, testCasesReportEmailPassword);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    
    int lengthOfSignUpValidator = signUpValidator.length;
    if (lengthOfSignUpValidator == 0) {
        System.exit(exitStatusFailedTestsCounter);
      } else {
    	  actualFantasticTrippleRemedyLogger.remedyLoggerExitSequanceWarning();
    
      }


  }


}

