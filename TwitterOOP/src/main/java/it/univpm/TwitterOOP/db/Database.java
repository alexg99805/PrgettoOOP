package it.univpm.TwitterOOP.db;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class Database {
	public static JSONArray downloadJSON() {

		String data = "";
		String line = "";
		String url = "https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/user/1.1/statuses/user_timeline.json?screen_name=RemoteSens_MDPI&count=100&tweet_mode=extended";

		try {
			
			URLConnection openConnection = new URL(url).openConnection();
			openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			InputStream in = openConnection.getInputStream();
			
			try {
				
				InputStreamReader inR = new InputStreamReader( in );
				BufferedReader buf = new BufferedReader( inR );
				  
				while ( ( line = buf.readLine() ) != null ) {
					data+= line;
				}
				
			}finally {
				in.close();
			} 
			
		}catch (IOException e) {	
				e.printStackTrace();	
		}catch (Exception e) {	
			e.printStackTrace();	
		}	
		
		JSONArray json = null;
		try {
			 json = (JSONArray) JSONValue.parse(data);
			 return json;
		}catch(Exception e) {
			e.printStackTrace();	
		}
		
		return json;
	}
	

}
