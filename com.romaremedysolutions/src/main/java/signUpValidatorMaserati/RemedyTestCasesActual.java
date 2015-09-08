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
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemedyTestCasesActual extends RemedySignUpCommonMethodsAndVarriables
{
	
	
	
// This is a Chain of responsibility pattern
	  public static Hashtable<String, String> remedyTestCases (int remedyTestCaseIterator) {
		  
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
		    				foo(remedyTestCaseIterator, homeidftitlePageFactory, RemedySignUpCommonMethodsAndVarriables.driver) 
		    				.getText());
		    		break;
		    	
		    		
		    	case 3:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(homeidquotesPageFactory.isDisplayed()));
		    		remedyHighlightAndScreenshotTestedElement(remedyTestCaseIterator, homeidquotesPageFactory, driver);
		    		break;
			    	
		    		
		    	case 4:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(homeidfnamePageFactory.isDisplayed() && 
		    				homeidlnamePageFactory.isDisplayed() && 
		    				homeidemailPageFactory.isDisplayed() && 
		    				homeidphonePageFactory.isDisplayed()));
		    		break;
		    		
		    		
		    	case 5:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(homeidgradio01PageFactory.isDisplayed() && 
		    				homeidgradio02PageFactory.isDisplayed()));
		    		break;
			    	
		    		
		    	case 6:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(homeidstatePageFactory.isDisplayed()));
		    		break;
			    	
		    		
		    	case 7:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(homeidcheckboxPageFactory.isDisplayed()));
		    		break;
			    	
		    		
		    	case 8:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(homeidimgfacebookPageFactory.isDisplayed() && 
		    				homeidimgtwitterPageFactory.isDisplayed() && 
		    				homeidimgflickrPageFactory.isDisplayed() && 
		    				homeidimgyoutubePageFactory.isDisplayed()));

		    		remedyHighlightAndScreenshotTestedElement(remedyTestCaseIterator, homeidimgfacebookPageFactory, driver);
		    		remedyHighlightAndScreenshotTestedElement(remedyTestCaseIterator, homeidimgtwitterPageFactory, driver);
		    		remedyHighlightAndScreenshotTestedElement(remedyTestCaseIterator, homeidimgflickrPageFactory, driver);
		    		remedyHighlightAndScreenshotTestedElement(remedyTestCaseIterator, homeidimgyoutubePageFactory, driver);
		    		break;
			    	
		    		
		    	case 9:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(homeidresetbuttonPageFactory.isDisplayed() && 
		    				homeidsubmitbuttonPageFactory.isDisplayed()));
		    		break;
			    	
		    		
		    	case 10:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(hometimestampPageFactory.isDisplayed() && 
		    				hometimestampPageFactory.getText().equals(DateFormatUtils.format(new Date(), "MMMM d, yyyy"))));
		    				
//		    				&& (RemedyRegexInterface.remedyRegexDateValidator(hometimestampPageFactory.getText())));
		    		break;
			    	
		    		
		    	case 11:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(homecopyrightPageFactory.getText()));
		    		break;
			    	
		    		
		    	case 12:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(homeosbrowserPageFactory.isDisplayed()));
		    		break;
			    	
		    		
		    	case 13:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(homeidcurrentlocationPageFactory.isDisplayed()));
		    		break;
			    	
		    		
		    	case 14:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(homexpathCurrentWeatherDynamicIconPageFactory.isDisplayed()));
		    		break;
			    	
		    		
		    	case 15:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(homeidtemperaturePageFactory.getText()));
		    		break;
			    	
		    		
		    	case 16:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseExpected", homeidquotesPageFactory.getText());
		    				ArrayList<String> allTabs = new ArrayList<String>(driver.getWindowHandles());
		    				driverSecondaryBrowser.navigate().to(propRemedy.getProperty("url"));
		    				new WebDriverWait(driverSecondaryBrowser, 10L).until(ExpectedConditions.presenceOfElementLocated(By.id("id_quotes")));
		    				sbRemedyTestCaseHelper.append(driverSecondaryBrowser.findElement(By.id("id_quotes")).getText());
		    				driverSecondaryBrowser.close();
		    				driver.switchTo().window((String)allTabs.get(0));
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(sbRemedyTestCaseHelper.toString()));
		    		break;
			    	
		    		
		    	case 17:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(homeidtemperaturePageFactory.getText()));
		    		break;
			    	
		    		
		    	case 24:
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(homeidcurrentlocationPageFactory.getText()));
		    		break;
			    	
		    		
		    	case 26:;
		    			Capabilities cap1 = ((RemoteWebDriver)driver).getCapabilities();
		    			String browserNameFormatted1 = 
		    			Character.toString(cap1.getBrowserName().charAt(0)).toUpperCase() + 
		    			cap1.getBrowserName().substring(1);
		    			sbRemedyTestCaseHelper.append(System.getProperty("os.name"))
		    			.append(" & ").append(browserNameFormatted1).append(" ").append(cap1.getVersion().toString());
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseExpected", sbRemedyTestCaseHelper.toString());
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(homeosbrowserPageFactory.getText()));
		    		break;
			    	
		    		
		    	case 27:
		    			Abstract_SignUpPage.remedyFillInFields(propRemedy);
		    		    homeidresetbuttonPageFactory.click();
		    		remedyHashTableTestCasesActual.put("hashKeyTestCaseActual", String.valueOf(homeidfnamePageFactory.getAttribute("value").isEmpty() && 
		    				homeidlnamePageFactory.getAttribute("value").isEmpty() && 
		    				homeidemailPageFactory.getAttribute("value").isEmpty() && 
		    				homeidphonePageFactory.getAttribute("value").isEmpty()));
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
