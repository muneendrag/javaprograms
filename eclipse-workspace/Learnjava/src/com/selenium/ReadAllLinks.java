package com.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReadAllLinks {
	public static void main(String[] args) {
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
//		List<WebElement> allLinkRef=driver.findElements(By.xpath("//a"));
//		Iterator<WebElement> ie=allLinkRef.iterator();
//		TreeSet<String> ts=new TreeSet<String>();
//		while(ie.hasNext()) {
//			WebElement indElement=ie.next();
//			//ts.add(indElement.getText());
//			ts.add(indElement.getAttribute("href"));
//			
//		}
List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		//Traversing through the list and printing its text along with link address
		for(WebElement link:allLinks){
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
		
		//System.out.println(ts);
	}
		
	
}
