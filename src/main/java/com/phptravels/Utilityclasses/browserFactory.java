package com.phptravels.Utilityclasses;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserFactory 
{	
	public static WebDriver driver;
	
	public static void startbrowser(String browserName, String URL)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver","//home//jayesh//d_drive//driver//geckodriver");
			driver = new FirefoxDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.get(URL);
		
		
		
	}

}
