package pom_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_pack.base;

public class signup_pom extends base {

	   // Constructor to initialize elements
    public signup_pom() {
        PageFactory.initElements(driver, this);
    }


	@FindBy(xpath = "//li //a[@href=\"/\"]")
	WebElement homepage;
	
	@FindBy(xpath = "//a[@href=\"/login\"]")
	WebElement login;
	
	@FindBy(xpath= "//h2[text()='Login to your account'] ")
	WebElement verifylogin;
	
	@FindBy(xpath= "//input[@data-qa=\"signup-name\"]")
	WebElement signup_name;
	
	@FindBy(xpath = "//input[@data-qa=\"signup-email\"]")
	WebElement signup_email;
	
	@FindBy(xpath = "//button[@data-qa=\"signup-button\"]")
	WebElement btnsign;

	public WebElement getHomepage() {
		return homepage;
	}
	
	public void getLogin(){
		login.click();
	}
	
	public void getlogin_verify() {
		 verifylogin.isDisplayed();
		 assert true;
	}
	
	public void getsignup_name(String element) {
		
		signup_name.sendKeys(element);
	}
	
	public void getsign_email(String element) {
		
		signup_email.sendKeys(element);
	}
	
	public void btn_signup() {
		btnsign.click();
	}
	
	



	
}
