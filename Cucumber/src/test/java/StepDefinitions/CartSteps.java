package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {
	WebDriver driver;
	int currentCart= 0;

	@Given("browser is open for add to cart")
	public void browser_is_open_for_add_to_cart() {
		System.out.println("Inside Step - user is on login page");
		System.setProperty("webdriver.chrome.driver","C:/Users/IDstar/eclipse-workspace/Cucumber/src/test/resources/drivers/chromedriver.exe");

		driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	}

	@When("user open login page for add to cart")
	public void user_open_login_page_for_add_to_cart() {
		driver.get("https://www.saucedemo.com/"); 
		System.out.println("Inside Step - user click on login button");
	}

	@And("user enters username and password for add to cart")
	public void user_enters_username_and_password_for_add_to_cart() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");							
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		System.out.println("Inside Step - user enters username and password");

		Thread.sleep(2000);
	}

	@And("user clicks on login button for add to cart")
	public void user_clicks_on_login_button_for_add_to_cart() {
		driver.findElement(By.id("login-button")).click();							
		System.out.println("Inside Step - user click on login button");
	}

	@And("user get cart detail")
	public void user_get_cart_detail() {
		String currentCart1 = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).getText();
		System.out.println("current string " +currentCart1);

		//		int currentCart = Integer.parseInt(driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).getText());							
		int currentCart = 0;
		System.out.println("Inside Step - user check current cart");

	}

	@And("user click detail product")
	public void user_click_detail_product() {
		driver.findElement(By.id("item_4_img_link")).click();							
		System.out.println("Inside Step - user click product");

	}

	@And("user clicks on Add to cart button")
	public void user_clicks_on_add_to_cart_button() throws InterruptedException {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();							
		System.out.println("Inside Step - user add product to cart");

		Thread.sleep(2000);

	}

	@Then("icon cart is update")
	public void icon_cart_is_update() throws InterruptedException {
		int actualCart = Integer.parseInt(driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText());							
		assert (currentCart ==(actualCart)+1);

		Thread.sleep(2000);

		System.out.println("Inside Step - cart is update");

	}

	@And("user log out for cart")
	public void user_log_out_for_cart() throws InterruptedException {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();

		System.out.println("Inside Step - user is log out");

		Thread.sleep(2000);

	}

	@Then("user can see login page for cart")
	public void user_can_see_login_page_for_cart() {
		driver.findElement(By.id("login-button")).isDisplayed();							

		System.out.println("Inside Step - user on login page");
		
		driver.quit();

	}

	@And("user click remove button")
	public void user_click_remove_button() throws InterruptedException {
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();	

		System.out.println("Inside Step - user click remove button");
		Thread.sleep(2000);
	}

	@Then("user can see add to cart button")
	public void user_can_see_add_to_cart_button() throws InterruptedException {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).isDisplayed();							

		System.out.println("Inside Step - user can see add to cart button");

		Thread.sleep(2000);

		driver.quit();
	}

	//	@And("user can see cart count is decrease")
	//	public void user_can_see_cart_count_is_decrease() throws InterruptedException {
	//		System.out.println("actualCart" + driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText());
	//		
	////		int actualCart = Integer.parseInt(driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText());							
	////		assert (currentCart ==(actualCart)-1);
	//		
	//		
	////		Thread.sleep(2000);
	////		System.out.println("Inside Step - user can see the count of products on the cart updated");
	////
	////		
	////		driver.quit();
	//}

	@And("user click cart")
	public void user_click_cart() {
		driver.findElement(By.id("shopping_cart_container")).click();

		System.out.println("Inside Step - user click cart");

	}

	@And("user click checkout button")
	public void user_click_checkout_button() {
		driver.findElement(By.id("checkout")).click();

		System.out.println("Inside Step - user click checkout button");
	}
	
	@And("user enters First Name, Last Name, and Zip")
	public void user_enters_first_name_last_name_and_zip() throws InterruptedException {
		driver.findElement(By.id("first-name")).sendKeys("Andi");							
		driver.findElement(By.id("last-name")).sendKeys("M");
		driver.findElement(By.id("postal-code")).sendKeys("1234");


		System.out.println("Inside Step - user enters First Name, Last Name, and Zip");
		
		Thread.sleep(1000);
	}

	@And("user click contiue button")
	public void user_click_contiue_button() throws InterruptedException {
		driver.findElement(By.id("continue")).click();

		System.out.println("Inside Step - user click checkout button");
		
		Thread.sleep(1000);
	}
	
	@Then("user can see Checkout: Overview page")
	public void user_can_see_checkout_overview_page() throws InterruptedException {
		driver.findElement(By.id("finish")).isDisplayed();							

		System.out.println("Inside Step - user can see Checkout: Overview page ");
		
		Thread.sleep(1000);
	}

	@Then("user click finish button")
	public void user_click_finish_button() throws InterruptedException {
		driver.findElement(By.id("finish")).click();

		System.out.println("Inside Step - user click finish button");
		
		Thread.sleep(1000);
		
	}

	@Then("user can see Checkout: Complete! page")
	public void user_can_see_checkout_complete_page() throws InterruptedException {
		driver.findElement(By.id("back-to-products")).isDisplayed();

		System.out.println("Inside Step - user can see Checkout: Complete! page");
		
		Thread.sleep(1000);

		driver.quit();
	}

}
