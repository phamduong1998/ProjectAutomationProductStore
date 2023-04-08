package page;

import core.SeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends SeleniumPage {
    public LoginPage (){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@id='login2']")
    private static WebElement btnSign;

    @FindBy(xpath = "//input[@id='loginusername']")
    private static WebElement userName;

    @FindBy(xpath = "//input[@id='loginpassword']")
    private static WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Log in']")
    private static WebElement btnLogin;

    public void login(String userNameText, String passwordText){
        clickElement(btnSign);
        sendKeys(userName,userNameText);
        sendKeys(password,passwordText);
        clickElement(btnLogin);
    }

}
