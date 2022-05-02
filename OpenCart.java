package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {

	
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.opencart.com/index.php?route=account/register");

			driver.findElement(By.name("firstname")).sendKeys("ABC");
			driver.findElement(By.name("lastname")).sendKeys("XYZ");	
			Select country = new Select(driver.findElement(By.id("input-country")));
			country.selectByVisibleText("India");

	}

}
