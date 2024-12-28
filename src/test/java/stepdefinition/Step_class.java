package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base_pack.base;
import io.cucumber.java.en.*;
import pom_pack.account_created;
import pom_pack.address_pom;
import pom_pack.delete_page;
import pom_pack.signup_pom;

public class Step_class extends base {
	
	public signup_pom pm;
	public address_pom ap;
	public account_created ac;
	public delete_page dp;
	
	
	
	
	@Given ("User launches the browser")
	public void User_launches_the_browser () {
		
		browser();
	implicit_waits();
	}
	

	@When("User navigates to url {string}")
	public void user_navigates_to_url(String url) {

		url(url);
		max();
	}

	@Then("Verify that home page is visible successfully")
	public void  verify_that_home_page_is_visible_successfully() throws IOException {
		pm = new signup_pom();
		pm.getHomepage();
		System.out.println("Verify that home page is visible successfully");
		implicit_waits();
		screen_shot("shot1");
	}

	@When("User clicks on Signup Login button")
	public void user_clicks_on_signup_login_button() {
		pm= new signup_pom();
//		WebElement login = pm.getLogin();
		pm.getLogin();
		implicit_waits();
	}

	@Then("Verify Login to your account is visible")
	public void verify_login_to_your_account_is_visible() {
		
		pm.getlogin_verify();
		implicit_waits();
	}

	@When("User enters name {string} and email {string}")
	public void user_enters_name_and_email(String name, String email) {

		pm.getsignup_name(name);
		pm.getsign_email(email);
		
	}

	@When("User clicks on Signup button")
	public void user_clicks_on_signup_button() {

		pm.btn_signup();
	
	}

	@Then("Verify that ENTER ACCOUNT INFORMATION is visible")
	public void verify_that_enter_account_information_is_visible() throws InterruptedException {
		ap = new address_pom();
		ap.getVerify_txt_account();
	
		implicit_waits();
	
	}

	@Then("Fill details Title {string} Password {string} Day {string} month {string} year{string}")
	public void fill_details_title_password_day_month_year(String title, String password, String Day, String Month, String Year) {
		ap = new address_pom();
		ap.getBtn_mr();
		ap.getPassword(password);
		ap.getDays(Day);
		ap.getMonths(Month);
		ap.getYears(Year);
		
		
	}

	@Then("User select Sign up for our newsletter checkbox")
	public void user_select_sign_up_for_our_newsletter_checkbox() {
		ap.getNewletters();
	
	}

	@Then("User select Receive special offers from our partners checkbox")
	public void user_select_receive_special_offers_from_our_partners_checkbox() {

		ap.getofferletters();
		implicit_waits();
	}

	@Then("user fill personal details First name {string} Last name {string} Company {string} Address {string} Country {string} State {string} City {string} Zipcode {string} Mobile Number {string}")
	public void user_fill_personal_details_first_name_last_name_company_address_country_state_city_zipcode_mobile_number(String FirstName, String LastName, String Company, String Address, String Country, String State, String City, String Zipcode, String MobileNumber) {

	ap.first_name(FirstName);
	ap.Last_name(LastName);
	ap.company(Company);
	ap.address1(Address);
	ap.country(Country);
	ap.state(State);
	ap.city(City);
	ap.zipcode(Zipcode);
	ap.mobilenumber(MobileNumber);
	
	implicit_waits();
	}

	@Then("Click on Create Account button")
	public void click_on_create_account_button() {

	ap.btn_create_account();
	}

	@Then("Verify that ACCOUNT CREATED is visible")
	public void verify_that_account_created_is_visible() {

		ac = new account_created();
		ac.getaccount_verify();
		
	}

	@Then("Click on Continue button")
	public void click_on_continue_button() {

		ac.btn_continue();
	}

	@Then("Verify that Logged in as {string} is visible")
	public void verify_that_logged_in_as_is_visible(String username) {

		ac.txt_login_visible(username);
	}

	@Then("Click on Delete Account button")
	public void click_on_delete_account_button() {

		dp = new delete_page();
		
		dp.deleteaccount();
		implicit_waits();
	}

	@Then("Verify that ACCOUNT DELETED is visible and click Continue button")
	public void verify_that_account_deleted_is_visible_and_click_continue_button() {

		dp = new delete_page();
		
		 dp.verifydeleted();
		 implicit_waits();
		 
		 dp.click_continue();
	}
	
}
