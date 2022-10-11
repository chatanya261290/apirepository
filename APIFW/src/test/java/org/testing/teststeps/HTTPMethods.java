package org.testing.teststeps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods  
{
	Properties pr;
	public HTTPMethods(Properties pr) 
	{
		this.pr=pr;
    }	
	
public Response Postmethods(String bodydata, String urikey)
{
	Response res=
	given()
	.contentType(ContentType.JSON)
	.body(bodydata)
	.when()
	.post(pr.getProperty(urikey));
	System.out.println("stsatus code is");
	System.out.println(res.statusCode());
	return res;
}

   public Response getrequest(String urikey, String idvalue)
   {
	   
	   String completeuri=pr.getProperty(urikey)+"/"+idvalue;
	   Response res=
       given()
       .contentType(ContentType.JSON)
       .when()
       .get(completeuri);
	   return res;
   }

   public Response GetAllMethod(String uriKey)
   {
	   Response res=
	    given()
	   .contentType(ContentType.JSON)
	   .when()
	   .get(pr.getProperty(uriKey));
	    System.out.println("stsatus code is");
		System.out.println(res.statusCode());
	    return res;   
   }
   public Response putrequest(String bodydata,String urikey,String idvalue)
      {
	   String completeuri=pr.getProperty(urikey)+"/"+idvalue;
	   Response res=
	   given()
	   .contentType(ContentType.JSON)
	   .body(bodydata)
	   .when()
	   .put(completeuri);
	   return res;
      }
   
   public Response deleterequest(String urikey, String idvalue)
   {
	   
	   String completeuri=pr.getProperty(urikey)+"/"+idvalue;
	   Response res=
       given()
       .contentType(ContentType.JSON)
       .when()
       .delete(completeuri);
	   return res;
   }
   
   
}
