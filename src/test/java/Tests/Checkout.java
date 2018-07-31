package Tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sixt.Launcher.AppLauncher;
import com.sixt.apps.PageObjects.BasketPage;
import com.sixt.apps.PageObjects.ProductPage;
import com.sixt.apps.PageObjects.Search;
import com.sixt.apps.PageObjects.SignInPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Checkout{
	
public static AndroidDriver<MobileElement> testDriver;
    
    private static Logger log = LogManager.getLogger(Logger.class.getName());
	private static SignInPage signIn;
	private static Search search;
	private static ProductPage productPage;
	private static BasketPage basketPage;
	AppLauncher appLauncher;
	
	
	
	@Given("^user is at Amazon app Home page$")
	public void user_is_at_Amazon_app_Home_page() throws Exception {
		System.out.print("The test driver object is "+testDriver);
		appLauncher = new AppLauncher();
		testDriver = appLauncher.launchAndroidAppiumService(4723, "CIHYKJPBGY95YHKV");
         signIn = new SignInPage(testDriver);
	    signIn.verifySignInLabel();
	    
	}

	@When("^Click SignIn button$")
	public void click_SignIn_button()  {
	    signIn.clickSignIn();
	}

	@When("^Provide valid email address and Password$")
	public void provide_valid_email_address_and_Password() {
	    signIn.addUserEmail("dummy@gmail.com");
	    signIn.addPassword("dummy123");
	}

	@Then("^User has successfully logged in$")
	public void user_has_successfully_logged_in()  {
	   signIn.submitCredentials();
	}

	
	@Given("^click for search textbox$")
	public void click_for_search_textbox() {
		search = new Search(testDriver);
	    search.initiateSearch();
	}

	@When("^provide product name$")
	public void provide_product_name() {
		search.searchProduct("Tshirts");
	    
	}

	@Then("^product search is successfull$")
	public void product_search_is_successfull() {
	    search.selectProduct();
	    
	}

	@Given("^Registered user has at Product page$")
	public void registered_user_has_at_Product_page()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^selecting product attributes$")
	public void selecting_product_attributes()  {
		productPage = new ProductPage(testDriver);
	    productPage.selectProductSize();
	    
	}

	@When("^Add product to cart$")
	public void add_product_to_cart() {
	    productPage.addProduct();
	    
	}

	@Then("^product successfully added to cart$")
	public void product_successfully_added_to_cart() {
	   productPage.getCartCount();
	    
	}

	@Given("^Registered user at Basket page$")
	public void registered_user_at_Basket_page()  {
		productPage.accessCart();
	    
	}

	@When("^proceeds to checkout$")
	public void proceeds_to_checkout()  {
		basketPage = new BasketPage(testDriver);
	    
	}

	@Then("^user successfully proceed to checkout$")
	public void user_successfully_proceed_to_checkout()  {
		basketPage.proceedCheckout();

	}
	
}
