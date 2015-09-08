package signUpValidatorMaserati;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;



public class RemedyLogger_DELETEME {

	
	Logger REMEDYLOGGER = Logger.getLogger(RemedyLogger_DELETEME.class.getName());
	FileHandler remedyLoggerTextFileAttributes;
	
public RemedyLogger_DELETEME() {
		
		

	    // Configures Logger to be saved locally via text file RemedyLogger.txt 				(1 - 4) RR
	    REMEDYLOGGER.setLevel(Level.ALL);
	    // RemedyLogger output text file will be formated for readability 						(2 - 4) RR
	    try {
			remedyLoggerTextFileAttributes = new FileHandler("RemedyTestResults/REMEDYLOGGERrrrr.txt");
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
	
	
	
	
	public RemedyLogger_DELETEME(int remedyTestCaseIterator) {
		
		REMEDYLOGGER.config("\r\n\r\n\t Test Case ID: \t \t" + remedyTestCaseIterator + "\t - Passed" + "\r\n\r\n");
		
		
	}

}
