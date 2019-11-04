package com.selenium;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Screenshot {
	
	public static void main(String[] args) throws IOException {
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
//  		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]"));
//  		element.click();
  		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  		File destFile=new File("C:\\selenium softwares\\screenshot2.jpeg");
  		FileUtils.copyFile(srcFile, destFile, true);
		System.out.println("screenshot taken");
	}

}
