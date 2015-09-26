package signUpValidatorMaserati;

import org.omg.CORBA.OMGVMCID;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlphaRemedyPageFactoryObject {

	  // Declares the Object driver that will have the properties of our tested web site RR
	  // The Object driver will also be used as a base for pre-loading "PageFactory" Elements. RR
	  public static WebDriver driver = new FirefoxDriver();
	  
	  
	  
	  
	  @FindBy(id="id_f_title")
	  @CacheLookup
	  protected static WebElement homeidftitlePageFactory;
	  @FindBy(id="id_quotes")
	  @CacheLookup
	  protected WebElement homeidquotesPageFactory;
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
	  
	
	
	public AlphaRemedyPageFactoryObject () {
		
		
		System.out.println("\n\r\t AlphaRemedyPageFactoryObject has been constructed - Hello World!! R-)\r");		
//		driver.navigate().to("http://learn2test.net/qa/apps/sign_up/v1/");	
		
		// the comented line below makes reload the browser non stop (gets stuck endless cycle Sep13 RR
//		PageFactory.initElements(driver, AlphaRemedyPageFactoryObject.class); // PageFactory Initialization Sep13RR
//		PageFactory.initElements(driver, RemedyMain.class); // PageFactory Initialization Sep13RR
		
//		String breakfast = "omlet";
//		System.out.println(String.valueOf(homeidftitlePageFactory.getText()));
//		if (breakfast.equals(String.valueOf(homeidftitlePageFactory.getText()))) {
//			System.out.println("it equals!");
//		}
//		else {
//			System.out.println("breafast omlet does not equal to homeidftitlePageFactory :(");
//		}

	}

	
}
