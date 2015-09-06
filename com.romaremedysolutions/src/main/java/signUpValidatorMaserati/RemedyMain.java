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

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import remedyEmailSender.RemedySimpleGmailEmailMessageSender;






// The main Executioner of the RemedySignUpValidator Viper - this is the ignition and steering wheel of the program
public class RemedyMain 
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
    
    

 
 
 
 
 
   
 	// Initialization of the workbook xlsx RR (1 - 4)
	try {
//		Workbook remedyExcelMetadataWB = WorkbookFactory.create(new File("C:\\Users\\Roma Remedy\\Dropbox\\RemedyWorkspace\\RemedyMetadata\\RemedySignUpViperMetadata.xlsx"));
		Workbook remedyMetadataExcelWorkBook = WorkbookFactory.create(new File("RemedyMetadata/RemedySignUpMetadata.xlsx"));
		Sheet remedyMetadataExcelReaderSheet = remedyMetadataExcelWorkBook.getSheetAt(1);
		
//		workbook.createSheet("Java Class Info");this command allows to create a sheet name RR
		
		int remedyExpectedResultsColumnNumberFromWB = 5-1;
		
		
		
		Sheet remedyExcelWebElementsSheet = remedyMetadataExcelWorkBook.getSheetAt(2);
		  
		System.out.println("hellooooo " + remedyExcelWebElementsSheet.getRow(3-1).getCell(2-1).getStringCellValue());
		driver.findElement(By.id(remedyExcelWebElementsSheet.getRow(3-1).getCell(2-1).getStringCellValue())).sendKeys(propRemedy.getProperty("username"));
    
    
	    // I initiate remedyTestCaseIterator at 1 because there is no test case 0, the first one is TC-1
	    for (int remedyTestCaseIterator = 1; remedyTestCaseIterator < remedyMetadataExcelReaderSheet.getLastRowNum()+1; remedyTestCaseIterator++) {
	    	try
	        {
	    	
	    	// Loading the test cases actual results using HashTable instead of HashMap to keep it Synchronized
	    	final Hashtable<String, String> remedyMainTestCasesHashMap = RemedyTestCasesActual.remedyTestCases(remedyTestCaseIterator);
			
	    	// xlsx workbook adding of result RR (2 - 4)
	    	Sheet remedyExcelResultsSheet = remedyMetadataExcelWorkBook.getSheetAt(1);
	    	Row remedyExcelResultsRow = remedyExcelResultsSheet.getRow(remedyTestCaseIterator);
	    	    
	    	
	    	
	    	
	    	
	    		// Tests weather the test Passed or Failed RR Jul06
	    	    if (remedyMetadataExcelReaderSheet.getRow(remedyTestCaseIterator).getCell(remedyExpectedResultsColumnNumberFromWB).getStringCellValue()
	    	    		.toString().equals(remedyMainTestCasesHashMap.get("hashKeyTestCaseActual").toString()))
	    	    {
	    	    	remedyExcelResultsRow.createCell(1-1).setCellValue("Passed");
	    	    	remedyLoggerPassed(remedyTestCaseIterator);
	    	    }
	    	    else
	    	    {
	    	    	remedyExcelResultsRow.createCell(1-1).setCellValue("Failed");
	    	    	remedyLoggerFailed(remedyTestCaseIterator);
	    	    }
	    	    
	    	    remedyExcelResultsRow.createCell(7-1).setCellValue(remedyMainTestCasesHashMap.get("hashKeyTestCaseActual").toString());
            }
	    	catch (Exception e)
	        {
	    		remedyExceptionHandler(remedyTestCaseIterator, e);
	        }
	    }
    
    
    
    
    
    
    
    
    	
    
    // output of xlsx sequance workbook RR (3 - 4)
	    FileOutputStream out = new FileOutputStream("RemedyTestResults/RemedyExcelResults.xlsx");
	    remedyMetadataExcelWorkBook.write(out);
	    out.close();
//	} catch (InvalidFormatException e) { ---------------------- Can Probably Delete RR
//		System.out.println("couldnt read wb"); ---------------------- Can Probably Delete RR
//		e.printStackTrace();     ---------------------- Can Probably Delete RR
	  } catch (Exception ex) {
	      REMEDYLOGGER.warning("An Exception occured - when trying to load MetaData Excel file! RR:("  + ex);
	  } // finish of xlsx sequence RR (4 - 4)
   	
 
 
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
  }
}



// I want the following:
// when script gets updated to git
// it goes through maven
// it eithers becomes an executable or gets auto attached with a batch file
// it is then downloaded to the drop box and auto executes on desktop
// and it gets also ready to be executed on android