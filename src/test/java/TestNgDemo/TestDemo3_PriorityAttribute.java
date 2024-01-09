package TestNgDemo;

import org.testng.annotations.Test;

public class TestDemo3_PriorityAttribute {

	@Test(priority=1,description="This is the First Test Case")
	public void RegisterTest() {
		System.out.println("This is Register Test");
	}

	@Test(priority=2,description="This is the Second Test Case")
	public void LoginTest() {
		System.out.println("This is Login Test");
	}

	@Test(priority=3,description="This is the Third Test Case")
	public void SecrchProductTest() {
		System.out.println("This is serch product Test");
	}

	@Test(priority=4,description="This is the Forth Test Case")
	public void AddToCartTest() {
		System.out.println("This is a Add To Cart Test");
	}
}
