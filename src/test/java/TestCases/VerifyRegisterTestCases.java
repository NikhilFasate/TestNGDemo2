package TestCases;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import Resources.BaseClass;
import Resources.TestCaseDataPro2;
import pageObjectModel2.RegisterPageObject;

public class VerifyRegisterTestCases extends BaseClass
{
	@Test
	public void register() throws IOException, InterruptedException 
	{
		RegisterPageObject rpo=new RegisterPageObject(driver);
		rpo.MyAccountClick().click();
		Thread.sleep(2500);
		rpo.RegisterClick().click();
		rpo.EnterFirstName().sendKeys(TestCaseDataPro2.firstName);
		rpo.EnterLastName().sendKeys(TestCaseDataPro2.lastName);
		rpo.EnterEmail().sendKeys(TestCaseDataPro2.email);
	    rpo.EnterTelephone().sendKeys(TestCaseDataPro2.phoneNumber);
	    rpo.EnterPassword().sendKeys(TestCaseDataPro2.password);
	    rpo.EnterConfirmPW().sendKeys(TestCaseDataPro2.confPassword);
	    rpo.TickCheckBox().click();   
	    Thread.sleep(2500);
	    File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src, new File("C:\\Users\\nikhil\\OneDrive\\Desktop\\ScreenShot\\test19th12.png"));
	      
		if (rpo.EnterPassword().getText()==rpo.EnterConfirmPW().getText()) 
		{
			rpo.FinalSub().click();		
		}
		else 
		{
			System.out.println("password not match or privacy policy not checked");
		}
	}
}
