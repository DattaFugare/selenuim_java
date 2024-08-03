package TestData;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {
	
	 @DataProvider(name = "loginData")
	    public static Object[][] loginData() {
	        return new Object[][] {
	            {"dattatrayfugare77@gmail.com", "dattasujay1"},
	         //   {"dattatrayfugare18@gmail.com", "anotherPassword"},
	            //{"rahulshettyacademy","learning"}
	            // Add more sets of test data as needed
	        };
	    }

}
