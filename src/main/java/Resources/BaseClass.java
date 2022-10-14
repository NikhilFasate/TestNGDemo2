package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;




public class BaseClass 
{
	public Properties prop;
	public WebDriver driver;
	public WebDriver browserLaunch1() throws IOException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\nikhil\\eclipse-workspace\\TestNGProject2\\src\\main\\java\\Resources\\data.properties");
		prop=new Properties();
		prop.load(fis);
		String browserName =prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil\\OneDrive\\Desktop\\Chrome Driver 105\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("edge")) 
		{
		
		}
		
		else if (browserName.equalsIgnoreCase("firefox")) 
		{
		
		}
		
		else 
		{
			System.out.println("please enter valid browser");
		}
		
		return driver;
	}
	
	@BeforeMethod
	public void openBrowser() throws IOException 
	{
		browserLaunch1();	 
		driver.get(prop.getProperty("url"));
	}

}
