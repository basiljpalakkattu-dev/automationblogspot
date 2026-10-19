package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.ConfigReader;

public class DragDropPage {

    WebDriver driver;
    ConfigReader config;

    public DragDropPage(WebDriver driver) throws IOException {
        this.driver = driver;
        config = new ConfigReader();
    }

    public void draganddrop() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        WebElement source = driver.findElement(
                By.xpath(config.getProperty("dragSource")));

        WebElement destination = driver.findElement(
                By.xpath(config.getProperty("dropDestination")));

        Actions action = new Actions(driver);

        action.dragAndDrop(source, destination).perform();
    }

    public String getDropResult() {

        WebElement result = driver.findElement(
                By.xpath(config.getProperty("dropResult")));

        return result.getText();
    }
}