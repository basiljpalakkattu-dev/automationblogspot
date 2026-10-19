package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ConfigReader;

public class DoubleClickPage {

    public WebDriver driver;
    public WebDriverWait wait;
    public ConfigReader config;

    public DoubleClickPage(WebDriver driver) throws IOException {

        this.driver = driver;

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        config = new ConfigReader();
    }

    public void Doubleclick() {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,500)");

        // Wait until double click button is visible
        WebElement Doubleclick = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//button[text()='Copy Text']")));

        // Double click
        Actions action = new Actions(driver);

        action.doubleClick(Doubleclick).perform();
    }

    public String getMessage() {

        WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[@id=\"HTML10\"]/div[1]/p")));

        return message.getText();
    }

    public String getExpectedMessage() {
        return config.getProperty("doubleclickmessage").trim();
    }
}