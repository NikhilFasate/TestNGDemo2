package TestCases;

import org.testng.annotations.Test;

import Resources.BaseClass;
import pageObjectModel2.TabletPageObject;

public class VerifyTabletTestCases extends BaseClass
{
	@Test
	public void Tab() 
	{
		TabletPageObject tpo=new TabletPageObject(driver);
		tpo.TabletClick().click();
		tpo.AddToCartClick().click();
		
	}
	
}
