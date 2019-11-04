package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlVerification {
	
	public static void main(String[] args) throws InterruptedException {
		//To set the system property
		System.setProperty("webdriver.chrome.driver", "C:\\selenium softwares\\chromedriver.exe");
		//how to launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//To pass the url
		driver.get("http://demo.actitime.com");
		//To find the location of the webElement
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager1");
		driver.findElement(By.partialLinkText("Login")).click();
		//To wait
		Thread.sleep(3000);
		//To get the current url
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	}

}
