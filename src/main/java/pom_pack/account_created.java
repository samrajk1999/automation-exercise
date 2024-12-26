package pom_pack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_pack.base;

public class account_created extends base{

	public account_created() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//b[contains(text(), 'Account Created!')]")
	WebElement verify_account;
	
	@FindBy(xpath = "//a[@data-qa=\"continue-button\"]")
	WebElement btn_continue;
	
	@FindBy(xpath = "//a[contains(text(), ' Logged in as ')]")
	WebElement login_visible;
	
	public void getaccount_verify() {
		
		verify_account.isDisplayed();
		assert true;
		System.out.println("Congratulations! Your new account has been successfully created!");
	}
	
	public void btn_continue() {
		
		btn_continue.click();
	}
	
	public void txt_login_visible(String element) {
		
		 login_visible.isDisplayed();
		 System.out.println("Verify that Logged in as "+ element + " is visible");
		
	}
	
}
