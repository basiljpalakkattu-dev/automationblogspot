 package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.ConfigReader;

public class Basepage {

	public WebDriver driver;
	public ConfigReader config;
	
	

@BeforeMethod
public void setup() throws IOException {
	ConfigReader config= new ConfigReader();
	driver = new ChromeDriver();
	
	driver.get(config.getProperty("url"));
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
}

//@AfterMethod
//public void teardown() {
//	
//	driver.quit();
//}
//}
