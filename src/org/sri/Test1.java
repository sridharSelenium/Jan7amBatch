package org.sri;

import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.AWTException;
import java.awt.event.KeyEvent;

public class Test1 
{
	//set the property
		public static void main(String[] args) throws AWTException, InterruptedException
		{			
		//Set the property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\g\\eclipse-workspace\\Eclipse-oxygen\\SriJava\\driver\\chromedriver.exe");
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//Load url
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement btnHelloSignIn =  driver.findElement(By.xpath("//span[text()='Hello. Sign in']"));
		Actions acc = new Actions(driver);	
		acc.moveToElement(btnHelloSignIn).perform();
	         
	    WebElement btnSignIn = driver.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
	    acc.click(btnSignIn).perform();
	    
	    acc.sendKeys("Sridhar").perform();
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	    acc.sendKeys("8883236170").perform();
	    r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	    acc.sendKeys("Sri@gmail.com").perform();
	    r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	    acc.sendKeys("Sri@123456").perform();
	    r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	    
		}

}
