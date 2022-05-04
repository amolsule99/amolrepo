package stepDef;

import org.openqa.selenium.WebDriver;

import com.pages.loginPage;

import Utility.Constant;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverFactory.driverFactoryMMT;

public class defenceStepDef 
{
	private loginPage login=new loginPage(driverFactoryMMT.getDriver());
	WebDriver driver;
	
	@Given("^Soldier is on search page$")
	public void soldier_is_on_search_page() throws Throwable
	{
		driverFactoryMMT.getDriver().get(Constant.URL);
	}
	
	@When("^Soldier click on from button$")
	public void soldier_click_on_from_button() throws Throwable 
	{
	   login.searchFrom();
	   Thread.sleep(7000);
	}

	@When("^Soldier search from \"([^\"]*)\"$")
	public void soldier_search_from(String arg1) throws Throwable
	{
	    login.searchFromCity();
	    Thread.sleep(7000);
	}
	
	@When("^Soldier click on to button$")
	public void soldier_click_on_to_button() throws Throwable 
	{
	    login.searchTo();
	    Thread.sleep(7000);
	}



	@When("^Soldier search to \"([^\"]*)\"$")
	public void soldier_search_to(String arg1) throws Throwable 
	{
	    login.searchToMumbai();
	    Thread.sleep(7000);
	}
	
	@When("^Soldier select option Defence forces$")
	public void soldier_select_option_Defence_forces() throws Throwable 
	{
	    login.defence();
	    Thread.sleep(7000);
	}

	@When("^Soldier click on search button$")
	public void soldier_click_on_search_button() throws Throwable
	{
	    login.search();
	    Thread.sleep(7000);
	}

	@Then("^Soldier should navigate to Soldier page$")
	public void soldier_should_navigate_to_Soldier_page() throws Throwable
	{
	    System.out.println("Soldier page");
	    Thread.sleep(7000);
	}


	

}
