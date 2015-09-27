package signUpValidatorMaserati;
/**
 * @author Roma Remedy
 * Last Modified Jun01/15
 */

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

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

import remedyEmailSender.RemedySimpleGmailEmailMessageSender;



public class RemedySignUpCommonMethodsAndVarriablesSEP15Backup
{
	
  // Declares the Object driver that will have the properties of our tested web site RR
  // The Object driver will also be used as a base for pre-loading "PageFactory" Elements. RR
  public static WebDriver driver = new FirefoxDriver();   
  // Declares the Object driverSecondaryBrowser for test cases involving browser navigation and comparison
  // Secondary reason for driverSecondaryBrowser is to maintain PageFactory references if the main driver navigates
  protected static WebDriver driverSecondaryBrowser = new FirefoxDriver();
  
  
  
  protected static int exitStatusFailedTestsCounter;
  protected static long remedyTestDurationTimer = System.currentTimeMillis();
  
  
  
  
  
  @FindBy(id="id_f_title")
  @CacheLookup
  protected static WebElement homeidftitlePageFactory;
//  @FindBy(id="id_quotes")
//  @CacheLookup
//  protected static WebElement homeidquotesPageFactory;
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
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    
  
  protected static void remedyExitSequance(int SignUpValidator, String summaryEmailPassword) throws IOException
  {
 
	
	  String scriptExecutionSummary = ("\r\n\r\n\r\n\r\n\t User:\t\t Roma Remedy"
			  + "\r\n\t Myemail:\t RemedyRoma@gmail.com"
			  + "\r\n\t Cellphone:\t 650 731 2873"
			  + "\r\n\r\n\r\n\t Script executed successfully!!"
			  + "\r\n\t Test Script Duration:\t\t " + (System.currentTimeMillis() - remedyTestDurationTimer)
			  + "\r\n\t Failed Test Cases:\t\t " + exitStatusFailedTestsCounter
			  + "\r\n\t Test Date:\t\t "+ new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date())
			  + "\r\n\t Output file:\t\t remedyLoggerNEWAGEAlpha.txt"
			  + "\r\n\r\n\r\n\t Os:\t\t\t " + System.getProperty("os.name") 
			  + "\r\n\t Jave Version:\t\t JaveSE-1.8"
			  + "\r\n\t Script name:\t\t RemedySignUpViper"
			  + "\r\n\t Regression Testing for  www.RomaRemedySolutions.com"
			  + "\r\n\t (: Thank you for trying Roma RemedySignUpViper - Have a nice day RR :)");
	  
	  
	  
	  RemedySimpleGmailEmailMessageSender.remedyEmailSenderMethod(summaryEmailPassword, scriptExecutionSummary);
//	  BetaRemedySimpleGmailEmailMessageSenderSep10.remedyEmailSenderMethod(summaryEmailPassword, scriptExecutionSummary);
	  
	  
	  driver.quit();

	  FantasticTrippleRemedyLogger actualFantasticTrippleRemeyLogger = new FantasticTrippleRemedyLogger(); // fantastic logger sep07RR
	  actualFantasticTrippleRemeyLogger.remedyLoggerExitSeuance(scriptExecutionSummary);					// fantastic logger sep07 RR
	  
	  
    
    
    

    // Below Process p opens remedyTestResultsFolder directory in windows and file selects the RemedyLogger.txt RR-- need an option for mac
    Process p = new ProcessBuilder("explorer.exe", "/select,remedyTestResults\\remedyLoggerNEWAGEAlpha.txt").start();
    // ProcessBuilder pb launches the remedyLoggerNEWAGEAlpha.TXT log file for review. RR
    ProcessBuilder pb = new ProcessBuilder("Notepad.exe", new File("RemedyTestResults/remedyLoggerNEWAGEAlpha.txt").getPath());
    pb.start();
    
    
    
    
    
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

  
  // below code should print three times the html string of the element Sep10 RR
  System.out.println(((JavascriptExecutor) driver).executeScript("return arguments[0].innerHTML", element));
  System.out.println(((JavascriptExecutor) driver).executeScript("return arguments[0].innerHTML", element));
  System.out.println(((JavascriptExecutor) driver).executeScript("return arguments[0].innerHTML", element));
  // below code will save pic screen with the inner html string in the element Sep10 RR
  FileUtils.copyFile(scrFile222, new File("RemedyTestResults/RemedyScreenshots/screenshot"
  + ((JavascriptExecutor) driver).executeScript("return arguments[0].innerHTML", element) + ".png"));

  
  
  romaTestJS.executeScript("arguments[0].style.backgroundColor = '"+originalBackgroundColor+"'",  element);
  

  return element;
}
  
  
  
  
  
  
  
  

}
