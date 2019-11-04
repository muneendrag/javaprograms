package com.selenium;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderAbhi {

	public static void main(String[] args) {
		
		  ChromeOptions ops = new ChromeOptions();
		  ops.addArguments("--disable-notifications");
		  System.setProperty("webdriver.chrome.driver","C:\\selenium softwares\\chromedriver.exe"); 
		  WebDriver driver=new ChromeDriver(ops); 
		  //to luanch the browser 
		  driver.get("https://www.abhibus.com/abhioffer?gclid=CjwKCAjwqZPrBRBnEiwAmNJsNkVnfbIAYpa_0V0fqZyH6nO0TzVhyyNb7szRGQ8mo4iKU0ytZ7bk7BoCPGEQAvD_BwE");
		  //to maximize the browser 
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.id("datepicker1")).click(); //String
		
		 
		Date d1 = new Date();
		SimpleDateFormat d2 = new SimpleDateFormat("dd/MM/yyyy");
		String d3 = d2.format(d1);
		System.out.println(d3);
		String d4[] = d3.split("/");
		int d5 = Integer.parseInt(d4[1]);
		int d6 = d5 - 1;
		driver.findElement(By.xpath("//td[@data-month='" + d6 + "' and @data-year='" + d4[2] + "']/a[text()='" + d4[0] + "']")).click();

	}

}
