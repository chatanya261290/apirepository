package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonparsingoneid
{
	public static String parsejson(String responseData, String keyname)
	{
		JSONObject js=new JSONObject(responseData);
		return js.getString(keyname);
		
	}
	
	
	
public static void responseParse (String responseData,String keyname)
{
	JSONArray array=new JSONArray(responseData);
	int l=array.length();
	for(int i=0;i<l;i++)
	{
		JSONObject ob=array.getJSONObject(i);
		System.out.println("id value is "+ob.getString(keyname));
	}
}
}
