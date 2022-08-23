package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActionPOM {

	 WebDriver driver;//global variable
	 
	 /*
	 1. constructor is not a method but special type of method
	 2. Constructor name should be match with class name
	 3. it has no return type
	 4. we use constructor to access code from one class to another class*/
	   
	 public  DellActionPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	   
	 }
	 
	/* Capturing web elements using locator: Three steps
	 * 1. @FindBy(locator); mostly used xpath, id, name, css. 
	 * 2. Declare the Web Element
	 * 3. Create a method for the Web Element returning the Web Element*/
	    
	@FindBy(css="#unified-masthead-navigation > nav > ul > li:nth-child(3) > button > span")
	//@FindBy(xpath="//a[@href=\"/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_help\"]")  
	WebElement click_Allsoluttion;
	public WebElement Allsolution(){
		   return click_Allsoluttion ;
	  
	}
	   

	//@FindBy(css="#unified-masthead-navigation > nav > ul > li:nth-child(3) > button > span")
	@FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/ul/li[3]/a")  
	WebElement click_Viewallsoluttion;
	public WebElement Viewallsolution(){
		   return click_Viewallsoluttion ;
	  
	}

}
