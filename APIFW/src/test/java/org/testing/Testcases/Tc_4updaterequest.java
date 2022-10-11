package org.testing.Testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.jsonhandle;
import org.testing.utilities.variablereplacement;

import io.restassured.response.Response;

public class Tc_4updaterequest 
{
public void testcase4() throws IOException
    {
	Properties pr=PropertiesHandle.readpropertyfile("../APIFW/uri.properties");
	String bodydata=jsonhandle.readjson("../APIFW/src/test/java/org/testing/resources/updatefile");
	bodydata=variablereplacement.assignvalue(bodydata, "id", tc1_update.returnidvalue);
	HTTPMethods http=new HTTPMethods(pr);
	Response res=http.putrequest(bodydata, "QA_URI_Java", tc1_update.returnidvalue);
	System.out.println("test case 4");
	System.out.println(res.asString());
	System.out.println("status code is");
	System.out.println(res.statusCode());
	
	}
}
