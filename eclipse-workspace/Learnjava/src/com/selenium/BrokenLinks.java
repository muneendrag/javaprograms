package com.selenium;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrokenLinks {
    public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium softwares\\chromedriver.exe");
		//how to launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to delete cookies
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		allLinks.addAll(driver.findElements(By.tagName("img")));
		System.out.println("alllinks in webpage:"+allLinks.size());
		ArrayList<WebElement> activeLinks = new ArrayList<WebElement>();
		for(int i=0;i<allLinks.size();i++) {
			if(allLinks.get(i).getAttribute("href")!=null) {
				activeLinks.add(allLinks.get(i));
			}
		}
		System.out.println("activelinks in webpage"+activeLinks.size());
		for(int j=0;j<activeLinks.size();j++) {
		     HttpURLConnection connection=(HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
		     connection.setConnectTimeout(2000);
		     connection.connect();
		     String response=connection.getResponseMessage();
		     if(connection.getResponseCode()==200) {
		    	 System.out.println(activeLinks.get(j).getAttribute("href")+"--->"+response);
		     }
		     else {
		    	 System.out.println(activeLinks.get(j).getAttribute("href")+"--->"+response);
		     }
		}	
	}
}
