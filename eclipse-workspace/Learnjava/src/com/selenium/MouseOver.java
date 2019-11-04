package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//to luanch the browser
		driver.get("https://www.spicejet.com/");
		//to maximize the browser
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Login / Signup']"))).build().perform();
		action.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Member Login")).click();
		driver.findElement(By.partialLinkText("SIGN UP")).click();
		
	}

}
