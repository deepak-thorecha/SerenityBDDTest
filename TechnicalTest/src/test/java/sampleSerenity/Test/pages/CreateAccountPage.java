package sampleSerenity.Test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreateAccountPage extends PageObject {

	@FindBy(id="ap_customer_name")
	WebElementFacade userNameField;
	
	@FindBy(id="ap_email")
	WebElementFacade userEmailField;
	
	@FindBy(id="ap_password")
	WebElementFacade userPasswordField;
	
	@FindBy(id="ap_password_check")
	WebElementFacade userRePasswordField;
	
	@FindBy(id="continue")
	WebElementFacade createAccountBtn;
	
	public CreateAccountPage enterUserName(String uName) {
		userNameField.clear();
		userNameField.type(uName);
		return this;
	}	
	
	public CreateAccountPage enterUserEmail(String uEmail) {
		userEmailField.clear();
		userEmailField.type(uEmail);
		return this;
	}
	
	public CreateAccountPage enterUserPassword(String uPass) {
		userPasswordField.clear();
		userPasswordField.type(uPass);
		userRePasswordField.clear();
		userRePasswordField.type(uPass);
		return this;
	}
	
	public void clickCreateAccountBtn() {
		createAccountBtn.click();
	}
	
			
}
