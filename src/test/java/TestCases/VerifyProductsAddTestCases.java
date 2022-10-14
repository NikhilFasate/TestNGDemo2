package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.BaseClass;
import pageObjectModel2.ProductsAddToCartObject;

public class VerifyProductsAddTestCases extends BaseClass
{
	@Test
	public void Iphone() throws InterruptedException 
	{
		ProductsAddToCartObject pac= new ProductsAddToCartObject(driver);
		
		pac.ClickOnSearch().sendKeys("iphone");
		pac.searchClick().click();
		
		WebElement a= driver.findElement(By.xpath("//p[@class='price']"));
		String IphonePriceDollar=a.getText();
		String IphonePrice[]=IphonePriceDollar.split(" ");
		System.out.println(IphonePrice[0]);
		String IphonePriceNum = IphonePrice[0].replaceAll("[^\\d.]", ""); 			//str = str.replaceAll("[^\\d.]", "");
		System.out.println(IphonePriceNum);
		
		pac.clickIphoneAddToCart().click();
		
		pac.ClickOnSearch().clear();
		pac.ClickOnSearch().sendKeys("samsung");
		pac.searchClick().click();
		
		WebElement b= driver.findElement(By.xpath("(//p[@class='price'])[2]"));
		String SamsungPriceDollar=b.getText();
		String SamsungPrice [] =SamsungPriceDollar.split(" ");
		String SamsungPriceNum = SamsungPrice [0].replaceAll("[^\\d.]", "");
		System.out.println(SamsungPriceNum);
	
		
		pac.clickSamsungAddToCart().click();
		
		double IphonepriceFinal = Double.parseDouble(IphonePriceNum);
		double SamsungpriceFinal = Double.parseDouble(SamsungPriceNum);
		double totalPrice = IphonepriceFinal+SamsungpriceFinal;
		System.out.println(totalPrice);
		
		Thread.sleep(2500);
		pac.ClickOnCartDetails().click();
		
		WebElement c= driver.findElement(By.xpath("(//td[@class='text-right'])[12]"));
		String CartpriceDollar =c.getText();
		String CartPriceDetails []=CartpriceDollar.split(" ");
		String CartPriceNum = CartPriceDetails[0].replaceAll("[^\\d.]", "");
		double CartPriceFinal = Double.parseDouble(CartPriceNum);
		if (totalPrice == CartPriceFinal) 
		{
			System.out.println("Price match");
		}
		else 
		{
			System.out.println("Price does not match");
		}
	
	}
	
}
