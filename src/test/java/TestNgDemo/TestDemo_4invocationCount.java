package TestNgDemo;

import org.testng.annotations.Test;

public class TestDemo_4invocationCount {
  @Test(priority=1)
  public void enrollforCousre() {
	  
	  System.out.println("Students get enroll for Course");
	  
  }
  @Test(priority=2)
  public void training() {
	  
	  System.out.println("Students get Training for Course");
	  
  }
  @Test(priority=3,invocationCount=3)
  public void placaement() {
	  
	  System.out.println("Students get placements calls for Course");
	  
  }
}