package seleniumspract;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sracb {
WebDriver driver;

	@Test
	public void name() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/");
		driver.manage().timeouts().getImplicitWaitTimeout();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1200)", "");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
