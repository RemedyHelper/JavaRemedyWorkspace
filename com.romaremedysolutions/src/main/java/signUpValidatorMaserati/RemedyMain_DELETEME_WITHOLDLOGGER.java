package signUpValidatorMaserati;
/**
 * @author Roma Remedy
 * Last Modified Jun01/15
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Scanner;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import remedyEmailSender.RemedySimpleGmailEmailMessageSender;






// The main Executioner of the RemedySignUpValidator Viper - this is the ignition and steering wheel of the program
public class RemedyMain_DELETEME_WITHOLDLOGGER 
  extends RemedySignUpCommonMethodsAndVarriables
//  implements RemedyRegexInterfacer
{
	 
	
	
//
//@FindBy(id="id_f_title")
//@CacheLookup
//protected static WebElement homeidftitlePageFactory;




	//the following is for junit
	public static String zoom = "ok";
	


public static void main(final String[] signUpValidator)
    throws SecurityException, IOException // RemedyLogger Exceptions for Opening file or Permissions RR
  {
		
	  
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
    
    
  
    
    
    
    // Bellow is the password requirement that will ask for the email password for the email that will be used
    // to send the results of the script operation RR Aug18 
    Scanner scanner = new Scanner(System.in);
    
	System.out.println("Hi please enter your name for the \"Test Casese Report\". RR");
	final String testCasesReportUser = scanner.nextLine();
	System.out.println("if you want a separate email to be sent as report enter it now, otherwise press enter for an email to be sent t \"default\". RR");
	final String testCasesReportEmail = scanner.nextLine();
    //if statement that validates email with a regex function
	System.out.println("For security reasons the password for the Test Case Report email is not hardcoded. "
			+ "please enter the password for email to continue. RR");
	final String testCasesReportEmailPassword = scanner.nextLine();
	
	
	
	
    /**
     * @author Roma Remedy
     * Executes the remedyStartSequences methods that loads all necessary 
     */
    remedyStartSequence(propRemedy);
    

//    //below we are trying to load excel with the newly created ExcelRemedyObject SEP05 RR
//       ExcelRemedyObject actualExcelRemedyObject = new ExcelRemedyObject();
//       Workbook remedyMetadataExcelWorkBook = actualExcelRemedyObject.metaDataWorkbookRemedy;
//       Sheet remedyMetadataExcelReaderSheet = actualExcelRemedyObject.metaDataSheetRemedy;


 
    
 //below we are trying to load excel with the newly created ExcelRemedyObject SEP07 RR
    String mmmmetaDataWorkBookPath = "RemedyMetadata/RemedySignUpMetadata.xlsx";
    int ttttesting_DataSheetPositionInWorkbook = 1;
    ExcelRemedyObject actualEvolutionazedPathEnabledExcelRemedyObject = new ExcelRemedyObject(mmmmetaDataWorkBookPath, ttttesting_DataSheetPositionInWorkbook);
    Workbook remedyMetadataExcelWorkBook = actualEvolutionazedPathEnabledExcelRemedyObject.metaDataWorkbookRemedy;
    Sheet remedyMetadataExcelReaderSheet = actualEvolutionazedPathEnabledExcelRemedyObject.metaDataSheetRemedy;
    
		int remedyExpectedResultsColumnNumberFromWB = 5-1;
		
		
		
		
		
		//Bellow I will load the New FantasticTrippleRemedyLogger Sep07 RR
		FantasticTrippleRemedyLogger actualFantasticTrippleRemedyLogger = new FantasticTrippleRemedyLogger();
		
		
    
    
	    // I initiate remedyTestCaseIterator at 1 because there is no test case 0, the first one is TC-1
	    for (int remedyTestCaseIterator = 1; remedyTestCaseIterator < remedyMetadataExcelReaderSheet.getLastRowNum()+1; remedyTestCaseIterator++) {
	    	
	    	try //this try catch activates if element is not present RR SEP05 
	        {
	    	
	    	// Loading the test cases actual results using HashTable instead of HashMap to keep it Synchronized
	    	final Hashtable<String, String> remedyMainTestCasesHashMap = RemedyTestCasesActual.remedyTestCases(remedyTestCaseIterator);
			
	    	// xlsx workbook adding of result RR (2 - 4)
	    	Sheet remedyExcelResultsSheet = remedyMetadataExcelWorkBook.getSheetAt(1);
	    	Row remedyExcelResultsRow = remedyExcelResultsSheet.getRow(remedyTestCaseIterator);
	    	    
	    	
	    	
	    	
	    	
	    		// Tests weather the test Passed or Failed RR Jul06
	    	    if (remedyMetadataExcelReaderSheet.getRow(remedyTestCaseIterator).getCell(remedyExpectedResultsColumnNumberFromWB)
	    	    		.getStringCellValue().toString().equals(remedyMainTestCasesHashMap.get("hashKeyTestCaseActual").toString()))
	    	    {
	    	    	remedyExcelResultsRow.createCell(1-1).setCellValue("Passed");
//	    	    	remedyLoggerPassed(remedyTestCaseIterator);
	    	    	actualFantasticTrippleRemedyLogger.remedyLoggerPassed(remedyTestCaseIterator); //FANTASTICREMEDY LOGGER TEST (1 - 3)
	    	    	
	    	    	
	    	    }
	    	    else
	    	    {
	    	    	remedyExcelResultsRow.createCell(1-1).setCellValue("Failed");
//	    	    	remedyLoggerFailed(remedyTestCaseIterator);
	    	    	exitStatusFailedTestsCounter += 1;
	    	    	actualFantasticTrippleRemedyLogger.remedyLoggerFailed(remedyTestCaseIterator);//FANTASTICREMEDY LOGGER TEST (2 - 3)
	    	    }
	    	    
	    	    remedyExcelResultsRow.createCell(7-1).setCellValue(remedyMainTestCasesHashMap.get("hashKeyTestCaseActual").toString());
            }
	    	catch (Exception e)
	        {
//	    		remedyExceptionHandler(remedyTestCaseIterator, e);
	    		exitStatusFailedTestsCounter += 1;
	    		actualFantasticTrippleRemedyLogger.remedyExceptionHandler(remedyTestCaseIterator, e); //FANTASTICTREMEDERY LOGGER TEST (3-3
	    		
	        }
	    }
    
    
    
    
    
    
    
    
	    new ExcelRemedyObject(actualEvolutionazedPathEnabledExcelRemedyObject.metaDataWorkbookRemedy); 
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
    remedyExitSequance(signUpValidator.length, testCasesReportEmailPassword);
    
    
    int lengthOfSignUpValidator = signUpValidator.length;
    if (lengthOfSignUpValidator == 0) {
        System.exit(exitStatusFailedTestsCounter);
      } else {
    	  actualFantasticTrippleRemedyLogger.remedyLoggerExitSequanceWarning();
    
      }


  }


}

