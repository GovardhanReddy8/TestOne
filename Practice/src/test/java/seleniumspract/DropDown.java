package seleniumspract;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	WebDriver driver;
	@Test
	public void drop() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/tryit.asp?filename=trybs_dropdown-divider&stacked=h");
		driver.manage().timeouts().getImplicitWaitTimeout();
		WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		WebElement btn = driver.findElement(By.xpath("//button[@type='button']"));
		btn.click();
		Select sl = new Select(btn);
		sl.selectByIndex(1);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
