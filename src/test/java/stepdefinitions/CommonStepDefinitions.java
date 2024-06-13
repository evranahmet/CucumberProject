package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Driver;

public class CommonStepDefinitions {

    @Then("user closes the browser")
    public void user_closes_the_browser() {
        Driver.closeDriver();
    }

    @Given("user goes to url {string}")
    public void userGoesToUrl(String url) {
        Driver.getDriver().get(url);
    }

}
