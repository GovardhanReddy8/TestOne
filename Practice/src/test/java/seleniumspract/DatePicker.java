package seleniumspract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	WebDriver driver;
	@Test
	public void datepick() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().getImplicitWaitTimeout();
		String emonth="Feb";
		String eyear="2023";
		String eday="25";
		driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
		String monyer = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		String month = monyer.split(" ")[0];
		String years = monyer.split(" ")[1];
		System.out.println(monyer);
		
		while (!(month.equals(emonth)&&years.equals(eyear))) {
			driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
			monyer = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			month = monyer.split(" ")[0];
			years = monyer.split(" ")[1];
			System.out.println(monyer);
			
		}
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		for (WebElement date : dates) {
			String dt = date.getText();
			if (dt.equals(eday)) {
				date.click();
			}
			
		}
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
