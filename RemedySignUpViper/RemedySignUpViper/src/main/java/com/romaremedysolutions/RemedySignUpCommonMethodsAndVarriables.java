package com.romaremedysolutions;
/**
 * @author Roma Remedy
 * Last Modified Jun01/15
 */

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class RemedySignUpCommonMethodsAndVarriables
{
	
  // Declares the Object driver that will have the properties of our tested web site RR
  // The Object driver will also be used as a base for pre-loading "PageFactory" Elements. RR
  public static WebDriver driver = new FirefoxDriver();   
  // Declares the Object driverSecondaryBrowser for test cases involving browser navigation and comparison
  // Secondary reason for driverSecondaryBrowser is to maintain PageFactory references if the main driver navigates
  protected static WebDriver driverSecondaryBrowser = new FirefoxDriver();
  
  
  protected static final Logger REMEDYLOGGER = Logger.getLogger(RemedySignUpCommonMethodsAndVarriables.class.getName());
  protected static FileHandler remedyLoggerTextFileAttributes;
  protected static int exitStatusFailedTestsCounter;
  protected static long remedyTestDurationTimer = System.currentTimeMillis();
  
  
  
  
  
  @FindBy(id="id_f_title")
  @CacheLookup
  protected static WebElement homeidftitlePageFactory;
  @FindBy(id="id_quotes")
  @CacheLookup
  protected static WebElement homeidquotesPageFactory;
  @FindBy(id="id_fname")
  @CacheLookup
  protected static WebElement homeidfnamePageFactory;
  @FindBy(id="id_lname")
  @CacheLookup
  protected static WebElement homeidlnamePageFactory;
  @FindBy(id="id_email")
  @CacheLookup
  protected static WebElement homeidemailPageFactory;
  @FindBy(id="id_phone")
  @CacheLookup
  protected static WebElement homeidphonePageFactory;
  @FindBy(id="id_g_radio_01")
  @CacheLookup
  protected static WebElement homeidgradio01PageFactory;
  @FindBy(id="id_g_radio_02")
  @CacheLookup
  protected static WebElement homeidgradio02PageFactory;
  @FindBy(id="id_state")
  @CacheLookup
  protected static WebElement homeidstatePageFactory;
  @FindBy(id="id_checkbox")
  @CacheLookup
  protected static WebElement homeidcheckboxPageFactory;
  @FindBy(id="id_img_facebook")
  @CacheLookup
  protected static WebElement homeidimgfacebookPageFactory;
  @FindBy(id="id_img_twitter")
  @CacheLookup
  protected static WebElement homeidimgtwitterPageFactory;
  @FindBy(id="id_img_flickr")
  @CacheLookup
  protected static WebElement homeidimgflickrPageFactory;
  @FindBy(id="id_img_youtube")
  @CacheLookup
  protected static WebElement homeidimgyoutubePageFactory;
  @FindBy(id="id_reset_button")
  @CacheLookup
  protected static WebElement homeidresetbuttonPageFactory;
  @FindBy(id="id_submit_button")
  @CacheLookup
  protected static WebElement homeidsubmitbuttonPageFactory;
  @FindBy(id="timestamp")
  @CacheLookup
  protected static WebElement hometimestampPageFactory;
  @FindBy(id="copyright")
  @CacheLookup
  protected static WebElement homecopyrightPageFactory;
  @FindBy(id="os_browser")
  @CacheLookup
  protected static WebElement homeosbrowserPageFactory;
  @FindBy(id="id_current_location")
  @CacheLookup
  protected static WebElement homeidcurrentlocationPageFactory;
  @FindBy(id="id_temperature")
  @CacheLookup
  protected static WebElement homeidtemperaturePageFactory;
  @FindBy(xpath="/html/body/form/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[1]/td[5]/table/tbody/tr[2]/td[1]/img")
  @CacheLookup
  protected static WebElement homexpathCurrentWeatherDynamicIconPageFactory;
  
  
  
  protected static StringBuilder sbRemedyTestCaseHelper = new StringBuilder(256);
  
  
  
  
  
  
  protected static void remedyStartSequence(Properties propRemedy)
    throws SecurityException, IOException
  {
	  
	  
    PageFactory.initElements(driver, RemedyMain.class); // PAGEFACTORY RR	
    
    
    // Configures Logger to be saved locally via text file RemedyLogger.txt 				(1 - 4) RR
    REMEDYLOGGER.setLevel(Level.ALL);
    // RemedyLogger output text file will be formated for readability 						(2 - 4) RR
    remedyLoggerTextFileAttributes = new FileHandler("RemedyTestResults/REMEDYLOGGER.txt");
    // Predetermines how the data will be formated in the Logger for ease of reading 		(3 - 4) RR
    remedyLoggerTextFileAttributes.setFormatter(new SimpleFormatter());
    // Configures the handling of the RemedyLogger text file combining name and attributes	(4 - 4) RR
    REMEDYLOGGER.addHandler(remedyLoggerTextFileAttributes);
    
    
    driver.manage().window().setPosition(new Point(0, 0));
    driver.manage().window().setSize(new Dimension(800, 600));
    driverSecondaryBrowser.manage().window().setPosition(new Point(800, 0));
    driverSecondaryBrowser.manage().window().setSize(new Dimension(800, 600));
    driver.navigate().to(propRemedy.getProperty("url"));
//    driver.navigate().to("C:\\Users\\Roma Remedy\\Desktop\\On to Bigger and Better\\SeignUpWebsite\\Welcome to Sign Up v1.htm");
    driverSecondaryBrowser.navigate().to(propRemedy.getProperty("url"));
    
    
//    driver.get("C:\\Users\\Roma Remedy\\Desktop\\On to Bigger and Better\\SeignUpWebsite\\Welcome to Sign Up v1.htm");
//    driverSecondaryBrowser.get(propRemedy.getProperty("url"));
//    driverSecondaryBrowser.get("C:\\Users\\Roma Remedy\\Desktop\\On to Bigger and Better\\SeignUpWebsite\\Welcome to Sign Up v1.htm");


    
    // ChromeDriver for cross compatibility testing RR
	System.setProperty("webdriver.chrome.driver", "RemedyMetadata/Webdriver Essentials/chromedriver.exe" );  
    WebDriver driverchromi = new ChromeDriver();
    driverchromi.navigate().to(propRemedy.getProperty("url"));
  	String driverosatitlechrommi = driverchromi.getTitle();
    System.out.println(driverosatitlechrommi);	
    driverchromi.quit();   
    
    
  }
  
  
  protected static int remedyExceptionHandler(int remedyTestCaseIterator, Exception remedyActual)
  {
    REMEDYLOGGER.warning(
      "\r\n\t Test Case Number: \t\t" + remedyTestCaseIterator + "\t" + 
      "- Caused an EXCEPTIION - Check Element precense and validity \r\n" + "\r\n\t");
    Toolkit.getDefaultToolkit().beep();
    return ++exitStatusFailedTestsCounter;
  }
  
  
  
  
  
  	
  
	protected static void remedyLoggerPassed(int remedyTestCaseIterator)
	{
	REMEDYLOGGER.config("\r\n\r\n\t Test Case ID: \t \t" + remedyTestCaseIterator + "\t - Passed" + "\r\n\r\n");
	      }


  	protected static int remedyLoggerFailed(int remedyTestCaseIterator)
  	{
	REMEDYLOGGER.warning("\r\n\r\n\t Test Case ID: \t \t" + remedyTestCaseIterator + "\t - FAILED" + "\r\n\r\n");
	      Toolkit.getDefaultToolkit().beep();
	      exitStatusFailedTestsCounter += 1;
	      return exitStatusFailedTestsCounter;
	      }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  protected static void remedyExitSequance(int SignUpValidator) throws IOException
  {
 
	  
	  
	  
    driver.quit();


    REMEDYLOGGER.config("\r\n\r\n\r\n\r\n\t User:\t\t Roma Remedy"
      + "\r\n\t Myemail:\t RemedyRoma@gmail.com"
	  + "\r\n\t Cellphone:\t 650 731 2873"
      + "\r\n\r\n\r\n\t Script executed successfully!!"
      + "\r\n\t Test Script Duration:\t\t " + (System.currentTimeMillis() - remedyTestDurationTimer)
      + "\r\n\t Failed Test Cases:\t\t " + exitStatusFailedTestsCounter
      + "\r\n\t Test Date:\t\t "+ new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date())
      + "\r\n\t Output file:\t\t REMEDYLOGGER.txt"
      + "\r\n\r\n\r\n\t Os:\t\t\t " + System.getProperty("os.name") 
      + "\r\n\t Jave Version:\t\t JaveSE-1.8"
      + "\r\n\t Script name:\t\t RemedySignUpViper"
      + "\r\n\t Regression Testing for  www.RomaRemedySolutions.com"
      + "\r\n\t (: Thank you for trying Roma RemedySignUpViper - Have a nice day RR :)");
    

    // Below Process p opens remedyTestResultsFolder directory in windows and file selects the RemedyLogger.txt RR-- need an option for mac
    Process p = new ProcessBuilder("explorer.exe", "/select,remedyTestResults\\REMEDYLOGGER.txt").start();
    // ProcessBuilder pb launches the REMEDYLOGGER.TXT log file for review. RR
    ProcessBuilder pb = new ProcessBuilder("Notepad.exe", new File("RemedyTestResults/REMEDYLOGGER.txt").getPath());
    pb.start();
    
    if (SignUpValidator == 0) {
      System.exit(exitStatusFailedTestsCounter);
    } else {
      REMEDYLOGGER.warning("Yes Arguments!");
    }
  }
  
  
  
  /**
   * remedyHighlighter highlights on screen the element that is tested RR
 * @throws IOException 
   */	
  public static void remedyHighlightAndScreenshotTestedElement(final int remedyTestCaseIterator, final WebElement element, final WebDriver driver) throws IOException {
      final String originalBackgroundColor  = element.getCssValue("backgroundColor");
      final JavascriptExecutor romaTestJS = ((JavascriptExecutor) driver); // java script
      romaTestJS.executeScript("arguments[0].style.backgroundColor = 'rgb(0,200,0)'",  element);
	  
      // Below takes picture
      // I should have a isFileIOallowed variable that is off by default that detects can i save a file
	  File scrFile222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  // Now you can do whatever you need to do with it, for example copy somewhere
	  FileUtils.copyFile(scrFile222, new File("RemedyTestResults/RemedyScreenshots/screenshot" + remedyTestCaseIterator + ".png"));
      try {
		Thread.sleep(50);
	} catch (InterruptedException e) {
	}
      romaTestJS.executeScript("arguments[0].style.backgroundColor = '"+originalBackgroundColor+"'",  element);
  }

  
  
  public static WebElement foo(final int remedyTestCaseIterator, final WebElement element, final WebDriver driver) throws IOException {

	  
	  
  final String originalBackgroundColor  = element.getCssValue("backgroundColor");
  final JavascriptExecutor romaTestJS = ((JavascriptExecutor) driver); // java script
  romaTestJS.executeScript("arguments[0].style.backgroundColor = 'rgb(0,200,0)'",  element);
  
  // Below takes picture
  // I should have a isFileIOallowed variable that is off by default that detects can i save a file
  File scrFile222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  // Now you can do whatever you need to do with it, for example copy somewhere
  FileUtils.copyFile(scrFile222, new File("RemedyTestResults/RemedyScreenshots/screenshot" + remedyTestCaseIterator + ".png"));
//  try {
//	Thread.sleep(50);
////	
//} catch (InterruptedException e) {
//}
  romaTestJS.executeScript("arguments[0].style.backgroundColor = '"+originalBackgroundColor+"'",  element);
  

  return element;
}
  
  
  
  
  
  
  
  

}
