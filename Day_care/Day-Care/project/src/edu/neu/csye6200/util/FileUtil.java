/**
 * 
 */
package edu.neu.csye6200.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pnakave
 *
 */
public class FileUtil {

	// This function takes a list as a parameter and writes to the file
	public static void writeTextFile(List<String> entries, String fileName) {
		File entryFile = new File(fileName);
		try (FileWriter fileWriter = new FileWriter(entryFile, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
			for (String entry : entries) {
				bufferedWriter.write(entry);
				bufferedWriter.newLine();
			}

		} catch (IOException e) {
			// TODO: handle exception
			System.err.format("IOException: %s%n", e);
		}
	}

	// This function takes a string as a parameter and writes to file
	public static void writeTextFile(String entry, String fileName) {
		File entryFile = new File(fileName);
		try (FileWriter fileWriter = new FileWriter(entryFile, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
			bufferedWriter.write(entry);
			bufferedWriter.newLine();

		} catch (IOException e) {
			// TODO: handle exception
			System.err.format("IOException: %s%n", e);
		}

	}

	// This function reads the file and returns a string
	public static List<String> readTextFile(String fileName) {
		List<String> entries = new ArrayList<>();
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				entries.add(line);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.err.format("Exception: %s%n", e);
		}

		return entries;
	}
}
