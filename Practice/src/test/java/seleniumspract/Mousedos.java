package seleniumspract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousedos {
	public WebDriver driver;
	@Test
	public void movetis() throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement td = driver.findElement(By.linkText("Electronics"));
		Actions sc = new Actions(driver);
		sc.moveToElement(td).perform();
		Thread.sleep(2000);
		WebElement dl = driver.findElement(By.linkText("Deals"));
		sc.moveToElement(dl).click().perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
