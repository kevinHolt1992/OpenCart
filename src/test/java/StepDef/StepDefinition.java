package StepDef;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;

import Base.base;
import POM.Pom;
import Runner.runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends base{
	

	public static WebDriver driver= runner.driver;
	Pom o= new Pom(driver);

	@Given("the user has internet connection and sucessfully navigated to OrangeHRM homepage")
	public void the_user_has_internet_connection_and_sucessfully_navigated_to_orange_hrm_homepage() {
		url(driver, "https://opensource-demo.orangehrmlive.com");
	}
	

	@When("the user types user name and password to login")
	public void the_user_types_user_name_and_password_to_login() throws InterruptedException {
		Thread.sleep(5000);
		snd(o.getUserName(), "Admin");
		  snd(o.getTxtPass(), "admin123");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("the user clicks on login button")
	public void the_user_clicks_on_login_button() {
	Actions ac = new Actions(driver);
	ac.click(o.getBtnLogin()).build().perform();
	
	
	}

}
