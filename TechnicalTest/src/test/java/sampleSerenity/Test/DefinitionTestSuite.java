package sampleSerenity.Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/consult_dictionary/", glue="sampleSerenity.Test.steps")
public class DefinitionTestSuite{
	
}
