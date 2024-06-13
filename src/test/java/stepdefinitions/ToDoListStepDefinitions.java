package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.ToDoListPage;

import java.util.List;

public class ToDoListStepDefinitions {

    @When("user enters todos")
    public void user_enters_todos(DataTable dataTable) throws InterruptedException {

        ToDoListPage toDoListPage = new ToDoListPage();

        List<String> todos = dataTable.asList();

        for (String w : todos) {
            toDoListPage.input.sendKeys(w + Keys.ENTER);
            Thread.sleep(500);
        }


    }


}
