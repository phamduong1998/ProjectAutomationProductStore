package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import page.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("I login with user {string} and password {string}")
    public void login(String userName, String pasword){
        loginPage.login(userName,pasword);
    }
    @Then("I should see message {string}")
    public void verifyMessageLogin(String expectMessage) throws InterruptedException {
        Assert.assertEquals(loginPage.getMessage(),expectMessage);
    }


}
