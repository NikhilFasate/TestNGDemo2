package pageObjectModel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObject 
{
	public RegisterPageObject(WebDriver driver2) 
	{
		this.driver=driver2;
	}
	public WebDriver driver;
	By MyAccount=By.xpath("//a[@title='My Account']");
	By Register =By.xpath("//li//a[contains(text(),'Register')]");
	By FirstName = By.xpath("//input[@id='input-firstname']");
	By LastName = By.xpath("//input[@id='input-lastname']");
	By Email= By.xpath("//input[@id='input-email']");
	By Telephone = By.xpath("//input[@id='input-telephone']");
	By Password = By.xpath("//input[@id='input-password']");
	By ConfirmPassword = By.xpath("//input[@id='input-confirm']");
	By Checkbox = By.xpath("//input[@name='agree']");
	By Finalize = By.xpath("//input[@class='btn btn-primary']");
	
	public WebElement MyAccountClick() 
	{
		return driver.findElement(MyAccount);
	}
	
	public WebElement RegisterClick() 
	{
		return driver.findElement(Register);
	}
	public WebElement EnterFirstName() 
	{
		return driver.findElement(FirstName);
	}
	
	public WebElement EnterLastName() 
	{
		return driver.findElement(LastName);
	}
	public WebElement EnterEmail() 
	{
		return driver.findElement(Email);
	}
	
	public WebElement EnterTelephone() 
	{
		return driver.findElement(Telephone);
	}
	
	public WebElement EnterPassword() 
	{
		return driver.findElement(Password);
	}
	
	public WebElement EnterConfirmPW() 
	{
		return driver.findElement(ConfirmPassword);
	}
	
	public WebElement TickCheckBox() 
	{
		return driver.findElement(Checkbox);
	}
	
	public WebElement FinalSub() 
	{
		return driver.findElement(Finalize);
	}
}
