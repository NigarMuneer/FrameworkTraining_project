package Common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FacebookRun {
		WebDriver driver;
		
	  @Test(priority=1)
	  public void Login() throws InterruptedException {
		  driver.navigate().to("https://www.facebook.com/");
		  driver.manage().window().maximize();
		  
		  HomepageFB homepg = new HomepageFB(driver);  //creating object of "HomepageFB" class
		  homepg.EmailField();
		  
		  Thread.sleep(2000);
		  homepg.PasswordField();
		  
		  Thread.sleep(2000);
		  homepg.Login();
		  
		  driver.navigate().back();
	  }
	  @Test(priority=2)
	  public void ForgotAccount() {
		  HomepageFB forgotlink = new HomepageFB(driver);
		  forgotlink.ForgottenAcc();  //calling the forgotten link from homepage class
		  
		  ForgotPassFB Secondhomepg = new ForgotPassFB (driver);
		  Secondhomepg.Email2();
		  Secondhomepg.CancelBut();
		  
		  Secondhomepg.newEmail();
		  Secondhomepg.newPass();
		  Secondhomepg.newLogin();
		  }
	  @BeforeClass
	//  @Parameters({"URL", "Browser"})
	//  public void beforeClass(String website, String browser) {
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nigar Muneer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
//		  driver.navigate().to(website);
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }

	}
