package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ParallelDriver;

public class ParallelTestStepDefinitions {

    @Given("user goes to URL {string}")
    public void userGoesToURL(String url) {
        ParallelDriver.getDriver().get(url);
    }

    @When("user prints the title")
    public void user_prints_the_title() {
        System.out.println(ParallelDriver.getDriver().getTitle());
    }

    @Then("close parallel driver")
    public void close_parallel_driver() {
        ParallelDriver.closeDriver();
    }


}
