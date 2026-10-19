package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadPage {

    public WebDriver driver;

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void filesuploading() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");

        String file1 = "C:\\Users\\ASUS\\OneDrive\\Documents\\MAIN PROJECT REPORT 1.pdf";
        String file2 = "C:\\Users\\ASUS\\OneDrive\\Documents\\SEMINAR REPORT 2.pdf";

        WebElement multiupload = driver.findElement(By.id("multipleFilesInput"));

        multiupload.sendKeys(file1 + "\n" + file2);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(driver -> multiupload.getAttribute("value").contains("MAIN PROJECT REPORT 1.pdf"));
    }

    public void singlefile() throws InterruptedException {

        String file3 = "C:\\Users\\ASUS\\OneDrive\\Documents\\SEMINAR REPORT 2.pdf";

        WebElement singfile = driver.findElement(By.id("singleFileInput"));

        singfile.sendKeys(file3);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(driver -> singfile.getAttribute("value").contains("SEMINAR REPORT 2.pdf"));
    }

    public long getMultipleFileCount() {

        WebElement multiupload =
                driver.findElement(By.id("multipleFilesInput"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        Long count = (Long) js.executeScript(
                "return arguments[0].files.length;",
                multiupload
        );

        return count;
    }

    public String getSingleFileValue() {
        WebElement singfile = driver.findElement(By.id("singleFileInput"));
        return singfile.getAttribute("value");
    }
}