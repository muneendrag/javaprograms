package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxVerification {

public static void main(String[] args) {
		
		//To set the system property
		System.setProperty("webdriver.chrome.driver", "C:\\selenium softwares\\chromedriver.exe");
		//how to launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//To pass the url
		driver.get("http://demo.actitime.com");
		//To find the element location
		boolean checkboxStatus=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		System.out.println(checkboxStatus);
		//To perform action on the checkbox
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		boolean checkboxStatusAC=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		System.out.println(checkboxStatusAC);
	}

}
