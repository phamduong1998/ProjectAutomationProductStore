package page;

import core.SeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage extends SeleniumPage {
    public PurchasePage(){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[normalize-space()='Samsung galaxy s6']")
    private static WebElement productGalaxyS6;

    @FindBy(xpath = "//a[normalize-space()='Add to cart']")
    private static WebElement btnAddToCard;


    public void purchaseGlaxyS6() throws InterruptedException {
//        productGalaxyS6.click();
        Thread.sleep(5000);
        clickElement(productGalaxyS6);
        clickElement(btnAddToCard);
        Thread.sleep(5000);
        acceptAlert();
    }


}
