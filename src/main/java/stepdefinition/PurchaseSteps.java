package stepdefinition;

import io.cucumber.java.en.When;
import page.PurchasePage;

public class PurchaseSteps {

    PurchasePage purchasePage = new PurchasePage();

    @When("I purchase galaxy s6 with {string} and {string}, {string}, {string}, {string}")
    public void purchaseProduct( String nameCustomer,
                                 String country,
                                 String cityCustomer,
                                 String creditCard,
                                 String monthByProduct,
                                 String yearByProduct) throws InterruptedException {
        purchasePage.purchaseGlaxyS6(nameCustomer,country, cityCustomer, creditCard, monthByProduct, yearByProduct );
    }
}
