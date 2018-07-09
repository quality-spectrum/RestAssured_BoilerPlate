/*====================================================================================================================*/
/*                                                  IMPORT UNITS                                                      */
/*====================================================================================================================*/

package messageConstruction;

/*====================================================================================================================*/
/**
 * @version 1.0
 *   <p><b>Date:</b>
 *   07-Jul-2018</p>
 *   <p><b>Description:</b> 'Setting AUT version to run tests on'.</p>
 *   @author : Ali Khalid
 */
/*====================================================================================================================*/


public class Environment {

	private static String hostName;
	private static String hostBaseUri;
	private static String database;
	private static String username;
	private static String password;
	

	/*====================================================================================================================*/	
	public static void setEnvironment(String environment) {
		
		switch(environment){
		
		case "Env1": 
			hostName = "Server1";
			hostBaseUri = "http://server/v1/";
			database = "database1";	
			setUsername("username");
			setPassword("password");
			break;
		case "Env2": 
			hostName = "Server2";
			hostBaseUri = "http://server/v2/";
			database = "database2";	
			setUsername("username");
			setPassword("password");
			break;		
		}
		
	}
	
	/*====================================================================================================================*/
	public static String getHostName() {
		return hostName;
	}
	
	public static String getHostBaseUri() {
		return hostBaseUri;
	}
	
	public static String getDatabase() {
		return database;
	}
	
	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		Environment.username = username;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		Environment.password = password;
	}


}
