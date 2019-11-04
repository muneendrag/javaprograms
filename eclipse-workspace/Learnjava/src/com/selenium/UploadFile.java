package com.selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
public static void main(String[] args) throws InterruptedException {
		//To set the system property
				System.setProperty("webdriver.chrome.driver", "C:\\selenium softwares\\chromedriver.exe");
				//how to launch the chrome browser
				WebDriver driver=new ChromeDriver();
				//To Maximize the window
				driver.manage().window().maximize();
				//To delete cookies
				driver.manage().deleteAllCookies();
				//To achieve synchronization
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(2000);
				driver.get("file:///C://Users//munna//Desktop//Demo.html");
				
				driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\munna\\"
						+ "eclipse-workspace\\SeleniumSessions\\src\\LearnSeleniumscreen\\google.png");               	
          }
}



