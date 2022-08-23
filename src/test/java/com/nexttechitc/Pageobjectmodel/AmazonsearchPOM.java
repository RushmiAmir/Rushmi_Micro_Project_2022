package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonsearchPOM {

	WebDriver driver;//global variable
	 /*
	  * constructor is not a method but special type of method
	  * 1. Constructor name should be match with classname
	  * 2. it has no return type
	  */
	 //we use constructor to access code from one class to another class
	   public  AmazonsearchPOM (WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
	   }
	 
	    

	   @FindBy(name="field-keywords")
	   //@FindBy(xpath="//a[@href=\"/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_help\"]")  
	   WebElement Type_search;
	   public WebElement amazonsearch(){
		   return Type_search;
	  
	   }
	   
	   @FindBy(id="nav-search-submit-button")
	   //@FindBy(xpath="//a[@href=\"/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_help\"]")  
	   WebElement click_searchicon;
	   public WebElement searchicon(){
		   return click_searchicon;
	  
	   }
	   
}
