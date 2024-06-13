package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.it.Ma;
import pages.FormPage;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class FormPageStepDefinitions {

    FormPage formPage = new FormPage();

    @When("user enters form username {string}")
    public void user_enters_form_username(String username) {
        formPage.username.sendKeys(username);
    }

    @When("user enters form password {string}")
    public void user_enters_form_password(String password) {
        formPage.password.sendKeys(password);
    }

    @When("user enters form comment {string}")
    public void user_enters_form_comment(String comment) {
        formPage.comments.clear();
        formPage.comments.sendKeys(comment);
    }

    @When("user clicks on form submit")
    public void user_clicks_on_form_submit() {
        formPage.submit.click();
    }

    @When("user enters username and comment")
    public void user_enters_username_and_comment(DataTable dataTable) throws InterruptedException {

        FormPage formPage = new FormPage();

        Map<String, String> usernameComment = dataTable.asMap();//{john_doe=Hello John, tom_zoey=Hi, everyone, ken_known=Goodbye}

        for (Map.Entry<String, String> w : usernameComment.entrySet()) {

            String username = w.getKey();
            String comment = w.getValue();

            formPage.username.sendKeys(username);
            formPage.comments.clear();
            formPage.comments.sendKeys(comment);

            Thread.sleep(2000);
            Driver.getDriver().navigate().refresh();

        }

    }

    @When("user enters username password and comment")
    public void user_enters_username_password_and_comment(DataTable dataTable) throws InterruptedException {

        List<List<String>> credentials = dataTable.asLists();

        for (List<String> w : credentials) {

            FormPage formPage = new FormPage();

            String username = w.get(0);
            String password = w.get(1);
            String comment = w.get(2);

            formPage.username.sendKeys(username);
            formPage.password.sendKeys(password);
            formPage.comments.clear();
            formPage.comments.sendKeys(comment);
            Thread.sleep(2000);
            Driver.getDriver().navigate().refresh();

        }


    }


}
