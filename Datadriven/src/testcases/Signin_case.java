package testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.Homepage;
import dd.Base;

public class Signin_case extends Base {
	
	@Test(dataProvider="dp1")
	public void TC_001(String a, String b)
	{
		Logger  l = Logger.getLogger(Signin_case.class);
		Homepage obj = new Homepage(driver);
		obj.username(a);
		obj.password(b);
		obj.signin();
		
	}
	
	@DataProvider(name="dp1")
	public Object[][] testData()
	{
		Object [][] arr = {{"unam1","pass1"},{"unam2","pass2"},{"unam3","pass3"}};
		return arr;
	}

}
