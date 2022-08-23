package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBSignupPOM {
	  
	WebDriver driver;//global variable
	
	 /*
	 1. constructor is not a method but special type of method
	 2. Constructor name should be match with class name
	 3. it has no return type
	 4. we use constructor to access code from one class to another class*/
		
	public  FBSignupPOM (WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/* Capturing web elements using locator: Three steps
	 * 1. @FindBy(locator); mostly used xpath, id, name, css. 
	 * 2. Declare the Web Element
	 * 3. Create a method for the Web Element returning the Web Element*/
		 
	@FindBy(xpath="//input [@name=\"firstname\"]")
	//@FindBy(xpath="//*[@name=\"firstname\"]")
	WebElement edit_firstname;
	public WebElement firstname() {
		   return edit_firstname;
	}
		   
	
	@FindBy(name="lastname")
	//@FindBy(name="lastname")
	WebElement edit_lastname;
	public WebElement lastname() {
		 return  edit_lastname;
	}
		  
	
	@FindBy(name="reg_email__")    
	//@FindBy(name="reg_email__")
	WebElement edit_email;
	public WebElement email() {
		 return  edit_email;
	}
		   
	//Added this extra web element for email confirmation
		   
	/*@FindBy(name="reg_email_confirmation__")    
	//@FindBy(name="reg_email__")
	WebElement edit_email_confirmation;
	public WebElement emailconfirmation() {
		 return  edit_email_confirmation;
	}*/
		   

	@FindBy(id="password_step_input")
	//@FindBy(id="password_step_input")
	WebElement edit_password;
	public WebElement password() {
		 return  edit_password;
	}
		       
		    
	@FindBy(id="day")
	public WebElement click_day; 
	
	
	@FindBy(xpath="//select[@id=\"month\"]")
	// @FindBy(xpath="//*[@id=\"month\"]")
	public WebElement click_month;
		       	    
		    
	@FindBy(id="year")
	public WebElement click_year;
		    
		    
	/* Added web element for gender
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/div[1]")
	WebElement click_gender; */
		    
		
	/* Added web element submit button
	@FindBy(name="websubmit")
	Webelement click_submit_button;
	public WebElement click_submit(){
		 return click_submit_button;
	}*/
		    
}


