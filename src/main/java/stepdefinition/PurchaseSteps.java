package stepdefinition;

import io.cucumber.java.en.When;
import page.PurchasePage;

public class PurchaseSteps {

    PurchasePage purchasePage = new PurchasePage();

    @When("I purchase galaxy s6")
    public void purchaseProduct() throws InterruptedException {
        purchasePage.purchaseGlaxyS6();
    }
}
