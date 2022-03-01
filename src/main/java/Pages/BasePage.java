package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.sql.Driver;
import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    private Wait<WebDriver> wait;

    public BasePage() {
        System.setProperty("webdriver.chrome.driver","src/test/ressources/driver/chromedriver2.exe");
		 driver = new ChromeDriver();

        this.wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(UnhandledAlertException.class);
    }

    private WebElement find(By locator) {
        return driver.findElement(locator);
    }

    WebElement waitForElementToBeDisplayed(By locator) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return find(locator) ;
    }

    void setText(By locator, String text) {
        waitForElementToBeDisplayed(locator).sendKeys(text);
    }

    private WebElement waitForElementToBeClickable(By locator) {

        wait.until(ExpectedConditions.elementToBeClickable(locator));
        return find(locator);
    }

    void clickElement(By locator) {
        waitForElementToBeClickable(locator).click();
    }
    
    public WebDriver getDriver() {
    	return driver;
    }
    
    
    

}
