import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Test01_GET {
	@Test
    void getUsedCarListings()
	{
		//specify base URI
		RestAssured.baseURI="https://api.trademe.co.nz/v1/Search/General.{file_format}";
		//request object
	    RequestSpecification httprequest= RestAssured.given();
	    
	    //response object
	    Response response=httprequest.request(Method.GET,"/UsedCars");
	    
	    //print response in console window
	    String responseBody=response.getBody().asString();
	    System.out.println("Response body is:" +responseBody);
	    
	    //Status code validation
	    int statusCode=response.getStatusCode();
	    System.out.println("Status code is:" +statusCode);
	    Assert.assertEquals(statusCode,200);
	    
	    //status line verification
	    String statusLineresponse.getStatusLine();
	    System.out.println("Status line is +statusLine");
	    Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	    
	    
	    
	  
	}	
}
