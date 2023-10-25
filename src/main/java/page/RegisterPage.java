package page;

import core.Constant;
import core.SeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends SeleniumPage {
    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@id='signin2']")
    private static WebElement buttonSignUp;
    @FindBy(xpath = "//*[@id=\"sign-username\"]")
    private static WebElement userName;
    @FindBy(xpath = "//*[@id=\"sign-password\"]")
    private static WebElement passWord;
    @FindBy(xpath = "//button[@onclick='register()']")
    private static WebElement buttonRegister;


    public void registerUser(String inpurUsserName, String inpuePassWord) throws InterruptedException {
        clickElement(buttonSignUp);
        sendKeys(userName,inpurUsserName);
        clickElement(passWord);
        sendKeys(passWord,inpuePassWord);
        clickElement(buttonRegister);
        waitElement(5000);
        Constant.MESSAGE = getTextAlert();



    }

    public String getMessageRegisterUser(){
        return getTextAlert();
    }
}
