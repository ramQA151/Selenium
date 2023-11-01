package narayan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("Amazon" + Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".LC20lb.MBeuO.DKV0Md:first-of-type")).click();
	}
}
