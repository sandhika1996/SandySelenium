package Pages;

import ProjectBase.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	public CreateLeadPage clickCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}
	

}
