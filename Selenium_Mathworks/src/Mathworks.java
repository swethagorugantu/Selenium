import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mathworks {
	private static WebDriver driver;
	
	@BeforeClass
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void searchPlots() {
		// TODO Auto-generated method stub
		driver.get("https://www.mathworks.com/");
		String title = driver.getTitle();
		assertEquals("MathWorks - Makers of MATLAB and Simulink - MATLAB & Simulink",title);
		driver.findElement(By.linkText("Support")).click();
		//driver.findElement(By.xpath("//*[@id=\'topnav\']/li[4]/a")).click();
		driver.findElement(By.xpath("//a[span[contains(.,'Documentation')]]")).click();
		driver.findElement(By.id("docsearch")).sendKeys("plot");
		driver.findElement(By.id("submitsearch")).click();

	}
	
	@AfterClass
	public static void closeBrowser() {
		driver.close();
		
	}
	

}
