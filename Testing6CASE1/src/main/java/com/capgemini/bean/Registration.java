package com.capgemini.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration 
{
	@FindBy(name="fname")
	 public WebElement fname;
	
	@FindBy(name="lname")
	public WebElement lname;
	
	@FindBy(name="email")
	public WebElement email;
	@FindBy(name="gender")
	public WebElement gender;
	@FindBy(name="contact")
	public WebElement contact;
	
	@FindBy(name="address")
	public WebElement address;
	
	@FindBy(name="city")
	public WebElement city;
	@FindBy(name="hobby")
	public WebElement hobby;
	@FindBy(name="state")
	public WebElement state;
	
	@FindBy(name="submit")
	public WebElement submit;
	
}
