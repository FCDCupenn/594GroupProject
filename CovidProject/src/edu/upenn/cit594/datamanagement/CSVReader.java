package edu.upenn.cit594.datamanagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.upenn.cit594.util.State;

public class CSVReader {
	
	
	/**This will read a file and return all state
	 * 
	 * @param fileName
	 * @return return all state in a list
	 */	
public static List<State> readAllState(String fileName) {
		
		List<State> res = new ArrayList<State>();
		// create a file
		File file = new File(fileName);
		// define a file reader
		FileReader fileReader = null;
		/// define buffered reader
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line;
			
			while ((line = bufferedReader.readLine()) != null) {
				// split based on the tab
				String[] lineArray = line.split(",");
				String state = lineArray[0];
				double latitude = Double.parseDouble(lineArray[1]);
				double longtitude = Double.parseDouble(lineArray[2]);
				State newState = new State(state, latitude, longtitude);
				
				res.add(newState);

			}
			// close the buffer reader after used it
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Sorry, " + file.getName() + " not found.");
			// e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return res;

	}

}
