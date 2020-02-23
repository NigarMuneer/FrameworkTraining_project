package Run;

import org.testng.annotations.Test;

import Common.FacebookRun;
import Common.HomepageFB;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class TestData extends FacebookRun {

@Test(dataProvider = "dp")
  public void f(Integer n, String s) throws InterruptedException {
	  
	  HomepageFB h = new HomepageFB(driver);
	  h.EmailField(n);
	  h.PasswordField(s);
	  h.Login();
	  
	  driver.navigate().back();
	  Thread.sleep(2000);
	  h.empty();
	  Thread.sleep(2000);
	  
	  Reporter.log("Executed Successfully");
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 23@gmail.pom, "a" },
      new Object[] { demo345, "b" },
    };
  }
}
