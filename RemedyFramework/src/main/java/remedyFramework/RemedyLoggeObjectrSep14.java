package remedyFramework;

import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;



public class RemedyLoggeObjectrSep14 {

	
	static Logger REMEDYLOGGER = Logger.getLogger(RemedyLoggeObjectrSep14.class.getName());
	FileHandler remedyLoggerTextFileAttributes;
	
	
	
public RemedyLoggeObjectrSep14() {
		
		

	    // Configures Logger to be saved locally via text file RemedyLogger.txt 				(1 - 4) RR
	    REMEDYLOGGER.setLevel(Level.ALL);
	    // RemedyLogger output text file will be formated for readability 						(2 - 4) RR
	    try {
			remedyLoggerTextFileAttributes = new FileHandler("RemedyTestResults/REMEDYLOGGERFantastic.txt");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    // Predetermines how the data will be formated in the Logger for ease of reading 		(3 - 4) RR
	    remedyLoggerTextFileAttributes.setFormatter(new SimpleFormatter());
	    // Configures the handling of the RemedyLogger text file combining name and attributes	(4 - 4) RR
	    REMEDYLOGGER.addHandler(remedyLoggerTextFileAttributes);
		
		
	}

	
	
	
	
	
	protected void remedyLoggerPassed(int remedyTestCaseIterator)
	{
	REMEDYLOGGER.config("\r\n\r\n\t Test Case ID: \t \t" + remedyTestCaseIterator + "\t - Passed" + "\r\n\r\n");
	      }

	
	protected void remedyLoggerFailed(int remedyTestCaseIterator)
  	{
	REMEDYLOGGER.warning("\r\n\r\n\t Test Case ID: \t \t" + remedyTestCaseIterator + "\t - FAILED" + "\r\n\r\n");
	      Toolkit.getDefaultToolkit().beep();
	      }
	
	
	protected void remedyLoggerExitSeuance(String scriptExecutionSummary)
	{
		REMEDYLOGGER.config(scriptExecutionSummary);
	      }

	
	protected void remedyLoggerExitSequanceWarning()
	{
		   REMEDYLOGGER.warning("Yes Arguments!");
	      }

	

	  protected void remedyExceptionHandler(int remedyTestCaseIterator, Exception e)
	  {
	    REMEDYLOGGER.warning(
	      "\r\n\t Test Case Number: \t\t" + remedyTestCaseIterator + "\t" + 
	      "- Caused an EXCEPTIION - Check Element precense and validity \r\n" 
	    		  + "It is also possible that the corresponding Cell in Excel is empty or invalid" + "\r\n\t"
	    		  + e + "\r\n\t");
	    Toolkit.getDefaultToolkit().beep();
	  }
	
	
}
