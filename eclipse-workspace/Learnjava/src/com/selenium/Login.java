package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) {
		//To set the system property
		System.setProperty("webdriver.chrome.driver", "C:\\selenium softwares");
		//how to launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//To pass the url
		driver.get("http://demo.actitime.com");
		//To find the location of username field
		WebElement usernameRef=driver.findElement(By.id("username"));
		//To perform action on the username field
		usernameRef.sendKeys("admin");
		//To find the location of password field
		WebElement passwordRef=driver.findElement(By.name("pwd"));
		//To perform action on the password field
		passwordRef.sendKeys("manager");
		//To find the location of Login button
		WebElement loginRef=driver.findElement(By.partialLinkText("Login"));
		//To perform action on login ref
		loginRef.click();
		
	}

}
