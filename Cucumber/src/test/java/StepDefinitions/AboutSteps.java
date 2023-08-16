package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutSteps {

	WebDriver driver;
	
	@Given("browser is open for about")
	public void browser_is_open_for_about() {
		System.out.println("Inside Step - user is on login page");
		System.setProperty("webdriver.chrome.driver","C:/Users/IDstar/eclipse-workspace/Cucumber/src/test/resources/drivers/chromedriver.exe");

		driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	}

	@When("user open login page for about")
	public void user_open_login_page_for_about() {
		driver.get("https://www.saucedemo.com/"); 
		System.out.println("Inside Step - user click on login button");
	}

	@When("user enters username and password for about")
	public void user_enters_username_and_password_for_about() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");							
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		System.out.println("Inside Step - user enters username and password");
		
		Thread.sleep(2000);
	}

	@When("user clicks on login button for about")
	public void user_clicks_on_login_button_for_about() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();							
		System.out.println("Inside Step - user click on login button");
		
		Thread.sleep(1000);

	}
	
	@When("user clicks on burger menu")
	public void user_clicks_on_burger_menu() throws InterruptedException {
		driver.findElement(By.id("react-burger-menu-btn")).click();		

		System.out.println("Inside Step - user click on burger menu button");
		Thread.sleep(1000);

	}

	@And("user click About")
	public void user_click_about() throws InterruptedException {
		driver.findElement(By.id("about_sidebar_link")).click();		

		System.out.println("Inside Step - user click on burger menu button");
		Thread.sleep(1000);

	}

	@Then("user is navigated to the SauceLabs page")
	public void user_is_navigated_to_the_sauce_labs_page() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[1]/div[1]/div/div[4]/div[1]/a/button")).isDisplayed();							

		System.out.println("Inside Step - user on SauceLabs page");
		Thread.sleep(1000);
		
		driver.quit();

	}


}
