package messageConstruction;

/*====================================================================================================================*/
/*                                                  IMPORT UNITS                                                      */
/*====================================================================================================================*/

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

/*====================================================================================================================*/
/**
 * @version 1.0
 *   <p><b>Date:</b>
 *   07-Jul-2018</p>
 *   <p><b>Description:</b> 'Creating headers for the HTTP requests'.</p>
 *   @author : Ali Khalid
 */
/*====================================================================================================================*/


public class RequestSpec {
	
    private static RequestSpecBuilder builder = new RequestSpecBuilder();
    private static RequestSpecification requestSpecWithoutSession;
    private static RequestSpecification requestSpec;    
    private static String sessionID = "1111111";    
    

    /*====================================================================================================================*/
    public static RequestSpecification requestHeaders(){

    	RequestSpecBuilder builder = new RequestSpecBuilder();

    	// origin field    	
		builder.addHeader("Origin", "http://" + Environment.getHostName());
    	
    	//x-requested with field
		builder.addHeader("X-Requested-With", "XMLHttpRequest");
    	
    	//upgrade insecure requests
		builder.addHeader("Upgrade-Insecure-Requests", "1"); 

    	//content type
		builder.addHeader("Content-Type", "application/x-www-form-urlencoded");
    	
       	//user agent
        builder.addHeader("User-Agent", "Mozilla//5.0 (Windows NT 6.3; Win64; x64) AppleWebKit//537.36 (KHTML, like Gecko) Chrome//58.0.3029.110 Safari//537.36");
        
        //accept
		builder.addHeader("Accept", "text//html,application//xhtml+xml,application//xml;q=0.9,image//webp,image//apng,*//*;q=0.8");
        
        //referrer
		builder.addHeader("Referer", Environment.getHostBaseUri() + "/breadCrumbs/");
        													 
		// Encoding
        builder.addHeader("Accept-Encoding", "gzip, deflate");
        
        // Language
        builder.addHeader("Accept-Language", "en-US,en;q=0.8");
        
        // Cache
        builder.addHeader("Cache-Control", "no-cache");
        
        //Base URI
        builder.setBaseUri("http://" + Environment.getHostName());
        
        requestSpec = builder.build();
        
        return requestSpec;
    }

    /*====================================================================================================================*/
    public static RequestSpecification getReqSpec(){
        return requestSpec;
    }
    
    public static RequestSpecification getReqSpecWithoutSession(){
        return requestSpecWithoutSession;
    }

    public static String getSessionId(){
        return sessionID;
    }
    
    public static void setSessionId(String sessionid){
        sessionID = sessionid;
    }


}
