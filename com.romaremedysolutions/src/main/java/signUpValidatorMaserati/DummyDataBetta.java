package signUpValidatorMaserati;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DummyDataBetta {

	@FindBy(id="id_quotes")
	  @CacheLookup
	  protected static WebElement homeidquotesPageFactory;
	
	public static void main(String[] args) {
		

		// Declares the Object driver that will have the properties of our tested web site RR
		// The Object driver will also be used as a base for pre-loading "PageFactory" Elements. RR
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://learn2test.net/qa/apps/sign_up/v1/");
		System.out.println("DummyDataBetta turned on about t call AlphaRemedyPageFactryObject");
		
		PageFactory.initElements(driver, DummyDataBetta.class); // PageFactory Initialization Sep13RR
		
		
		
		   System.out.println(driver.findElement(By.id("id_quotes")).getText());
		    System.out.println(String.valueOf(homeidquotesPageFactory.getText()));
		  System.out.println(String.valueOf(homeidquotesPageFactory.getText()));
		  System.out.println(String.valueOf(homeidquotesPageFactory.getText()));
		
//		AlphaRemedyPageFactoryObject scout = new AlphaRemedyPageFactoryObject();
		
		
//		System.out.println(homeidquotesPageFactory.getText());
		  
		  
		  
//		    Date d = new Date();
//		    SimpleDateFormat form = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
		    System.out.println(new SimpleDateFormat("MMMdd__HHmm").format(new Date()));
		    System.out.println(new SimpleDateFormat("MMMdd__HHmm").format(new Date()));
		    System.out.println(new SimpleDateFormat("MMMdd__HHmm").format(new Date()));
//		    String str = form.format(d); // or if you want to save it in String str
//		    System.out.println(str); // and print after that
		
		driver.close();
	}

}
