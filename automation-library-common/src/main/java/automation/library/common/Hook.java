package automation.library.common;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;


public class Hook {
	
	
		
		@Before(order = 0)
		public void setUp(){
			System.out.println("\nInside Hook 0");
		}
}