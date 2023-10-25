package page;

import core.SeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SeleniumPage {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    private static WebElement buttonHome;

    @FindBy(xpath = "//a[normalize-space()='Contact']")
    private static WebElement buttonContact;

    @FindBy(xpath = "//a[normalize-space()='About us']")
    private static WebElement buttonAboutUs;

    @FindBy(xpath = "//a[@id='logout2']")
    private static WebElement buttonCart;

    @FindBy(xpath = "//a[@onclick=\"byCat('phone')\"]")
    private static WebElement buttonPhone;

    @FindBy(xpath = "//a[@onclick=\"byCat('notebook')\"]")
    private static WebElement buttonLaptops;

    @FindBy(xpath = "//a[@onclick=\"byCat('monitor')\"]")
    private static WebElement buttonMonitors;

    @FindBy(xpath = "//a[normalize-space()='Samsung galaxy s6']")
    private static WebElement productPhones;

    @FindBy(xpath = "//a[normalize-space()='Sony vaio i5']")
    private static WebElement productLaptops;

    @FindBy(xpath = "//a[normalize-space()='ASUS Full HD']")
    private static WebElement productMonitors;



    public boolean checkButtonHome() throws InterruptedException {
        waitElement(5000);
        return checkElementIsDisplayed(buttonHome);
    }

    public boolean buttonContact(){
        return checkElementIsDisplayed(buttonContact);
    }
    public boolean buttonAboutUs(){
        return checkElementIsDisplayed(buttonAboutUs);
    }
    public boolean buttonCart(){
        return checkElementIsDisplayed(buttonCart);
    }

    public boolean buttonPhones() throws InterruptedException {
        waitElement(5000);
        return checkElementIsDisplayed(buttonPhone);
    }
    public boolean buttonLaptops(){
        return checkElementIsDisplayed(buttonLaptops);
    }
    public boolean buttonMonitors(){
        return checkElementIsDisplayed(buttonMonitors);
    }

    public boolean checkProductPhone() throws InterruptedException {
        waitElement(5000);
        clickElement(buttonPhone);
        waitElement(5000);
        return checkElementIsDisplayed(productPhones);
    }
    public boolean checkProductLaptops() throws InterruptedException {
        waitElement(5000);
        clickElement(buttonLaptops);
        waitElement(5000);
        return checkElementIsDisplayed(productLaptops);
    }
    public boolean checkProductMonitors() throws InterruptedException {
        waitElement(5000);
        clickElement(buttonMonitors);
        waitElement(5000);
        return checkElementIsDisplayed(productMonitors);
    }

}
