package dd;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
public WebDriver driver;
@BeforeMethod
public void openbrowesr()
{
	ResourceBundle rb = ResourceBundle.getBundle("Config");
	if(rb.getString("browser").equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();	
	}
	else if(rb.getString("browser").equalsIgnoreCase("firefox"))
	{
		
		driver=new FirefoxDriver();	
	}
	
	
	driver.get(rb.getString("url"));
}
@AfterMethod
public void closebrowesr()
{
	driver.close();
}
}
