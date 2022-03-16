package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	private By oUserNameText = By.id("username");
	private By oPasswordText = By.id("password");
	private By oSignInBtn = By.xpath("//button[text()='Sign In']");
	private By oForgotLink = By.xpath("//*[text()='Register For Account']");
	private By oRegisterLink = By.xpath("//*[text()='Register For Account']");
	
	public boolean verifyElement() {
		if(driver.findElement(oUserNameText).isDisplayed() && 
				driver.findElement(oPasswordText).isDisplayed() && 
				driver.findElement(oSignInBtn).isEnabled() && 
				driver.findElement(oForgotLink).isDisplayed() && 
				driver.findElement(oRegisterLink).isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	
	public LoginPage typeUserName(String userName) {
		driver.findElement(oUserNameText).sendKeys("userName");
		//return new LoginPage();
		return this;
		
	}
	
	public LoginPage typePassword(String password) {
		driver.findElement(oPasswordText).sendKeys("password");
		//return new LoginPage();
		return this;
		
	}
	
	public HomePage clickSignOn() {
		driver.findElement(oSignInBtn).click();;
		return new HomePage();
		
	}
}
