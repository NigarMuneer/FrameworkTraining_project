package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassFB {

		//locating and naming Forgot acc after going back from the logged-in web page
			@FindBy(linkText="Forgot account?")
			WebElement pass;
			
			//locating email on Forgot acc page
			@FindBy(id="identify_email")
			WebElement id2;
			
			@FindBy(className="uiButtonText")
			WebElement cancel;
			
//			@FindBy(xpath="//*[@value='Search']")
//			WebElement search;
			
			@FindBy(name="email")
			WebElement email3;
			
			@FindBy(id="pass")
			WebElement pw3;
			
			@FindBy(id="loginbutton")
			WebElement login3;
			
			WebDriver driver;
			public ForgotPassFB (WebDriver driver) {   //Constructor
				this.driver = driver;
				PageFactory.initElements(driver,  this);
			}
			
			public void ForgotAcc() {
				pass.click();
				
			}
			public void Email2() {
				id2.sendKeys("Donot Disturb!!");
			}
			public void CancelBut() {
				cancel.click();
			}
//			public void SearchBut() {
//				search.click();
//			}
			public void newEmail() {
				email3.sendKeys("Success");
			}
			public void newPass() {        //on forgot acc pg
				pw3.sendKeys("YAAAAAAAY");
			}
			public void newLogin() {
				login3.click();
			}
}
