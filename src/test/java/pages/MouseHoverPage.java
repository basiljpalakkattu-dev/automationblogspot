package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHoverPage {

    WebDriver driver;
    WebDriverWait wait;

    public MouseHoverPage(WebDriver driver) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void Mousehover() {

        WebElement point = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"HTML3\"]/div[1]/div/button")));

        Actions action = new Actions(driver);
        action.moveToElement(point).perform();
    }

    public void dataentryform() {

        WebElement def = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"Blog1\"]/div[1]/div/div/div/div/h3/a")));

        Actions action = new Actions(driver);
        action.moveToElement(def).perform();
    }

    // Methods for assertion
    public boolean isMouseHoverButtonDisplayed() {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"HTML3\"]/div[1]/div/button"))).isDisplayed();
    }

    public boolean isDataEntryFormDisplayed() {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"Blog1\"]/div[1]/div/div/div/div/h3/a"))).isDisplayed();
    }
}