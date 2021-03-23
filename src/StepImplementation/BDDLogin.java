package StepImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BDDLogin {
	
	WebDriver driver = new FirefoxDriver();
	@Given("^I am on login page$")
	public void I_am_on_login_page()
	{
		System.setProperty("webdriver.gecko.driver", "D://geckodriver-v0.18.0-win64/geckodriver.exe");
		
		String baseUrl = "https://www.facebook.com/";
		driver.get(baseUrl);
	}
	
	 @When("^I entered userid and pwd$")
	 public void I_entered_userid_and_pwd()
	 {
			
	        driver.findElement(By.id("email")).sendKeys("8308249798");
	        
	        driver.findElement(By.name("pass")).sendKeys("Redhat123#");
	        
	         driver.findElement(By.id("u_0_2")).click();
		 System.out.println("User and pwd");
	 }
	    
	 @Then("^my login is confirm$")
	 public void my_login_is_confirm()
	 {
		 System.out.println("Confirmed");
	 }
	    

}
