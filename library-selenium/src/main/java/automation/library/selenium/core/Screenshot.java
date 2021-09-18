package automation.library.selenium.core;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.*;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Screenshot {
	
	public static File grabScreenShot(WebDriver driver) throws IOException {
		
		//String screenShotType = System.getProperty("fw.scrollingScreenshot");
		String screenShotType = "false";
		
		if(driver.getWindowHandle() != null) {
			if(screenShotType != null) {
				return (screenShotType.equals("true") ? grabScrollingScreenshot(driver) : grabDisplayedAreaScreenShot(driver));
			}
			else {
				return grabDisplayedAreaScreenShot(driver);
			}
		}
		else {
			System.out.println("Driver is not launched. Skipping screenshot");
		}
		return null;
	}

	public static File grabDisplayedAreaScreenShot(WebDriver driver) {
		// TODO Auto-generated method stub
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	}

	public static File grabScrollingScreenshot(WebDriver driver) throws IOException {
		// TODO Auto-generated method stub
		ru.yandex.qatools.ashot.Screenshot screenshot;
		
		screenshot = new ru.yandex.qatools.ashot.Screenshot(ShootingStrategies.viewportPasting(1000).getScreenshot(driver));
		
		File file = new File("image.png");
		ImageIO.write(screenshot.getImage(), "PNG", file);
		return file;
	}

}
