package seleniumspract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DigDong {
	public WebDriver driver;
	@Test
	public void dop() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement elt = driver.findElement(By.xpath("//select[@id='course']"));
		Select sl = new Select(elt);
		sl.selectByIndex(2);
		Thread.sleep(2000);
		driver.quit();
	}
	

}
