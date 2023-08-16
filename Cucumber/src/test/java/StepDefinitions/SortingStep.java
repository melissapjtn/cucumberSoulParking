package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class SortingStep {
	WebDriver driver;
	
	@Given("browser is open for sorting")
	public void browser_is_open_for_sorting() {
		System.out.println("Inside Step - user is on login page");
		System.setProperty("webdriver.chrome.driver","C:/Users/IDstar/eclipse-workspace/Cucumber/src/test/resources/drivers/chromedriver.exe");

		driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	}

	@When("user open login page for sorting")
	public void user_open_login_page_for_sorting() {
		driver.get("https://www.saucedemo.com/"); 
		System.out.println("Inside Step - user click on login button");
	}
	
	@And("user enters username and password for sorting")
	public void user_enters_username_and_password_for_sorting() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");							
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		System.out.println("Inside Step - user enters username and password");
		
		Thread.sleep(2000);
	}
	
	@And("user clicks on login button for sorting")
	public void user_clicks_on_login_button_for_sorting() {
		driver.findElement(By.id("login-button")).click();							
		System.out.println("Inside Step - user click on login button");
	}

	@And("User click on sort container")
	public void user_click_on_sort_container() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		System.out.println("Inside Step - user click on sort container");
		
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		Thread.sleep(2000);

	}

	@And("user click option Name A to Z")
	public void user_click_option_name_a_to_z() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select")).click();							

		System.out.println("Inside Step - user click on sort Name A to Z");
		Thread.sleep(2000);
	}

	@Then("user can see displayed order of products after sorting")
	public void user_can_see_displayed_order_of_products_after_sorting() {
		driver.findElement(By.id("item_4_title_link")).isDisplayed();							

		System.out.println("Inside Step - user on page products");

	}
	
	@And("user click option Price Low to High")
	public void user_click_option_price_low_to_high() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div")).click();							

		System.out.println("Inside Step - user click on sort Price Low to High");
		Thread.sleep(2000);
	}

	@Then("user can see the display order of products Price Low to High")
	public void user_can_see_the_display_order_of_products_price_low_to_high() {
		driver.findElement(By.id("item_4_title_link")).isDisplayed();							

		System.out.println("Inside Step - user on page products");
		driver.quit();
	}

	
}
