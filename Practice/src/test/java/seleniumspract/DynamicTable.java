package seleniumspract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable {
	public WebDriver driver;

	@Test
	public void name() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2021/08/");
		List<WebElement> heads = driver.findElements(By.xpath("//table[contains(@id,'cust')]//th"));
		System.out.println(heads.size());
		for (WebElement els : heads) {
			String test = els.getText();
			System.out.println(test);
		}
		List<WebElement> lists = driver.findElements(By.xpath("//table[contains(@id,'cust')]//td"));
		System.out.println(lists.size());
		for (WebElement lem : lists) {

			String text = lem.getText();
			System.out.println(text);
		}
		// driver.findElement(By.xpath("//td[text()='FlipKart']//preceding-sibling::td//input")).click();
		driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td[3]//a")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
