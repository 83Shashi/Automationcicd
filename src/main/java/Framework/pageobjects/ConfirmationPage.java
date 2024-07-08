package Framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework.AbstractComponents.AbstractComponent;

public class ConfirmationPage extends AbstractComponent{

	//Creating constructor for driver
	   WebDriver driver;
		
		public  ConfirmationPage(WebDriver driver)
		 	
		{
			super(driver);
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
		//pagefactory for confirming text
		@FindBy(css=".hero-primary")
		WebElement confirmationMessage;
		
		
		public String verifyConfirmationMessage()
		{
			return confirmationMessage.getText();
		}
	}

