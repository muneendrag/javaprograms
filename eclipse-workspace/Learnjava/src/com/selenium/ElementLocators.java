package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementLocators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium softwares\\chromedriver.exe");
		//how to launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//to maximize the window
		driver.manage().window().maximize();
		//to delete cookies
		//driver.manage().deleteAllCookies();
		driver.findElement(By.name("firstname")).sendKeys("Mun");
		driver.findElement(By.name("lastname")).sendKeys("Red");
		driver.findElement(By.name("reg_email__")).sendKeys("8106666666");
		driver.findElement(By.name("reg_passwd__")).sendKeys("MunRed@123");
		
		WebElement dayRef=driver.findElement(By.id("day"));
		Select day=new Select(dayRef);
		day.selectByIndex(8);
		
		Thread.sleep(2000);
		WebElement monthRef=driver.findElement(By.name("birthday_month"));
		Select sel2=new Select(monthRef);
		sel2.selectByValue("10");
		
		Thread.sleep(2000);
		WebElement yearRef=driver.findElement(By.name("birthday_year"));
		Select sel3=new Select(yearRef);
		sel3.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
	}

}
