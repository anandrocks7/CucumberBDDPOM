package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver ldriver;
	
	
	public HomePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}

	

	@FindBy(xpath="//a[text()='Free account']")
	WebElement linkFreeAcct;
	
	
	
	
	
	public boolean verifyFreeacctLink() {
		return linkFreeAcct.isDisplayed();
		
	}
	
	
	
	
}
