package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage {

    public WebDriver driver;

    public AlertsPage(WebDriver driver) throws IOException {

        this.driver = driver;

    }

    public void simplalert() {

        WebElement simple = driver.findElement(By.id("alertBtn"));
        simple.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.accept();
    }

    public void confirmationalert() {

        WebElement confalert = driver.findElement(By.id("confirmBtn"));
        confalert.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.dismiss();
    }

    public void propmpalert() {

        WebElement prompt = driver.findElement(By.id("promptBtn"));
        prompt.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.sendKeys("Harry Potter");

        alert.accept();
    }
}