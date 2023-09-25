package stepdefinition;

import core.Constant;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import page.PurchasePage;

public class PurchaseSteps {

    PurchasePage purchasePage = new PurchasePage();

    @When("I purchase galaxy s6 with {string} and {string}, {string}, {string}, {string}, {string}")
    public void purchaseProduct( String nameCustomer,
                                 String country,
                                 String cityCustomer,
                                 String creditCard,
                                 String monthByProduct,
                                 String yearByProduct) throws InterruptedException {
        purchasePage.purchaseGlaxyS6(nameCustomer,country, cityCustomer, creditCard, monthByProduct, yearByProduct );
    }

    @Then("I should see message purchase {string}")
    public void verifyMessage(String expectString){
        Assert.assertEquals(Constant.MESSAGE,expectString);
    }
    @Then("I should see homepage is displayed")
    public void verifyHomePageIsDisplayed(){
        Assert.assertEquals(true,
                purchasePage.checkHompageIsDisplayed());
    }
}
