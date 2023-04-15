package edu.upenn.cit594.datamanagement;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import edu.upenn.cit594.util.SoloProjectException;
import edu.upenn.cit594.util.Tweet;
public class JSONFileReader {
	
	JSONFileReader jReader;
	
	public JSONFileReader() {
		
	}
	/**
	 * this method will return a JSONObject from reading the file
	 * @return return all tweet in a list
	 * 
	 */
	public  List<Tweet> readAllTweet(String filename) {
		List<Tweet> res = new ArrayList<>();
		JSONArray jo = null;
		try {
			
			Object obj = new JSONParser().parse(new FileReader(filename));
			jo = (JSONArray) obj;
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		res = JSONFileReader.processTweets(jo);
		return res;
		
	}
	
	/**
	 * This method will get the Tweet information from the read file
	 * @return all tweet information from the JSONArray
	 */
	@SuppressWarnings("unused")
	private  List<Tweet> processTweets(JSONArray ja){
		List<Tweet> res = new ArrayList<>();
		JSONObject jo = null;
		Iterator<?> itr = ja.iterator();
		while (itr.hasNext()) {
			jo = (JSONObject) itr.next();
			JSONArray coordinates = (JSONArray)jo.get("location");
            Double latitude = (Double) coordinates.get(0);
            Double longitude = (Double) coordinates.get(1);
			String text = (String)jo.get("text");
			Tweet tweet = new Tweet (latitude, longitude, text);
			res.add(tweet);
			
		}
		return res;
	}
	
	

	
	
}
