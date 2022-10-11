
package org.testing.Testcases;

import java.io.IOException;
import java.util.Properties;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.jsonhandle;
import org.testing.utilities.jsonparsingoneid;
import org.testing.utilities.jsonparsingusingorgjson;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class tc1_postwithtestng
{
 public static String returnidvalue;
 @Test
public void testcase1 () throws IOException 
 {
	Properties pr=PropertiesHandle.readpropertyfile("../APIFW/uri.properties");
	String bodydata=jsonhandle.readjson("../APIFW/src/test/java/org/testing/resources/inputpayload.json");
	HTTPMethods http=new HTTPMethods (pr);
	Response res=http.Postmethods(bodydata, "QA_URI_Java");
	returnidvalue=jsonparsingoneid.parsejson(res.asString(),"id");
	
 }
}
