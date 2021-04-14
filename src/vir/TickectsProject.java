/**
 * 
 */
package vir;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;


/**
 * @author Virgilio
 *
 */
public class TickectsProject {

	
	public void getMonthlyOccurences(String pathLogGit, String pathFileTickes) throws IOException {
		int lung;
		int i=0;
		String lineFileLogGit;
		String[] mesi={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		int[] count= {0,0,0,0,0,0,0,0,0,0,0,0};
		
		FileReader fr=new FileReader(pathLogGit);
		BufferedReader br=new BufferedReader(fr);
		
		Path path= Paths.get(pathFileTickes);		
		List<String> linesTicketsFile =Files.readAllLines(path);
		lung=linesTicketsFile.size();
		
		
		try {
			 while( (lineFileLogGit=br.readLine() ) !=null ) {
				
				 
				if(lineFileLogGit.startsWith("Date") ) {
					
					for(i=0;i<12;i++) {
						if(lineFileLogGit.contains( mesi[i] )) {
							
						   break;	
						}
						
					}//for
										
				}//if
				
							
					if(lineFileLogGit.contains("STDCXX-") ) {
						
						for(int j=0;j<lung;j++) {
							if(lineFileLogGit.contains( linesTicketsFile.get(j) )) {
							   count[i]=count[i]+1;	
							   break;
							}
					    }//for
						
				    }//if
					
				
				
	          }//while
		}//try
		
		finally {
			br.close();	
				
		}
		
	Logger.getLogger("myLogger").info(Arrays.toString(count));
	
	
	}//fine metodo
}
