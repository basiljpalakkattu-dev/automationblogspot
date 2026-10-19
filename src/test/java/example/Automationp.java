package example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement promptbtn= driver.findElement(By.id("promptBtn"));
		promptbtn.click();
		Alert alert=driver.switchTo().alert() ;
		alert.sendKeys("sibil shivadas");
		alert.accept();
		

	}

}
