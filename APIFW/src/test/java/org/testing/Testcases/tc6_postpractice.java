
	package org.testing.Testcases;

	import java.io.IOException;
	import java.util.Properties;

import org.json.JSONObject;
import org.testing.teststeps.HTTPMethods;
	import org.testing.utilities.PropertiesHandle;
	import org.testing.utilities.jsonhandle;
    import org.testing.utilities.jsonparsingoneid;
    import org.testing.utilities.jsonparsingusingorgjson;

    import io.restassured.response.Response;

	public class tc6_postpractice 
	{
	
	public void testcase6 () throws IOException 
	    {
		Properties pr=PropertiesHandle.readpropertyfile("../APIFW/uri.properties");
		String bodydata=jsonhandle.readjson("../APIFW/src/test/java/org/testing/resources/inputfilepractice");
		HTTPMethods http=new HTTPMethods (pr);
		Response res=http.Postmethods(bodydata, "QA_URI_websitelink");
		JSONObject ob=new JSONObject(res.asString());
		JSONObject inner= ob.getJSONObject("data");
	    Integer idvalue=(Integer) inner.get("id");
	    System.out.println(res.asString());
	    System.out.println("Id value is -"+idvalue);
	    }
	}

