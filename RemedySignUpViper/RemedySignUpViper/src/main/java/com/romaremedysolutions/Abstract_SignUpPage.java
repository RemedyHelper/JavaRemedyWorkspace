package com.romaremedysolutions;
/**
 * @author Roma Remedy
 * Last Modified Jun01/15
 */

import java.util.Properties;

abstract class Abstract_SignUpPage
  extends RemedySignUpCommonMethodsAndVarriables
{
	
/**
 * method below specifies what to write in which fields	
 * @param propRemedy
 */
  public static void remedyFillInFields(final Properties propRemedy)
  {
    homeidfnamePageFactory.clear();
    homeidfnamePageFactory.sendKeys(new CharSequence[] { propRemedy.getProperty("fname") });
    homeidlnamePageFactory.clear();
    homeidlnamePageFactory.sendKeys(new CharSequence[] { propRemedy.getProperty("lname") });
    homeidemailPageFactory.clear();
    homeidemailPageFactory.sendKeys(new CharSequence[] { propRemedy.getProperty("email") });
    homeidphonePageFactory.clear();
    homeidphonePageFactory.sendKeys(new CharSequence[] { propRemedy.getProperty("phone") });
  }
  
}
