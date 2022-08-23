package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.AmazonsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonsearch {
	
	WebDriver driver;
	
	@Given("^users visits Amazon homepage$")
	public void users_visits_Amazon_homepage() throws Throwable {
		try {
				//open browser
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe"); 
				driver = new ChromeDriver();
				
				//implicit wait between browser and URL
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
				
				//how to open URL
				driver.get("https://www.amazon.com.au/");
				//Thread.sleep(3000);
				
				//maximize window to access every single element
				driver.manage().window().maximize();
		}
		catch(Exception e){
			System.out.println("Browser or URL is not opening!");
		}
	}

	
	@When("^user types \"([^\"]*)\" and click search icon$")
	public void user_types_and_click_search_icon(String arg1) throws Throwable {
		try {
			AmazonsearchPOM obj = new AmazonsearchPOM(driver);
			obj.amazonsearch().sendKeys(arg1);
			obj.searchicon().click();
		
			//Explicit wait between web elements
			WebDriverWait wait=new WebDriverWait(driver, 20);
		}
		catch(Exception e) {
			System.out.println("Amazon search option is not working!!");
		}
	}

	
	@Then("^User should be able to see the expected product$")
	public void user_should_be_able_to_see_the_expected_product() throws Throwable {
	   
		driver.quit();
	}

}
