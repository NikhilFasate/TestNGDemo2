package TestCases;


import java.io.IOException;

import org.testng.annotations.Test;

import Resources.BaseClass;
import Resources.TestCaseDataPro2;
import pageObjectModel2.LoginPageObject;
import pageObjectModel2.RegisterPageObject;

public class VerifyLoginTestCases extends BaseClass
{
	@Test
	public void Login() throws InterruptedException, IOException 
	{
		RegisterPageObject rpo=new RegisterPageObject(driver);
		rpo.MyAccountClick().click();
		
		LoginPageObject lpo=new LoginPageObject(driver);
		Thread.sleep(5000);
		lpo.LoginClick().click();
		lpo.ContinueClick().click();
		//After clicking on continue registration form will be open then we use following code
		rpo.EnterFirstName().sendKeys(TestCaseDataPro2.firstName);
		rpo.EnterLastName().sendKeys(TestCaseDataPro2.lastName);
		rpo.EnterEmail().sendKeys(TestCaseDataPro2.email);
	    rpo.EnterTelephone().sendKeys(TestCaseDataPro2.phoneNumber);
	    rpo.EnterPassword().sendKeys(TestCaseDataPro2.password);
	    rpo.EnterConfirmPW().sendKeys(TestCaseDataPro2.confPassword);
	    rpo.TickCheckBox().click();   
	    Thread.sleep(2500);
	  //  File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  //  FileUtils.copyFile(src, new File("C:\\Users\\nikhil\\OneDrive\\Desktop\\ScreenShot\\test28th02.png"));
	      
		if (rpo.EnterPassword().getText()==rpo.EnterConfirmPW().getText()) 
		{
			rpo.FinalSub().click();		
		}
		else 
		{
			System.out.println("password not match or privacy policy not checked");
		}
		
		lpo.HomeClick().click();
	}

}
