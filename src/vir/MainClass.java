/**
 * 
 */
package vir;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @author Virgilio
 *
 */
public class MainClass {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		TickectsProject tp=new TickectsProject();
		
		Properties property=new Properties();
		try(FileReader fr = new FileReader("config")){		
			property.load(fr);
		}	
		
		String pathLogGit=property.getProperty("pathLogGit");
		String pathFileTickes=property.getProperty("pathFileTickes");
		
		tp.getMonthlyOccurences(pathLogGit, pathFileTickes );
		
        Logger.getLogger("MyLogger").info("fine");
        
	}

}
