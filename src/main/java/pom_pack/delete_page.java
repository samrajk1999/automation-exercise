package pom_pack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_pack.base;

public class delete_page extends base{

	public delete_page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href=\"/delete_account\"]")
	WebElement delete_account;
	
	@FindBy(xpath = "//b[contains (text(), 'Account Deleted!')]")
	WebElement verify_deleted;
	
	@FindBy(xpath = "//a[@data-qa=\"continue-button\"]")
	WebElement delete_continue;
	
	public void deleteaccount() {
		
		delete_account.click();
	}
	
	public void verifydeleted() {
		
		verify_deleted.isDisplayed();
		System.out.println("Your account has been permanently deleted!");
		
	}
	
	public void click_continue() {
		
		delete_continue.click();
	}
	
	
}
