package stepdefinition;

import core.SeleniumPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import static core.SeleniumPage.navigateUrl;

public class ServiceHooks extends SeleniumPage{

    @Before
    public void initTest(){
        navigateUrl();
    }

    @After
    public void afterHooks(Scenario scenario){
        if(scenario.isFailed()){
            scenario.attach(((TakesScreenshot)SeleniumPage.driver).getScreenshotAs(OutputType.BYTES),
                    "src/test/resources/data", "imageDemo/png");
        }
//        closeDriver();

    }
}
