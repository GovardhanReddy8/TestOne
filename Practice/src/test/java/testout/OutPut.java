package testout;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import comments.BagePage;
import pages.HomePage;
import utils.UtilKit;
@Listeners(mits.ListMe.class)
public class OutPut extends BagePage{
	@Test(dataProvider = "getme")
	public void startMe(String username, String password) {
		HomePage hp = new HomePage(driver);
		hp.doLogin(username, password);
		
		
	}
	
	@DataProvider
	Object[][] getme() throws IOException{
		return UtilKit.data("Sheet", "Login");
		
	}

}
