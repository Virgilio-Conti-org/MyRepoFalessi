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



/**
 * @author Virgilio
 *
 */
public class TickectsProject {

	
	public void getMonthlyOccurences(String pathLogGit, String pathFileTickes) throws IOException {
		int lung;
		int index=0;
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
					
					index=indexMonth(lineFileLogGit, mesi);
										
				}//if
				
							
					if(lineFileLogGit.contains("STDCXX-") ) {
						
						for(int j=0;j<lung;j++) {
							if(lineFileLogGit.contains( linesTicketsFile.get(j) )) {
							   count[index]=count[index]+1;	
							   break;
							}
					    }//for
						
				    }//if
					
				
				
	          }//while
		}//try
		
		finally {
			br.close();	
				
		}
		
	System.out.println(Arrays.toString(count));

	}//fine metodo
	
	
	//restituisce indice array pari al mese trovato nella stringa
	public int indexMonth(String strToAnalyze, String[] mesi) {
		int i;
		for(i=0;i<12;i++) {
			if(strToAnalyze.contains( mesi[i] )) {
				
			   break;	
			}
			
		}//for
		
		return i;
		
	}//fine metodo
	
	
}
