import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class SeleniumTest {
public int j=10;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Ankit");
		System.setProperty("webdriver.ie.driver","C:\\Users\\HP\\Downloads\\IEDriverServer.exe");
		
		WebDriver d = new InternetExplorerDriver();
		d.get("http://juliemr.github.io/protractor-demo/");
		Thread.sleep(4000);
		
		//d.findElement(By.xpath("//button[@id='button1']")).click();
		//d.findElement(By.id("button1")).click();
		//WebElement we = d.findElement(By.xpath("//button[@id='button1']"));
		//((JavascriptExecutor) d).executeScript("document.getElementById('button1').click();");
		NgWebDriver ngdriver = new NgWebDriver((JavascriptExecutor) d);
		ngdriver.waitForAngularRequestsToFinish();
		
        d.findElement(ByAngular.model("first")).sendKeys("2");
        d.findElement(ByAngular.model("second")).sendKeys("2");
        //d.findElement(ByAngular.buttonText("Go!")).click();
        ((JavascriptExecutor) d).executeScript("document.getElementById('gobutton').click();");
	}

}
