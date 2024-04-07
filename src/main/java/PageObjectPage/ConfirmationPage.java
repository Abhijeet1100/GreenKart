package PageObjectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Basket.Resuable;

public class ConfirmationPage extends Resuable{
	
	
	WebDriver driver;
	
	public ConfirmationPage(WebDriver driver)
	{
		super(driver);
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//select[@style='width: 200px;']")
	WebElement country;
	
	@FindBy(css=".chkAgree")
	WebElement checkbox;
	
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement proceed;
	
	@FindBy(css=".wrapperTwo")
	WebElement confirmText;
	
	
	public String getConfirmOrder()
	{
		
		Select select = new Select(country);
		
		select.selectByValue("India");
		
		checkbox.click();
		
		proceed.click();
		
		return confirmText.getText();
		
	}
	
	


}
