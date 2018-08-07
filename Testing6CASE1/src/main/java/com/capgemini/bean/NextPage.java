package com.capgemini.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NextPage 
{

	@FindBy(name = "pdetails")
	public WebElement pdetails;
	
	@FindBy(name = "pname")
	public WebElement pname;
	
	@FindBy(name = "client")
	public WebElement client;
	
	@FindBy(name = "size")
	public WebElement size;
	
	@FindBy(name = "register")
	public WebElement register;
}
