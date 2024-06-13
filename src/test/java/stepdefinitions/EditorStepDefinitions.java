package stepdefinitions;

import io.cucumber.java.en.When;
import pages.EditorPage;
import utilities.ExcelUtils;

import java.util.List;
import java.util.Map;

public class EditorStepDefinitions {
    EditorPage editorPage = new EditorPage();

    @When("user enters credentials from excel")
    public void user_enters_credentials_from_excel() throws InterruptedException {


        ExcelUtils excelUtils = new ExcelUtils("employees.xlsx", "info");
        List<Map<String, String>> dataList = excelUtils.getDataList();


        for (Map<String, String> w : dataList) {

            System.out.println(w);
            String first_name = w.get("first_name");
            String last_name = w.get("last_name");
            String position = w.get("position");
            String extension = w.get("extension");
            String office = w.get("office");
            String salary = w.get("salary");
            String start_date = w.get("start_date");


            editorPage.newButton.click();
            editorPage.first_name.sendKeys(first_name);
            editorPage.last_name.sendKeys(last_name);
            editorPage.position.sendKeys(position);
            editorPage.office.sendKeys(office);
            editorPage.extension.sendKeys(extension);
            editorPage.start_date.sendKeys(start_date);
            editorPage.salary.sendKeys(salary);
            editorPage.createButton.click();
            Thread.sleep(2000);
            editorPage.search.clear();
            editorPage.search.sendKeys(first_name);

            assert editorPage.nameCell.getText().contains(first_name);

        }
    }
}
