package by.htp.test.pages;

import java.util.logging.LogManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateNewMailPage extends AbstractPage{

  private final String BASE_URL = "https://e.mail.ru/login?lang=ru_RU&Page=";
  private final Logger logger = LogManager.getRootLogger();
  
  @FindBy(id = "repository_name")
  private WebElement inputRepositoryNam
  
	
	public CreateNewMailPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {
		// TODO Auto-generated method stub
		
	}

}
