package PageObjectPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basket.Resuable;

public class ProductListPage extends Resuable{
	
	public WebDriver driver;
	
	public ProductListPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(css=".products .product")
	List<WebElement> veggies;
	
	
	public ProceedToCart addProduct(String[] vegetables)
	{
		
		
		for(int i=0;i<veggies.size();i++)	
		{
			String[] vegName = veggies.get(i).findElement(By.cssSelector(".product-name")).getText().trim().split("-");
			
			String updatedVeg = vegName[0].trim();
			
			for(String vegetable:vegetables)
			{
				
			
			if(updatedVeg.equalsIgnoreCase(vegetable))
			{
				System.out.println(updatedVeg);
				
				veggies.get(i).findElement(By.cssSelector(".product-action button")).click();
			}
			
			}
			
			 
		}
		
		return new ProceedToCart(driver);
		
	}
	
	
	
	
	
	

}
