package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageFB {

		// 1. initializing/locating elements
		
		//locating and naming email [facebook.com]
		@FindBy(name="email")
		WebElement userId;  //naming the above function as userId
		
		//locating and naming password field
		@FindBy(name="pass")
		WebElement pw;
		
		//locating and naming login button
		@FindBy(xpath="//*[@value='Log In']")
		WebElement loginButton;
		
		//locating and naming forgot acc on the homepage
		@FindBy(xpath="//*[text()='Forgot account?']")
		WebElement fgtn;
		
		// 2. Page factory Constructor
		WebDriver driver;
		public HomepageFB(WebDriver driver) {   //Constructor
			this.driver = driver;
			PageFactory.initElements(driver,  this);
		}
		
		// 3. Creating methods (for each element) to take necessary/required actions
		public void EmailField() {                             //method created for email
			userId.sendKeys("Nigar@hotmail.com");
//			
			//OR,
			
			//2nd type of method for email
//			public void EmailField(String sendKeys) {
		}
			
		public void PasswordField() {
			pw.sendKeys("12345");
			
			//2nd type of method for pw
//		public void PasswordField(String sendKeys) {
		}
		
		public void Login() {
			loginButton.click();		
			}
		public void ForgottenAcc() {  //home page element
			fgtn.click();
		}
		public void empty() {
			userId.click();
		}
		public void empty2() {
			pw.click();
		}
}
