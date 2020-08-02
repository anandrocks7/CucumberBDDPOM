package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);

	}

	
	@FindBy(name="email")
	WebElement userName;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//div[contains(@class,'submit')]")
	WebElement loginButton;
	
	@FindBy(xpath="//div/p[text()='Invalid login']")
	WebElement loginErrorMessage;
	
	@FindBy(xpath="//i[@class='settings icon']")
	WebElement settingsIcon;
	
	@FindBy(xpath="//span[text()='Log Out']")
	WebElement logout;


	public void setUserName(String username) {
		userName.click();
		userName.clear();
		userName.sendKeys(username);

	}
	public void setPassword(String pwd) {
		
		password.click();
		password.clear();
		password.sendKeys(pwd);
		
	}

	public void clickSubmit() {

		loginButton.click();
	}
	
	public void clickLogout() {
		ldriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		System.out.println("in clicklogoutmethod");
		settingsIcon.click();
		
		System.out.println("settingsIcon clicked");
		ldriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		logout.click();
		
	}
	
	public boolean verifyLogout() {
		
		return loginButton.isDisplayed();
	}
	
	public boolean failedLoginMessage() {
	
		try {
			System.out.println("loginErrorMessage.getSize()" +  loginErrorMessage.getSize());
			System.out.println("loginErrorMessage.isDisplayed();" +  loginErrorMessage.isDisplayed());
			return loginErrorMessage.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
		
	}



}
