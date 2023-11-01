package narayan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC12 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='suggestor-input '][1]")).sendKeys("Softwarw Testing");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.qsbSubmit")).click();
		
		driver.close();
	}
}
