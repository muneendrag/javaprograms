package com.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleWindows {
	
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
  		driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
  		Set<String> windowHandles=driver.getWindowHandles();
  		Iterator<String> ie=windowHandles.iterator();
  		String parentWindow=ie.next();
  		String childWindow=ie.next();
  		driver.switchTo().window(childWindow);
  		Thread.sleep(3000);
  		driver.findElement(By.id("stationFrom")).sendKeys("bangalore");
  		Thread.sleep(3000);
  		driver.switchTo().window(parentWindow);
  		Thread.sleep(3000);
  		driver.switchTo().window(childWindow);
  		driver.close();
  		driver.quit();
	}

}
