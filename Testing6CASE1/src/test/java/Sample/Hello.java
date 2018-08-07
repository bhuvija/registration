package Sample;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.capgemini.bean.NextPage;
import com.capgemini.bean.Registration;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hello {
	WebDriver driver;
	Registration registration;
	NextPage next;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("D:\\Users\\byerra\\Documents\\selenium-casestudy1-master\\selenium-casestudy1-master\\Testing6CASE1\\Index.html");
	    registration = PageFactory.initElements(driver, Registration.class);
	    
	}
	
	

	@Given("^firstname is \"([^\"]*)\"$")
	public void username_is_and_password_is(String arg1) throws Throwable {

		Thread.sleep(1000);
		registration.fname.sendKeys(arg1);

		// driver.findElement(By.id("commit")).click();
		

	}

	@Then("^lastname is \"([^\"]*)\"$")
	public void lastname_is(String arg1) throws Throwable 
	{
		Thread.sleep(1000);
		registration.lname.sendKeys(arg1);
	}
	

	@Then("^email is \"([^\"]*)\"$")
	public void email_is(String arg1) throws Throwable 
	{
		Thread.sleep(1000);
		registration.email.sendKeys(arg1);
	}

	@Then("^gender is \"([^\"]*)\"$")
	public void gender_is(String arg1) throws Throwable {
	   Thread.sleep(1000);
	   registration.gender.click();
	}

	
	@Then("^contact is \"([^\"]*)\"$")
	public void contact_is(String arg1) throws Throwable
	{
		Thread.sleep(1000);
		registration.contact.sendKeys(arg1);
	}
	
	@Then("^address is \"([^\"]*)\"$")
	public void address_is(String arg1) throws Throwable 
	{
		Thread.sleep(1000);
		registration.address.sendKeys(arg1);
	}

	@Then("^city is \"([^\"]*)\"$")
	public void city_is(String arg1) throws Throwable
	{
		Thread.sleep(1000);
		registration.city.sendKeys(arg1);
	}

	@Then("^hobby is \"([^\"]*)\" \"([^\"]*)\"$")
	public void hobby_is(String arg1, String arg2) throws Throwable {
	   Thread.sleep(1000);
	   registration.hobby.click();
	   
	}
	@Then("^state is \"([^\"]*)\"$")
	public void state_is(String arg1) throws Throwable 
	{
		Thread.sleep(1000);
		Select dropDown = new Select(registration.state);
		dropDown.selectByValue(arg1);
		
		registration.submit.click();
		Alert jsAlert = driver.switchTo().alert();
		if(jsAlert.getText().equals("validated"))
		{
			Thread.sleep(1000);
			jsAlert.accept();
			driver.navigate().to("D:\\Users\\byerra\\Documents\\selenium-casestudy1-master\\selenium-casestudy1-master\\Testing6CASE1\\nextPage.html");
			next = PageFactory.initElements(driver, NextPage.class);
		}
		else
		{
			
		}
	}
	
	
	@Given("^Project Details are \"([^\"]*)\"$")
	public void Project_Details_are(String arg1) throws Throwable 
	{
		Thread.sleep(1000);
	   next.pdetails.sendKeys(arg1);
	    
	}

	@Then("^Project name is \"([^\"]*)\"$")
	public void Project_name_is(String arg1) throws Throwable 
	{
		Thread.sleep(1000);
		next.pname.sendKeys(arg1);
	}

	@Then("^Client name is \"([^\"]*)\"$")
	public void Client_name_is(String arg1) throws Throwable 
	{
		Thread.sleep(1000);
		next.client.sendKeys(arg1);
	}

	@Then("^Team Size is \"([^\"]*)\"$")
	public void Team_Size_is(String arg1) throws Throwable 
	{
		Thread.sleep(1000);
		next.size.sendKeys(arg1);
		next.register.click();
	}

	
	
	
}
