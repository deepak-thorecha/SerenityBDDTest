package sampleSerenity.Test.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import sampleSerenity.Test.RegistrationUserData;
import sampleSerenity.Test.steps.serenity.EndUserSteps;
import sampleSerenity.Utilities.ExcelToClassObject;
import sampleSerenity.Utilities.ResourceFiles;

public class RegistrationSteps {
	
    @Steps
    EndUserSteps deepak;
    
    @Given("^the user is on IMDB HomePage$")
    public void the_user_is_on_IMDB_HomePage() throws Exception {
    	deepak.is_onIMDB_HomePage();
    }

    private static String userRegName = new String();
    @When("^the user tries to register account number \"([^\"]*)\"$")
    public void the_user_tries_to_register_a_new_account(String count) throws Exception {
    	System.out.println("Registering Account number: "+count);
    	deepak.click_other_signIn_options();
    	deepak.click_register_new_account();
    	
    	RegistrationUserData data = (RegistrationUserData) ExcelToClassObject.createMappingPOJO(RegistrationUserData.class, ResourceFiles.TESTDATA_XLS);
    	userRegName = deepak.fill_registrationDetails_andSubmit(data.users.get(Integer.parseInt(count)-1));
    }

    @Then("^the user should be loggedIn after successful Registration$")
    public void the_user_should_be_loggedIn_after_successful_Registration() throws Exception {
    	System.out.println("Account registered for: "+userRegName);
    }
    
    /*@Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        anna.is_the_home_page();
    }

    @When("the user looks up the definition of the word '(.*)'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        anna.looks_for(word);
    }

    @Then("they should see the definition '(.*)'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        anna.should_see_definition(definition);
    }*/

}
