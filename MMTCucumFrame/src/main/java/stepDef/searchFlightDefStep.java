package stepDef;

import org.openqa.selenium.WebDriver;

import com.pages.filterPage;
import com.pages.loginPage;

import Utility.Constant;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverFactory.driverFactoryMMT;

public class searchFlightDefStep 
{
	private loginPage login=new loginPage(driverFactoryMMT.getDriver());
	WebDriver driver;
	
	private filterPage filter=new filterPage(driverFactoryMMT.getDriver());

	@Given("^Soldier Is On Flight Search Page$")
	public void soldier_Is_On_Flight_Search_Page() throws Throwable 
	{
		driverFactoryMMT.getDriver().get(Constant.URL1);
	}

	

	@When("^Soldier select nonstop filter$")
	public void soldier_select_nonstop_filter() throws Throwable
	{
	    filter.nonstop();
	    Thread.sleep(5000);
	}

	@When("^Click on search button$")
	public void click_on_search_button() throws Throwable 
	{
	   filter.search();
	   Thread.sleep(5000);
	}

	@Then("^Non stop flights for Soldier get available$")
	public void non_stop_flights_for_Soldier_get_available() throws Throwable
	{
	   System.out.println("Non-stop flight for Defence will show");
	   Thread.sleep(5000);
	}
	
	@Given("^Soldier is on Non Stop Flight Page$")
	public void soldier_is_on_Non_Stop_Flight_Page() throws Throwable 
	{
		driverFactoryMMT.getDriver().get(Constant.URL2);
	}

	@When("^Soldier click on Go First Book flight$")
	public void soldier_click_on_Go_First_Book_flight() throws Throwable
	{
	   filter.bookGoFirst();
	}

	@Then("^Booking page will be open$")
	public void booking_page_will_be_open() throws Throwable 
	{
	    System.out.println("Booking page will be open");
	}



	
	


	
	


	
}
