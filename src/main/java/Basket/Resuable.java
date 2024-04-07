package Basket;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Resuable {
	
	WebDriver driver;
	
	WebDriverWait wait ;
	
	public Resuable(WebDriver driver)
	{
		this.driver = driver;
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
	}
	
	
	
	public void elementVisibility(WebElement element)
	{
		
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	

}
