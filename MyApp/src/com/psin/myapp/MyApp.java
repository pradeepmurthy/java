/**
 * 
 */
package com.psin.myapp;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;

import com.psin.myapp.model.Account;
import com.psin.myapp.util.DirectoryUtil;


/**
 * @author psindhanur
 *
 */
public class MyApp {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		final String IMAGE_SOURCE_ROOT_PATH = "/Users/psindhanur/Downloads";
		final String JSON_DIR_ROOT_PATH = "/Users/psindhanur/root/DATA/projects/git-projects/java/MyApp";
		
		File[] files = DirectoryUtil.parseDirectory(IMAGE_SOURCE_ROOT_PATH, Boolean.FALSE);
		
		Account currentAccount = null;
		Boolean newAccount = Boolean.TRUE;
		int MAX_PERSON_PER_ACCOUNT = 2;
		int currentPersonCount = 0;
		HashMap<String, byte[]> currentAccountPersonsMap = null;
		for(File f : files) {
			//System.out.println(f.getName());
			//Create acccount object
			 if(currentPersonCount == 0) {
				 currentAccount = new Account();
				 currentAccountPersonsMap = new HashMap<>();
			 }
			 if(currentAccount.getAccountName()==null) {
				 currentAccount.setAccountName(f.getName());
				 currentAccount.setCardNumber(100000L);
			 }
			 //currentAccountPersonsMap.put(f.getName(), Files.readAllBytes(f.toPath()));
			 currentAccountPersonsMap.put(f.getName(), null);
			 currentPersonCount++;
			 if(currentPersonCount == MAX_PERSON_PER_ACCOUNT) {
				 currentAccount.setPersonsMap(currentAccountPersonsMap);
				 System.out.println("AccountName="+currentAccount.getAccountName() +", PersonSize="+currentAccount.getPersonsMap());
				 DirectoryUtil.writeToFile(currentAccount.toString(), currentAccount.getAccountName(), JSON_DIR_ROOT_PATH);
				 currentPersonCount =0;
			 }
			//Update account object with 2 file records
			//Convert to Json
			//Write Json to a file
		}
	}

}
