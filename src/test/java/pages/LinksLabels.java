// File: LinksLabels.java
package pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksLabels {

    WebDriver driver;
    WebDriverWait wait;

    public LinksLabels(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public int brokenLink() throws IOException {

        int brokenCount = 0;

        // webdriverwait for links to be present
        List<WebElement> links = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("a")));

        // print total nuber of links fond
        System.out.println("total links: " + links.size());

        // check each link one by one
        for (WebElement link : links) {

            // getting the url from the href attributes
            String url = link.getAttribute("href");

            // skip the if the url is emty or null
            if (url == null || url.isEmpty()) {
                continue;
            }

            // create a URL obirct
            URL linkURL = new URL(url);

            // open the connection
            HttpURLConnection connection = (HttpURLConnection) linkURL.openConnection();

            // get the HTTP response code
            int responseCode = connection.getResponseCode();

            // check the whether the link is broken
            if (responseCode >= 400) {

                // increase broken link count
                brokenCount++;

                // print the broken link and its response code
                System.out.println("Broken Link :" + url);
                System.out.println("Responce Code :" + responseCode);
                System.out.println("------------------------------------");

            }

            // close the connection
            connection.disconnect();

        }

        // print total broken links
        System.out.println("Total Broken Links :" + brokenCount);

        return brokenCount;
    }
}