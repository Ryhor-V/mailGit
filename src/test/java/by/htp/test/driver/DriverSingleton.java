package by.htp.test.driver;

import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class DriverSingleton {
	
	private static WebDriver driver;
    private static final String CHROME = "webdriver.chrome.driver";
    private static final String CHROME_PATH = "c:\\\\driver\\\\chromedriver.exe";
    
    private DriverSingleton(){};


    public static WebDriver getDriver(){
        if (null == driver){
            System.setProperty(CHROME, CHROME_PATH);
            driver = new ChromeDriver();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
           
        }

        return driver;
    }
    
    public static void closeDriver(){
        driver.quit();
        driver = null;
    }

}
