package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium softwares\\chromedriver.exe");
		//how to launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//To Maximize the window
		driver.manage().window().maximize();
		//To delete cookies
		driver.manage().deleteAllCookies();
		//To achieve synchronization
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://admin-demo.nopcommerce.com/Admin/Order/List");
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		WebElement date=driver.findElement(By.id("StartDate"));
		String dateValue="29/08/2010";
		selectByJS(driver, date, dateValue);
		Thread.sleep(3000);
	}
	public static void selectByJS(WebDriver driver,WebElement element,String dateValue) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+dateValue+"');",element);
		
	}
}