package org.testing.Testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

import io.restassured.response.Response;

public class tc3_update 
{
  public void testcase3() throws IOException
  {
	Properties pr=PropertiesHandle.readpropertyfile("../APIFW/uri.properties");
    HTTPMethods http=new HTTPMethods(pr);
	Response res=http.getrequest("QA_URI_Java", tc1_update.returnidvalue);
	System.out.println("Testcase no. 3 ");
	System.out.println(res.asString());
	System.out.println("Status code is"+res.statusCode());
	
	
  }
}
