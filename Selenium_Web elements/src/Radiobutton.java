import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://echoecho.com/tooldropdown.htm");
		driver.findElement(By.xpath("//input[@value='false']")).click();
		System.out.println(driver.findElements(By.xpath("//input[@name='go']")).size());
		

	}

}
