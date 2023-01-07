import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


@Test
public class LoginTest {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pavantestingtools.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	WebElement locator=	driver.findElement(By.xpath("//*[@id=\"menu-primary-items\"]/li[5]/a"));
	 locator.click();
	 driver.navigate().back();
	 Thread.sleep(5000);
	 try{
	 locator.click();
	 }
	 catch(StaleElementReferenceException e) {
	 locator =	driver.findElement(By.xpath("//*[@id=\"menu-primary-items\"]/li[5]/a"));
		 locator.click();
	 }
	 
		

	}
	
	 }
	 
	

