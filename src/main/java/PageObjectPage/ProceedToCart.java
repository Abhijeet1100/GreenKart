package PageObjectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basket.Resuable;

public class ProceedToCart extends Resuable{
	
	WebDriver driver;
	
	public ProceedToCart(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(css=".cart-icon")
	WebElement cart;
	
	@FindBy(xpath="//button[text()='PROCEED TO CHECKOUT']")
	WebElement checkout;
	
	@FindBy(css=".promoCode")
	WebElement promocode;
	
	@FindBy(css=".promoBtn")
	WebElement promobutton;
	
	@FindBy(css=".promoInfo")
	WebElement promoInfo;
	
	
	@FindBy(xpath="//button[text()='Place Order']")
	WebElement placeOrder;
	
	
	
	
	
	public ConfirmationPage placeOrder()
	{
		cart.click();
		
		checkout.click();
		
		promocode.sendKeys("rahulshettyacademy");
		
		promobutton.click();
		
		elementVisibility(promoInfo);
		
		placeOrder.click();
		
		return new ConfirmationPage(driver);
	}

}
