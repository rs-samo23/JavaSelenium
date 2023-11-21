package WorkingWithTestNG;

import org.testng.annotations.Test;

public class Working_with_InvocationCount {
	
	@Test(priority=1,invocationCount=5)
	public void register()
	{
		System.out.println("Registration successful");
	}
	@Test(dependsOnMethods = "register")
	public void login()
	{
		System.out.println("Login Successful");
	}
	@Test(priority=3)
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
