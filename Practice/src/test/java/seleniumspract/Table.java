package seleniumspract;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
	public WebDriver driver;
	@Test
	public void name() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2021/08/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> all = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println(all.size());
		for (WebElement el : all) {
			String tx = el.getText();
			if (tx.contains("Company")) {
				
			}
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
