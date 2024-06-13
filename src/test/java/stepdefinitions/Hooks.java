package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {//Bu class tekrarlı kullanılacak before ve after methoları içindir.

    @Before//Her scenario öncesi çalışır. --> import io.cucumber.java.Before;
    public void setUp(Scenario scenario){

        System.out.println("Scenario Name: "+scenario.getName());
        System.out.println("Scenario ID: "+scenario.getId());

    }

    @After//Her scenario sonrası çalışır. --> import io.cucumber.java.After;
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()){//Scenaio fail olrsa bu kod bloğı çalışır.

            System.out.println("Senaryo başarısız oldu");
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Başarısız Senaryo Ekran Görüntüsü");

            Driver.closeDriver();
        }


    }


    @Before("@Smoke")//Her @Smoke scenario öncesi çalışır. --> import io.cucumber.java.Before;
    public void smokeSetUp(Scenario scenario){
        System.out.println("********Smoke Test Scenariosu**********");
    }




}
