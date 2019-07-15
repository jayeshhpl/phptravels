package com.phptravels.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.Pages.Homepage;
import com.phptravels.Utilityclasses.browserFactory;

public class Register_TC extends browserFactory
{
	@Test
	public void verifytitle()
	{		
		browserFactory.startbrowser("chrome", "https://www.phptravels.net/");
		String actualtitle = "PHPTRAVELS | Travel Technology Partner";
		String gettitle = driver.getTitle();
		Assert.assertEquals(actualtitle, gettitle);
	}
	
	@Test
	public void gotosignup()
	{		
		browserFactory.startbrowser("chrome", "https://www.phptravels.net/");
		Homepage home_obj = PageFactory.initElements(driver, Homepage.class);
		home_obj.GotoSignup_page();
	}

}



