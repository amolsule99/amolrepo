package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pages.loginPage;

import Utility.Constant;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverFactory.driverFactoryMMT;

public class loginStepDef 
{
	private loginPage login=new loginPage(driverFactoryMMT.getDriver());
	WebDriver driver;
	

	@Given("^User is on main page$")
	public void user_is_on_main_page() throws Throwable
	{
	   
		driverFactoryMMT.getDriver().get(Constant.URL);
		
	}

	@When("^User click on from button$")
	public void user_click_on_from_button() throws Throwable 
	{
		login.searchFrom();
		
		Thread.sleep(10000);
		
	}
	
	@When("^User select from \"([^\"]*)\"$")
	public void user_select_from(String arg1) throws Throwable
	{
		login.searchFromCity();
		Thread.sleep(10000);
	   
	}

	
	@When("^User click on to button$")
	public void user_click_on_to_button() throws Throwable 
	{
		login.searchTo();
		Thread.sleep(10000);
	}

	@When("^User select to \"([^\"]*)\"$")
	public void user_select_to(String arg1) throws Throwable 
	{
	    login.searchToCity();
	    Thread.sleep(10000);
	}
	
	@When("^User click on search button$")
	public void user_click_on_search_button() throws Throwable 
	{
	    login.search();
	    Thread.sleep(10000);
	}
	
	@Then("^Website shows Alert$")
	public void website_shows_Alert() throws Throwable 
	{
	    login.alert();
	    Thread.sleep(10000);
	    
	}

	
	

	

	
}
