package by.htp.test.pages;

import java.util.logging.LogManager;

import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

public class LoginPage extends AbstractPage {
	
	
	private final String BASE_URL = "https://mail.ru/login";
	
	public LoginPage (WebDriver driver) {
		super(driver);
	}
	
	public void openPage() {
		driver.get(BASE_URL);
		
	}
	


}
