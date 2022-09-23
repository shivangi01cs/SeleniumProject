package com.telus.webtables;

/* --------------------------------------
Author	:Shivangi Singh
Project :NxtGen Automation
purpose :This program explains Dynamic Web Table
Date	:03/08/2022
------------------------------------------*/

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {

	public static void main(String[] args) {
		//Setting the system property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Creating instance of chrome driver
		WebDriver driver=new ChromeDriver();

		//Storing application url 
		String url="https://money.rediff.com/gainers/bsc/daily/groupa";
		String company="Gati Ltd.";

		//Launch the url
		driver.get(url);

		//Maximize the application
		driver.manage().window().maximize();

		//Identify the table
		String tableXpath="//*[@id=\"leftcontainer\"]/table";
		WebElement CompanyTable=driver.findElement(By.xpath(tableXpath));

		//Locate rows of the table
		List<WebElement> rowTable=CompanyTable.findElements(By.tagName("tr"));

		//claculate the total number of rows
		int rowCount=rowTable.size();
		//System.out.println(rowCount);

		//For loop - this loop will execute till last row of the table
		outerloop:
		for(int row=0;row<rowCount;row++) {

			//locate the column of specific row
			List<WebElement> columnRow=rowTable.get(row).findElements(By.tagName("td"));


			//Calculate total number of columns
			int colCount=columnRow.size();
			//System.out.println(colCount);


			//For loop - this loop will execute till last column of the table
			for(int col=0;col<colCount;col++) {


				//Retrieve all cell text
				String cellText=columnRow.get(col).getText();
				//System.out.println(cellText);


				//Retrieve all column value for given company name
				if(cellText.equals(company)) {
					
					// Company Name
					String companyName = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[1]/a")).getText();
					System.out.println("Company Name is : "+companyName);
					
					// Group
					String group = 
					driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[2]")).getText();
					System.out.println("Company Group is : "+group);
					
					// Prev Close Price
					String prevPrice = 
					driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[3]")).getText();
					System.out.println("Previous Price is : "+prevPrice);
					
					// Current Price
					String currentPrice = 
					driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[4]")).getText();
					System.out.println("Current Price is : "+currentPrice);
					
					// % Change
					String change = 
					driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[5]/font")).getText();
					System.out.println("Company % of Change is : "+change);
					break outerloop;
				}
				
			}
			
		}
		
		//close the application
		driver.quit();
		System.out.println("Application closed.");
		
	}
}