package assertition;

import org.openqa.selenium.chrome.ChromeDriver;

import dd.Base;

public class Assert {
	
	public static boolean validateurl(ChromeDriver driver, String expURL){
		boolean b=false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL))
		{
			b=true;
		}
		return b;
		
	}
}
