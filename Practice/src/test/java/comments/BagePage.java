package comments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BagePage {
	public static WebDriver driver;
	@BeforeMethod
	public void setUp() throws IOException {
		FileInputStream fis = new FileInputStream("Properties\\config.property");
		Properties prs = new Properties();
		prs.load(fis);
		String brs = prs.getProperty("browser");
		if (brs.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (brs.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.get(prs.getProperty("url"));
		driver.manage().timeouts().getImplicitWaitTimeout();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
