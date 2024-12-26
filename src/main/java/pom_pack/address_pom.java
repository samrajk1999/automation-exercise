package pom_pack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base_pack.base;

public class address_pom extends base{

	
	public address_pom() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//b[contains(text(), 'Enter Account Information')]")
	WebElement verifytxt_account;
	
	@FindBy(id="id_gender1")
	WebElement btn_mr;
	
	@FindBy(xpath = "//input[@data-qa=\"password\"]")
	WebElement password;
	
	@FindBy (xpath = "//select[@id=\"days\"]")
	WebElement daysdropdown;
	
	@FindBy(xpath = "//select[@id=\"months\"]")
	WebElement monthdropdown;

	@FindBy(xpath = "//select[@id=\"years\"]")
	WebElement yeardropdown;
	
	@FindBy(xpath = "//input[@id=\"newsletter\"]")
	WebElement newletters;
	
	@FindBy(xpath = "//label[contains(text(), 'Receive special offers from our partners!' )]")
	WebElement txt_specialoffer;
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id = "last_name")
	WebElement lastname;
	
	@FindBy(id="company")
	WebElement company;
	
	@FindBy(id= "address1")
	WebElement address1;
	
	@FindBy(id = "country")
	WebElement country;
	
	@FindBy(id= "state")
	WebElement state;
	
	@FindBy(id = "city")
	WebElement city;
	
	@FindBy(id = "zipcode")
	WebElement zipcode;
	
	@FindBy(id = "mobile_number")
	WebElement mobile_number;
	
	@FindBy(xpath = "//button[@data-qa=\"create-account\"]")
	WebElement btn_createaccount;
	
	
	
	public void  getVerify_txt_account() {
		
		 verifytxt_account.isDisplayed();
		 System.out.println("Verify that ENTER ACCOUNT INFORMATION is visible");
	}

	public void getBtn_mr() {
		btn_mr.click();
	}

	public void getPassword(String element) {
		 password.sendKeys(element);
	}

	public void getDays(String element) {
		  
		Select select = new Select(daysdropdown);
		select.selectByVisibleText(element);
		
	}

	public void getMonths(String element) {
		Select select = new Select(monthdropdown);
		select.selectByVisibleText(element);
	}

	public void getYears(String element) {
		Select select = new Select(yeardropdown);
		select.selectByValue(element);
	}

	public void getNewletters() {
		newletters.click();
	}
	
	public void getofferletters() {
		
		WebElement txt_specialoffer2 = txt_specialoffer;
		txt_specialoffer2.click();
	}
	
	public void first_name(String element) {
		
		firstname.sendKeys(element);
	}
	
	public void Last_name(String element) {
		
		lastname.sendKeys(element);
	}
	
	public void company(String element) {
		
		company.sendKeys(element);
	}
	
	public void address1 (String element) {
		
		address1.sendKeys(element);
	}
	
	public void country(String element) {
		
		country.sendKeys(element);
	}
	
	public void state(String element) {
			
			state.sendKeys(element);
		}
		
	public void city(String element) {
		
		city.sendKeys(element);
	}
	
	public void zipcode(String element) {
		
		zipcode.sendKeys(element);
	}
	
	public void mobilenumber(String element) {
		
		mobile_number.sendKeys(element);
	}

	public void btn_create_account() {
		
		btn_createaccount.click();
	}

}
