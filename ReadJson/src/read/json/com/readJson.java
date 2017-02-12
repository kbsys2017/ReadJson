package read.json.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

public class readJson {

	private static final String IOException = null;

	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub
		
		String jsonData = "";
		BufferedReader br = null;
		
		try{
			String line;
			br = new BufferedReader(new FileReader("C:\\Users\\abhinav\\Desktop\\javajson.txt"));
			while((line=br.readLine())!=null){
				jsonData +=line+"\n";
			}
			}catch(IOException e){
				e.printStackTrace();
		}finally{
			try{
				if(br != null);
				br.close();
			}catch(IOException ex){
			ex.printStackTrace();
			}
		}
		
		JSONObject obj = new JSONObject(jsonData);
	System.out.println("blog url :" + obj.getString("Region"));
	}
	}
