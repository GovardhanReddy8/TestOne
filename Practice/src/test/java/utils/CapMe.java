
package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.aspectj.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import comments.BagePage;

public class CapMe extends BagePage {
	@AfterTest
	public static void TakeCapture() {
		SimpleDateFormat sin = new SimpleDateFormat("MM/DD/YYYY HH/MM/SS");
		Date date = new Date();
		String format = sin.format(date);
		System.out.println(format);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File st = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(".//ScreenShots/"+format+".png");
		try {
			FileUtils.copyFile(st, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
