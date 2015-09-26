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

import remedyEmailSender.RemedySimpleGmailEmailMessageSender;



public class RemedySignUpCommonMethodsAndVarriables
{
	
  // Declares the Object driver that will have the properties of our tested web site RR
  // The Object driver will also be used as a base for pre-loading "PageFactory" Elements. RR
  public static WebDriver driver = new FirefoxDriver();   
  
  
  
  protected static int exitStatusFailedTestsCounter;
  protected static long remedyTestDurationTimer = System.currentTimeMillis();
  
  
  
  protected static StringBuilder sbRemedyTestCaseHelper = new StringBuilder(256);
  
  
  
  
  
  
  protected static void remedyStartSequence(Properties propRemedy)
    throws SecurityException, IOException
  {
	  
	  
    
    
    
    
    driver.manage().window().setPosition(new Point(0, 0));
    driver.manage().window().setSize(new Dimension(800, 600));
    driver.navigate().to(propRemedy.getProperty("url"));
//    driver.navigate().to("C:\\Users\\Roma Remedy\\Desktop\\On to Bigger and Better\\SeignUpWebsite\\Welcome to Sign Up v1.htm");
    
    
//    driver.get("C:\\Users\\Roma Remedy\\Desktop\\On to Bigger and Better\\SeignUpWebsite\\Welcome to Sign Up v1.htm");


    
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
			  + "\r\n\t Output file:\t\t REMEDYLOGGER.txt"
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
    Process p = new ProcessBuilder("explorer.exe", "/select,remedyTestResults\\REMEDYLOGGER.txt").start();
    // ProcessBuilder pb launches the REMEDYLOGGER.TXT log file for review. RR
    ProcessBuilder pb = new ProcessBuilder("Notepad.exe", new File("RemedyTestResults/REMEDYLOGGER.txt").getPath());
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
