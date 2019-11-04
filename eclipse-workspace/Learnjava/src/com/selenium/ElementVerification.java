package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVerification {
	

public static void main(String[] args) {
			//To set the system property
			System.setProperty("webdriver.chrome.driver", "C:\\selenium softwares\\chromedriver.exe");
			//how to launch the chrome browser
			WebDriver driver=new ChromeDriver();
			//To pass the url
			driver.get("http://demo.actitime.com");
			//To find the element location
			WebElement eleRef=driver.findElement(By.partialLinkText("Login"));
			//To check whether the element is displayed or not
			boolean eleStatus=eleRef.isDisplayed();
			System.out.println(eleStatus);
			//To quit the browser
			driver.quit();
}

}
