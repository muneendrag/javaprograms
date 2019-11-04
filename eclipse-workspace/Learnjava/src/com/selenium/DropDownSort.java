package com.selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSort {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//to luanch the browser
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement ele = driver.findElement(By.id("animals"));
		Select sel=new Select(ele);
		List<WebElement> options=sel.getOptions();
		Iterator<WebElement> ie=options.iterator();
		while(ie.hasNext()){
			WebElement ele1=ie.next();
			String text=ele1.getText();
			System.out.println(text);
			//System.out.println(options.get);
			
			//ArrayList tempList=new ArrayList();
			//tempList=text;
		}
		
		
	}
	}

