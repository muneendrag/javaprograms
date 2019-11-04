package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {
	
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
		//To navigate the url
		driver.navigate().to("http://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.partialLinkText("Login")).click();
		Thread.sleep(3000);
		String loginurl=driver.getCurrentUrl();
		System.out.println(loginurl);
		//To click on tasks
		driver.findElement(By.cssSelector(".content.tasks")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Add New')]")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name' and @class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("sai");
		Thread.sleep(3000);
		driver.findElement(By.id("customerLightBoxCloseButton")).click();
		Alert alt=driver.switchTo().alert();
		String altText=alt.getText();
		System.out.println(altText);
		alt.accept();
}

}
