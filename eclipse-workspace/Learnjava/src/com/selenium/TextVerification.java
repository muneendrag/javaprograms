package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextVerification {
	
	public static void main(String[] args) {
		
		//To set the system property
		System.setProperty("webdriver.chrome.driver", "C:\\selenium softwares\\chromedriver.exe");
		//how to launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//To pass the url
		driver.get("http://demo.actitime.com");
		//To find the element location
		WebElement textRef=driver.findElement(By.id("headerContainer"));
		//To get the text from the textRef
		String actualText=textRef.getText();
		System.out.println(actualText);
		
	}

}
