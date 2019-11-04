package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitializeBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//To pass the url
		driver.get("http://demo.actitime.com");
		//To get the title from the browser
		String actualTitle=driver.getTitle();
		String expectedTitle="actiTIME - Login";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title pass");
		}
		System.out.println(actualTitle);
	}

}
