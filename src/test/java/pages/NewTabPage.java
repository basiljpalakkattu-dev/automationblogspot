package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewTabPage {

    WebDriver driver;

    public NewTabPage(WebDriver driver) {
        this.driver = driver;
    }

    public void webTables() {

        WebElement udemyCourses = driver.findElement(
            By.xpath("//*[@id=\"PageList2\"]/div/ul/li[2]/a")
        );

        udemyCourses.click();

        String parentWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {

            if (!window.equals(parentWindow)) {

                driver.switchTo().window(window);
            }
        }
    }

    public void childAction() {

        WebElement home = driver.findElement(
            By.xpath("//*[@id=\"navbar\"]/div/ul/li[1]/a")
        );

        home.click();
    }
}