package Pages;

import ProjectBase.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods  {
	public LoginPage enterUsername(String username)
	{
		driver.findElementById("username").sendKeys(username);
		return this;
	}
	public LoginPage enterPassword(String password)
	{
		driver.findElementById("password").sendKeys(password);
		return this;
	}
	public HomePage clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}
	

}
