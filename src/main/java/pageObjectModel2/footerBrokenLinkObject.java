package pageObjectModel2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class footerBrokenLinkObject 
{
	public footerBrokenLinkObject(WebDriver driver2) 
	{
		this.driver=driver2;
	}
	
	public WebDriver driver;
	By footerLink=By.xpath("(//div[@class='container'])[5]");

	public WebElement brokenLink() 
	{
		return driver.findElement(footerLink);
	}
	
}
