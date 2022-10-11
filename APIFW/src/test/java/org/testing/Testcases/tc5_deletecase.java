package org.testing.Testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

import io.restassured.response.Response;

public class tc5_deletecase 
{
public void testcase5() throws IOException
  {
	Properties pr=PropertiesHandle.readpropertyfile("../APIFW/uri.properties");
    HTTPMethods http=new HTTPMethods(pr);
	Response res=http.deleterequest("QA_URI_Java", tc1_update.returnidvalue);
	System.out.println("Testcase no. 5 ");
	System.out.println(res.asString());
	System.out.println("Status code is"+res.statusCode());
	
  }
}
