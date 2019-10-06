package Pages;

import org.openqa.selenium.WebElement;

import com.leafBot.pages.MyHomePage;

import ProjectBase.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	public CreateLeadPage enterFirstname(String fName )
	{			
		WebElement eleFN = locateElement("id", "createLeadForm_firstName");		
		return this;
	}
	private WebElement locateElement(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
	public CreateLeadPage enterLastname(String Lname)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
		return this;
	}
	public CreateLeadPage enterCompanyname(String cName)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		return this;
	}
	public ViewLeadPage clickCreatelead()
	{
		driver.findElementByClassName("smallSubmit").click();
		return new ViewLeadPage();
	}

}
