package sampleSerenity.Test.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import sampleSerenity.Test.User;
import sampleSerenity.Test.pages.CreateAccountPage;
import sampleSerenity.Test.pages.IMDBHomePage;
import sampleSerenity.Test.pages.RegistrationSignInPage;

public class EndUserSteps extends ScenarioSteps{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	IMDBHomePage IMDBHome;
	RegistrationSignInPage regLoginPage;
	CreateAccountPage regPage;
	
	@Step
	public void is_onIMDB_HomePage() {
		IMDBHome.open();
	}
	
	@Step
	public void click_other_signIn_options() {
		IMDBHome.clickOtherSignInOptionsLink();
	}
	
	@Step
	public void click_register_new_account() {
		regLoginPage.clickCreateANewAccountButton();
	}
	
	@Step
	public String fill_registrationDetails_andSubmit(User user) {
		String str = System.currentTimeMillis()+"";
		regPage.enterUserName(user.getUserName()+str)
			.enterUserEmail(user.getUserEmail()+str+"@email.com")
			.enterUserPassword(user.getUserPassword())
			.clickCreateAccountBtn();
		return (user.getUserName()+str);
	}
	
	/*DictionaryPage dictionaryPage;
    
    @Step
    public void enters(String keyword) {
        dictionaryPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        dictionaryPage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }*/
}