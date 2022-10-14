package TestCases;


import org.testng.annotations.Test;

import Resources.BaseClass;
import pageObjectModel2.footerBrokenLinkObject;

public class VerifyBrokenLinkTestCases extends BaseClass
{
	@Test
	public void linksOnFooter() 
	{
		footerBrokenLinkObject fbl=new footerBrokenLinkObject(driver);
		System.out.println(fbl.brokenLink().getText());
		
		
	} 
	
	
	
}
