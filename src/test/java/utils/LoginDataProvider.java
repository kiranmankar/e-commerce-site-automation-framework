package utils;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {
	
	 @DataProvider(name = "loginData")
	    public Object[][] getLoginData() {

	        return ExcelUtils.getData(
	                "src/test/resources/testdata/LoginData.xlsx",
	                "TestData");
	    }
	}
