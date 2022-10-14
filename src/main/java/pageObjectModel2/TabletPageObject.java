package pageObjectModel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TabletPageObject 
{
	public WebDriver driver;
	public TabletPageObject(WebDriver driver2) 
	{
		this.driver=driver2;
	}
	
	By Tablet=By.xpath("//a[contains(text(),'Tablets')]");
	By AddToCart=By.xpath("(//i[@class='fa fa-shopping-cart'])[3]");
			//("//span[contains(text(),'Add to Cart')]");
	

	public WebElement TabletClick() 
	{
		return driver.findElement(Tablet);
	}
	
	public WebElement AddToCartClick() 
	{
		return driver.findElement(AddToCart);
	}

}
