package org.sri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 
{
	public static void main(String[] args)
	{
	//Set the property
	System.setProperty("webdriver.chrome.driver","C:\\Users\\g\\workspace\\Selenium\\driver\\chromedriver.exe");
	//Launch the browser
	WebDriver driver = new ChromeDriver();
	//Load url
	driver.get("https://www.cleartrip.com/trains");
	 
	 WebElement txtFromStation =  driver.findElement(By.id("from_station"));
	 txtFromStation.sendKeys("Chennai");
	 WebElement txtToStation =  driver.findElement(By.id("to_station"));
	 txtToStation.sendKeys("Mayiladuthurai");
	} 

}
