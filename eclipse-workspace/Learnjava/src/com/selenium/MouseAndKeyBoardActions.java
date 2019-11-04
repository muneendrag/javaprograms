package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyBoardActions {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        //To set the system property
  		System.setProperty("webdriver.chrome.driver", "C:\\selenium softwares\\chromedriver.exe");
  		//how to launch the chrome browser
  		WebDriver driver=new ChromeDriver(ops);
  		driver.manage().window().maximize();
  		driver.manage().deleteAllCookies();
  		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  		driver.get("http://irctc.co.in");
  		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]"));
  		Actions act=new Actions(driver);
  		act.moveToElement(element).build().perform();
  		act.contextClick().build().perform();
  		//act.sendKeys(Keys.F5).perform();
  		Thread.sleep(3000);
  		act.sendKeys(Keys.DOWN).perform();
  		Thread.sleep(3000);

  		act.sendKeys(Keys.DOWN).perform();
  		Thread.sleep(3000);
   		act.sendKeys(Keys.ENTER).perform();
	}

}
