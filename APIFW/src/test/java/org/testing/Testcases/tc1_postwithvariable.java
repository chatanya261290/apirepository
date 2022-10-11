
	package org.testing.Testcases;

	import java.io.IOException;
	import java.util.Properties;
    import java.util.Random;
import java.util.Scanner;
import org.testing.teststeps.HTTPMethods;
	import org.testing.utilities.PropertiesHandle;
	import org.testing.utilities.jsonhandle;
    import org.testing.utilities.jsonparsingoneid;
    import org.testing.utilities.jsonparsingusingorgjson;
   import org.testing.utilities.variablereplacement;

   import io.restassured.response.Response;

	public class tc1_postwithvariable 
	{
	public static String returnidvalue;
	public void testcase1 () throws IOException 
	 {
		Properties pr=PropertiesHandle.readpropertyfile("../APIFW/uri.properties");
		String bodydata=jsonhandle.readjson("../APIFW/src/test/java/org/testing/resources/inputdatawithvariables");
		System.out.println("please enter the id value");
		Scanner s=new Scanner(System.in);
		String variableValue=s.next();
		bodydata=variablereplacement.assignvalue(bodydata, "id", variableValue);
		HTTPMethods http=new HTTPMethods (pr);
		Response res=http.Postmethods(bodydata, "QA_URI_Java");
		returnidvalue=jsonparsingoneid.parsejson(res.asString(),"id");
		
	 }
	}
