package stepdefinition;

import io.cucumber.java.en.Given;
import page.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("I login with user {string} and password {string}")
    public void login(String userName, String pasword){
        loginPage.login(userName,pasword);
    }
}
