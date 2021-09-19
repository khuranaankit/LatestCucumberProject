package automation.library.web.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automation.library.selenium.exec.driver.factory.DriverContext;

public class BaseStepsWebClick {
	
	private static WebElement eleToClick;

	public static void clickElement(String object) throws InterruptedException {
		eleToClick = DriverContext.getInstance().getDriver().findElement(By.xpath(object));
		Thread.sleep(5000);
		eleToClick.click();
	}

}
