package seleniumspract;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Office {
	public WebDriver driver;
	@Test
	public void ofs() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.officedepot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement et = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		et.sendKeys("folders");
		et.sendKeys(Keys.ENTER);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='item_sku gray med_txt']"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
