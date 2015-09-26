package signUpValidatorMaserati;
/**
 * @author Roma Remedy
 * Last Modified Jun01/15
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Properties;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemedyTestCasesActual //extends RemedySignUpCommonMethodsAndVarriables
{
	
	
	
// This is a Chain of responsibility pattern
	  public static Hashtable<String, String> remedyTestCases (int remedyTestCaseIterator, WebDriver driver) {
		  
		  

//		  BettaValidatorHomePage actualbeBettaVzalidatorHomePage = PageFactory.initElements(driver, BettaValidatorHomePage.class);
		  PageObjectModel_HomePageFactoryElementsSep18 atualGammaValidatorHomePage = PageFactory.initElements(driver, PageObjectModel_HomePageFactoryElementsSep18.class);
		  
		  final Properties propRemedy = new Properties();
		    try
		    {
		      propRemedy.load(new FileInputStream("RemedySignUp.properties"));
		    }
		    catch (IOException ex)
		    {
		      ex.printStackTrace();
		    }
		    
		    Hashtable<String, String> remedyHashTableTestCasesActual = new Hashtable<String, String>();
		    try
		    {
		    	
		    	switch (remedyTestCaseIterator)
		    	{
		    	
		    	
		    	case 1:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", driver.getTitle());
		    		break;
		    	
		    		
		    	case 2:
//		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", homeidftitlePageFactory.getText());
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual",
		    				RemedySignUpCommonMethodsAndVarriables.foo(remedyTestCaseIterator, atualGammaValidatorHomePage.homeidftitlePageFactory, RemedySignUpCommonMethodsAndVarriables.driver) 
		    				.getText());
		    		break;
		    	
		    		
		    	case 3:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(atualGammaValidatorHomePage.homeidquotesPageFactory.isDisplayed()));
		    		RemedySignUpCommonMethodsAndVarriables.remedyHighlightAndScreenshotTestedElement(remedyTestCaseIterator, atualGammaValidatorHomePage.homeidquotesPageFactory, driver);
		    		
		    		System.out.println(driver.findElement(By.id("id_quotes")).getText());
		    		
		    		
		    		break;
			    	
		    		
		    	case 4:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(atualGammaValidatorHomePage.homeidfnamePageFactory.isDisplayed() && 
		    				atualGammaValidatorHomePage.homeidlnamePageFactory.isDisplayed() && 
		    				atualGammaValidatorHomePage.homeidemailPageFactory.isDisplayed() && 
		    				atualGammaValidatorHomePage.homeidphonePageFactory.isDisplayed()));
		    		break;
		    		
		    		
		    	case 5:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(atualGammaValidatorHomePage.homeidgradio01PageFactory.isDisplayed() && 
		    				atualGammaValidatorHomePage.homeidgradio02PageFactory.isDisplayed()));
		    		break;
			    	
		    		
		    	case 6:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(atualGammaValidatorHomePage.homeidstatePageFactory.isDisplayed()));
		    		break;
			    	
		    		
		    	case 7:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(atualGammaValidatorHomePage.homeidcheckboxPageFactory.isDisplayed()));
		    		break;
			    	
		    		
		    	case 8:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(atualGammaValidatorHomePage.homeidimgfacebookPageFactory.isDisplayed() && 
		    				atualGammaValidatorHomePage.homeidimgtwitterPageFactory.isDisplayed() && 
		    				atualGammaValidatorHomePage.homeidimgflickrPageFactory.isDisplayed() && 
		    				atualGammaValidatorHomePage.homeidimgyoutubePageFactory.isDisplayed()));

		    		RemedySignUpCommonMethodsAndVarriables.remedyHighlightAndScreenshotTestedElement(remedyTestCaseIterator, atualGammaValidatorHomePage.homeidimgfacebookPageFactory, driver);
		    		RemedySignUpCommonMethodsAndVarriables.remedyHighlightAndScreenshotTestedElement(remedyTestCaseIterator, atualGammaValidatorHomePage.homeidimgtwitterPageFactory, driver);
		    		RemedySignUpCommonMethodsAndVarriables.remedyHighlightAndScreenshotTestedElement(remedyTestCaseIterator, atualGammaValidatorHomePage.homeidimgflickrPageFactory, driver);
		    		RemedySignUpCommonMethodsAndVarriables.remedyHighlightAndScreenshotTestedElement(remedyTestCaseIterator, atualGammaValidatorHomePage.homeidimgyoutubePageFactory, driver);
		    		break;
			    	
		    		
		    	case 9:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(atualGammaValidatorHomePage.homeidresetbuttonPageFactory.isDisplayed() && 
		    				atualGammaValidatorHomePage.homeidsubmitbuttonPageFactory.isDisplayed()));
		    		break;
			    	
		    		
		    	case 10:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(atualGammaValidatorHomePage.hometimestampPageFactory.isDisplayed() && 
		    				atualGammaValidatorHomePage.hometimestampPageFactory.getText().equals(DateFormatUtils.format(new Date(), "MMMM d, yyyy"))));
		    				
//		    				&& (RemedyRegexInterface.remedyRegexDateValidator(hometimestampPageFactory.getText())));
		    		break;
			    	
		    		
		    	case 11:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(atualGammaValidatorHomePage.homecopyrightPageFactory.getText()));
		    		break;
			    	
		    		
		    	case 12:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(atualGammaValidatorHomePage.homeosbrowserPageFactory.isDisplayed()));
		    		break;
			    	
		    		
		    	case 13:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(atualGammaValidatorHomePage.homeidcurrentlocationPageFactory.isDisplayed()));
		    		break;
			    	
		    		
		    	case 14:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(atualGammaValidatorHomePage.homexpathCurrentWeatherDynamicIconPageFactory.isDisplayed()));
		    		break;
			    	
		    		
		    	case 15:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(atualGammaValidatorHomePage.homeidtemperaturePageFactory.getText()));
		    		break;
			    	
//		    		
		    	case 16:
//		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseExpected", atualGammaValidatorHomePage.homeidquotesPageFactory.getText());
//		    				ArrayList<String> allTabs = new ArrayList<String>(driver.getWindowHandles());
//		    				driver.switchTo().window((String)allTabs.get(0));
//		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(sbRemedyTestCaseHelper.toString()));
		    		break;
			    	
		    		
		    	case 17:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(atualGammaValidatorHomePage.homeidtemperaturePageFactory.getText()));
		    		break;
			    	
		    		
		    	case 24:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(atualGammaValidatorHomePage.homeidcurrentlocationPageFactory.getText()));
		    		break;
			    	
		    		
		    	case 26:;
		    			Capabilities cap1 = ((RemoteWebDriver)driver).getCapabilities();
		    			String browserNameFormatted1 = 
		    			Character.toString(cap1.getBrowserName().charAt(0)).toUpperCase() + 
		    			cap1.getBrowserName().substring(1);
		    		RemedySignUpCommonMethodsAndVarriables.sbRemedyTestCaseHelper.append(System.getProperty("os.name"))
		    			.append(" & ").append(browserNameFormatted1).append(" ").append(cap1.getVersion().toString());
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseExpected", RemedySignUpCommonMethodsAndVarriables.sbRemedyTestCaseHelper.toString());
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(atualGammaValidatorHomePage.homeosbrowserPageFactory.getText()));
		    		break;
			    	
		    		
		    	case 27:
		    			atualGammaValidatorHomePage.homeidresetbuttonPageFactory.click();
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(atualGammaValidatorHomePage.homeidfnamePageFactory.getAttribute("value").isEmpty() && 
		    				atualGammaValidatorHomePage.homeidlnamePageFactory.getAttribute("value").isEmpty() && 
		    				atualGammaValidatorHomePage.homeidemailPageFactory.getAttribute("value").isEmpty() && 
		    				atualGammaValidatorHomePage.homeidphonePageFactory.getAttribute("value").isEmpty()));
		    		break;
		    		
		    		
		    		
		    		
			    	default:
		    			remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", "Unassigned test case id");
						break;
			    	}
				    
				} catch (Exception e) {
					System.out.println("An Exception below occured RR \t\t\r\n" + e);
				}
		    
		    
			// nice approach: return (blablabla) ? 42 : 97; // this returnis 42 if blabla is 1 and, 97 if bla is 2
			return remedyHashTableTestCasesActual;
	  }
}
