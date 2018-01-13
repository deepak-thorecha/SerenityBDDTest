package sampleSerenity.Test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegistrationSignInPage extends PageObject{
	
	@FindBy(css="a.create-account")
	WebElementFacade createNewAccountBtn;
	
	public void clickCreateANewAccountButton() {
		createNewAccountBtn.click();
	}
}
