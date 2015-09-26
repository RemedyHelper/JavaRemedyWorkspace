package remedyFramework;

/**
 * By Roma Remedy RR SEP18
 * HelpmeRemedy@gmail.com
 * 
 * Information about Class:
 * 
 * This class is used to Cache the Elements for the HomePage of the learn2test.net signup website
 * The Elements are Cached in a PageFactory style which leads to
 * a much faster test execution than if the elements were searched for individually
 * 
 * 
 * In order to initialize the Element we must call this class with Init Element command below:
 * 		  ValidotorHomePageFactoryElementsSep18 actualValidotorHomePageFactoryElementsSep18 = PageFactory.initElements(driver, ValidotorHomePageFactoryElementsSep18.class);
 * 
 *
 * Requires dependence=y
 *    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>2.47.1</version>
    </dependency>  
 *
 *
 *
 * 
 *
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


 
public class PageObjectModel_HomePageFactoryElementsSep18 {
 
    WebDriver driver;
 
    
    @FindBy(id="id_f_title")
    @CacheLookup
    WebElement homeidftitlePageFactory;
    @FindBy(id="id_quotes")
    @CacheLookup
    WebElement homeidquotesPageFactory;
    @FindBy(id="id_fname")
    @CacheLookup
    WebElement homeidfnamePageFactory;
    @FindBy(id="id_lname")
    @CacheLookup
    WebElement homeidlnamePageFactory;
    @FindBy(id="id_email")
    @CacheLookup
    WebElement homeidemailPageFactory;
    @FindBy(id="id_phone")
    @CacheLookup
    WebElement homeidphonePageFactory;
    @FindBy(id="id_g_radio_01")
    @CacheLookup
    WebElement homeidgradio01PageFactory;
    @FindBy(id="id_g_radio_02")
    @CacheLookup
    protected  WebElement homeidgradio02PageFactory;
    @FindBy(id="id_state")
    @CacheLookup
    protected  WebElement homeidstatePageFactory;
    @FindBy(id="id_checkbox")
    @CacheLookup
    protected  WebElement homeidcheckboxPageFactory;
    @FindBy(id="id_img_facebook")
    @CacheLookup
    protected  WebElement homeidimgfacebookPageFactory;
    @FindBy(id="id_img_twitter")
    @CacheLookup
    protected  WebElement homeidimgtwitterPageFactory;
    @FindBy(id="id_img_flickr")
    @CacheLookup
    protected  WebElement homeidimgflickrPageFactory;
    @FindBy(id="id_img_youtube")
    @CacheLookup
    protected  WebElement homeidimgyoutubePageFactory;
    @FindBy(id="id_reset_button")
    @CacheLookup
    protected  WebElement homeidresetbuttonPageFactory;
    @FindBy(id="id_submit_button")
    @CacheLookup
    protected  WebElement homeidsubmitbuttonPageFactory;
    @FindBy(id="timestamp")
    @CacheLookup
    protected  WebElement hometimestampPageFactory;
    @FindBy(id="copyright")
    @CacheLookup
    protected  WebElement homecopyrightPageFactory;
    @FindBy(id="os_browser")
    @CacheLookup
    protected  WebElement homeosbrowserPageFactory;
    @FindBy(id="id_current_location")
    @CacheLookup
    protected  WebElement homeidcurrentlocationPageFactory;
    @FindBy(id="id_temperature")
    @CacheLookup
    protected  WebElement homeidtemperaturePageFactory;
    @FindBy(xpath="/html/body/form/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[1]/td[5]/table/tbody/tr[2]/td[1]/img")
    @CacheLookup
    protected  WebElement homexpathCurrentWeatherDynamicIconPageFactory;
        
 
    public PageObjectModel_HomePageFactoryElementsSep18(WebDriver driver){
    	this.driver = driver;
 
   
    
    	
    	
    }
    	   
}