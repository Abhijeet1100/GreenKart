package Basket;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseTest.CreateDriver;
import PageObjectPage.ConfirmationPage;
import PageObjectPage.ProceedToCart;
import PageObjectPage.ProductListPage;



public class Testing extends CreateDriver{
	
@Test	
 public void greenKart() throws IOException{
		// TODO Auto-generated method stub
		
		
	    String[] vegetables = {"Cucumber","tomato","potato"};
	
		
		ProductListPage productListPage = getDriver();
		
		ProceedToCart proceedToCart = productListPage.addProduct(vegetables);
		
		ConfirmationPage confirmationPage = proceedToCart.placeOrder();
		
		String text = confirmationPage.getConfirmOrder();
		
		System.out.println(text);
		
		
		
		

	}

//     @DataProvider
//     public Object[] getData()
//     {
//    	 Object[] vegetables = {"Cucumber","tomato","potato"};
//    	 
//    	 
//    	 
//    	 return vegetables;
//     }

}
