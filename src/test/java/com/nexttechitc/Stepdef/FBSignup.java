package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.FBSignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBSignup {
	
	WebDriver driver;
	
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
		
		try {
			//open browser
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe"); 
			driver = new ChromeDriver();
			
			//implicit wait between browser and URL
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
			
			//how to open URL
			driver.get("https://www.facebook.com/reg/");
			//Thread.sleep(3000);
			//maximize window to access every single element
			driver.manage().window().maximize();
		}
		catch(Exception e){
			System.out.println("Browser or URL is not opening!");
		}
	}

	
	@When("^user enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		
		try {
			
			FBSignupPOM obj = new FBSignupPOM(driver);
			
			obj.firstname().sendKeys(arg1);
			Thread.sleep(3000);
			
			obj.lastname().sendKeys(arg2);
			Thread.sleep(3000);
		
			//Explicit wait between web elements
			WebDriverWait wait=new WebDriverWait(driver, 20);
		  
			obj.email().sendKeys(arg3);
			Thread.sleep(3000);
			
			obj.password().sendKeys(arg4);
			Thread.sleep(3000);
			
			
			//Explicit wait between web elements
			WebDriverWait wait1=new WebDriverWait(driver, 20);
		}
		catch(Exception e) {
			System.out.println("Element not found!!");
		}
	}
		

	
	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
		
		try {
		
			FBSignupPOM obj = new FBSignupPOM(driver);
		
			Select dropdown = new Select (obj.click_day);
			dropdown.selectByValue("2");
			Thread.sleep(3000);
			//Explicit wait between web elements
			WebDriverWait wait=new WebDriverWait(driver, 20);
		
			Select dropdown1 = new Select (obj.click_month);
			dropdown1.selectByIndex(2);
			Thread.sleep(3000);
			//Explicit wait between web elements
			WebDriverWait wait1=new WebDriverWait(driver, 20);
			
			Select dropdown2 = new Select (obj.click_year);
			dropdown2.selectByVisibleText("2000");
			Thread.sleep(3000);
			//Explicit wait between web elements
			WebDriverWait wait2=new WebDriverWait(driver, 20);
			
			driver.quit();
		}
		catch(Exception e) {
			System.out.println("Element not found!!");
		}
	    
	}

}
