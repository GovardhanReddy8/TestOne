package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;

import commens.BasePage;

public class CaptureShot extends BasePage{
	@AfterTest
	public void TakeShot() {
		SimpleDateFormat sim = new SimpleDateFormat("MM/DD/YYYY HH/MM/SS");
		Date date = new Date();
		String dts = sim.format(date);
		System.out.println(dts);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(".//ScreenShots/"+dts+".png");
		try {
			FileUtil.copyFile(src, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
