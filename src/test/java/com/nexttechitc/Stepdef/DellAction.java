package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.DellActionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction {
	

	WebDriver driver;
	
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
	    
		try {
			//open browser
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe"); 
			driver = new ChromeDriver();
			
			//implicit wait between browser and URL
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
			
			//how to open URL
			driver.get("https://www.dell.com.au/");
			Thread.sleep(5000);
			
			//maximize window to access every single element
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
		}
		catch(Exception e){
		System.out.println("Browser or URL is not opening!");
		}
		
	}
	

	@When("^user go to Solutions dropdown menu and able to see View All Solutions$")
	public void user_go_to_Solutions_dropdown_menu_and_able_to_see_View_All_Solutions() throws Throwable {
	  try {  
		
		  Actions act = new Actions(driver);//act is object for Action class
		  DellActionPOM obj = new DellActionPOM(driver);
		  
		  act.moveToElement(obj.Allsolution()).build().perform();
		  Thread.sleep(5000);
		  obj.Viewallsolution().click();
		  
		  //Explicit wait between web elements
		  WebDriverWait wait=new WebDriverWait(driver, 20);
		  
	  }
	  catch(Exception e) {
		  System.out.println("Element not found!!");
	  }
	  
	}
	  

	@Then("^user redirects to solution portfolio$")
	public void user_redirects_to_solution_portfolio() throws Throwable {
		
		driver.quit();
	    
	}

}
