package com.tyss.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.demo.util.DriverUtility;


public class LoginPage{
	
	/*usernameTxt*/
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameTxt;
	
	/*passwordTxt*/
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement passwordTxt;
	
	
	/*loginBtn*/
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginBtn;

	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
			

	}
	
	/**
	 * This method is used to login
	 * @author lavakumar
	 * @param username
	 * @param password
	 */
	
	public void login(String username,String password) {
		
		usernameTxt.sendKeys(username);
	
		passwordTxt.sendKeys(password);
		
		loginBtn.click();
		
	
	}
}
