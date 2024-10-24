package com.actitime.test;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Createcustomer {
	@Test
	public void create()
	{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	@Nullable
	String titile = driver.getTitle();
	System.out.println(titile);
		
		
	}

}
