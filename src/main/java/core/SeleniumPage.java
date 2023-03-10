package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumPage {

    public static WebDriver driver;
    public static WebDriverWait webDriverWait;
    public static Alert alerts;



//    @Test
    public static void navigateUrl(){
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public static void closeDriver(){
        driver.close();
    }

    public static void sendKeys(WebElement element, String text){
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }
    public static void clickElement(WebElement element){
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    public static void acceptAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }




}
