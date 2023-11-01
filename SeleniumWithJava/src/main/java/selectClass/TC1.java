package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://C://Users//Testriq_D25//Downloads//demo.html");
		Thread.sleep(3000);
		WebElement dd=driver.findElement(By.id("standard_cars"));
		Thread.sleep(3000);
		dd.click();
		
		Select s= new Select (dd);
		s.selectByValue("aud");
		
		System.out.println("Selected car: " +s.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		List <WebElement> multipleCars= driver.findElements(By.id("multiple_cars"));
		
		for(WebElement car:multipleCars) {
			Select s1= new Select (car);
			if(s1.isMultiple()) {
				System.out.println("Multiple options are selectable");
				//s.selectByIndex(1);
				
				s.selectByValue("merc");
				//s.selectByVisibleText("Jaguar");
				//s.all
				//System.out.println(s.getAllSelectedOptions().toString());
				
			}
			//System.out.println(car.getText());
		}
}
}
