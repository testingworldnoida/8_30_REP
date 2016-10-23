package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {
	
WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void username(String uname)
	{
		driver.findElement(By.id("email")).sendKeys(uname);
	}
	
	public void password(String pass)
	{
		driver.findElement(By.id("pass")).sendKeys(pass);
	}

	public void signin()
	{
		driver.findElement(By.id("u_0_1")).click();
	}
}
