package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.ConfigReader;

public class GUIElementsPage {
	
	public WebDriver driver;
    public ConfigReader config;

    public GUIElementsPage(WebDriver driver) {
        this.driver = driver;
        
        
    }
	
	 public void formfiledschecking() throws IOException {

	        ConfigReader config = new ConfigReader();

	        WebElement name = driver.findElement(By.id("name"));
	        name.click();
	        name.sendKeys(config.getProperty("name"));
	        
	        
	        WebElement email = driver.findElement(By.id("email"));
	        email.sendKeys(config.getProperty("email"));

	        WebElement phone = driver.findElement(By.id("phone"));
	        phone.sendKeys(config.getProperty("phone"));

	        WebElement address = driver.findElement(By.id("textarea"));
	        address.sendKeys(config.getProperty("Address"));

	        WebElement searchField = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
	        searchField.click();
	        searchField.sendKeys(config.getProperty("searcfield"));

	       
	 }
	 public void radiobuttons() {
		  
	      WebElement  gender=driver.findElement(By.id("male"));
	      gender.click();
		 
		WebElement mon = driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[4]/div[2]/label"));
		mon.click();
			
		WebElement tue = driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[4]/div[3]/label"));
		tue.click();
		
			
		}
	 
	 public void dropdown() {
		 
		 WebElement countryElement=driver.findElement(By.id("country"));
		 Select country=new Select(countryElement);
		 country.selectByVisibleText("Japan");
		
		 WebElement colors=driver.findElement(By.id("colors"));
		 Select color=new Select(colors);
		 color.selectByVisibleText("White");
		 
		 WebElement animals=driver.findElement(By.id("animals"));
		 Select animal=new Select(animals);
		 animal.selectByVisibleText("Dog");
		 
				 
	 }
	 
	 
	 

}
