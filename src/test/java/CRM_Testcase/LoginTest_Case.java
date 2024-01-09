package CRM_Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest_Case extends BaseClass
{
	
  @Test (priority=1)
  public void verifyUrl() 
  {
	  String curl= lp.geturl();
	  Assert.assertTrue(curl.contains("crm"),"fail: url not matches");
	  System.out.println("Url is matched: "+curl);
	  
  }
  @Test (priority=2)
  public void verifyTittle() 
  {
	  String tittle= lp.gettittle();
	  Assert.assertTrue(tittle.contains("Customer"),"fail: tittle not matches");
	  System.out.println("Url is matched: "+tittle);
	  
  }
  @Test (priority=3)
  public void verifyLogin() 
  {
   String curl=lp.dologin("Test@gmail.com","test1234");
   Assert.assertTrue(curl.contains("customers"),"Login is fail ");
   System.out.println("Login is completed");
	  
   }
  
  
  
  
  
}
