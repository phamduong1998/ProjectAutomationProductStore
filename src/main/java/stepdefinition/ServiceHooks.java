package stepdefinition;

import core.SeleniumPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.net.MalformedURLException;

import static core.SeleniumPage.closeDriver;
import static core.SeleniumPage.navigateUrl;

public class ServiceHooks{

    @Before
    public void initTest(){
        navigateUrl();
    }

    @After
    public void afterHooks(Scenario scenario){
        if(scenario.isFailed()){
            scenario.attach(((TakesScreenshot)SeleniumPage.driver).getScreenshotAs(OutputType.BYTES),
                    "image/png", "imageDemo");
        }
        closeDriver();
    }
}
