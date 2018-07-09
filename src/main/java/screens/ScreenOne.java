package screens;
/*====================================================================================================================*/
/*                                                  IMPORT UNITS                                                      */
/*====================================================================================================================*/

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import messageConstruction.Environment;
import messageConstruction.RequestSpec;

/*====================================================================================================================*/
/**
 * @version 1.0
 *   <p><b>Date:</b>
 *   07-Jul-2018</p>
 *   <p><b>Description:</b> 'Screen one methods / similar to POM file'.</p>
 *   @author : Ali Khalid
 */
/*====================================================================================================================*/

public class ScreenOne {
	
	private static Response response;
	private static RequestSpecification requestSpec;
    
	/*====================================================================================================================*/
	public static String getValue1() {	
		
	  requestSpec = RequestSpec.requestHeaders();
	
	  response =
	  	given().
	      spec(requestSpec).
    	when().
	      post(Environment.getHostBaseUri() + "screen1.aspx").
	  	then().
	      log().body().
	      extract().response(); // extract the response

	  String CurrentFlagValue = response.xmlPath().getString("ROOT.DATA.USER_VALUE").toString();
	  
	  System.out.println(CurrentFlagValue);
	  return CurrentFlagValue;
  }
	
	/*====================================================================================================================*/
	public static void setValue1(String newValue) {
	

		requestSpec = RequestSpec.requestHeaders();
        
		response =
	    given().
		    spec(requestSpec).
		    formParam("Param1","value1").		    
	    when().
        post(Environment.getHostBaseUri() + "screen1.aspx").
	    then().
        log().body().
        extract().response(); // extract the response
			
			Assert.assertEquals(response.statusCode(), 200);
	}
	
}
