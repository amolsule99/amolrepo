package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class filterPage
{
	private WebDriver driver;

	private By NonStop =By.id("PPchkNonStop");
	private By searchButton=By.id("btnSrch");
	
	private By bookGoFiirst=By.id("btnSeg0");
	
	public filterPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
public void nonstop()
{
	driver.findElement(NonStop).click();
}

public void search()
{
	driver.findElement(searchButton).click();
}

public void bookGoFirst()
{
	driver.findElement(bookGoFiirst).click();
}

}
