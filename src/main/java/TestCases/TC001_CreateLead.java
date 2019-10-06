package TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;
import ProjectBase.ProjectSpecificMethods;

public class TC001_CreateLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setData()
	{
		excelFileName="CreateLead";
	}
	@Test(dataProvider="fetchdata")
	public void CreateLeadTC(String username,String password,String fname,String lname,String cname)	{


		new LoginPage().enterUsername(username).enterPassword(password).clickLogin().clickCRMSFA().clickLeads().clickCreateLead()
		.enterFirstname(fname).enterLastname(lname).enterCompanyname(cname).clickCreatelead().Verifyfirstname();


	}
}


