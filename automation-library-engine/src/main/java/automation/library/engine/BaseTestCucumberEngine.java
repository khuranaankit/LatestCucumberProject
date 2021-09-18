package automation.library.engine;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import com.intuit.karate.junit4.Karate;

import automation.library.api.BaseTest;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features"},
				glue = {"automation.library"})
public class BaseTestCucumberEngine extends BaseTest{
public static int x = 10;
}
