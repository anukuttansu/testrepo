package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.LoginPageObjects;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;
	WebDriverWait wait;
	 @When("^Application is launched$")
	    public void application_is_launched() throws Throwable {
	        throw new PendingException();
	        
			List<List<String>> obj = data.asLists();
			// Getting the automation project path
			String ProjectPath = System.getProperty("user.dir");
			System.out.println();

			// Initialize the driver
			System.setProperty("webdriver.chrome.driver", ProjectPath + "/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(obj.get(0).get(0));
	    }

	    @When("^Create new appplication is executed$")
	    public void create_new_appplication_is_executed() throws Throwable {
	        throw new PendingException();
	        LoginPageObjects objects = new LoginPageObjects(driver);
	    }

	    @Then("^New application is created$")
	    public void new_application_is_created() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^Login is executed$")
	    public void login_is_executed() throws Throwable {
	        throw new PendingException();
	    }

}
