package jenkinjob_feb15.hellojenkins;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class heloo {
	@Before
	public void login()
	{
		System.out.println("Login window of web");
		
	}
   @Test
   public void addTocart()
   {
	    System.out.println("Add to shopping cart");
	    
   }
   
   @After
   
   public void logout()
   {
	    System.out.println("Logout window of the wbe");
   }
}
