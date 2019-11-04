package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//to luanch the browser
		driver.get("http://demo.automationtesting.in/Windows.html");
		//driver.findElement(By.xpath("//ul/li[1]/a[@class='analystic']")).click();
		driver.findElement(By.xpath("//a//button[contains(text(),'click')]")).click();
		
		//System.out.println(driver.getTitle());
		Set<String> wh = driver.getWindowHandles();
		for(String i:wh) {
			System.out.println(i);
			String title=driver.switchTo().window(i).getTitle();
			System.out.println(title);
			if(title.contains("Frames & windows")) {
				driver.close();
			}
		}
	}

}
