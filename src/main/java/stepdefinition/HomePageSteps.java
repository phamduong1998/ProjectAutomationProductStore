package stepdefinition;

import core.Constant;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import page.HomePage;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Then("I should see menu is displayed")
    public void verifyMenu() throws InterruptedException {

        Assert.assertTrue(homePage.checkButtonHome());
        Assert.assertTrue(homePage.buttonContact());
        Assert.assertTrue(homePage.buttonAboutUs());
        Assert.assertTrue(homePage.buttonCart());
    }

    @Then("I should see categories is displayed")
    public void verifyCategories() throws InterruptedException {
        Assert.assertTrue(homePage.buttonPhones());
        Assert.assertTrue(homePage.buttonLaptops());
        Assert.assertTrue(homePage.buttonMonitors());
    }
    @Then("I should see title {string}")
    public void verifyTitle(String expectTitle){
        Assert.assertEquals(Constant.TITLE,expectTitle);
    }

    @Then("I should see product phones is displayed")
    public void verifyProductPhone() throws InterruptedException {
        Assert.assertTrue(homePage.checkProductPhone());
    }

    @Then("I should see product laptops is displayed")
    public void verifyProductLaptops() throws InterruptedException {
        Assert.assertTrue(homePage.checkProductLaptops());
    }

    @Then("I should see product monitors is displayed")
    public void verifyProductmonitors() throws InterruptedException {
        Assert.assertTrue(homePage.checkProductMonitors());
    }
}
