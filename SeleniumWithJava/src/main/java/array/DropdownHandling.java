package array;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement DD=driver.findElement((By.xpath("//select[@name='country']")));
		DD.click();
		Select sel= new Select(DD);
	//	sel.selectByVisibleText("ALGERIA");
		sel.selectByIndex(4);
		
	}
}
