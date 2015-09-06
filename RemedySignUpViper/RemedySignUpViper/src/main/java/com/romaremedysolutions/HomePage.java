package com.romaremedysolutions;

import java.io.File;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage  {

	
	  @FindBy(id="id_f_title")
	  @CacheLookup
	  protected static WebElement homeidftitlePageFactory;
	
//	 public HomePage(int banana) {
	  
	  

	 public HomePage(Sheet remedyExcelWebElementsSheet) {
		 
		 
		 		 
		 
		 
	 }


	
	 
	

	 
	 
	 
	
	 String uber = ("hello");
	 //remedyExcelWebElementsSheet.getRow(3-1).getCell(2-1).getStringCellValue());
	
	
	
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
	
	
	
	
	
	
	
}
