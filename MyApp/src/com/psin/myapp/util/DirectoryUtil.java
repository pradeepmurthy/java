/**
 * 
 */
package com.psin.myapp.util;

import java.io.File;
import java.io.FileFilter;

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
	
	public static Boolean writeToFile(final String json, final String fileName, final String directoryPath) {
		return Boolean.TRUE;
	}
}
