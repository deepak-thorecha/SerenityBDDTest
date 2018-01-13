package sampleSerenity.Test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.imdb.com/")
public class IMDBHomePage extends PageObject{
	
	@FindBy(id="nblogin")
	protected WebElementFacade otherSignInOptions;
	
	public void clickOtherSignInOptionsLink() {
		otherSignInOptions.click();
	}
	
	
}
