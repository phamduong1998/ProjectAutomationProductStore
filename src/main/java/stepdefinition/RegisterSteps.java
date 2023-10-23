package stepdefinition;

import Utils.RanDomUtils;
import core.Constant;
import io.cucumber.java.en.Given;
import page.LoginPage;
import page.RegisterPage;



public class RegisterSteps {

    RegisterPage registerPage = new RegisterPage();

    LoginPage loginPage = new LoginPage();
    @Given("I registerNewUser with user {string} and password {string}")
    public void registerNewUser(String userName, String password) throws InterruptedException {
        if(userName.equals("Random")){
            Constant.USER_NAME = RanDomUtils.generateRandomUsername(12);
        }
        if (password.equals("Random")) {
            Constant.PASS_WORD = RanDomUtils.generateRandomUsername(10);
        }
        registerPage.registerUser(Constant.USER_NAME,Constant.PASS_WORD);

    }

    @Given("I login with user registed")
    public void login(){
        loginPage.login(Constant.USER_NAME,Constant.PASS_WORD);
    }
}
