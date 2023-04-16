package edu.upenn.cit594.datamanagement;

import edu.upenn.cit594.util.Covid;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CovidReader {
	
	 public CSVReader csvReader;
	 public JSONFileReader jReader;
	 private Map<String, Integer> headerID;
	 
	 public CovidReader(String filename) throws IOException {
		try( var reader = new CharacterReader(filename)){
			var csvReader = new CSVReader(reader);
			var allRows = csvReader.readAll();
			headerID =csvReader.generateHeaderID();
			List<Covid> covidDataList = new ArrayList<>();
			for(var row:allRows){
				String zipCode = row[headerID.get("zip_code")];
				String timestamp = row[headerID.get("etl_timestamp")];
				String partiallyVaccinated = row[headerID.get("partially_vaccinated")];
				String fullyVaccinated = row[headerID.get("fully_vaccinated")];
				Covid eachCovidRecord = new Covid(zipCode,timestamp,partiallyVaccinated,fullyVaccinated);
				covidDataList.add(eachCovidRecord);
			}
			System.out.println(allRows.size());

		} catch (CSVFormatException e) {
			throw new RuntimeException(e);
		}


	 }}
