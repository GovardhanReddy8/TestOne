package seleniumspract;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wins {
	public WebDriver driver;
	@Test
	public void dos() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/met_win_alert.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@class='w3-btn'][normalize-space()='Try it Yourself »']")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> all = driver.getWindowHandles();
		for (String child : all) {
			if (!(parent.equals(child))) {
				driver.switchTo().window(child);
			}
		}
		WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		WebElement at = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		at.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.quit();
	}

}
