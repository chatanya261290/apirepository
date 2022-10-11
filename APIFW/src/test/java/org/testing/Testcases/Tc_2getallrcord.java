package org.testing.Testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.jsonparsingusingorgjson;

import io.restassured.response.Response;

public class Tc_2getallrcord 
{
	public void testcase2() throws IOException
	{
	Properties pr=PropertiesHandle.readpropertyfile("../APIFW/uri.properties");
	HTTPMethods http=new HTTPMethods(pr);
	Response res=http.GetAllMethod("QA_URI_Selenium");
	jsonparsingusingorgjson.responseParse(res.asString(), "id");
	}
}
