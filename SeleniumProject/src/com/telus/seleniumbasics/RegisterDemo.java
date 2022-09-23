package com.telus.seleniumbasics;

/* -----------------------------------------------------------------------------
Author	:Shivangi Singh
Project :NxtGen Automation
purpose :This program explains about User Registration[End to End Demo]
Date	:29/07/2022
---------------------------------------------------------------------------------*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterDemo {

	public static void main(String[] args) {

		//Set System property
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");

		//Creating instance of ChromeDriver
		WebDriver driver=new ChromeDriver();

		//Input Data
		String firstNameValue="Shivangi";
		String lastNameValue="Singh";
		String streetAddress="Lalganj Raebareli";
		String aptAddressValue="H2 Block ,Apt 243";
		String cityValue="Raebareli";
		String stateValue="Uttar Pradesh";
		String zipCodeValue="229206";
		String countryValue="India";
		String emailValue="shivangi01cs@gmail.com";
		String dateValue="27/07/2022";
		String hrsValue="03";
		String mntsValue="30";
		String mobileNum="1234567890";
		String queryInputValue="Do we get notes also?";



		//Storing the Application Url
		String Url="https://nxtgenaiacademy.com/";

		//Launch the Url
		driver.get(Url);
		System.out.println("Welcome to the NXTGen AI Academy's Home Page");
		System.out.println();

		//Maximize the Application
		driver.manage().window().maximize();

		//Create instance of Actions class
		Actions action=new Actions(driver);


		//Create web element object for QA Automation text 
		WebElement qaAutomation=driver.findElement(By.linkText("QA AUTOMATION"));

		//Verify if QA Automation text is displayed or not
		if(qaAutomation.isDisplayed()){
			System.out.println("QA Automation option is displayed");
			System.out.println("Elaborating QA Automation option to Register a user ");
			//Mouse hover on QA AUTOMATION
			action.moveToElement(qaAutomation).perform();
			System.out.println();
			
			//Mouse hover on Practice Automation
			WebElement practiceAutomation=driver.findElement(By.linkText("Practice Automation"));
			action.moveToElement(practiceAutomation).perform();
			
			//Click on registration form
			WebElement registrationForm=driver.findElement(By.partialLinkText("Registration Form"));
			registrationForm.click();
			System.out.println("Registration Page displayed successfully");


		}
		else {
			System.out.println("QA Automation is not displayed");
		}

		

		//For Registration Page Title
		//Create the web element object for Registration page
		WebElement regTitle=driver.findElement(By.xpath("//*[@id=\"item-vfb-1\"]/div/h3"));


		//verify the title
		if(regTitle.isDisplayed()) {
			System.out.println("Registration Title is displayed");
		}
		else
		{
			System.out.println("Registration Title is not displayed");
		}

		//Validating The title
		String actRegTitle=regTitle.getText();
		String expRegTitle="Register For Demo";
		if(actRegTitle.equals(expRegTitle)) {
			System.out.println("The Registration Title of the page is: "+actRegTitle);
			System.out.println();
		}
		else {
			System.out.println("Actual and Expected Title are not same");
			System.out.println("The Actual Registration Title is "+actRegTitle );
			System.out.println("The Expected Registration Title is "+expRegTitle);
		}

		//Create web element object for first name 
		WebElement firstName=driver.findElement(By.id("vfb-5"));

		//Verify if first name displayed or not 
		if(firstName.isDisplayed()) {
			System.out.println("First Name is displayed");
		}
		else {
			System.out.println("First Name is not displayed");
		}

		//Verify if first name enabled or not
		if(firstName.isEnabled()) {
			System.out.println("First Name is enabled");
			firstName.sendKeys(firstNameValue);
			System.out.println("First Name is : "+firstNameValue);
			System.out.println();
		}
		else {
			System.out.println("First Name is not enabled");
		}



		//Create web element object for the last name 
		WebElement lastName=driver.findElement(By.id("vfb-7"));

		//Verify if last name displayed or not
		if(lastName.isDisplayed()) {
			System.out.println("Last Name is displayed");
		}
		else {
			System.out.println("Last Name is not displayed");
		}

		//Verify if last name enabled or not
		if(lastName.isEnabled()) {
			System.out.println("Last Name is enabled");
			lastName.sendKeys(lastNameValue);
			System.out.println("Last Name is: "+lastNameValue);
			System.out.println();
		}
		else {
			System.out.println("Last Name is not enabled");
		}



		//Create web element object for female Radio Button
		WebElement femaleRadioBtn=driver.findElement(By.id("vfb-8-2"));

		//Verify if female Radio Button displayed or not
		if(femaleRadioBtn.isDisplayed()) {
			System.out.println("female Radio Button is displayed");
		}
		else {
			System.out.println("female Radio Button is not displayed");
		}

		//Verify if female Radio Button enabled or not
		if(femaleRadioBtn.isEnabled()) {
			System.out.println("female Radio Button is enabled");
		}
		else {
			System.out.println("female Radio Button is not enabled");
		}

		//verify if female Radio Button selected or not 
		if(femaleRadioBtn.isSelected()) {
			System.out.println("female Radio Button is selected");
		}
		else {
			System.out.println("female Radio Button is not selected");
			femaleRadioBtn.click();
		}

		//verify if female Radio Button selected or not 
		if(femaleRadioBtn.isSelected()) {
			System.out.println("female Radio Button is selected");
			System.out.println();
		}
		else {
			System.out.println("female Radio Button is not selected");
		}



		//Create web element object for street address  
		WebElement address=driver.findElement(By.id("vfb-13-address"));

		//Verify if street address is displayed or not
		if(address.isDisplayed()) {
			System.out.println("Address is displayed");
		}
		else {
			System.out.println("Address is not displayed");
		}

		//Verify if street address is enabled or not
		if(address.isEnabled()) {
			System.out.println("Address is enabled");
			address.sendKeys(streetAddress);
			System.out.println("Address is: "+streetAddress);
			System.out.println();
		}
		else {
			System.out.println("Address is not enabled");
		}



		//Create web element object for apt,suite,bldg
		WebElement aptAddress=driver.findElement(By.id("vfb-13-address-2"));

		//Verify if apt address is displayed or not 
		if(aptAddress.isDisplayed()){
			System.out.println("apt ,suite,bldg address is displayed");
		}
		else {
			System.out.println("apt ,suite,bldg address is not displayed");
		}

		//Verify if apt address is enabled or not 
		if(aptAddress.isEnabled()){
			System.out.println("apt ,suite,bldg address is enabled");
			aptAddress.sendKeys(aptAddressValue);
			System.out.println("apt ,suite,bldg address is : "+aptAddressValue);
			System.out.println();
		}
		else {
			System.out.println("apt ,suite,bldg address is not enabled");
		}



		//Create web element object for city
		WebElement city=driver.findElement(By.id("vfb-13-city"));

		//Verify if city is displayed or not 
		if(city.isDisplayed()){
			System.out.println("city is displayed");
		}
		else {
			System.out.println("city is not displayed");
		}

		//Verify if city is enabled or not 
		if(city.isEnabled()){
			System.out.println("city is enabled");
			city.sendKeys(cityValue);
			System.out.println("city is : "+cityValue);
			System.out.println();
		}
		else {
			System.out.println("city is not enabled");
		}



		//Create web element object for state
		WebElement state=driver.findElement(By.id("vfb-13-state"));

		//Verify if state is displayed or not 
		if(state.isDisplayed()){
			System.out.println("state is displayed");
		}
		else {
			System.out.println("state is not displayed");
		}

		//Verify if state is enabled or not 
		if(state.isEnabled()){
			System.out.println("state is enabled");
			state.sendKeys(stateValue);
			System.out.println("state is : "+stateValue);
			System.out.println();
		}
		else {
			System.out.println("state is not enabled");
		}



		//Create web element for Postal/Zip Code
		WebElement zipCode=driver.findElement(By.id("vfb-13-zip"));

		//Verify if Zip code is displayed or not
		if(zipCode.isDisplayed()){
			System.out.println("Zip Code is displayed");
		}
		else {
			System.out.println("Zip Code is not displayed");
		}

		//Verify if zip code is enabled or not 
		if(zipCode.isEnabled()){
			System.out.println("Zip Code is enabled");
			zipCode.sendKeys(zipCodeValue);
			System.out.println("Zip Code is : "+zipCodeValue);
			System.out.println();
		}
		else {
			System.out.println("Zip Code is not enabled");
		}



		//Enter country from Drop Down
		//Create web element object for country
		WebElement countryDropDown=driver.findElement(By.id("vfb-13-country"));

		//Verify if country Drop Down is displayed or not
		if(countryDropDown.isDisplayed()) {
			System.out.println("country Drop Down is displayed");
		}
		else {
			System.out.println("country Drop Down is not displayed");
		}

		//Verify if country Drop Down is enabled or not
		if(countryDropDown.isEnabled()) {
			System.out.println("country Drop Down is Enabled");
			Select cDropDown = new Select(countryDropDown);
			cDropDown.selectByVisibleText(countryValue);
			System.out.println("country is slected from country DropDown : "+countryValue);
			System.out.println();
		}
		else {
			System.out.println("country Drop Down is not Enabled");
		}


		//Create web element object for email
		WebElement email=driver.findElement(By.id("vfb-14"));

		//Verify if email is displayed or not
		if(email.isDisplayed()){
			System.out.println("email is displayed");
		}
		else {
			System.out.println("email is not displayed");
		}

		//Verify if email is enabled or not 
		if(email.isEnabled()){
			System.out.println("email is enabled");
			email.sendKeys(emailValue);
			System.out.println("email is : "+emailValue);
			System.out.println();
		}
		else {
			System.out.println("email is not enabled");
		}



		//Create web element object for Date of Demo
		WebElement date=driver.findElement(By.id("vfb-18"));

		//Verify if Date of Demo is displayed or not
		if(date.isDisplayed()){
			System.out.println("Date of Demo is displayed");
		}
		else {
			System.out.println("Date of Demo is not displayed");
		}

		//Verify if Date of Demo is enabled or not 
		if(date.isEnabled()){
			System.out.println("Date of Demo is enabled");
			date.sendKeys(dateValue);
			System.out.println("Date of Demo is : "+dateValue);
			System.out.println();
		}
		else {
			System.out.println("Date of Demo is not enabled");
		}

		//Enter Time
		//For hours

		//Create web element object for hour drop down
		WebElement hourDropDown =driver.findElement(By.id("vfb-16-hour"));

		//Verify if hour DropDown displayed or not 
		if(hourDropDown.isDisplayed()) {
			System.out.println("hour Drop Down is displayed");
		}
		else {
			System.out.println("hour Drop Down is not displayed");
		}

		//Verify if hour DropDown is enabled or not
		if(hourDropDown.isEnabled()) {
			System.out.println("hour Drop Down is enabled");
			//create select object
			Select hrsDropDown=new Select(hourDropDown);
			hrsDropDown.selectByVisibleText(hrsValue);
			System.out.println("hour is slected from HH drop down : "+hrsValue);
			System.out.println();
		}
		else {
			System.out.println("hour Drop Down is not enabled");
		}


		//For minutes
		//Create web element object for minutes drop down
		WebElement mntsDropDown =driver.findElement(By.id("vfb-16-min"));

		//Verify if minutes Drop Down displayed or not 
		if(mntsDropDown.isDisplayed()) {
			System.out.println("minutes Drop Down is displayed");
		}
		else {
			System.out.println("minutes Drop Down is not displayed");
		}

		//Verify if minutes DropDown is enabled or not
		if(mntsDropDown.isEnabled()) {
			System.out.println("minutes Drop Down is enabled");
			//create select object
			Select minuteDropDown=new Select(mntsDropDown);
			minuteDropDown.selectByVisibleText(mntsValue);
			System.out.println("minutes are slected from MM drop down : "+mntsValue);
			System.out.println();
		}
		else {
			System.out.println("minutes Drop Down is not enabled");
		}


		//For mobile number
		//Create web element object for mobile number
		WebElement mobileNumber=driver.findElement(By.id("vfb-19"));


		//Verify if mobile Number is displayed or not
		if(mobileNumber.isDisplayed()){
			System.out.println("mobile Number is displayed");
		}
		else {
			System.out.println("mobile Number is not displayed");
		}

		//Verify if mobile Number is enabled or not 
		if(mobileNumber.isEnabled()){
			System.out.println("mobile Number is enabled");
			mobileNumber.sendKeys(mobileNum);
			System.out.println("mobileNumber is : "+mobileNum);
			System.out.println(" ");
		}
		else {
			System.out.println("mobile Number is not enabled");
		}


		//Select course
		//For testNG course

		//Create web element for check box
		WebElement testNGCheckBox=driver.findElement(By.id("vfb-20-2"));

		//Verify if testNG CheckBox is displayed or not
		if(testNGCheckBox.isDisplayed()){
			System.out.println("testNG CheckBox is displayed");
		}
		else {
			System.out.println("testNG CheckBox is not displayed");
		}

		//Verify if testNG CheckBox is enabled or not 
		if(testNGCheckBox.isEnabled()){
			System.out.println("testNG CheckBox is enabled");
		}
		else {
			System.out.println("testNG CheckBox is not enabled");
		}

		//Verify if testNG CheckBox is selected or not
		if(testNGCheckBox.isSelected()){
			System.out.println("testNG CheckBox is selected");
		}
		else {
			System.out.println("testNG CheckBox is not selected");
			testNGCheckBox.click();
		}

		//Verify if testNG CheckBox is selected or not
		if(testNGCheckBox.isSelected()){
			System.out.println("testNG CheckBox is selected");
			System.out.println();
		}
		else {
			System.out.println("testNG CheckBox is not selected");
		}

		//For core java course
		//Create web element for check box
		WebElement coreJavaCheckBox=driver.findElement(By.id("vfb-20-3"));

		//Verify if core Java CheckBox is displayed or not
		if(coreJavaCheckBox.isDisplayed()){
			System.out.println("core Java CheckBox is displayed");
		}
		else {
			System.out.println("core Java CheckBox is not displayed");
		}

		//Verify if core Java CheckBox is enabled or not 
		if(coreJavaCheckBox.isEnabled()){
			System.out.println("core Java CheckBox is enabled");
		}
		else {
			System.out.println("core Java CheckBox is not enabled");
		}

		//Verify if core Java CheckBox is selected or not
		if(coreJavaCheckBox.isSelected()){
			System.out.println("core Java CheckBox is selected");
		}
		else {
			System.out.println("core Java CheckBox is not selected");
			coreJavaCheckBox.click();
		}

		//Verify if core Java CheckBox is selected or not
		if(coreJavaCheckBox.isSelected()){
			System.out.println("core Java CheckBox is selected");
			System.out.println();
		}
		else {
			System.out.println("core Java CheckBox is not selected");
		}



		//Enter the query
		//Create web element for query box
		WebElement queryBox=driver.findElement(By.id("vfb-23"));

		//Verify if query box is displayed or not
		if(queryBox.isDisplayed()){
			System.out.println("query Box is displayed");
		}
		else {
			System.out.println("query Box is not displayed");
		}

		//Verify if query box is enabled or not 
		if(queryBox.isEnabled()){
			System.out.println("query Box is enabled");
			queryBox.sendKeys(queryInputValue);
			System.out.println("query is : "+queryInputValue);
			System.out.println();
		}
		else {
			System.out.println("query Box is not enabled");
		}


		//Enter code for verification
		//Create web element object for verification text
		WebElement verificationcode=driver.findElement(By.xpath("//*[@id=\"item-vfb-2\"]/ul/li[1]/span/label"));

		//Verify if verification text is displayed or not
		if(verificationcode.isDisplayed()){
			System.out.println("verification text is displayed");

			//Getting the text from Xpath
			String code=verificationcode.getText();

			//Splitting the value 
			String getCode[]=code.split(":");

			//Create web element object for verification box
			WebElement enterCode=driver.findElement(By.id("vfb-3"));

			//Verify if verification box is displayed or not
			if(enterCode.isDisplayed()){
				System.out.println("verification box is displayed");
			}
			else {
				System.out.println("verification box is not displayed");
			}

			//Verify verification box is enabled or not
			if(enterCode.isEnabled()){
				System.out.println("verification box is enabled");
				enterCode.sendKeys(getCode[1].trim());
				System.out.println("Entered code is : "+getCode[1].trim());
				System.out.println();
			}
			else {
				System.out.println("verification box is not enabled");
			}
		}
		else {
			System.out.println("verification text is not displayed");
		}



		//Click on submit button
		//Create web element object for submit button
		WebElement submitBtn=driver.findElement(By.id("vfb-4"));

		//Verify if submit Button is displayed or not
		if(submitBtn.isDisplayed()){
			System.out.println("submit Button is displayed");
		}
		else {
			System.out.println("submit Button is not displayed");
		}

		//Verify if submit Button is enabled or not 
		if(submitBtn.isEnabled()){
			System.out.println("submit Button is enabled");
			submitBtn.click();
			System.out.println("submit Button clicked successfully");
			System.out.println();
		}
		else {
			System.out.println("submit Button is not enabled");
		}


		//Check successful text message validation
		//Create web element object for successful text validation
		WebElement validationText=driver.findElement(By.xpath("//*[contains(text(),'Registration Form is Successfully Submitted')]"));

		//Verify if validation text is displayed or not
		if(validationText.isDisplayed()){
			System.out.println("validation Text is displayed");

			//Getting text from Xpath
			String actValidationText=validationText.getText();

			//Splitting the value 
			String fetchCode[]=actValidationText.split("The");

			//Fetched values are
			String expValidationText=fetchCode[0];
			String transactionId[]=actValidationText.split(":");

			//String expValidationText="Registration Form is Successfully Submitted.";
			if(actValidationText.contains(expValidationText)) {
				System.out.println("The registration title of the page is : "+expValidationText);
				System.out.println("The trancation id is : "+transactionId[1].trim());
				System.out.println();
			}
			else {
				System.out.println("Actual and Expected registration title are not same");
				System.out.println("The Actual Title is : "+actValidationText);
				System.out.println("The Expected Title is : "+expValidationText);
				System.out.println();
			}
		}
		else {
			System.out.println("validationText is not displayed");
		}

		//Close the Application
		driver.quit();
		System.out.println("Application closed successfully.");
	}

}

