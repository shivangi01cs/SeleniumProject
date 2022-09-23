package com.telus.seleniumbasics;

/* --------------------------------------
Author	:Shivangi Singh


Project :NxtGen Automation
purpose :This program explains about Locators
Date	:27/07/2022
------------------------------------------*/

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		
		//1.id locator
		driver.findElement(By.id("session_key")).sendKeys("Shivangi");
		
		//2.name locator
		driver.findElement(By.name("session_password")).sendKeys("12345");
		
		//3.xpath locator
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/div[2]/div[2]/button")).click();
		
		//4.CSS Selector
		driver.findElement(By.cssSelector("#main-content > section.section.min-h-\\[560px\\].flex-nowrap.pt-\\[40px\\].babybear\\:flex-col.babybear\\:min-h-\\[0\\].babybear\\:px-mobile-container-padding.babybear\\:pt-\\[24px\\] > div > div > form > a")).click();
		
		//5.linkText locator
		driver.findElement(By.linkText("Back")).click();
		
		//6.partialLinkText
		driver.findElement(By.partialLinkText("Forgot")).click();
	
	}
	

}
