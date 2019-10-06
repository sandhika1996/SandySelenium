package Pages;

//import org.openqa.selenium.By;

import ProjectBase.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	public MyLeadsPage clickLeads()
	{
		driver.findElementByLinkText("Leads").click();
		return new MyLeadsPage();
	}
	

}
