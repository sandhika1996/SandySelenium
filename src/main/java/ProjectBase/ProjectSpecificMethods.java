package ProjectBase;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	public String excelFileName; //for storing a excel file name
		public static ChromeDriver driver;
		@Parameters({"url"})
		
		@BeforeMethod
		public void startApp(String url)
		{
			System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//Launching the URL
			driver.get(url);
			
//			//Login with Username & Password
//			
//			driver.findElementById("username").sendKeys(username);
//			driver.findElementById("password").sendKeys(password);
//			driver.findElementByClassName("decorativeSubmit").click();
//			
//			//Open CRMSFA
//			
//			driver.findElementByLinkText("CRM/SFA").click();
		}
		@AfterMethod
		public void closeapp()
		{
			driver.close();
			
		}
		@DataProvider(name="fetchdata")
		public Object[][] getData() throws IOException
		{
			
		return ReadExcel.readExcelData(excelFileName);
		
		}
	}


