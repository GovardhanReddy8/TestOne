package seleniumspract;

import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDown {
	public WebDriver driver;
	@Test
	public void name() throws Exception {
		WebDriverManager.chromedriver().setup();
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("download.default_directory", "C:\\fills\\img.png");
		ChromeOptions op = new ChromeOptions();
		op.setExperimentalOption("prefs", map);
		driver=new ChromeDriver(op);
		driver.get("https://www.w3schools.com/tags/att_a_download.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@id='main']//div[2]//a[1]")).click();
		Set<String> allwins = driver.getWindowHandles();
		Iterator<String> wins = allwins.iterator();
		String parent = wins.next();
		String child = wins.next();
		driver.switchTo().window(child);
		WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//img[@alt='W3Schools']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
