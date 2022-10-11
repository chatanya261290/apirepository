    package org.testing.Testcases;

	import java.io.IOException;
	import java.util.Properties;
    import org.json.JSONObject;
    import org.testing.teststeps.HTTPMethods;
	import org.testing.utilities.PropertiesHandle;
	import org.testing.utilities.jsonhandle;
import org.testing.utilities.jsonparseonlineapi;
import org.testing.utilities.jsonparsingoneid;
    import org.testing.utilities.jsonparsingusingorgjson;
    import io.restassured.response.Response;

	public class tc7_getallpractice 
	{
	
	    public void testcase7 () throws IOException 
	    {
		Properties pr=PropertiesHandle.readpropertyfile("../APIFW/uri.properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.GetAllMethod("QA_URI_getall");
		jsonparseonlineapi.responseParse(res.asString(), "id");
		System.out.println(res.asString());
		
	
	}
	}

