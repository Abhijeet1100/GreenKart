package BaseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import PageObjectPage.ProductListPage;



public class CreateDriver {
	
	public WebDriver driver;
	
	public WebDriver instantiateDriver() throws IOException
	{
		

		
		String path =System.getProperty("user.dir")+"/src/test/java/resource/cart.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize(); 
		
		return driver;
	}
	
	
	@BeforeTest
	public ProductListPage getDriver() throws IOException
	{
		driver = instantiateDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		ProductListPage productListPage = new ProductListPage(driver);
		
		return productListPage;
	}
	
	
	
	
	


	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	

}

