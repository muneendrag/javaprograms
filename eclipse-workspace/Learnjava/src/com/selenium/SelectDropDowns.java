package com.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDowns {
	
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
		driver.navigate().to("file:///C:/Users/munna/Desktop/redbus.html");
		WebElement selRef=driver.findElement(By.xpath("(//select)[1]"));
		Select sel=new Select(selRef);
		//To select by using index
		sel.selectByIndex(3);
		Thread.sleep(3000);
		//To select by using value
		sel.selectByValue("1");
		Thread.sleep(3000);
		//To select by using visible text
		sel.selectByVisibleText("chennai");
		//To get all the options from the select dropdown
		List<WebElement> allSelOptions=sel.getOptions();
		Iterator<WebElement> ie=allSelOptions.iterator();
		while(ie.hasNext()) {
			WebElement indElement=ie.next();
			String indText=indElement.getText();
			System.out.println(indText);
		}
		
	}
}
