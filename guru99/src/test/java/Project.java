import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Project {
	WebDriver driver;
	
	public Project(WebDriver driver) throws Exception
	{
		this.driver = driver;
	}
	
	public void Flight() throws Exception 
	{
		driver.findElement(By.xpath("//a[@href='reservation.php']")).click();
		Thread.sleep(2000);
	}
	
	public void OneWay() throws Exception
	{
		driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > b > font > input[type=radio]:nth-child(2)")).click();
		Thread.sleep(2000);
	}
	
	public void Passenger() throws Exception
	{
		Select Pass = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		Pass.selectByVisibleText("2");
		Thread.sleep(2000);
	}
	
	public void Departing() throws Exception
	{
		Select Dep = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		Dep.selectByVisibleText("New York");
		Thread.sleep(2000);
	}
	
	public void ON() throws Exception
	{
		Select ON = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
		ON.selectByVisibleText("March");
		Thread.sleep(2000);
		Select On = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
		On.selectByVisibleText("9");
		Thread.sleep(2000);
	}
	
	public void Arriving() throws Exception
	{
		Select Arr = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		Arr.selectByVisibleText("London");
		Thread.sleep(2000);
	}
	
	public void Returning() throws Exception
	{
		Select Ret = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		Ret.selectByVisibleText("March");
		Thread.sleep(2000);
		Select Re = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
		Re.selectByVisibleText("16");
		Thread.sleep(2000);
	}
	
	public void Service() throws Exception
	{
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		Thread.sleep(2000);
		
	}
	
	public void Airlines() throws Exception {
		Select Air = new Select(driver.findElement(By.xpath("//select[@name='airline']")));
		Air.selectByVisibleText("Blue Skies Airlines");
		Thread.sleep(2000);
	}
	
	public void Submit() throws Exception
	{
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
	}

}
