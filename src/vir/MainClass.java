/**
 * 
 */
package vir;

import java.io.IOException;
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
		String pathLogGit="D:\\Libri\\Università\\Falessi\\Repo\\RepoFalessi\\MyRepoFalessi\\LogGitStdcxx.txt";
		String pathFileTickes="D:\\Libri\\Università\\Falessi\\Repo\\RepoFalessi\\MyRepoFalessi\\TicketsBug.txt";
		tp.getMonthlyOccurences(pathLogGit, pathFileTickes );
		
        Logger.getLogger("MyLogger").info("fine");
        
	}

}
