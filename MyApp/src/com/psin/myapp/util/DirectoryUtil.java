/**
 * 
 */
package com.psin.myapp.util;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.psin.myapp.model.Account;

/**
 * @author psindhanur
 *
 */
public class DirectoryUtil {

	public static File[] parseDirectory(final String directoryPath, final Boolean recursive) {
		FileFilter jpegFilter = (File file) -> file.getName().endsWith("jpg");
		File directory = new File(directoryPath);
		return directory.listFiles(jpegFilter);
	}
	
	public static void writeToFile(final Account account, final String fileName, final String directoryPath) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		final String destinationFilePath = directoryPath + File.separator + fileName+".json";
		mapper.writeValue(new File(destinationFilePath), account);
	}
}
