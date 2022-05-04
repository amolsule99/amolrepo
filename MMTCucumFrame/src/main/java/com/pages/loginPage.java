package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage 
{
 
	private WebDriver driver;
	
	
	
	private By searchBoxFrom=By.id("FromSector_show");//from
	private By fromCity=By.xpath("//div[@id=\"fromautoFill\"]//span[@id=\"spn12\"]");//Delhi
	private By searchBoxTo=By.id("Editbox13_show");//to
	private By toCity=By.xpath("//div[@id=\"toautoFill\"]//span[@id=\"spn12\"]");//Delhi
	
	private By toMumbai=By.xpath("//div[@id=\"toautoFill\"]//span[@id=\"spn3\"]");//Mumbai
	
	private By searchButton=By.xpath("//input[@class=\"src_btn\"]"); //Search Button
	
	
	
	private By checkBoxDefence=By.xpath("//input[@id=\"chkArmy\"]");
	
	
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
		
	public void searchFrom()
	{
		
		driver.findElement(searchBoxFrom).click();
	}
	
	public void searchFromCity()
	{
		driver.findElement(fromCity).click();;
	}
	
	public void searchTo()
	{
		driver.findElement(searchBoxTo).click();
	}
	
	public void searchToCity()
	{
		driver.findElement(toCity).click();
	}
	
	public void searchToMumbai()
	{
		driver.findElement(toMumbai).click();
	}
	public void search()
	{
		driver.findElement(searchButton).click();
	}
	
	public void alert()
	{
		String message1=driver.switchTo().alert().getText();
		System.out.println(message1);
		driver.switchTo().alert().accept();;
		
	}
	
	public void defence()
	{
		driver.findElement(checkBoxDefence).click();
	}
	
	
	
}
