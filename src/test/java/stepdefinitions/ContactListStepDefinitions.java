package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CLHomePage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;

public class ContactListStepDefinitions {

    CLHomePage clHomePage = new CLHomePage();

    @Given("user goes to homepage")
    public void user_goes_to_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("contact_list_url"));
    }

    @When("user enters email")
    public void user_enters_email() {
        clHomePage = new CLHomePage(); //StaleElementReferenceException durumunda bu şekilde kullanılabilir.
        clHomePage.email.sendKeys(ConfigReader.getProperty("contact_list_username"));

    }

    @When("user enters password")
    public void user_enters_password() {

        clHomePage.password.sendKeys(ConfigReader.getProperty("contact_list_password"));

    }

    @When("user clicks on submit")
    public void user_clicks_on_submit() {

        clHomePage.submit.click();
    }

    @Then("user validates sign in")
    public void user_validates_sign_in() throws InterruptedException {
        Thread.sleep(500);
        String url = Driver.getDriver().getCurrentUrl();
        assertEquals("https://thinking-tester-contact-list.herokuapp.com/contactList", url);
    }


    @When("user enters wrong email")
    public void user_enters_wrong_email() {
        clHomePage.email.sendKeys("wrongemail@hotmail.com");
    }

    @Then("user validates error message")
    public void user_validates_error_message() throws InterruptedException {
        Thread.sleep(200);
        assert clHomePage.error.isDisplayed();
    }

    @And("user enters wrong password")
    public void userEntersWrongPassword() {
        clHomePage.password.sendKeys("wrongPassword");
    }

    @When("user enters email {string}")
    public void userEntersEmail(String email) {
        clHomePage.email.sendKeys(email);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String password) {
        clHomePage.password.sendKeys(password);
    }


}