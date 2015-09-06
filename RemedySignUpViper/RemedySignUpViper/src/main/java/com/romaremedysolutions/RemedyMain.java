package com.romaremedysolutions;
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

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;






// The main Executioner of the RemedySignUpValidator Viper - this is the ignition and steering wheel of the program
public class RemedyMain 
  extends RemedySignUpCommonMethodsAndVarriables
//  implements RemedyRegexInterfacer
{
	 
	
	
//
//@FindBy(id="id_f_title")
//@CacheLookup
//protected static WebElement homeidftitlePageFactory;


	

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
    
    
    
    
    
    
    /**
     * @author Roma Remedy
     * Executes the remedyStartSequences methods that loads all necessary 
     */
    remedyStartSequence(propRemedy);
    
    

 
 
 
 
 
   
 	// Initialization of the workbook xlsx RR (1 - 4)
	try {
//		Workbook remedyExcelMetadataWB = WorkbookFactory.create(new File("C:\\Users\\Roma Remedy\\Dropbox\\RemedyWorkspace\\RemedyMetadata\\RemedySignUpViperMetadata.xlsx"));
		Workbook remedyExcelMetadataWB = WorkbookFactory.create(new File("RemedyMetadata/RemedySignUpViperMetadata.xlsx"));
		Sheet remedyExcelMetaDataReaderSheet = remedyExcelMetadataWB.getSheetAt(1);
		
//		workbook.createSheet("Java Class Info");this command allows to create a sheet name RR
		
		int remedyExpectedResultsColumnNumberFromWB = 5-1;
		
		
		
		Sheet remedyExcelWebElementsSheet = remedyExcelMetadataWB.getSheetAt(2);
		  
		System.out.println("hellooooo " + remedyExcelWebElementsSheet.getRow(3-1).getCell(2-1).getStringCellValue());
		driver.findElement(By.id(remedyExcelWebElementsSheet.getRow(3-1).getCell(2-1).getStringCellValue())).sendKeys(propRemedy.getProperty("username"));
    

//		HomePage homepageobject = new HomePage(1000);
		HomePage homepageobject = new HomePage(remedyExcelWebElementsSheet);
    
	    // I initiate remedyTestCaseIterator at 1 because there is no test case 0, the first one is TC-1
	    for (int remedyTestCaseIterator = 1; remedyTestCaseIterator < remedyExcelMetaDataReaderSheet.getLastRowNum()+1; remedyTestCaseIterator++) {
	    	try
	        {
	    	
	    	// Loading the test cases actual results using HashTable instead of HashMap to keep it Synchronized
	    	final Hashtable<String, String> remedyMainTestCasesHashMap = RemedyTestCasesActual.remedyTestCases(remedyTestCaseIterator);
			
	    	// xlsx workbook adding of result RR (2 - 4)
	    	Sheet remedyExcelResultsSheet = remedyExcelMetadataWB.getSheetAt(1);
	    	Row remedyExcelResultsRow = remedyExcelResultsSheet.getRow(remedyTestCaseIterator);
	    	    
	    	
	    	
	    	
	    	
	    		// Tests weather the test Passed or Failed RR Jul06
	    	    if (remedyExcelMetaDataReaderSheet.getRow(remedyTestCaseIterator).getCell(remedyExpectedResultsColumnNumberFromWB).getStringCellValue()
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
	    remedyExcelMetadataWB.write(out);
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
    remedyExitSequance(signUpValidator.length);
  }
}



// I want the following:
// when script gets updated to git
// it goes through maven
// it eithers becomes an executable or gets auto attached with a batch file
// it is then downloaded to the drop box and auto executes on desktop
// and it gets also ready to be executed on android