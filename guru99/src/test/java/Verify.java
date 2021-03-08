import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify {
	@Test
	public void verify() throws Exception{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32_2/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.guru99.com/test/newtours/index.php");
	    
	    Project pg =new Project(driver);
	    pg.Flight();
	    pg.OneWay();
	    pg.Passenger();
	    pg.Departing();
	    pg.ON();
	    pg.Arriving();
	    pg.Returning();
	    pg.Service();
	    pg.Airlines();
	    pg.Submit();
	}
}
