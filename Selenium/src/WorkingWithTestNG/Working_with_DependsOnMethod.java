package WorkingWithTestNG;

import org.testng.annotations.Test;

public class Working_with_DependsOnMethod {
		
		@Test
		public void register()
		{
			System.out.println("Registration successful");
		}
		@Test(dependsOnMethods = "register")
		public void login()
		{
			System.out.println("Login Successful");
		}
		@Test(enabled = false)
		public void addToCart()
		{
			System.out.println("Product added to cart");
		
		}
		@Test(priority=4)
		public void placeOrder()
		{
			System.out.println("Order placed");
		}
	}
