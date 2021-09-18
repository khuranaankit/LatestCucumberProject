package automation.library.api.core;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;


public class Hook {
	
	
		
		@Before(order = 2)
		public void setUp(){
			System.out.println("\nInside Hook 2");
		}
		
		
}