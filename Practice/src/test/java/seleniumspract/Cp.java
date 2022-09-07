package seleniumspract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cp {
	public WebDriver driver;
@Test
	public void name() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement text = driver.findElement(By.xpath("(//div[@class='CodeMirror-lines'])[1]"));
		WebElement text1 = driver.findElement(By.xpath("(//div[@class='CodeMirror-lines'])[2]"));
		Actions ac = new Actions(driver);
		ac.keyDown(text,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		ac.keyDown(text1,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
