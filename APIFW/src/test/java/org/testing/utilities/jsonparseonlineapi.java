package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonparseonlineapi 
{
public static void responseParse (String responseData,String keyname)
{
	JSONObject object=new JSONObject(responseData);
	JSONArray array=object.getJSONArray(responseData);
	int l=array.length();
	for(int i=0;i<l;i++)
	{
		JSONObject ob=array.getJSONObject(i);
		System.out.println("id value is "+ob.getString(keyname));
		
	}

}
}
