package Common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class browsers {
	public static WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeClass
  @Parameters({"URL", "Browser"})
  
  public void beforeClass(String website, String br) {
	  if(br.equalsIgnoreCase("Firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nigar Muneer\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  
		  driver.navigate().to("website");
		  driver.manage().window().maximize();
	  }
	  else if(br.equalsIgnoreCase("Chrome")){
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nigar Muneer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
		  driver.navigate().to("website");
		  driver.manage().window().maximize();
	  }
	  else {
		  System.out.println("There's a problem");
	  }
  }

  @AfterClass
  public void afterClass() {
  }
  public void Screenshots(String source) {
	  
  }

}
