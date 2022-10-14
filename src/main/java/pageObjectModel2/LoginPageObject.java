package pageObjectModel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject 
{
	public WebDriver driver;
	
	public LoginPageObject(WebDriver driver2) 
	{
		this.driver=driver2;
	}
	
	By Login=By.xpath("//a[contains(text(),'Login')]");
	By Continue=By.xpath("//a[contains(text(),'Continue')]");
	By Home=By.xpath("//i[@class='fa fa-home']");
	
	public WebElement LoginClick() 
	{
		return driver.findElement(Login);
	}
	
	public WebElement ContinueClick()
	{
		return driver.findElement(Continue);
	}
	
	public WebElement HomeClick() 
	{
		return driver.findElement(Home);
	}
	

}
