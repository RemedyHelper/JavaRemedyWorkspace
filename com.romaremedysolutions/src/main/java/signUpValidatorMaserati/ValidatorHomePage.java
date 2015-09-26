package signUpValidatorMaserati;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
 
public class ValidatorHomePage {
 
    WebDriver driver;
 
//    By homePageUserName = By.xpath("//table//tr[@class='heading3']");
 
    @FindBy(id="id_quotes")
	@CacheLookup
	WebElement homeidquotesPageFactory;
     
 
//    public ValidatorHomePage(WebDriver driver){
//    	this.driver = driver;
// 
//    }
     //Get the User name from Home Page
    public String gethomeidquotesPageFactory(){
    	System.out.println("\r\n getHomePgeDashBoredUserName - Activated RR \n\r");
    	System.out.println(homeidquotesPageFactory.getText());
    	return    homeidquotesPageFactory.getText(); //works sep13RR
       	

    }
    
}