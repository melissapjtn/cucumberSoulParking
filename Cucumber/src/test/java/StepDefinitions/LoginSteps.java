package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step - user is on login page");
		System.setProperty("webdriver.chrome.driver","C:/Users/IDstar/eclipse-workspace/Cucumber/src/test/resources/drivers/chromedriver.exe");

		driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		//		driver.manage().window().maximize();
	}

	@When("user open login page")
	public void user_open_login_page()  {
		driver.get("https://www.saucedemo.com/"); 
		System.out.println("Inside Step - user click on login button");
		
	}

	@And("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");							
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		System.out.println("Inside Step - user enters username and password");
		
		Thread.sleep(2000);
	}
	
	@And("user enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");							
		driver.findElement(By.id("password")).sendKeys("secret_sr");
		
		System.out.println("Inside Step - user enters username and password");
	}
	
	@And("user enters invalid username and valid password")
	public void user_enters_invalid_username_and_valid_password() {
		driver.findElement(By.id("user-name")).sendKeys("standard_ur");							
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		System.out.println("Inside Step - user enters username and password");
	}
	
	@And("user both the username and password fields blank")
	public void user_both_the_username_and_password_fields_blank() {
		driver.findElement(By.id("user-name")).sendKeys(" ");							
		driver.findElement(By.id("password")).sendKeys(" ");
		
		System.out.println("Inside Step - user enters username and password");
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login-button")).click();							
		System.out.println("Inside Step - user click on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		
		driver.findElement(By.id("shopping_cart_container")).isDisplayed();							

		System.out.println("Inside Step - user is navigated to the home page");
	}
	
	@Then("user is can see error message")
	public void user_is_can_see_error_message() {
		
		driver.findElement(By.xpath("//button[@class='error-button']")).isDisplayed();							

		System.out.println("Inside Step - user is can see error message");
	}
	
	@When("user log out")
	public void user_log_out() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		System.out.println("Inside Step - user is log out");

	}

	@Then("user can see login page")
	public void user_can_see_login_page() {
		driver.findElement(By.id("login-button")).isDisplayed();							

		System.out.println("Inside Step - user on login page");
		driver.quit();


	}

}
