package page;

import core.SeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage extends SeleniumPage {
    public PurchasePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[normalize-space()='Samsung galaxy s6']")
    private static WebElement productGalaxyS6;

    @FindBy(xpath = "//a[normalize-space()='Add to cart']")
    private static WebElement btnAddToCard;

    @FindBy(xpath = "//a[@id='cartur']")
    private static WebElement btnCart;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    private static WebElement btnPlaceOrder;

    @FindBy(xpath = "//input[@id='name']")
    private static WebElement textBoxName;

    @FindBy(xpath = "//input[@id='country']")
    private static WebElement textboxCountry;

    @FindBy(xpath = "//input[@id='city']")
    private static WebElement city;

    @FindBy(xpath = "//input[@id='card']")
    private static WebElement card;

    @FindBy(xpath = "//input[@id='month']")
    private static WebElement month;

    @FindBy(xpath = "//input[@id='year']")
    private static WebElement year;

    @FindBy(xpath = "//button[normalize-space()='Purchase']")
    private static WebElement btnPurchase;

    public void purchaseGlaxyS6(
            String nameCustomer,
            String country,
            String cityCustomer,
            String creditCard,
            String monthByProduct,
            String yearByProduct
    ) throws InterruptedException {
        clickProductGalaxyS6();
        clickBtnAddToCard();
        clicBtnBtnCart();
        makePlaceOrder(
                nameCustomer,
                country,
                cityCustomer,
                creditCard,
                monthByProduct,
                yearByProduct);
    }

    private void clickProductGalaxyS6() throws InterruptedException {
        waitElement(5000);
        clickElement(productGalaxyS6);
    }

    private void clickBtnAddToCard() throws InterruptedException {
        clickElement(btnAddToCard);
        waitElement(5000);
        acceptAlert();
    }

    private void clicBtnBtnCart(){
        clickElement(btnCart);
    }

    private void makePlaceOrder(
            String nameCustomer,
            String country,
            String cityCustomer,
            String creditCard,
            String monthByProduct,
            String yearByProduct){

        clickElement(btnPlaceOrder);
        fillPlaceOrder(
                nameCustomer,
                country,
                cityCustomer,
                creditCard,
                monthByProduct,
                yearByProduct);

    }

    private void fillPlaceOrder(
            String nameCustomer,
            String country,
            String cityCustomer,
            String creditCard,
            String monthByProduct,
            String yearByProduct){
        sendKeys(textBoxName,nameCustomer);
        sendKeys(textboxCountry,country);
        sendKeys(city,cityCustomer);
        sendKeys(card,creditCard);
        sendKeys(month,monthByProduct);
        sendKeys(year,yearByProduct);
        clickElement(btnPurchase);



    }
}
