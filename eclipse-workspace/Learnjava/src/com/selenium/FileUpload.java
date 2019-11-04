package com.selenium;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium softwares\\chromedriver.exe");
		//how to launch the chrome browser
		ChromeOptions option=new ChromeOptions();
		option.addArguments("window-size=1400,800");
		WebDriver driver=new ChromeDriver(option);
		//To Maximize the window
		driver.manage().window().maximize();
		//To delete cookies
		driver.manage().deleteAllCookies();
		//To achieve synchronization
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//To navigate the url
		driver.navigate().to("file:///C://Users//munna//Desktop//Demo.html");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\\\Users\\\\munna\\\\eclipse-workspace\\\\SeleniumSessions\\\\src\\\\LearnSeleniumscreen\\\\google.png");
		Thread.sleep(3000);
		//Runtime.getRuntime().exec("D:\\upload.exe");
	}

}
