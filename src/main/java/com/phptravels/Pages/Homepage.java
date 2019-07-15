package com.phptravels.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.phptravels.Utilityclasses.browserFactory;

public class Homepage extends browserFactory
{
	
	
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
	}
	//Elements
	
	@FindBy(how=How.CSS,using=".nav:nth-child(1) > #li_myaccount > .dropdown-toggle")
	WebElement MyAccount;
	
	@FindBy(how=How.CSS,using=".nav:nth-child(1) > #li_myaccount li:nth-child(2) > .go-text-right")
	WebElement Signup_option;
	
	//Methods
	
	public void GotoSignup_page()
	{
		MyAccount.click();
		Signup_option.click();
	}
	
}
