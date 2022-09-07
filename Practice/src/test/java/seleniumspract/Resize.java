package seleniumspract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resize {
	public WebDriver driver;
	@Test
	public void name() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement frame = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame);
		WebElement dt = driver.findElement(By.xpath("(//div[@style='z-index: 90;'])[3]"));
		Actions ac = new Actions(driver);
	//	ac.clickAndHold(dt).dragAndDropBy(dt, 0, 59).build().perform();
		ac.dragAndDropBy(dt, 150, 100).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
