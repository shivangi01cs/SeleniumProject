package com.telus.handlebrowser;

/* ------------------------------------------------------------
Author	:Shivangi Singh
Project :NxtGen Automation
purpose :This program explains about handling Multiple Browser
Date	:03/08/2022
-------------------------------------------------------------*/


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleBrowser {

	public static void main(String[] args) {
		
		//Set the system property
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		
		//Creating instance of chrome driver
		WebDriver driver=new ChromeDriver();
		
		//Storing the application url
		String url="https://nxtgenaiacademy.com/multiplewindows/";
		
		//Launch the url
		driver.get(url);
		
		//Maximize the application
		driver.manage().window().maximize();
		System.out.println("Parent browser is opened");
		System.out.println();
		
		
		//Opening child browser window
		driver.findElement(By.xpath("//*[@id=\"button1\"]")).click();
		System.out.println("Child browser is opened");
		System.out.println();
		//Getting window's id
		Set<String>windowId=driver.getWindowHandles();
		Iterator<String> iterator=windowId.iterator();
		
		//Storing id's to the respective windows
		String parentPage=iterator.next();
		System.out.println("Parent page window id is: "+parentPage);
		
		String childPage=iterator.next();
		System.out.println("Child page window id is: "+childPage);
		System.out.println();
		
		//Switching the control to the child window
		driver.switchTo().window(childPage);
		System.out.println("Control switched to the child browser");
		
		//Maximize the child browser
		driver.manage().window().maximize();
		
		//Click on Python for Data Science
		driver.findElement(By.partialLinkText("DATA SCIENCE")).click();
		System.out.println("Data Science page is opened in child's browser");
		
		//Close the child browser
		driver.close();
		System.out.println("Child browser closed");
		System.out.println();
		
		//Switching control to the parent window
		driver.switchTo().window(parentPage);
		System.out.println("Control switched to parent browser");
		
		//Click on HOME link
		driver.findElement(By.linkText("HOME")).click();
		System.out.println("Home page is opened in parent page");
		
		//Close the application
		driver.quit();
		System.out.println("Parent browser closed");

	}

}
