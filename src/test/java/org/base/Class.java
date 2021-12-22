package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class {

	public static WebDriver driver;
	public static Select s;
public static WebDriver getDriver(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		return driver;

	}

	public static WebElement id(String cid) {
		
		WebElement e = driver.findElement(By.id(cid));
		return e;	
}
	
	public static  WebElement xpath(WebElement element, String name) {
		WebElement findElement = element.findElement(By.xpath(name));
		return element;
	
	}
	
	public static void select(String refname,WebElement location) {
		 s =new Select(location);

	}

	

	
	
	
	
	
	
	
}
