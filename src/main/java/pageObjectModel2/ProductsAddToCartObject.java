package pageObjectModel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsAddToCartObject 
{
	public WebDriver driver;
	public ProductsAddToCartObject(WebDriver driver2) 
	{
		this.driver=driver2;
	}

	By SearchBox = By.xpath("//input[@name='search']");
	By clickOnSearch = By.xpath("//i[@class='fa fa-search']");
	By addtoCart = By.xpath("(//i[@class='fa fa-shopping-cart'])[3]");
	By addCartSam = By.xpath("(//div[@class='button-group']/button)[4]");
	By Cartclick = By.xpath("//div[@id='cart']/button");
	By cartPrice = By.xpath("(//td[@class='text-right'])[12]");
	
	public WebElement ClickOnSearch() 
	{
		return driver.findElement(SearchBox); 
	}
	
	public WebElement searchClick() 
	{
		return driver.findElement(clickOnSearch);
	}
	
	public WebElement clickIphoneAddToCart() 
	{
		return driver.findElement(addtoCart);
	}
	public WebElement clickSamsungAddToCart() 
	{
		return driver.findElement(addCartSam);
	}
	
	public WebElement ClickOnCartDetails()
	{
		return driver.findElement(Cartclick);
	}
	
	public WebElement ClickOnCartprice()
	{
		return driver.findElement(cartPrice);
	}

}
