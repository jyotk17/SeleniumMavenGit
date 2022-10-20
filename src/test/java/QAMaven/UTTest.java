//for jenkins.....then create testng xml
//right click uttest...then convert to testng

package QAMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UTTest {

	@Test
	public void stratBrowser()
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com");

	Assert.assertTrue(driver.getTitle().contains("Orange"),"Tittle does not match");
	driver.quit();		
	}
}

